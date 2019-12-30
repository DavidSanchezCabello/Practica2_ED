package es.studium.TestBanco;

import es.studium.Banco.Cliente;
import es.studium.Banco.Cuenta;

public class TestBanco {

	private static final String MONEDA = " euros.";
	private static final String TIENE = " tiene ";
	private static final String CUENTA_DE = "La cuenta de ";

	public static void main(String[] args) {
		/* Antonio y Beatriz se hacen cliente del banco */
		Cliente antonio = new Cliente("123456789Z", "Antonio Alonso", "Av. Pueblo Saharaui, s/n");
		Cliente beatriz = new Cliente("987654321A", "Beatriz Benítez", "Calle Sol, 4");

		/* Por defecto, todas las cuentas nuevas tienen 100€ */
		Cuenta AntonioAlonso = new Cuenta(48151, 100, antonio);
		Cuenta BeatrizBenitez = new Cuenta(62342, 100, beatriz);

		/* Antonio y Beatriz consultan el saldo */
		mostrar(AntonioAlonso);
		mostrar(BeatrizBenitez);

		transferir(BeatrizBenitez, AntonioAlonso);

		mostrar(AntonioAlonso);
		mostrar(BeatrizBenitez);

		/* Antonio gana 100€ en una rifa y hace un ingreso en su cuenta */
		AntonioAlonso.setSaldo(AntonioAlonso.getSaldo() + 100);

		/* Beatriz tiene que pagar 30€ a hacienda y retira el dinero */
		BeatrizBenitez.setSaldo(BeatrizBenitez.getSaldo() - 30);

		/* Antonio transfiere 50€ a Beatriz */
		transferir(AntonioAlonso, BeatrizBenitez);

		mostrar(AntonioAlonso);
		mostrar(BeatrizBenitez);

	}

	private static void mostrar(Cuenta nombreCuenta) {
		System.out
				.println(CUENTA_DE + nombreCuenta.getCliente().getNombre() + TIENE + nombreCuenta.getSaldo() + MONEDA);
	}

	/*
	 * Creo un método para controlar la ejecución de las transferencias realizadas
	 */
	private static void transferir(Cuenta cuentaAntonio, Cuenta cuentaBeatriz) {
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() - 50);
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() + 50);
	}

}

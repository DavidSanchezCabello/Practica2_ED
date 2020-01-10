package es.studium.TestBanco;

import es.studium.Banco.Cliente;
import es.studium.Banco.Cuenta;

/**
 * Esto es una clase en la que se representan los movimientos de dos cuentas de
 * ahorro
 * 
 * @author David.Info Práctica del Tema 2 Entorno y Desarrollo
 * @version 1.0.0
 */
public class TestBanco {
	/**
	 * Constantes refactorizadas
	 */
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

		transferirB(BeatrizBenitez, AntonioAlonso);

		mostrar(AntonioAlonso);
		mostrar(BeatrizBenitez);

		transferirA(AntonioAlonso, BeatrizBenitez);

		/* Antonio transfiere 50€ a Beatriz */
		transferirB(AntonioAlonso, BeatrizBenitez);

		mostrar(AntonioAlonso);
		mostrar(BeatrizBenitez);

	}

	/**
	 * Con este procedimiento se efectua la primera operación del ejercicio
	 * 
	 * @param AntonioAlonso  Aquí se refiere el nombre del primer cliente al que se
	 *                       suman 100€
	 * @param BeatrizBenitez Aquí se refiere el nombre del primer cliente al que se
	 *                       restan 30€
	 */
	private static void transferirA(Cuenta AntonioAlonso, Cuenta BeatrizBenitez) {
		/* Antonio gana 100€ en una rifa y hace un ingreso en su cuenta */
		AntonioAlonso.setSaldo(AntonioAlonso.getSaldo() + 100);

		/* Beatriz tiene que pagar 30€ a hacienda y retira el dinero */
		BeatrizBenitez.setSaldo(BeatrizBenitez.getSaldo() - 30);
	}

	/**
	 * Este procedimiento muestra por pantalla el resultado
	 * 
	 * @param nombreCuenta Aquí se ingresa el nombre de la cuenta a mostrar
	 */
	private static void mostrar(Cuenta nombreCuenta) {
		System.out
				.println(CUENTA_DE + nombreCuenta.getCliente().getNombre() + TIENE + nombreCuenta.getSaldo() + MONEDA);
	}

	/*
	 * Creo un método para controlar la ejecución de las transferencias realizadas
	 */
	/**
	 * Con este procedimiento se efectua la segunda transferencia de saldo.
	 * 
	 * @param cuentaAntonio Aquí se refiere el nombre de la cuenta del primer
	 *                      cliente al que se restan 50€
	 * @param cuentaBeatriz Aquí se refiere el nombre de la cuenta del segundo
	 *                      cliente al que se suman 50€
	 */
	private static void transferirB(Cuenta cuentaAntonio, Cuenta cuentaBeatriz) {
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() - 50);
		cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() + 50);
	}

}

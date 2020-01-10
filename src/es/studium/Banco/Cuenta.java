package es.studium.Banco;
/**
 * Esta clase nos permite generar una cuenta bancaria y vincularla a un cliente
 * 
 * @author David.Info
 * @version 1.0.0
 */
public class Cuenta
	{
		private int numeroCuenta;
		private Cliente cliente;
		private double saldo;
		
		public Cuenta()
			{

				numeroCuenta = 0;
				cliente = new Cliente();
				saldo = 0;
			}
		/**
		 * 
		 * @param num Hace referencia al numero de cuenta del cliente
		 * @param s Hace referencia al saldo del cliente
		 * @param t Hace referencia al nombre del cliente
		 */
		public Cuenta(int num, int s, Cliente t)
			{

				numeroCuenta = num;
				saldo = s;
				cliente = t;
				
			}
		/**
		 * 
		 * @return Nos devuelve el numero de cuenta del cliente
		 */
		public int getNumeroCuenta()
			{
				return numeroCuenta;
			}
		/**
		 * 
		 * @param num Nos permite modificar un numero de cuenta
		 */
		public void setNumeroCuenta(int num)
			{
				numeroCuenta = num;
			}
		/**
		 * 
		 * @return Nos devuelve codo lo referente al cliente
		 */
		public Cliente getCliente()
			{
				return cliente;
			}
		/**
		 * 
		 * @param t Nos permite modificar un nuevo cliente
		 */
		public void setCliente(Cliente t)
			{
				cliente = t;
			}
		/**
		 * 
		 * @return Nos devuelve el saldo del cliente
		 */
		public double getSaldo()
			{
				return saldo;
			}
		/**
		 * 
		 * @param s nos permite modificar el saldo del cliente
		 */
		public void setSaldo(double s)
			{
				saldo = s;
			}

	}

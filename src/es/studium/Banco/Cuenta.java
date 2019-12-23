package es.studium.Banco;

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

		public Cuenta(int num, int s, Cliente t)
			{

				numeroCuenta = num;
				saldo = s;
				cliente = t;
				
			}

		public int getNumeroCuenta()
			{
				return numeroCuenta;
			}

		public void setNumeroCuenta(int num)
			{
				numeroCuenta = num;
			}

		public Cliente getCliente()
			{
				return cliente;
			}

		public void setCliente(Cliente t)
			{
				cliente = t;
			}

		public double getSaldo()
			{
				return saldo;
			}

		public void setSaldo(double s)
			{
				saldo = s;
			}

	}

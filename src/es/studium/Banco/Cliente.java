package es.studium.Banco;

public class Cliente
{
	private String nombre;
	private String dni;
	private String direccion;


	public Cliente()
		{

			nombre = "";
			dni = "";
			direccion = "";

		}

	public Cliente(String d, String nom, String dir)
		{
		   
			dni = d;
			nombre = nom;
			direccion = dir;

		}

	public String getNombre()
		{
			return nombre;
		}

	public void setNombre(String nom)
		{
			nombre = nom;
		}

	public String getDni()
		{
			return dni;
		}

	public void setDni(String d)
		{
			dni = d;
		}

	public String getDireccion()
		{
			return direccion;
		}

	public void setDireccion(String dir)
		{
			direccion = dir;
		}


}

package es.studium.Banco;

/**
 * Con esta clase podemos crear nuevos clientes en nuestro banco
 * 
 * @author David.Info Práctica Tema 2 Entorno y Desarrollo
 * @version 1.0.0
 */
public class Cliente {
	private String nombre;
	private String dni;
	private String direccion;

	public Cliente() {

		nombre = "";
		dni = "";
		direccion = "";

	}

	/**
	 * 
	 * @param d   Hace referencia al dni del cliente
	 * @param nom Hace referencia al nombre del cliente
	 * @param dir Hace referencia a la dirección del cliente
	 */
	public Cliente(String d, String nom, String dir) {

		dni = d;
		nombre = nom;
		direccion = dir;

	}

	/**
	 * 
	 * @return Nos devuelve el nombre del cliente
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nom Nos permite modificar un nuevo nombre de cliente
	 */
	public void setNombre(String nom) {
		nombre = nom;
	}

	/**
	 * 
	 * @return Nos devuelve el dni del cliente
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * 
	 * @param d Nos permite modificar un dni de cliente
	 */
	public void setDni(String d) {
		dni = d;
	}

	/**
	 * 
	 * @return Nos devuelve el nombre la dirección del cliente
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * 
	 * @param dir Nos permite modificar la dirección
	 */
	public void setDireccion(String dir) {
		direccion = dir;
	}

}

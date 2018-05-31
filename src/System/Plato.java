package System;


/**
 * @author gnara
 * @version 1.0
 * @created 30-may.-2018 6:03:18 p. m.
 */
public class Plato {

	private String nombrePlato;
	private int precio;

	public Plato(String nombre, int precio){
		this.nombrePlato = nombre;
		this.precio = precio;
	}

	public void finalize() throws Throwable {

	}

	public String getNombrePlato() {
		return nombrePlato;
	}

	public void setNombrePlato(String nombrePlato) {
		this.nombrePlato = nombrePlato;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	

}
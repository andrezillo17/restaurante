package System;


/**
 * @author gnara
 * @version 1.0
 * @created 30-may.-2018 6:03:18 p. m.
 */
public class Chef extends Empleado {

	private String cocina;

	public Chef(){
		super();
	}

	public void prepararMenu(Pedido pedido){
		pedido.cambiarEstado("En preparación");
	}
	public void dejarLisEntregar(Pedido pedido) {
		pedido.cambiarEstado("Listo para entregar");
	}

}
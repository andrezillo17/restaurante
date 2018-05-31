package System;


/**
 * @author gnara
 * @version 1.0
 * @created 30-may.-2018 6:03:18 p. m.
 */
public class Mesero extends Empleado {

	public Pedido m_Pedido;

	public Mesero(){

	}

	public void cancelarPedido(Pedido pedido){
		pedido.cambiarEstado("Pedido cancelado");
	}

	public void entregarPedido(Pedido pedido){
		pedido.cambiarEstado("Pedido Entregado");
	}


	public void tomarPedido(Pedido pedido){
		pedido.cambiarEstado("Pedido tomado de la cocina");
	}

}
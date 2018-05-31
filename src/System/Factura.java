package System;


/**
 * @author gnara
 * @version 1.0
 * @created 27-may.-2018 7:05:30 p. m.
 */
public class Factura {

	private Cajero cajero;
	private Pedido pedido;
	private int totalPedido;
	private String estadoFactura;

	public void totalizarPedido(Pedido pedido){
		int suma = 0;
		for(Menu pedid : pedido.getMenu()){
			for(Plato plato : pedid.getListPlato()){
				suma += plato.getPrecio();
			}
		}
		this.totalPedido = suma;
	}

	public int getTotalPedido() {
		return totalPedido;
	}

	public void setTotalPedido(int totalPedido) {
		this.totalPedido = totalPedido;
	}

	public String getEstadoFactura() {
		return estadoFactura;
	}

	public void setEstadoFactura(String estadoFactura) {
		this.estadoFactura = estadoFactura;
	}
	

}
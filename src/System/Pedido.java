package System;

import java.util.ArrayList;
import java.util.Date;


/**
 * @author gnara
 * @version 1.0
 * @created 30-may.-2018 6:03:18 p. m.
 */
public class Pedido {

	private Cliente cliente;
	private String estadoPedido;
	private Date fechaPedido;
	private ArrayList<Menu> menu = new ArrayList<Menu>();
	private Mesa mesa;
	private Mesero Mesero;
	private int idPedido;

	public Pedido(int idpedido){
		this.idPedido = idpedido;
	}

	public void cambiarEstado(String estado){
		this.estadoPedido = estado;
	}

	public void verPedido(){

	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getEstadoPedido() {
		return estadoPedido;
	}

	public void setEstadoPedido(String estadoPedido) {
		this.estadoPedido = estadoPedido;
	}

	public Date getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public ArrayList<Menu> getMenu() {
		return menu;
	}

	public void setMenu(ArrayList<Menu> menu) {
		this.menu = menu;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public Mesero getMesero() {
		return Mesero;
	}

	public void setMesero(Mesero mesero) {
		Mesero = mesero;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	
	

}
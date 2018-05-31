package System;

import java.util.ArrayList;
/**
 * @author gnara
 * @version 1.0
 * @created 30-may.-2018 6:03:18 p. m.
 */
public class Restaurante {

	//public Menu m_Menu;
	static Restaurante restaurante = null;
	private ArrayList<Menu> menu;
	private ArrayList<Pedido> listPedido = new ArrayList<Pedido>();
	private Empleado empleado;
 
	private Restaurante(){}

	public Factura generarFactura(int idpedido){
		Factura factura  = new Factura();
		for(Pedido pedido : listPedido){
			if(pedido.getIdPedido()==idpedido){
				factura.totalizarPedido(pedido);
			}
		}
		return factura;
	}
	public void pagarFactura(Factura factura){
		factura.setEstadoFactura("Pagada");
	}

	public Reserva generarReserva(String fecha, String hora, int mesa){
		Reserva reserva= new Reserva();
		reserva.setMesa(new Mesa(mesa));
		return reserva;
	}

	public static Restaurante getRestaurante(){
		if(restaurante == null){
			return new Restaurante();
		}else{
			return restaurante;
		}
		
	}
	public void cargarPlatos(){
		this.menu = new ArrayList<Menu>();
		menu.add(new Menu("Menu 1"));
		menu.get(0).agregarPlato(new Plato("Spagueti",120));
		menu.get(0).agregarPlato(new Plato("pescado",140));
		menu.get(0).agregarPlato(new Plato("Ensalada verde",200));
		menu.get(0).agregarPlato(new Plato("Vino",90));
		menu.add(new Menu("Menu 2"));
		menu.get(1).agregarPlato(new Plato("Ensala fria",80));
		menu.get(1).agregarPlato(new Plato("Pollo con champiñon",120));
		menu.get(1).agregarPlato(new Plato("Agua",115));
	}
	

	public ArrayList<Menu> verMenu(){
		cargarPlatos();
		return menu;
	}
	public void realizarPedido(Pedido pedido,String cliente){
		pedido.setCliente(new Cliente(cliente));
		pedido.setEstadoPedido("En alistamiento");
		listPedido.add(pedido);
	}
	public ArrayList<Pedido> verPedidos(){
		return listPedido;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	public void prepararPedido(int idpedido){
		for(Pedido pedido : listPedido){
			if(pedido.getIdPedido()==idpedido){
				empleado.prepararMenu(pedido);
			}
		}
	}

	public ArrayList<Menu> getMenu() {
		return menu;
	}

	public void setMenu(ArrayList<Menu> menu) {
		this.menu = menu;
	}
	
	

}
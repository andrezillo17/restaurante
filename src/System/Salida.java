package System;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


/**
 * @author gnara
 * @version 1.0
 * @created 30-may.-2018 6:03:18 p. m.
 */
public class Salida {
	private static Restaurante restaurante;
	private static Scanner entrada = new Scanner(System.in);

	public Salida(){

	}
	
	public static void main(String[] args){
		cargarRestaurante();
		int usuario = 5;
		int idP = 1;
		while(usuario != 0){
			System.out.println("Que tipo de usuario eres?");
			System.out.println("1: Cliente \t 2: Mesero \t 3: Cajero \t 4:Cocinero \t 0:Salir");
			
			usuario = entrada.nextInt();
			switch (usuario) {
				case 1:
					System.out.println("\t 1: Menu \t 2: Reserva");
					int opCliente = entrada.nextInt();
					
					switch (opCliente) {
					case 1:
						Pedido pedido = new Pedido(idP);
						int ciclo = 1;
						verMenu();
						while(ciclo==1){
							System.out.println("Qué menú desea?");
							int opMenu = entrada.nextInt();
							pedido = cargarPedido(pedido, opMenu);
							System.out.println("deseas pedir mas? 1:si \t 2:No");
							ciclo = entrada.nextInt();
						}
						realizarPedido(pedido,"");
						System.out.println("Tu pedido se está preparando y pronto llegará");
						idP++;
						break;
					case 2:
						System.out.println("Para que día y hora desea la reserva");
						System.out.println("fecha y hora:");
							String dia = entrada.nextLine();
						//System.out.println("Hora");
							String hora =  entrada.nextLine();
						System.out.println("Mesa sugerida");
						int mesa = entrada.nextInt();
							restaurante.generarReserva(dia, hora, mesa);
						System.out.println("Reserva realizada");
						break;
					default:
						break;
					}
					break;
				case 2:
					restaurante.setEmpleado(new Mesero());
					System.out.println("Pedidos pendientes por entregar");
					verPedidos();
					System.out.println("Cual pedido desea entregar?");
					int entradaChef = entrada.nextInt();
					restaurante.prepararPedido(entradaChef);
					System.out.println("Pedido entregado");
					break;
				case 3:
					restaurante.setEmpleado(new Cajero());
					verPedidos();
					System.out.println("Para cual  pedido desea generar Factura?");
					int idPedido = entrada.nextInt();
					Factura factura = restaurante.generarFactura(idPedido);
					System.out.println("El valor de la factura es de $"+factura.getTotalPedido());
					System.out.println("1:Pagar \t 2: Aun no");
					int entradaPago = entrada.nextInt();
					if(entradaPago==1){restaurante.pagarFactura(factura);}
					break;
				case 4:
					restaurante.setEmpleado(new Chef());
					System.out.println("Pedidos pendientes por entregar");
					verPedidos();
					System.out.println("Cual pedido está listo por entregar?");
					int entradaChef2 = entrada.nextInt();
					restaurante.prepararPedido(entradaChef2);
					System.out.println("El pedido será tomado por los meseros");
					break;
					
			}	
		}
		
	}

	
	public static void verMenu(){
		ArrayList<Menu> menu = restaurante.verMenu();
		for(Menu m_menu: menu){
			System.out.println(m_menu.getNombreMenu());
			for(Plato plato : m_menu.getListPlato()){
				System.out.println(plato.getNombrePlato());
			}
		}
	}
	public static void verPedidos(){
		for(Pedido pedido :restaurante.verPedidos()){
			System.out.println("Pedido "+pedido.getIdPedido()+":");
			for(Menu menu : pedido.getMenu()){
				System.out.println(menu.getNombreMenu());
			}
		}
	}
	public static Pedido cargarPedido(Pedido pedido, int opcionMenu){
		pedido.setFechaPedido(new Date());
		pedido.getMenu().add(restaurante.verMenu().get(opcionMenu-1));
		return pedido;
		//
	
	}

	public static void realizarPedido(Pedido pedido, String cliente){
		
		restaurante.realizarPedido(pedido,cliente);
	
	}

	public static void cargarRestaurante(){
		restaurante = Restaurante.getRestaurante();
	}

}
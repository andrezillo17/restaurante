package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import System.*;

public class RestauranteTest {
	Restaurante restaurante = Restaurante.getRestaurante();
	@Test
	public void testPagarFactura() {
		Pedido pedido = new Pedido(1);
		Factura factura = restaurante.generarFactura(1);
		restaurante.pagarFactura(factura);
		assertEquals("Pagada", factura.getEstadoFactura());
	}

	@Test
	public void testGenerarReserva() {
		Reserva reserva = restaurante.generarReserva("4-06-18", "18:00", 5);
		assertEquals(5, reserva.getMesa());
	}

	@Test
	public void testCargarPlatos() {
		restaurante.cargarPlatos();
		assertEquals(true, restaurante.getMenu().size()>0);
	}

	@Test
	public void testVerPedidos() {
		Pedido pedido = new Pedido(1);
		assertEquals(true ,restaurante.verPedidos() instanceof ArrayList<?>);
	}

	@Test
	public void testPrepararPedido() {
		Pedido pedido = new Pedido(1);
		restaurante.prepararPedido(1);
		assertEquals("En preparación", pedido.getEstadoPedido());
	}

}

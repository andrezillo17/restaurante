package test;

import static org.junit.Assert.*;

import org.junit.Test;
import System.*;

public class MeseroTest {
	Mesero mesero = new Mesero();
	@Test
	public void testCancelarPedido() {
		Pedido pedido = new Pedido(1);
		mesero.cancelarPedido(pedido);
		assertEquals("Pedido cancelado", pedido.getEstadoPedido());
	}

	@Test
	public void testEntregarPedido() {
		Pedido pedido = new Pedido(1);
		mesero.entregarPedido(pedido);
		assertEquals("Pedido entregado", pedido.getEstadoPedido());
	}

	@Test
	public void testTomarPedido() {
		Pedido pedido = new Pedido(1);
		mesero.tomarPedido(pedido);
		assertEquals("Pedido tomado de la cocina", pedido.getEstadoPedido());
	}

}

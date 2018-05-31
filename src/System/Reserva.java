package System;


/**
 * @author gnara
 * @version 1.0
 * @created 30-may.-2018 6:03:18 p. m.
 */
public class Reserva {

	private Mesa mesa;
	private int numeroReserva;

	public Reserva(){

	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public int getNumeroReserva() {
		return numeroReserva;
	}

	public void setNumeroReserva(int numeroReserva) {
		this.numeroReserva = numeroReserva;
	}


}
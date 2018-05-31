package System;

import java.util.Date;


/**
 * @author gnara
 * @version 1.0
 * @created 30-may.-2018 6:03:18 p. m.
 */
public class Empleado {

	public String nombreEmpleado;
	public int salario;
	public String tipoEmpleado;
	protected Date entrada, salida;

	public Empleado(){

	}
	
	public void verPedido(Pedido pedido){}
	public void prepararMenu(Pedido pedido){}

	/**
	 * 
	 * @param entrada
	 */
	public void registrarEntrada(Date entrada){
		this.entrada = entrada;
	}


	public void registrarSalida(Date salida){
		this.salida = salida;
	}

}
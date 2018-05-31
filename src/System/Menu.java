package System;

import java.util.ArrayList;


/**
 * @author gnara
 * @version 1.0
 * @created 30-may.-2018 6:03:18 p. m.
 */
public class Menu {

	private ArrayList<Plato> listPlato = new ArrayList<Plato>();
	private Plato m_Plato;
	private Chef m_Chef;
	private String nombreMenu;

	public Menu(String nomMenu){
		this.nombreMenu = nomMenu;
	}

	public void agregarPlato(Plato plato){
		this.listPlato.add(plato);
	}

	public ArrayList<Plato> getListPlato(){
		return listPlato;
	}

	public String getNombreMenu() {
		return nombreMenu;
	}

	public void setNombreMenu(String nombreMenu) {
		this.nombreMenu = nombreMenu;
	}
	
	

}
package models;

import java.util.ArrayList;

public class Equipo {
	

	/**
	 * Almacena los pokemon de un equipo en un array list
	 */
	//Porpiedades
	protected ArrayList<Pokemon> equipo;
	
	//Constructor
	public Equipo(ArrayList<Pokemon> equipo) {
		super();
		this.equipo = equipo;
	}
	
	/**
	 * Te muestra todos los pokemon que tiene un equipo
	 */
	
	public void mostrarEquipo() {
		int contador = 1;
		for (Pokemon pokemon : equipo) {
			System.out.println(contador++ + ". " + pokemon.getNombre());
		}
	}
	
	
}

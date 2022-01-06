package models;

import java.util.Scanner;
import java.util.Iterator;

public class Entrenador extends Equipo {

	// Propiedades
	protected String nombre;
	protected Equipo equipo;

	// Constructor
	public Entrenador(String nombre, Equipo equipo) {
		super(null);
		this.nombre = nombre;
		this.equipo = equipo;
	}

	// Getters y setters
	public String getNombre() {
		return nombre;
	}

	public Equipo getEquipo(int i) {
		return equipo;
	}

	/**
	 * Te muestra los pokemon que tiene un equipo y seleccionas cual quieres
	 * utilizar
	 * 
	 * @return Pokemon que quieres utilizar
	 */

	public Pokemon elegirPokemon() {

		Scanner s = new Scanner(System.in);
		equipo.mostrarEquipo();

		System.out.println("¿Cúal pokemon deseas escoger?");
		int opc = Integer.parseInt(s.nextLine());
		int contador = 1;

		Iterator<Pokemon> iterador = equipo.equipo.iterator();
		while (iterador.hasNext() && opc != contador) {

			iterador.next();
			contador++;
		}

		return iterador.next();

	}
}

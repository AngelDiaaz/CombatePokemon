package models;

import java.util.ArrayList;
import java.util.Scanner;

public class Pokemon {

	// Propiedades
	protected String nombre;
	protected TipoPokemon tipo1;
	protected TipoPokemon tipo2;
	protected Estado estado;
	protected double attack;
	protected double defense;
	protected double specialAttack;
	protected double specialDefense;
	protected int speed;
	protected ArrayList<Movimiento> movimiento;
	protected int maxHP;
	protected int actualHP;
	protected int level;
	protected int index;

	// Constructores

	public Pokemon(String nombre, TipoPokemon tipo1, TipoPokemon tipo2, Estado estado, int attack, int defense,
			int specialAttack, int specialDefense, int speed, ArrayList<Movimiento> movimiento, int maxHP, int level) {
		super();
		this.nombre = nombre;
		this.tipo1 = tipo1;
		this.tipo2 = tipo2;
		this.estado = estado;
		this.attack = attack;
		this.defense = defense;
		this.specialAttack = specialAttack;
		this.specialDefense = specialDefense;
		this.speed = speed;
		this.movimiento = movimiento;
		this.maxHP = maxHP;
		this.level = level;
		this.actualHP = maxHP;
	}

	protected Pokemon(ArrayList<Movimiento> movimiento) {
		super();
		this.movimiento = movimiento;
	}

	// Getters y setters
	public String getNombre() {
		return nombre;
	}

	public TipoPokemon getTipo1() {
		return tipo1;
	}

	public TipoPokemon getTipo2() {
		return tipo2;
	}

	public Estado getEstado() {
		return estado;
	}

	public double getAttack() {
		return attack;
	}

	public double getDefense() {
		return defense;
	}
	
	public void setDefense(double defense) {
		this.defense = defense;
	}

	public void setSpecialAttack(double specialAttack) {
		this.specialAttack = specialAttack;
	}

	public double getSpecialAttack() {
		return specialAttack;
	}

	public double getSpecialDefense() {
		return specialDefense;
	}

	public int getSpeed() {
		return speed;
	}

	public ArrayList<Movimiento> getMovimientos() {
		return movimiento;
	}

	public int getMaxHP() {
		return maxHP;
	}

	public int getActualHP() {
		return actualHP;
	}

	public void setActualHP(int actualHP) {
		this.actualHP = actualHP;
	}

	public int getLevel() {
		return level;
	}

	// Metodos

	/**
	 * Muestra los movimientos de un pokemon que puede realizar durante un combate
	 */
	public void mostrarMovimientos() {
		int contador = 1;
		for (Movimiento movimiento : this.movimiento) {
			if (contador <= 4) {
				System.out.println(contador++ + ". " + movimiento.getNombre() + "\t" + movimiento.getActualPP() + "/"
						+ movimiento.getMaxPP());
			} else { //Para que cuando sea el quinto muestre la opcion marcar pokemon
				System.out.println(contador++ + ". " + movimiento.getNombre());
			}
		}

	}

	/**
	 * Te muestra los movimientos y eliges cual quieres usar
	 * 
	 * @return Movimiento del pokemon que vas a usar
	 */

	public int elegirMovimiento(ArrayList<Movimiento> movimientos) {
		Scanner s = new Scanner(System.in);
		mostrarMovimientos();
		System.out.print("Movimiento que quieres utilizar: ");
		int opc = Integer.parseInt(s.nextLine());

		// Para que reste uno cada vez que se usa ese ataque
		movimientos.get(opc - 1).setActualPP(movimientos.get(opc - 1).getActualPP() - 1);

		return (opc - 1);
	}

	// toString
	@Override
	public String toString() {
		return nombre + " ----> HP = " + actualHP + ", estado = " + estado.getEstado() + ", nivel = " + level;
	}

}

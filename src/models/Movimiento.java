package models;

public class Movimiento extends Pokemon{

	// Propiedades
	private String nombre;
	private TipoPokemon tipo1;
	private int maxPP;
	private int actualPP;
	private int cambiaAttack;
	private int cambiaDef;
	private int cambiaSpAttack;
	private int cambiaSpDef;
	private int cambiaSpeed;
	private Estado aplicaEstado;
	private int precision;
	private int potencia;
	private int damage;
	private Categoria categoria;

	// Constructores
	// Para movimientos directos
	public Movimiento(String nombre, TipoPokemon tipo1, Categoria categoria, int maxPP, int precision, int potencia) {
		super(null);
		this.nombre = nombre;
		this.tipo1 = tipo1;
		this.categoria = categoria;
		this.maxPP = maxPP;
		this.precision = precision;
		this.actualPP = maxPP;
		this.potencia = potencia;
	}

	// Getters y setters
	public String getNombre() {
		return nombre;
	}

	public TipoPokemon getTipo() {
		return tipo1;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public int getMaxPP() {
		return maxPP;
	}

	public  int getActualPP() {
		return actualPP;
	}

	public void setActualPP(int actualPP) {
		this.actualPP = actualPP;
	}

	public int getCambiaAttack() {
		return cambiaAttack;
	}

	public int getCambiaDef() {
		return cambiaDef;
	}

	public int getCambiaSpAttack() {
		return cambiaSpAttack;
	}

	public int getCambiaSpDef() {
		return cambiaSpDef;
	}

	public int getCambiaSpeed() {
		return cambiaSpeed;
	}

	public Estado getAplicaEstado() {
		return aplicaEstado;
	}

	public int getPrecision() {
		return precision;
	}

	public int getPotencia() {
		return potencia;
	}

	
	/**
	 * Usa la formula del danyo que hace un movimiento atacando a un pokemon
	 * 
	 * @param pokemon1   Pokemon que ha realizado el movimiento
	 * @param pokemon2   Pokemon que va a recibir el danyo
	 * @param movimiento Posicion del movimiento en la lista de movimientos que va a
	 *                   realizar el pokemon
	 * @return Numero con el daño que va a causar el ataque
	 */
	public int getDamage(Pokemon pokemon1, Pokemon pokemon2, int movimiento) {
		double b;
		int v = (int) (Math.random() * (100 - 85 + 1) + 85);
		if (pokemon1.tipo1.equals(pokemon1.movimiento.get(movimiento).tipo1)
				|| pokemon1.tipo2.equals(pokemon1.movimiento.get(movimiento).tipo1)
				|| pokemon1.tipo1.equals(pokemon1.movimiento.get(movimiento).tipo2)
				|| pokemon1.tipo2.equals(pokemon1.movimiento.get(movimiento).tipo2)) {
			b = 1.5;
		} else {
			b = 1;
		}
		// Si el ataque es de tipo fisico
		if (pokemon1.movimiento.get(movimiento).getCategoria().getNombre().equalsIgnoreCase("fisico")) {
			damage = (int) (0.01 * b * pokemon1.tipo1.getEfectividad(pokemon1.movimiento.get(movimiento), pokemon2) * v
					* (((0.2 * pokemon1.getLevel() + 1) * pokemon1.getAttack()
							* pokemon1.movimiento.get(movimiento).getPotencia()) / (25 * pokemon2.getDefense()) + 2));
		}
		//Si el ataque es de tipo especial
		else if (pokemon1.movimiento.get(movimiento).getCategoria().getNombre().equalsIgnoreCase("especial")) {
			damage = (int) (0.01 * b * pokemon1.tipo1.getEfectividad(pokemon1.movimiento.get(movimiento), pokemon2) * v
					* (((0.2 * pokemon1.getLevel() + 1) * pokemon1.getSpecialAttack()
							* pokemon1.movimiento.get(movimiento).getPotencia()) / (25 * pokemon2.getSpecialDefense()) + 2));
		} 
		//Si el ataque es de tipo estado
		else {
			if(pokemon1.movimiento.get(movimiento).getNombre().equalsIgnoreCase("chirrido")) {
				pokemon2.setDefense(pokemon2.getDefense() - 2);
				System.out.println("Chirrido bajo la defensa a " + pokemon2.getNombre());
				damage = 1000000; //Pongo esta cantidad para luego en la clase combate identifique que es un ataque de tipo estado y poder omitir el ataque
				
			} else if (pokemon1.movimiento.get(movimiento).getNombre().equalsIgnoreCase("desarrollo")) {
				pokemon1.setSpecialAttack(pokemon1.getSpecialAttack() + 1);
				System.out.println("Desarrollo subio el ataque especial de " + pokemon1.getNombre());
				damage = 1000000;
			}
		}
		return damage;
	}


}

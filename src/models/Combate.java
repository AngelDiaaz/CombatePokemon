package models;

public class Combate {

	// Propiedades
	private Entrenador entrenador1;
	private Entrenador entrenador2;
	private Pokemon pokemon1;
	private Pokemon pokemon2;

	// Constructor
	public Combate(Entrenador entrenador1, Entrenador entrenador2) {
		super();
		this.entrenador1 = entrenador1;
		this.entrenador2 = entrenador2;
	}

	// Metodos

	/**
	 * Mira quien tiene la mayor velocidad y empieza primero atacando
	 * 
	 * @param pokemon1 Pokemon que combate
	 * @param pokemon2 Pokemon que combate
	 * @return Pokemon que tiene mayor velocidad
	 */

	public Pokemon quienEmpiezaTurno(Pokemon pokemon1, Pokemon pokemon2) {
		if (pokemon1.speed >= pokemon2.speed) {
			return pokemon1;
		} else if (pokemon2.speed > pokemon1.speed) {
			return pokemon2;
		}
		return null;
	}

	public void bienvenida() {
		System.out.println("_________________________________");
		System.out.println("|                               |");
		System.out.println("| Bienvenido al combate pokemon |");
		System.out.println("|_______________________________|");
	}

	public void combatePokemon() {
		bienvenida();
		System.out
				.println(entrenador1.getNombre() + " selecciona el pokemon de tu equipo que quieras utilizar primero");
		pokemon1 = entrenador1.elegirPokemon();

		System.out
				.println(entrenador2.getNombre() + " selecciona el pokemon de tu equipo que quieras utilizar primero");
		pokemon2 = entrenador2.elegirPokemon();

		boolean es = false, primero = true, pok3 = false;
		int danyo;
		Pokemon pokemon3, pokemon4;

		do {
			pokemon3 = quienEmpiezaTurno(pokemon1, pokemon2);
			if (pokemon3.equals(pokemon1)) {
				pokemon4 = pokemon2;
				es = true;
			} else {
				pokemon4 = pokemon1;
			}
			//if (primero) {
				System.out.println("Empieza el pokemon");
				System.out.println(pokemon3);
				System.out.println("Contra el pokemon");
				System.out.println(pokemon4);
				System.out.println();
			//}

			do {
				System.out.println("¿Que movimiento quieres que realice " + pokemon3.getNombre() + "?");
				int movimiento = pokemon3.elegirMovimiento(pokemon3.movimiento);

				

				System.out.println(pokemon3.getNombre() + " uso " + pokemon3.movimiento.get(movimiento).getNombre());

				int fallo = (int) ((Math.random() * 101) + 1);

				if (pokemon3.movimiento.get(movimiento).getPrecision() >= fallo) { //Si el numero aleatorio es mayor que la precision el ataque falla
					danyo = pokemon3.movimiento.get(movimiento).getDamage(pokemon3, pokemon4, movimiento);
					pokemon4.setActualHP(pokemon4.getActualHP() - danyo);
					System.out.println("Realizo " + danyo + " puntos de daño a " + pokemon4.getNombre());

					if (pokemon4.getActualHP() <= 0) {
						System.out.println(pokemon4.getNombre() + " se debilito...");
						if (es) {
							entrenador1.equipo.equipo.remove(pokemon4);
							entrenador2.equipo.equipo.remove(pokemon4);
						} else {
							entrenador1.equipo.equipo.remove(pokemon4);
							entrenador2.equipo.equipo.remove(pokemon4);
						}
						break;
					}
				} else {
					System.out.println(pokemon3.getNombre() + " fallo...");
				}
				System.out.println(pokemon4);

				System.out.println("¿Que movimiento quieres que realice " + pokemon4.getNombre() + "?");
				movimiento = pokemon4.elegirMovimiento(pokemon4.movimiento);

				System.out.println(pokemon4.getNombre() + " uso " + pokemon4.movimiento.get(movimiento).getNombre());

				fallo = (int) ((Math.random() * 101) + 1);

				if (pokemon4.movimiento.get(movimiento).getPrecision() > fallo) {
					danyo = pokemon3.movimiento.get(movimiento).getDamage(pokemon4, pokemon3, movimiento);
					pokemon3.setActualHP(pokemon3.getActualHP() - danyo);
					System.out.println("Realizo " + danyo + " puntos de daño a " + pokemon3.getNombre());

					if (pokemon3.getActualHP() <= 0) {
						System.out.println(pokemon3.getNombre() + " se debilito...");
						pok3 = true;
						if (es) {
							entrenador1.equipo.equipo.remove(pokemon3);
							entrenador2.equipo.equipo.remove(pokemon3);
						} else {
							entrenador1.equipo.equipo.remove(pokemon3);
							entrenador2.equipo.equipo.remove(pokemon3);
						}
						break;
					}
				} else {
					System.out.println(pokemon4.getNombre() + " fallo...");
				}
				System.out.println(pokemon3);

			} while (pokemon3.getActualHP() > 0 && pokemon4.getActualHP() > 0);

			if (entrenador1.equipo.equipo.size() > 0 && entrenador2.equipo.equipo.size() > 0) {
				primero = false;
				if (pok3) {
					System.out.println(entrenador1.getNombre() + " selecciona el pokemon que quieres que luche ahora");
					pokemon1 = entrenador1.elegirPokemon();
				} else {
					System.out.println(entrenador2.getNombre() + " selecciona el pokemon que quieras que luche ahora");
					pokemon1 = entrenador2.elegirPokemon();
				}

				if (!pok3) {
					System.out.println(entrenador1.getNombre() + " selecciona el pokemon que quieres que luche ahora");
					pokemon2 = entrenador1.elegirPokemon();
				} else {
					System.out.println(entrenador2.getNombre() + " selecciona el pokemon que quieras que luche ahora");
					pokemon2 = entrenador2.elegirPokemon();
				}

			} else {
				break;
			}

		} while (entrenador1.equipo.equipo.size() > 0 && entrenador2.equipo.equipo.size() > 0);

		System.out.println("______________________________________________________");
		System.out.println();

		if (entrenador1.equipo.equipo.size() == 0) {
			System.out.println("Ganador " + entrenador2.getNombre() + "!!!!!!!!");
		} else {
			System.out.println("Ganador " + entrenador1.getNombre() + "!!!!!!!!");
		} // Arreglar eliminar el segundo pokemon!!!!!!!
	}

	public int ataque(Pokemon pokemon1, Pokemon pokemon2, int movimiento) {
		int danyo = pokemon2.getActualHP()
				- pokemon1.movimiento.get(movimiento).getDamage(pokemon1, pokemon2, movimiento);// Mirar esto

		pokemon2.setActualHP(danyo);

		return danyo;
	}

}

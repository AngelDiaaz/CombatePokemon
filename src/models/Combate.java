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

	/**
	 * Te da la bienvenida al combate pokemon
	 */

	public void bienvenida() {
		System.out.println("_________________________________");
		System.out.println("|                               |");
		System.out.println("| Bienvenido al combate pokemon |");
		System.out.println("|_______________________________|");
	}

	/**
	 * Inicia el combate pokemon y juegas
	 */

	public void combatePokemon() {
		bienvenida();
		System.out
				.println(entrenador1.getNombre() + " selecciona el pokemon de tu equipo que quieras utilizar primero");
		pokemon1 = entrenador1.elegirPokemon();

		System.out
				.println(entrenador2.getNombre() + " selecciona el pokemon de tu equipo que quieras utilizar primero");
		pokemon2 = entrenador2.elegirPokemon();

		boolean primero = true, pok3 = false;
		int danyo, movimiento, fallo;
		Pokemon pokemon3 = null, pokemon4 = null;

		do {
			boolean es = false;

			pokemon3 = quienEmpiezaTurno(pokemon1, pokemon2); // Compara los pokemon y te devuelve cual tiene mayor
																// velocidad
			if (pokemon3.equals(pokemon1)) {
				pokemon4 = pokemon2;
				es = true;
			} else {
				pokemon4 = pokemon1;
			}
			do {
				if (primero) { // Para el primer combate pokemon
					System.out.println("Empieza el pokemon");
					System.out.println(pokemon3);
					System.out.println("Contra el pokemon");
					System.out.println(pokemon4);
					System.out.println();
				}
				System.out.println("¿Que movimiento quieres que realice " + pokemon3.getNombre() + "?");
				movimiento = pokemon3.elegirMovimiento(pokemon3.movimiento);

				if (movimiento < 4) { // Para realizar un movimiento

					System.out
							.println(pokemon3.getNombre() + " uso " + pokemon3.movimiento.get(movimiento).getNombre());

					fallo = (int) ((Math.random() * 101) + 1); // Saco un numero random para la precision del ataque

					if (pokemon3.movimiento.get(movimiento).getPrecision() >= fallo) { // Si el numero aleatorio es
																						// mayor que la precision el
																						// ataque falla
						danyo = pokemon3.movimiento.get(movimiento).getDamage(pokemon3, pokemon4, movimiento);
						if (danyo != 1000000) { // Para identificar un ataque de tipo estado
							pokemon4.setActualHP(pokemon4.getActualHP() - danyo);
							System.out.println("Realizo " + danyo + " puntos de daño a " + pokemon4.getNombre());

							if (pokemon4.getActualHP() <= 0) {
								System.out.println(pokemon4.getNombre() + " se debilito...");

								// Elimino el pokemon del equipo donde se encuentra
								entrenador1.equipo.equipo.remove(pokemon4);
								entrenador2.equipo.equipo.remove(pokemon4);

								break;
							}
						}
					} else {
						System.out.println(pokemon3.getNombre() + " fallo...");
					}
					System.out.println(pokemon4);
				} else { // Para cuando sea la opcion de cambiar pokemon
					if (es) {
						System.out.println(entrenador1.getNombre() + " selecciona el pokemon al que quieres cambiar");
						pokemon3 = entrenador1.elegirPokemon();
						System.out.println(entrenador1.getNombre() + " cambio a " + pokemon3.getNombre());
					} else {
						System.out.println(entrenador2.getNombre() + " selecciona el pokemon al que quieres cambiar");
						pokemon3 = entrenador2.elegirPokemon();
						System.out.println(entrenador2.getNombre() + " cambio a " + pokemon3.getNombre());
					}
				}

				System.out.println("¿Que movimiento quieres que realice " + pokemon4.getNombre() + "?");
				movimiento = pokemon4.elegirMovimiento(pokemon4.movimiento);

				if (movimiento < 4) {

					System.out
							.println(pokemon4.getNombre() + " uso " + pokemon4.movimiento.get(movimiento).getNombre());

					fallo = (int) ((Math.random() * 101) + 1);

					if (pokemon4.movimiento.get(movimiento).getPrecision() > fallo) {
						danyo = pokemon3.movimiento.get(movimiento).getDamage(pokemon4, pokemon3, movimiento);
						if (danyo != 1000000) {

							pokemon3.setActualHP(pokemon3.getActualHP() - danyo);
							System.out.println("Realizo " + danyo + " puntos de daño a " + pokemon3.getNombre());

							if (pokemon3.getActualHP() <= 0) {
								System.out.println(pokemon3.getNombre() + " se debilito...");
								pok3 = true;

								entrenador1.equipo.equipo.remove(pokemon3);
								entrenador2.equipo.equipo.remove(pokemon3);

								break;
							}
						}
					} else {
						System.out.println(pokemon4.getNombre() + " fallo...");
					}
					System.out.println(pokemon3);
				} else {
					if (!es) {
						System.out.println(entrenador1.getNombre() + " selecciona el pokemon al que quieres cambiar");
						pokemon4 = entrenador1.elegirPokemon();
						System.out.println(entrenador1.getNombre() + " cambio a " + pokemon4.getNombre());
					} else {
						System.out.println(entrenador2.getNombre() + " selecciona el pokemon al que quieres cambiar");
						pokemon4 = entrenador2.elegirPokemon();
						System.out.println(entrenador2.getNombre() + " cambio a " + pokemon4.getNombre());
					}
				}

				primero = false;

			} while (pokemon3.getActualHP() > 0 && pokemon4.getActualHP() > 0); // Cuando tienen salud los dos pokemon
																				// que luchan

			if (entrenador1.equipo.equipo.size() > 0 && entrenador2.equipo.equipo.size() > 0) { // Si hay pokemon en los
																								// equipo
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

			}

		} while (entrenador1.equipo.equipo.size() > 0 && entrenador2.equipo.equipo.size() > 0);

		System.out.println("______________________________________________________");
		System.out.println();

		// Muestra el ganador del combate
		if (entrenador1.equipo.equipo.size() == 0) {
			System.out.println("Ganador " + entrenador2.getNombre() + "!!!!!!!!");
		} else {
			System.out.println("Ganador " + entrenador1.getNombre() + "!!!!!!!!");
		}

	}
}
package models;

public class TipoPokemon {

	// Propiedades
	private String nombre;

	// Constructores
	public TipoPokemon(String nombre) {
		this.nombre = nombre;
	}


	// Getters y setters
	
	public String getNombre() {
		return nombre;
		
//		String tipo = null;
//
//		switch (nombre.toLowerCase()) {
//		case "bicho":
//			tipo = "bicho";
//			break;
//		case "dragon":
//			tipo = "dragon";
//			break;
//		case "electrico":
//			tipo = "electrico";
//			break;
//		case "hada":
//			tipo = "hada";
//			break;
//		case "lucha":
//			tipo = "lucha";
//			break;
//		case "fuego":
//			tipo = "fuego";
//			break;
//		case "siniestro":
//			tipo = "siniestro";
//			break;
//		case "volador":
//			tipo = "volador";
//			break;
//		case "fantasma":
//			tipo = "fantasma";
//			break;
//		case "planta":
//			tipo = "planta";
//			break;
//		case "tierra":
//			tipo = "tierra";
//			break;
//		case "hielo":
//			tipo = "hielo";
//			break;
//		case "normal":
//			tipo = "normal";
//			break;
//		case "veneno":
//			tipo = "veneno";
//			break;
//		case "psiquico":
//			tipo = "psiquico";
//			break;
//		case "roca":
//			tipo = "roca";
//			break;
//		case "acero":
//			tipo = "acero";
//			break;
//		case "agua":
//			tipo = "agua";
//			break;
//		default:
//			tipo = "No existe el tipo que de pokemon que has insertado";
//			break;
//		}
//
//		return tipo;
	}
	
	/**
	 * Te dice la efectividad que tiene un ataque de un tipo de pokemon hacia otro tipo de pokemon
	 * @param pokemon1 Pokemon que va a atacar
	 * @param pokemon Pokemon que va a recibir el ataque
	 * @return Efectividad del ataque
	 */
	
	public double getEfectividad(Movimiento movimiento, Pokemon pokemon) {
		
		switch (movimiento.getTipo().getNombre().toLowerCase()) {
		case "bicho":
			if(pokemon.tipo1.getNombre().equals("acero") || pokemon.tipo2.getNombre().equals("acero")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("fantasma") || pokemon.tipo2.getNombre().equals("fantasma")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("hada") || pokemon.tipo2.getNombre().equals("hada")) {
				return 0.5;
			}else if(pokemon.tipo1.getNombre().equals("fuego") || pokemon.tipo2.getNombre().equals("fuego")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("lucha") || pokemon.tipo2.getNombre().equals("lucha")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("planta") || pokemon.tipo2.getNombre().equals("planta")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("psiquico") || pokemon.tipo2.getNombre().equals("psiquico")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("siniestro") || pokemon.tipo2.getNombre().equals("siniestro")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("veneno") || pokemon.tipo2.getNombre().equals("veneno")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("volador") || pokemon.tipo2.getNombre().equals("volador")) {
				return 0.5;
			}
			break;
		case "dragon":
			if(pokemon.tipo1.getNombre().equals("acero") || pokemon.tipo2.getNombre().equals("acero")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("dragon") || pokemon.tipo2.getNombre().equals("dragon")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("hada") || pokemon.tipo2.getNombre().equals("hada")) {
				return 0;
			} 
			break;
		case "electrico":
			if(pokemon.tipo1.getNombre().equals("agua") || pokemon.tipo2.getNombre().equals("agua")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("dragon") || pokemon.tipo2.getNombre().equals("dragon")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("electrico") || pokemon.tipo2.getNombre().equals("electrico")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("planta") || pokemon.tipo2.getNombre().equals("planta")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("volador") || pokemon.tipo2.getNombre().equals("volador")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("tierra") || pokemon.tipo2.getNombre().equals("tierra")) {
				return 0;
			}
			break;
		case "hada":
			if(pokemon.tipo1.getNombre().equals("acero") || pokemon.tipo2.getNombre().equals("acero")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("dragon") || pokemon.tipo2.getNombre().equals("dragon")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("fuego") || pokemon.tipo2.getNombre().equals("fuego")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("lucha") || pokemon.tipo2.getNombre().equals("lucha")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("siniestro") || pokemon.tipo2.getNombre().equals("siniestro")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("veneno") || pokemon.tipo2.getNombre().equals("veneno")) {
				return 0.5;
			}
			break;
		case "lucha":
			if(pokemon.tipo1.getNombre().equals("acero") || pokemon.tipo2.getNombre().equals("acero")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("bicho") || pokemon.tipo2.getNombre().equals("bicho")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("hada") || pokemon.tipo2.getNombre().equals("hada")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("hielo") || pokemon.tipo2.getNombre().equals("hielo")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("fantasma") || pokemon.tipo2.getNombre().equals("fantasma")) {
				return 0;
			} else if(pokemon.tipo1.getNombre().equals("normal") || pokemon.tipo2.getNombre().equals("normal")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("psiquico") || pokemon.tipo2.getNombre().equals("psiquico")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("roca") || pokemon.tipo2.getNombre().equals("roca")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("siniestro") || pokemon.tipo2.getNombre().equals("siniestro")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("veneno") || pokemon.tipo2.getNombre().equals("veneno")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("volador") || pokemon.tipo2.getNombre().equals("volador")) {
				return 0.5;
			}
			break;
		case "fuego":
			if(pokemon.tipo1.getNombre().equals("acero") || pokemon.tipo2.getNombre().equals("acero")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("agua") || pokemon.tipo2.getNombre().equals("agua")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("bicho") || pokemon.tipo2.getNombre().equals("bicho")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("dragon") || pokemon.tipo2.getNombre().equals("dragon")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("fuego") || pokemon.tipo2.getNombre().equals("fuego")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("hielo") || pokemon.tipo2.getNombre().equals("hielo")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("planta") || pokemon.tipo2.getNombre().equals("planta")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("roca") || pokemon.tipo2.getNombre().equals("roca")) {
				return 0.5;
			}
			break;
		case "volador":
			if(pokemon.tipo1.getNombre().equals("acero") || pokemon.tipo2.getNombre().equals("acero")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("bicho") || pokemon.tipo2.getNombre().equals("bicho")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("electrico") || pokemon.tipo2.getNombre().equals("electrico")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("lucha") || pokemon.tipo2.getNombre().equals("lucha")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("planta") || pokemon.tipo2.getNombre().equals("planta")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("roca") || pokemon.tipo2.getNombre().equals("roca")) {
				return 0.5;
			}
			break;
		case "fantasma":
			if(pokemon.tipo1.getNombre().equals("normal") || pokemon.tipo2.getNombre().equals("normal")) {
				return 0;
			} else if(pokemon.tipo1.getNombre().equals("fantasma") || pokemon.tipo2.getNombre().equals("fantasma")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("psiquico") || pokemon.tipo2.getNombre().equals("psiquico")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("roca") || pokemon.tipo2.getNombre().equals("roca")) {
				return 0.5;
			}
			break;
		case "planta":
			if(pokemon.tipo1.getNombre().equals("acero") || pokemon.tipo2.getNombre().equals("acero")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("agua") || pokemon.tipo2.getNombre().equals("agua")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("bicho") || pokemon.tipo2.getNombre().equals("bicho")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("dragon") || pokemon.tipo2.getNombre().equals("dragon")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("fuego") || pokemon.tipo2.getNombre().equals("fuego")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("planta") || pokemon.tipo2.getNombre().equals("planta")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("roca") || pokemon.tipo2.getNombre().equals("roca")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("tierra") || pokemon.tipo2.getNombre().equals("tierra")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("veneno") || pokemon.tipo2.getNombre().equals("veneno")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("volador") || pokemon.tipo2.getNombre().equals("volador")) {
				return 0.5;
			}
			break;
		case "tierra":
			if(pokemon.tipo1.getNombre().equals("acero") || pokemon.tipo2.getNombre().equals("acero")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("bicho") || pokemon.tipo2.getNombre().equals("bicho")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("electrico") || pokemon.tipo2.getNombre().equals("electrico")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("fuego") || pokemon.tipo2.getNombre().equals("fuego")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("planta") || pokemon.tipo2.getNombre().equals("planta")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("roca") || pokemon.tipo2.getNombre().equals("roca")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("veneno") || pokemon.tipo2.getNombre().equals("veneno")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("volador") || pokemon.tipo2.getNombre().equals("volador")) {
				return 0;
			}
			break;
		case "siniestro":
			if(pokemon.tipo1.getNombre().equals("lucha") || pokemon.tipo2.getNombre().equals("lucha")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("fantasma") || pokemon.tipo2.getNombre().equals("fantasma")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("hada") || pokemon.tipo2.getNombre().equals("hada")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("psiquico") || pokemon.tipo2.getNombre().equals("psiquico")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("siniestro") || pokemon.tipo2.getNombre().equals("siniestro")) {
				return 0.5;
			} 
			break;
		case "hielo":
			if(pokemon.tipo1.getNombre().equals("acero") || pokemon.tipo2.getNombre().equals("acero")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("agua") || pokemon.tipo2.getNombre().equals("agua")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("dragon") || pokemon.tipo2.getNombre().equals("dragon")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("fuego") || pokemon.tipo2.getNombre().equals("fuego")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("hielo") || pokemon.tipo2.getNombre().equals("hielo")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("planta") || pokemon.tipo2.getNombre().equals("planta")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("tierra") || pokemon.tipo2.getNombre().equals("tierra")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("volador") || pokemon.tipo2.getNombre().equals("volador")) {
				return 2;
			} 
			break;
		case "normal":
			if(pokemon.tipo1.getNombre().equals("acero") || pokemon.tipo2.getNombre().equals("acero")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("fantasma") || pokemon.tipo2.getNombre().equals("fantasma")) {
				return 0;
			} else if(pokemon.tipo1.getNombre().equals("roca") || pokemon.tipo2.getNombre().equals("roca")) {
				return 0.5;
			}
			break;
		case "veneno":
			if(pokemon.tipo1.getNombre().equals("acero") || pokemon.tipo2.getNombre().equals("acero")) {
				return 0;
			} else if(pokemon.tipo1.getNombre().equals("fantasma") || pokemon.tipo2.getNombre().equals("fantasma")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("hada") || pokemon.tipo2.getNombre().equals("hada")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("planta") || pokemon.tipo2.getNombre().equals("planta")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("roca") || pokemon.tipo2.getNombre().equals("roca")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("tierra") || pokemon.tipo2.getNombre().equals("tierra")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("veneno") || pokemon.tipo2.getNombre().equals("veneno")) {
				return 0.5;
			}
			break;
		case "psiquico":
			if(pokemon.tipo1.getNombre().equals("acero") || pokemon.tipo2.getNombre().equals("acero")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("lucha") || pokemon.tipo2.getNombre().equals("lucha")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("psiquico") || pokemon.tipo2.getNombre().equals("psiquico")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("siniestro") || pokemon.tipo2.getNombre().equals("siniestro")) {
				return 0;
			} else if(pokemon.tipo1.getNombre().equals("veneno") || pokemon.tipo2.getNombre().equals("veneno")) {
				return 2;
			}
			break;
		case "roca":
			if(pokemon.tipo1.getNombre().equals("acero") || pokemon.tipo2.getNombre().equals("acero")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("bicho") || pokemon.tipo2.getNombre().equals("bicho")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("fuego") || pokemon.tipo2.getNombre().equals("fuego")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("hielo") || pokemon.tipo2.getNombre().equals("hielo")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("lucha") || pokemon.tipo2.getNombre().equals("lucha")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("tierra") || pokemon.tipo2.getNombre().equals("tierra")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("volador") || pokemon.tipo2.getNombre().equals("volador")) {
				return 2;
			}
			break;
		case "acero":
			if(pokemon.tipo1.getNombre().equals("acero") || pokemon.tipo2.getNombre().equals("acero")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("agua") || pokemon.tipo2.getNombre().equals("agua")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("electrico") || pokemon.tipo2.getNombre().equals("electrico")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("fuego") || pokemon.tipo2.getNombre().equals("fuego")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("hada") || pokemon.tipo2.getNombre().equals("hada")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("hielo") || pokemon.tipo2.getNombre().equals("hielo")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("roca") || pokemon.tipo2.getNombre().equals("roca")) {
				return 2;
			}
			break;
		case "agua":
			if(pokemon.tipo1.getNombre().equals("dragon") || pokemon.tipo2.getNombre().equals("dragon")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("agua") || pokemon.tipo2.getNombre().equals("agua")) {
				return 0.5;
			} else if(pokemon.tipo1.getNombre().equals("planta") || pokemon.tipo2.getNombre().equals("planta")) {
				return 0.5;
			}else if(pokemon.tipo1.getNombre().equals("fuego") || pokemon.tipo2.getNombre().equals("fuego")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("roca") || pokemon.tipo2.getNombre().equals("roca")) {
				return 2;
			} else if(pokemon.tipo1.getNombre().equals("tierra") || pokemon.tipo2.getNombre().equals("tierra")) {
				return 2;
			}
			break;
		}
		return 1;
	}

}

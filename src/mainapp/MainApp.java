package mainapp;

import java.util.ArrayList;

import models.Categoria;
import models.Combate;
import models.Entrenador;
import models.Equipo;
import models.Estado;
import models.Movimiento;
import models.Pokemon;
import models.TipoPokemon;

public class MainApp {

	public static void main(String[] args) {
		
		//Creo los tipos que voy a usar, lo haria con enums de manera mas eficiente, pero se ha pedido que solo por clases
		TipoPokemon tipoFuego = new TipoPokemon("fuego");
		TipoPokemon tipoAgua = new TipoPokemon("agua");
		TipoPokemon tipoPlanta = new TipoPokemon("planta");
		TipoPokemon tipoVeneno = new TipoPokemon("veneno");
		//TipoPokemon tipoBicho = new TipoPokemon("bicho");
		//TipoPokemon tipoRoca = new TipoPokemon("roca");
		TipoPokemon tipoVolador = new TipoPokemon("volador");
		TipoPokemon tipoNormal = new TipoPokemon("normal");
		TipoPokemon tipoTierra = new TipoPokemon("tierra");
		//TipoPokemon tipoLucha = new TipoPokemon("lucha");
		TipoPokemon tipoPsiquico = new TipoPokemon("psiquico");
		TipoPokemon nada = new TipoPokemon("");
		
		//Creo un estado, tambien lo haria por enums
		Estado estado = new Estado("sin efecto");
		
		//Creo las tres categorias de movimiento que hay, tambien lo haria por enums
		Categoria categoriaFisico = new Categoria("fisico");
		Categoria categoriaEspecial = new Categoria("especial");
		Categoria categoriaEstado = new Categoria("estado");


		
		ArrayList<Movimiento> movimientoCharizard = new ArrayList<Movimiento>();
		
		movimientoCharizard.add(new Movimiento("Lanzallamas", tipoFuego, categoriaEspecial, 15, 100, 90));
		movimientoCharizard.add(new Movimiento("Ataque Ala", tipoVolador, categoriaFisico, 35, 100, 60));
		movimientoCharizard.add(new Movimiento("Cuchillada", tipoNormal, categoriaFisico, 20, 100, 70)); 
		movimientoCharizard.add(new Movimiento("Colmillo Igneo", tipoFuego, categoriaFisico, 15, 95, 65)); 
		movimientoCharizard.add(new Movimiento("Cambiar Pokemon", null, null, 0, 0, 0)); 

		ArrayList<Movimiento> movimientoNidoking = new ArrayList<Movimiento>();
		movimientoNidoking.add(new Movimiento("Golpe", tipoNormal, categoriaFisico, 10, 100, 120)); 
		movimientoNidoking.add(new Movimiento("Cornada", tipoNormal, categoriaFisico, 25, 100, 65));
		movimientoNidoking.add(new Movimiento("Guardia Baja", tipoNormal, categoriaFisico, 20, 100, 70)); 
		movimientoNidoking.add(new Movimiento("Terremoto", tipoTierra, categoriaFisico, 10, 100, 100));
		movimientoNidoking.add(new Movimiento("Cambiar Pokemon", null, null, 0, 0, 0)); 

		ArrayList<Pokemon> pokemones1 = new ArrayList<Pokemon>();
		
		pokemones1.add(new Pokemon("Charizard", tipoFuego, tipoVolador, estado, 84, 78, 109, 85, 100, movimientoCharizard, 138, 42));
		pokemones1.add(new Pokemon("Nidoking", tipoVeneno, tipoTierra, estado, 102, 77, 85, 75, 85, movimientoNidoking, 136, 40));
		
		Equipo equipo1 = new Equipo(pokemones1);
		
		Entrenador entrenador1 = new Entrenador("Pepe", equipo1);
		

		ArrayList<Movimiento> movimientoGolduck = new ArrayList<Movimiento>();
		
		movimientoGolduck.add(new Movimiento("Acua Cola", tipoAgua, categoriaFisico, 10, 90, 90)); 
		movimientoGolduck.add(new Movimiento("Hidropulso", tipoAgua, categoriaEspecial, 20, 100, 60));
		movimientoGolduck.add(new Movimiento("Chirrido", tipoNormal, categoriaEstado, 40, 85, 0)); 
		movimientoGolduck.add(new Movimiento("Cabezazo Zen", tipoPsiquico, categoriaFisico, 15, 90, 80));
		movimientoGolduck.add(new Movimiento("Cambiar Pokemon", null, null, 0, 0, 0)); 
		
		ArrayList<Movimiento> movimientoVenusaur = new ArrayList<Movimiento>();
		movimientoVenusaur.add(new Movimiento("Hoja Afilada", tipoPlanta, categoriaFisico, 25, 95, 55)); 
		movimientoVenusaur.add(new Movimiento("Fuerza", tipoNormal, categoriaFisico, 15, 100, 80)); 
		movimientoVenusaur.add(new Movimiento("Desarrollo", tipoNormal, categoriaEstado, 20, 100, 0)); 
		movimientoVenusaur.add(new Movimiento("Corte", tipoNormal, categoriaFisico, 30, 95, 50)); 
		movimientoVenusaur.add(new Movimiento("Cambiar Pokemon", null, null, 0, 0, 0)); 

		ArrayList<Pokemon> pokemones2 = new ArrayList<Pokemon>();
		
		pokemones2.add(new Pokemon("Golduck", tipoAgua, nada, estado, 82, 78, 95, 80, 85, movimientoGolduck, 140, 41));
		pokemones2.add(new Pokemon("Venusaur", tipoPlanta , tipoVeneno, estado, 82, 83, 80, 80, 80, movimientoVenusaur, 146, 43));
		
		Equipo equipo2 = new Equipo(pokemones2);
		
		Entrenador entrenador2 = new Entrenador("Juan", equipo2);
		
		//Creamos el combate
		Combate combate = new Combate(entrenador1,entrenador2);
		
		//Iniciamos el combate pokemon
		combate.combatePokemon();
		
		
	}

}

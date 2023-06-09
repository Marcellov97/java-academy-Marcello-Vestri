package esercizio4.main.test;

import esercizio4.fumetteria.Fumetteria;
import esercizio4.fumetteria.Fumetto;

public class MainTest {

	public static void main(String[] args) {
		
		// creo l'array di fumetti che devono stare dentro la Fumetteria
		Fumetto[] fumetti = new Fumetto[5];
		
		fumetti[0] = new Fumetto("Batman", "Alan Moore", 1990, 5, "Mondadori", "Batman", "Tamaki");
		fumetti[1] = new Fumetto("Spiderman", "Verdi", 1987, 4, "Panini", "Spiderman", "Rossi");
		fumetti[2] = new Fumetto("Iron Man", "Bianchi", 1990, 3, "RW Lion", "Iron", "Bianchi");
		fumetti[3] = new Fumetto("HULK", "Alan Moore", 1954, 5, "Mondadori", "Batman", "Tamaki");
		fumetti[4] = new Fumetto("Batman", "Rossi", 1977, 6, "Panini", "Visione", "Tamaki");
		
		// Instanzio la fumetteria
		Fumetteria fumetteria = new Fumetteria("Star Shop", "Via Merliani", "Giovanni", 1000, fumetti);
		
		// stampo i dati
		fumetteria.stampaDati();

	}

}

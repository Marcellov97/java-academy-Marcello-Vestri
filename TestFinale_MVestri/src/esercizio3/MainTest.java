package esercizio3;

import esercizio3.implementazione.Calciatore;

public class MainTest {

	public static void main(String[] args) {
		
		Calciatore calciatore = new Calciatore("Lorenzo", "Insigne", 1983, "Napoli", "Toronto", "Attaccante", 20000, 4, 45000);
		
		calciatore.stampaDati();
		System.out.println("Il suo stipendio mensile e' di " + calciatore.calcolaStipendioMensile() + " euro");

	}

}

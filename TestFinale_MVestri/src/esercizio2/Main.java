package esercizio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> voti = new ArrayList<>();
		
		do {
			
			System.out.println("Inserire il voto dell'esame ");
			int value = sc.nextInt();
			
			if(value == -1) {	// se è -1 esci dal ciclo 
				break;
			}
			
			while (value < 18 || value > 30) {	// fin quando viene dato un valore sbagliato richiedilo
				System.out.println("Valore inserito non corretto!");
				System.out.println("Si prega di inserire un nuovo numero");
				value = sc.nextInt();
				
			}
			
			voti.add(value);	//aggiungi all'ArrayList
			
			
			
		} while (true);
		
		
		if (voti.size() != 0) {		// solo se l'array non è vuoto
			double avg = 0;
			
			for(int i=0; i<voti.size(); i++) {
				avg += voti.get(i).doubleValue();
			}
			
			avg = avg / voti.size();
			
			System.out.println("La media dei voti e': " + avg);
		}
		
		sc.close();

	}

}

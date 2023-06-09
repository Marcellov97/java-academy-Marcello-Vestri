package esercizio1;

public class Main {

	public static void main(String[] args) {
		
		int[] arr = {547, 87, 1, 24, 4, 9, 54, 37, 26, 19};
		
		double avg = 0;
		
		for(int i=0; i<arr.length; i++) {
			avg += arr[i];
		}
		
		avg = avg / arr.length;
		
		System.out.println("La media dei valori e': " + avg);

	}

}

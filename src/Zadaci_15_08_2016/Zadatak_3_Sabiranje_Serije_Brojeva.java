package Zadaci_15_08_2016;

public class Zadatak_3_Sabiranje_Serije_Brojeva {

	public static void main(String[] args) {
		/*
		 * 3. Napisati program koji sabira sljedeæu seriju 1/3 + 3/5 + 5/7 + 7/9
		 * + 9/11 + 11/13 ..... + 95/97 + 97/99.
		 */

	double suma = 0; // suma
		
		for(int i = 1; i < 98; i += 2) {
			// suma = suma + (i / (i + 2))
			suma += i / (i + 2.0);
		}
		
		// ispis sume
		System.out.printf("Suma brojeva je %1.2f",suma);
	}
}

	



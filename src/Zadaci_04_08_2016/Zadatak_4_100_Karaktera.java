package Zadaci_04_08_2016;

public class Zadatak_4_100_Karaktera {

	public static void main(String[] args) {
		/*
		 * 4. Napisati metodu koja printa 100 nasumiènih uppercase karaktera i
		 * 100 nasumiènih brojeva, 10 po liniji.
		 */

		// Poziv metode
		random();
	}

	// Metoda random
	public static void random() {
		// For petljom omogucavamo broj nasumicnih karaktera
		for (int i = 0; i < 100; i++) {
			char random = (char) ((int) ((Math.random() * 26) + 65));
			// Selekcijom if provjeramo da li je ispisano 10 u liniji
			if (i % 10 == 0) {
				System.out.println();
			}
			// Ispis
			System.out.print(random + " ");
		}
		System.out.println();
		// For petljom omogucavamo broj nasumicnih brojeva
		for (int i = 0; i < 100; i++) {
			int brojRandom = ((int) (Math.random() * 10));
			// Selekcijom if provjeramo da li je ispisano 10 u liniji
			if (i % 10 == 0) {
				System.out.println();
			}
			// Ispis
			System.out.print(brojRandom + " ");

		}
	}
}

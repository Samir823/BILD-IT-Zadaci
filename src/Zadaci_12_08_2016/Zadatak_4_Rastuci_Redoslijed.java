package Zadaci_12_08_2016;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak_4_Rastuci_Redoslijed {

	public static void main(String[] args) {
		/*
		 * 4. Napisati program koji pita korisnika da unese 3 cijela broja te mu
		 * ispiše ta ista tri broja u rastuæem redosljedu. Bonus: Napisati
		 * metodu koja prima tri cijela broja kao argumente te vraæa brojeve u
		 * rastuæem redosljedu.
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Unesite 3 cijela broja: ");// trazimo od korisnika
														// da unese 3 broja
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();

		System.out.println("Brojevi u rastucem redoslijedu su");// poziv i ispis
																// metode
		redoslijed(num1, num2, num3);
		input.close();
	}

	public static void redoslijed(int num1, int num2, int num3) {// metoda vraca
																	// brojeve u
																	// rastucem
																	// redoslijedu
		int array[] = { num1, num2, num3 };//kreiranje niza od 3 broja

		Arrays.sort(array);//sortiranje niza

		for (int j : array) {

			System.out.println(j + " ");
		}

	}

}

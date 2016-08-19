package Zadaci_18_08_2016;

import java.util.Scanner;

public class Zadatak_3_Pattern_Recognition {

	public static void main(String[] args) {
		/*
		 * 3. Chapter 7, zadatak 7.30 (Pattern recognition: consecutive four
		 * equal numbers) Write the following method that tests whether the
		 * array has four consecutive numbers with the same value.public static
		 * boolean isConsecutiveFour(int[] values) Write a test program that
		 * prompts the user to enter a series of integers and displays if the
		 * series contains four consecutive numbers with the same value. Your
		 * program should first prompt the user to enter the input size—i.e.,
		 * the number of values in the series. Here are sample runs:
		 */

		System.out.println("Unesite velicinu niza: ");

		Scanner input = new Scanner(System.in);

		int duzina = input.nextInt();

		System.out.println("Unesite " + duzina + " broja: ");
		int[] array = new int[duzina];

		for (int i = 0; i < array.length; i++) {// dodjeljivanje unosa u array
			array[i] = input.nextInt();

		}

		if (isConsecutiveFour(array)) {// provjera stanja metode i njen ispis
			System.out
					.println("Unos ima 4 broja koji se ponavlju jedan za drugim");
		} else
			System.out
					.println("Unos ne sadrzi broj koji se ponavlja zaredom 4 puta");

		input.close();
	}

	/**
	 * metoda vraca true ako se jedan od unesenih brojeva ponavlja 4 puta
	 * zaredom a ako se ne ponavlja vraca false.
	 **/
	public static boolean isConsecutiveFour(int[] values) {
		int counter = 0;
		int element = values[0];
		for (int i = 0; i < values.length; i++) { // petlja ide od prvog indexa
													// pa do posljednjeg
			if (element == values[i]) {
				counter++;
				if (counter == 4)
					return true;
			} else {
				element = values[i];
				counter = 1;
			}
		}
		return false;

	}

}

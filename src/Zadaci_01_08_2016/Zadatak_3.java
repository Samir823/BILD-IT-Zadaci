package Zadaci_01_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_3 {

	/*
	 * 3. Napisati metodu koja prima dva cijela broja kao argumente te vraæa
	 * najveæi zajednièki djelilac za ta dva broja.
	 * 
	 * PRIMJER:
	 * 
	 * Unesite prvi broj: 125 Unesite drugi broj: 2525 Najveæi zajednièki
	 * djelilac za brojeve 125 i 2525 je 25.
	 */
	public static void main(String[] args) {
		int br1 = 0;
		int br2 = 0;
		Scanner unos = new Scanner(System.in);

		// varijabla za kontrolisanje do while petlje
		boolean nastaviUnos = false;
		do {
			try {
				System.out.print("Unesite prvi broj: ");
				br1 = unos.nextInt();

				System.out.print("Unesite drugi broj: ");
				br2 = unos.nextInt();

				nastaviUnos = false;

			} catch (InputMismatchException a) { // U slucaju pogresnog unosa
													// korisnika, kao npr unos
													// slova,
													// try catch vraca stvar na
													// pocetak.

				unos.nextLine();
				nastaviUnos = true;
			}
		} while (nastaviUnos);

		System.out.println("Najveci zajednicki djelilac je: "
				+ racunaj(br1, br2));

		unos.close();
	}

	// Metoda za trazenje zajednickog djelilca
	public static int racunaj(int a, int b) {
		int najveciDjelilac = 1;

		int c = 0;

		// Selekcija odredjuje koji je broj veci, onaj koji je veci odredjuje
		// tok petlje
		if (a > b) {
			c = a;

		} else
			c = b;

		for (int i = 1; i < c; i++) {
			if (a % i == 0 && b % i == 0) {

				najveciDjelilac = i;
			}

		}

		return najveciDjelilac;

	}
}

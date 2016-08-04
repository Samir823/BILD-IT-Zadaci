package Zadaci_03_08_2016;

import java.util.Scanner;

public class Zadatak_1_Pocetni_i_Krajnji_Broj {

	public static void main(String[] args) {
		/*
		 * 1. Napisati metodu koja prima 2 argumenta: poèetni broj i krajnji
		 * broj te printa sve proste brojeve u zadanom rangu. BONUS: metoda može
		 * primati i treæi argument, broj brojeva za isprintati po liniji.
		 */

		// Kreiranje scannera
		Scanner unos = new Scanner(System.in);
		boolean prekidac = false;

		// do while petlju koristimo da omogucimo korisniku da ponovo unese broj
		// ako bi doslo do exceptiona..
		do {
			try {

				// Trazimo od korisnika da unese prvi i zadnji broj
				System.out.println("Unesite pocetni broj: ");
				int br1 = unos.nextInt();
				System.out.println("Unesite krajnji broj: ");
				int br2 = unos.nextInt();

				// Korisnik treba da unese u koliko linija zeli da mu se ispise
				// rezultat
				System.out.println("Unesite broj po liniji: ");
				int brLinija = unos.nextInt();

				// Pozivanje metode
				metoda(br1, br2, brLinija);
				prekidac = false;
			} catch (Exception e) {
				System.out
						.println("Doslo je do greske prilikom unosa, (unijeli ste nesto drugo osim broja)!!!");
				unos.nextLine();
				prekidac = true;
			}
		} while (prekidac);
		unos.close();
	}

	// Metoda za racunanje prostih brojeva
	public static void metoda(int broj1, int broj2, int brPoLiniji) {
		int count = 0; // brojac ispisanih brojeva
		System.out.println("Prosti brojevi su: ");

		for (int i = broj1; i <= broj2; i++) { // petlja se vrti u rasponu od prvog broja do drugog broja
												
			boolean isPrime = true; // promjenljiva koja oznacava da li je broj
									// prost ili ne
			// provjeravamo da li je broj prost tako sto ga dijelimo sa
			// brojevima od 2 do tog broja
			for (int j = 2; j < i; j++) {
				if (i % j == 0) { // ukoliko je broj djeljiv nekim brojem osim
									// samim sobom, onda nije prost
					isPrime = false;
					break;
				}
			}
			if (isPrime && i != 0 && i != 1) { // ako je broj prost, i ako nije
												// 0 i 1 onda ga stampamo
				count++;
				System.out.print(i + " ");
				if (count % brPoLiniji == 0) { // ako je isprintan odredjen broj
												// brojeva po liniji,
					// onda prelazi u novi red
					System.out.println();
				}

			}
		}
	}
}
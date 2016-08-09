package Zadaci_08_08_2016;

import java.util.Scanner;

public class Zadatak_5_Password {

	public static void main(String[] args) {
		/*
		 * 5. Neke web stranice forsiraju odreðena pravila za passworde.
		 * Napisati metodu koja provjerava da li je unijeti string validan
		 * password. Pravila da bi password bio validan su sljedeæa: 1. Password
		 * mora biti saèinjen od najmanje 8 karaktera. 2. Password smije da se
		 * sastoji samo od slova i brojeva. 3. Password mora sadržati najmanje 2
		 * broja. Napisati program koji pita korisnika da unese password te mu
		 * ispisuje "password je validan" ukoliko su sva pravila ispoštovana ili
		 * "password nije validan" ukoliko pravila nisu ispoštovana.
		 */

		Scanner unos = new Scanner(System.in);// kreiranje scannera
		System.out
				.print("Pasword mora biti saèinjen od najmanje 8 karaktera \nmora se sastojati od slova i brojeva\npasword mora sadržati najmanje 2 broja\nunesite pasword: ");

		boolean okidac = false;// petlja se ponavlja ukoliko dodje do pogresnog
								// unosa
		do {
			String korisnikpasw = unos.next();

			if (duzinapasword(korisnikpasw)// pozivanje metoda i provjera
											// njihovih stanja
					&& da_Li_Su_Dig_Ili_Letter(korisnikpasw)
					&& dvaBroja(korisnikpasw)) {
				System.out.println("Vas pasword je ispravan: ");
				okidac = false;

			} else {
				System.out.println("Pasword je pogresan, pokusajte ponovo");
				okidac = true;

			}

		} while (okidac);
		unos.close();

	}

	public static boolean duzinapasword(String pasw) {// metoda provjerava
														// duzinu stringa

		int duzinaPasw = pasw.length();
		if (duzinaPasw < 8) {
			return false;
		} else
			return true;
	}

	public static boolean da_Li_Su_Dig_Ili_Letter(String pasw) {// metoda
																// provjerava da
																// li je pasword
																// sacinjen samo
																// od slova i
																// brojeva
		int vrijednost = 0;
		for (int i = 0; i < pasw.length(); i++) {

			if (Character.isLetterOrDigit(pasw.charAt(i))) {
				vrijednost++;

			}

		}
		if (vrijednost == pasw.length()) {
			return true;
		} else
			return false;
	}

	public static boolean dvaBroja(String pasw) {// metoda provjerava da li se u
													// pasw nalaze najmanje 2
													// broja
		int brojBrojeva = 0;
		for (int i = 0; i < pasw.length(); i++) {

			if (Character.isDigit(pasw.charAt(i))) {
				brojBrojeva++;
			}
		}
		if (brojBrojeva >= 2) {
			return true;
		} else
			return false;

	}
}

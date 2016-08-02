package Zadaci_01_08_2016;

import java.util.Scanner;

public class Zadatak_2 {
	/*
	 * 2. Pretpostavimo da su slova A, E, I, O i U samoglasnici. (Smjela
	 * pretpostavka, znam) Napisati program koji pita korisnika da unese string
	 * te mu ispište broj samoglasnika i suglasnika u datom stringu.
	 */

	public static void main(String[] args) {

		// Importovanje Scannera
		Scanner unos = new Scanner(System.in);

		System.out.println("Unesite string/recenicu: ");

		// Sve pretvaramo u mala slova zbog lakse manipulacije u nastavku
		// programa
		
		String korisnik = unos.nextLine().toLowerCase();

		int brSamoglasnika = 0;
		int brSuglasnika = 0;

		// Petlja nam sluzi za prolaz kroz String

		for (int i = 0; i < korisnik.length(); i++) {

			char a = korisnik.charAt(i);
			if (Character.isLetter(a)) {

				if (a == 'a' || a == 'e' || a == 'i' || a == 'u' || a == 'o') {
					brSamoglasnika++;

				} else {
					brSuglasnika++;

				}

			}
		}
		System.out.println("Broj samoglasnika je " + brSamoglasnika
				+ " Broj suglasnika je " + brSuglasnika);
		unos.close();
	}
}

package Zadaci_16_08_2016;

import java.util.Scanner;

public class Zadatak_1_Palindrom {

	public static void main(String[] args) {
		/*
		 * 1. Napisati program koji pita korisnika da unese cijeli trocifreni
		 * broj te provjerava da li je unijeti broj palindrom. Broj je palindrom
		 * ukoliko se èita isto i sa lijeva na desno i sa desna na lijevo npr.
		 * 121, 131, itd.
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Unesite cijeli trocifren broj: ");

		// uzeti unos od korisnika
		int broj = input.nextInt();
		
		// zatvaranje Scannera
		input.close();

		// dobijanje prve cifre broja
		int prvaCifra = broj / 100;

		// dobijanje posljednje cifre broja
		int trecaCifra = broj % 10;

		// poredjenje prve i posljednje cifre, ako su jednake broj je palindrom
		if (prvaCifra == trecaCifra) {
			System.out.println("Broj " + broj + " je palindrom.");
		} else {
			System.out.println("Broj " + broj + " nije palindrom.");
		}
	}
}

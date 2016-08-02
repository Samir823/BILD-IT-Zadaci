package Zadaci_02_08_2016;

import java.util.Scanner;

public class Zadatak_5_Novcic {

	public static void main(String[] args) {
		/*
		 * 5. Napisati metodu koja prima jedan argument te simulira bacanje
		 * novèiæa toliko puta. Nakon što se simulacija završi, program ispisuje
		 * koliko puta je novèiæ pokazao glavu a koliko puta pismo
		 */

		System.out.println("Molimo vas unesite broj bacanja: ");

		Scanner unos = new Scanner(System.in);
		// Varijablom prekidac kontrolisemo do while petlju
		boolean prekidac = true;

		do {

			// Try catch koristi kod pogresnog unosa korisnika, odnosno unosa
			// slova itd..
			try {

				int unosKorisni = unos.nextInt();
				prekidac = false;

				// pozivanje metode
				metod(unosKorisni);

			} catch (Exception e) {
				System.out.println("Molimo vas da unesete broj!!!");
				unos.nextLine();
				prekidac = true;
			}
		} while (prekidac); // Petljom nudimo korisniku da ponovo odredi broj
							// bacanja ako unese slovo i dodje do exceptiona..
unos.close();
	}
	

	// Metoda za odredjivanje strana novcica
	public static void metod(int brBacanja) {

		// varijable u koje pohranjujemo vrijednosti koliko je novcic puta pao
		// na glavu a koliko na pismo

		int glava = 0;
		int pismo = 0;

		// Petlja odredjuje koliko ce se puta novcic baciti
		for (int i = 0; i < brBacanja; i++) {

			int broj = (int) (Math.random() * 2);

			if (broj == 1) {
				glava++;
			} else
				pismo++;
		}
		// Ispis rezultata bacanja

		System.out.println("Novcic je pao: " + glava
				+ " puta na glavu\na na pismo: " + pismo + " puta");

	}

}

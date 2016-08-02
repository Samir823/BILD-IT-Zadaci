package Zadaci_02_08_2016;

import java.util.Scanner;

public class Zadatak_2_Nasumicna_Pitanja {

	public static void main(String[] args) {
		/*
		 * 2. Napisati metodu koja prima jedan argument, broj pitanja, te
		 * generiše toliko nasumiènih, jednostavnih pitanja oduzimanja tipa :
		 * „Koliko je 5 - 2 ?“. Metoda treba da broji broj taènih i netaènih
		 * odgovora te ih ispiše korisniku.
		 */

		Scanner unos = new Scanner(System.in);

		// Pitamo korisnika koliko zeli pitanja
		System.out.println("Molimo vas unesite broj pitanja: ");

		// try catch koristimo u slucaju pogresnog unosa, stringa itd
		try {

			int korisnikPitanja = unos.nextInt();

			metoda(korisnikPitanja);

		} catch (Exception e) {

			System.out.println("Molimo unesite broj: ");

		}

		unos.close();
	}

	// Metoda za racunanje tacnih/netacnih odgovora
	public static void metoda(int brojPitanja) {
		Scanner unos2 = new Scanner(System.in);
		int tacniOdgori = 0;
		int netaèniOdgovori = 0;

		int broj1 = 0, broj2 = 0;

		// For petlja sluzi za postavljanje pitanja korisniku
		for (int i = 0; i < brojPitanja; i++) {
			broj1 = (int) (Math.random() * 10);
			broj2 = (int) (Math.random() * 10);
			System.out.println("Molimo unesite rezultat: " + broj1 + " - "
					+ broj2 + " = ");

			if (broj1 - broj2 == unos2.nextInt()) {
				tacniOdgori++;
			} else
				netaèniOdgovori++;

		}
		// Ispis tacnih i netacnih odgovora
		System.out.println("Tacnih odgovora bilo je: " + tacniOdgori
				+ "\nNetacnih odgovora bilo je: " + netaèniOdgovori);

		unos2.close();
	}

}

package Zadaci_03_08_2016;

import java.util.Scanner;

public class Zadatak_3_Identicni_Nizovi {

	public static void main(String[] args) {
		/*
		 * 3. Nizovi niz1 i niz2 su striktno identièni ukoliko su svi njihovi
		 * elementi na istim pozicijama jednaki. Napisati metodu koja vraæa true
		 * ukoliko su nizovi niz1 i niz2 striktno identièni. Koristiti sljedeæi
		 * header:public static boolean equals(int[ ] niz1, int[ ] niz2)
		 * 
		 * Napisati testni program koji pita korisnika da unese dva niza cijelih
		 * brojeva te provjerava da li su striktno identièni.
		 */
		// Kreiranje scannera
		Scanner unos = new Scanner(System.in);

		// Inicijalizacija varijable prekidac, koja nam sluzi za kontrolu do
		// while
		boolean prekidac = false;

		// do while petlja omogucava korisniku da se vrati na pocetak programa u
		// slucaju greske, s tim da ne mora ponovo pokretati program
		do {
			try {

				// Omogucavamo korisniku da unese duzinu niza
				System.out.println("Molimo vas unesite duzinu prvog niza: ");
				int duzinaPrvog = unos.nextInt();
				int niz1[] = new int[duzinaPrvog];

				System.out.println("Molimo vas unesite duzinu drugog niza: ");
				int duzinaDrugog = unos.nextInt();
				int niz2[] = new int[duzinaDrugog];

				// Ispunjavanje vrijednostima prvog niza for petljom
				System.out
						.println("Molimo vas unesite 5 cijelih brojeva u prvi niz: ");

				for (int i = 0; i < niz1.length; i++) {
					niz1[i] = unos.nextInt();
				}
				// Ispunjavanje vrijednostima drugog niza for petljom
				System.out
						.println("Molimo vas unesite 5 cijelih brojeva u drugi niz: ");
				for (int i = 0; i < niz2.length; i++) {
					niz2[i] = unos.nextInt();

				}

				// selekcija nam sluzi za odredjivanje daljeg toka programa u
				// slucaju da metoda vrati false i u drugom da vrati true

				if (equals(niz1, niz2) == false) {
					System.out.println("Nizovi nisu identicni");
				} else
					System.out.println("Nizovi su identicni");
				prekidac = false;
			} catch (Exception e) {//try catchom "hvatamo" exceptione koji se dese prilikom pogresnog unosa korisnika
				System.out
						.println("Doslo je do greske, molimo vas da unosite brojeve!!!");
				unos.nextLine();
				prekidac = true;
			}

		} while (prekidac);
		unos.close();
	}

	// metoda koja vraca true ili false
	public static boolean equals(int[] niz1, int[] niz2) {
		if (niz1.length != niz2.length) {
			return false;
		}
		for (int i = 0; i < niz1.length; i++) {
			if (niz1[i] != niz2[i]) {
				return false;
			}

		}

		return true;

	}

}

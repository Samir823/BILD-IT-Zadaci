package Zadaci_04_08_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_5_Niz_Cijelih_Brojeva {

	public static void main(String[] args) {
		/*
		 * 5. Napisati program koji uèitava neodreðeni broj cijelih brojeva
		 * (nula prekida unos) te ispisuje koliko je brojeva bilo iznad ili
		 * jednako prosjeku svih unešenih brojeva a koliko je bilo brojeva ispod
		 * prosjeka. Pretpostavimo da je maksimalan niz brojeva koje korisnik
		 * može unijeti 100.
		 */

		// Kreiranje scannera
		Scanner unos = new Scanner(System.in);

		// Deklarisanje varajabli u koje smjestamo vrijednosti
		int ukupanBrUnesenih = 0;
		int suma = 0;
		int iznadProsjeka = 0;
		int jednakoProsjeku = 0;
		int ispodProsjeka = 0;
		double prosjek = 0;

		// varijabla omogucava prekid ili nastavak do while petlje
		boolean prekidac = false;

		// kreiranje array liste
		ArrayList<Integer> lista = new ArrayList<Integer>();
		do {// do while petlja omogucava nastavak programa u slucaju pogresnog
			// unosa korisnika
			try {

				System.out
						.println("Unesite broj, 0 prekida unos, mozete unijeti maximalno 100 brojeva: ");
				// for petljom odredjujemo maximalan broj unosa
				for (int i = 0; i < 100; i++) {
					int korisnik = unos.nextInt();
					// uslov ako korisnik unese 0 da se izadje iz petlje
					if (korisnik == 0) {
						break;
					}
					// dodavanje elemenata u array listu
					lista.add(korisnik);
					// sumiranje elemenata u listi i dodjeljivanje vrijednosti
					// "suma" varijabli
					suma += lista.get(i);

				}
				prekidac = false;
			} catch (Exception e) {// try catch hvata exceptione i onemogucava
									// prekid programa, daje korisniku drugi
									// pokusaj
				System.out
						.println("Doslo je do greske, molimo vas da ne unosite nista osim brojeva!!!");
				unos.nextLine();
				prekidac = true;
			}
		} while (prekidac);
		// dodjeljivanje vrijednosti
		ukupanBrUnesenih = lista.size();
		// prosjek racunamo tako sto dijelimo sumu sa ukupnim brojem unesenih
		prosjek = (double) suma / ukupanBrUnesenih;
		// for petljom provjeravamo/uporedjujemo vrijednosti unosa da li su
		// vece,manje ili jednake od prosjeka
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) == prosjek) {
				jednakoProsjeku++;
			} else if (lista.get(i) < prosjek) {
				ispodProsjeka++;
			} else
				iznadProsjeka++;

		}
		// Ispis stanja
		System.out.println("Ukupan broj unesenih je: " + ukupanBrUnesenih
				+ "\nSuma unesenih brojeva je: " + suma
				+ "\nUkupan broj iznad prosjeka je:  " + iznadProsjeka
				+ "\nUkupan broj jednak prosjeku je: " + jednakoProsjeku
				+ "\nUkupan broj ispod prosjeka je: " + ispodProsjeka);
		System.out.printf("Prosjek unesenih brojeva je %2.2f ", prosjek);
		unos.close();
	}

}

package Zadaci_09_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_5_Milisekunde {

	public static void main(String[] args) {
		/*
		 * 5. Napisati metodu koja pretavara milisekunde u sate, minute i
		 * sekunde. Metoda treba da koristi sljedeæi header: public static
		 * String convertMillis(long millis). Metoda treba da vraæa vrijeme kao
		 * string u formatu sati:minute:sekunde. Na primjer
		 * convertMillis(100000) treba da vrati 0:1:40.
		 */

		Scanner unos = new Scanner(System.in);//kreiranje scannera
		System.out
				.println("Unesite koliko milisekundi zelite pretvoriti u format sati:minute:sekunde ");

		boolean on_off = false;//varijabla kontrolise petlju

		do {//petlja omogucava korisniku ponovan unos
			try {

				long milisekunde = unos.nextLong();// kreiranje promjenjive u
													// koju pohranjujemo
													// korisnikov unos

				System.out.println(convertMillis(milisekunde));// pozivanje i
																// printaje
																// metode

				on_off = false;
			} catch (InputMismatchException ex) {
				System.out.println("Greska!!! Unos mora biti u vidu broja: ");
				unos.nextLine();
				on_off = true;
			}

		} while (on_off);
		unos.close();
	}

	public static String convertMillis(long millis) {
		long ukupnoSekundi = millis / 1000;
		long ukupnoMinuta = ukupnoSekundi / 60;
		long ukupnoSati = ukupnoMinuta / 60;

		StringBuilder h = new StringBuilder();
		h.append(ukupnoSati + ":");
		h.append(ukupnoMinuta % 60 + ":");
		h.append(ukupnoSekundi % 60);

		return h.toString();
	}
}

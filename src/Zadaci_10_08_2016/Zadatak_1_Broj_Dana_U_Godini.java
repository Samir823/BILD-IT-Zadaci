package Zadaci_10_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_1_Broj_Dana_U_Godini {

	public static void main(String[] args) {
		/*
		 * 1. Napisati metodu koja vraæa broj dana u godini. Metoda koristi
		 * sljedeæi header: public static int numberOfDayInAYear(int year).
		 * Napisati program koji pita korisnika da unese poèetnu godinu, krajnju
		 * godinu te ispisuje broj dana za svaku godinu u rasponu
		 */

		Scanner input = new Scanner(System.in);// kreiranje scannera
		boolean on_off = false;// varijabla kontrolise petlju

		do {// petlja omogucava korisniku ponovan unos ako bi se dogodio ex
			try {

				System.out.println("Unesite pocetnu godinu: ");// trazimo od
																// korisnika da
																// unese pocetnu
																// i krajnju
																// godinu

				int startYear = input.nextInt();

				System.out.println("Unesite krajnju godinu: ");

				int lastYear = input.nextInt();

				for (int i = startYear; i <= lastYear; i++) {// petlja polazi i
																// ispisuje sve
																// godine u
																// rasponu od
																// pocetne do
																// krajnje
					System.out.println(numberOfDayInAYear(i) + " ");// pozivanje
																	// metode i
																	// ispis
																	// same

				}
				on_off = false;
			} catch (InputMismatchException ex) {// sprecava pad programa
				System.out.println("Greska!!! Unos mora biti u vidu broja");
				input.nextLine();
				on_off = true;
			}

		} while (on_off);
		input.close();
	}

	public static int numberOfDayInAYear(int year) {// metoda vraca broj dana u
													// godini, ovisno od toga da
													// li je prestupna bit ce
													// 366 ili 365

		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			return 366;

		} else
			return 365;

	}

}

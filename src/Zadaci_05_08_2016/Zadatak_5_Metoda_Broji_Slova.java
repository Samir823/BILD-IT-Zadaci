package Zadaci_05_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_5_Metoda_Broji_Slova {

	public static void main(String[] args) {
		/*
		 * 5. Napisati metodu koja broji slova u stringu. Metoda treba koristiti
		 * sljedeæi header: public static int countLetters(String s). Napisati
		 * program koji pita korisnika da unese neki string te mu vrati koliko
		 * taj string ima slova.
		 */

		Scanner unos = new Scanner(System.in);// Kreiranje scannera

		boolean prekidac = false;// Varujabla prekidac omogucava kontrolu do
									// while petlje

		do {// do while petlja omogucava korisniku ponovan unos ako dodje do
			// exceptiona
			try {

				System.out.print("Molimo vas da unesete string/recenicu: ");// trazimo
																			// od
																			// korisnika
																			// da
																			// unese
																			// string

				String korisnik = unos.nextLine();// Deklarisanje varijable
													// korisnik

				System.out.println("U datom stringu se nalazi "
						+ countLetters(korisnik) + " slova");// pozivanje i
																// ispis stanja
																// metode
			} catch (InputMismatchException e) {// try catch nam sluzi ako dodje
												// do exceptiona

			}
		} while (prekidac);
unos.close();
	}

	public static int countLetters(String s) {// metoda countLetter provjerava
												// kolicunu slova u stringu

		int brojSlova = 0;// iniciranje varijable brojSlova, koja nam omogucava
							// pohranjivanje broja slova u nju

		for (int i = 0; i < s.length(); i++) {// for petljom prolazimo kroz
												// string

			if (Character.isLetter(s.charAt(i))) {// selekcijom if provjeravamo
													// da li je na odredjenoj
													// poziciji slovo
				brojSlova++;// ako je uslov tacan povecavamo varijablu brojSLova
							// za 1
			}
		}

		return brojSlova;
	}
}

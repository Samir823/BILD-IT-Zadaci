package Zadaci_11_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_5_Suma_Prosjek_Unesenik {

	public static void main(String[] args) {
		/*
		 * 5. Napisati program koji uèitava neodreðen broj cijelih brojeva,
		 * odreðuje koliko je pozitivnih brojeva korisnik unijeo, koliko
		 * negativnih te izraèunava ukupnu sumu i prosjek svih unesenih brojeva.
		 * (Korisnik prekida unos tako što unese nulu). Na primjer, ukoliko
		 * korisnik unese 1 2 -1 3 0 program treba da ispiše da je broj
		 * pozitivnih brojeva 3, negativnih brojeva 1, suma ili zbir su 5.0 a
		 * prosjek svih brojeva je 1.25
		 */

		System.out.println("Unesite brojeve, 0 prekida unos: ");

		Scanner input = new Scanner(System.in);

		int num = input.nextInt();// varijabla za unos korisnika

		int pozitivni = 0;// kreiranje varijabli za spremanje vrijednosti
		int negativni = 0;
		double prosjek = 0;
		double suma = 0;

		try {

			while (num != 0) {// petlja ide dok korisnik ne unese 0
				if (num < 0) {
					negativni++;
				} else {
					pozitivni++;
				}
				suma += num;

				num = input.nextInt();

			}
			prosjek = suma / (negativni + pozitivni);

			System.out
					.printf("Ukupno pozitivnih: %d\nUkupno negativnih: %d\nSuma je: %2.2f\nProsjek je: %2.2f",// ispis
																												// poruke
																												// i
																												// stanje
																												// programa
							pozitivni, negativni, suma, prosjek);

		} catch (InputMismatchException ex) {// u slucaju ex try catch sprecava
												// pad programa
			System.out.println("Greska!!! Unesite cijeli broj");
			System.exit(0);// ako se desi ex metoda gasi program

		}

		input.close();
	}

}

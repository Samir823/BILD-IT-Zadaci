package Zadaci_17_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_2_Unicode {

	public static void main(String[] args) {
		/*
		 * 2. Napisati program koji prima karakter te vraæa njegov Unicode.
		 * Primjer: ukoliko korisnik unese karakter E program mu vraæa 69 kao
		 * unicode za taj karakter.
		 */

		Scanner input = new Scanner(System.in);

		char a = checkInput();//pozivanje metode i provjera unosa

		System.out.println("Unicode za taj karakter je : " + (int) a);//ispis
		input.close();
	}

	public static char checkInput() {//metoda za provjeru unosa
		char a = 0;
		boolean on_off = true;
		Scanner input = new Scanner(System.in);

		do {
			try {
				System.out.print("Unesite jedan karakter: ");
				
				a = (input.next()).charAt(0);
				on_off = false;

			} catch (InputMismatchException ex) {
				System.out.println("Doslo je do greske!!! Pokusajte ponovo: ");
				input.nextLine();
			}
			// petlja se izvrsava dok postoji greska
		} while (on_off);

		input.close();
		return a;
	}
}

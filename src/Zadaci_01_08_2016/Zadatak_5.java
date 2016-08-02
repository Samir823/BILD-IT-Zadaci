package Zadaci_01_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) {
		/*
		 * 5. Napisati program koji uèitava niz brojeva, pronalazi najveæi broj
		 * te ispisuje koliko se puta taj broj ponavlja. Pretpostavimo da se
		 * unos brojeva završava sa nulom.
		 */

		Scanner unos = new Scanner(System.in);

		
		int najveciBr = 1;
		int ponavljanje = 1;
		int brojac = 0;

		do {
			System.out
			.println("Unesite brojeve, 0 zavrsava unos ");

			

			try {
				najveciBr = unos.nextInt();
			} catch (Exception e) {
			System.out.println("Samo brojeve mozete unijeti, pokusaj ponovo");
			unos.nextLine();
				
			}

			// Provjera najveceg broja
			if (najveciBr > ponavljanje) {
				ponavljanje = najveciBr;
				brojac = 1;

				// brojanje ponavljanja najveceg elementa
			} else if (ponavljanje == najveciBr) {
				brojac++;
			}
			// s 0 prekidamo petlju
		} while (najveciBr != 0);

		
		System.out.println("Najveci broj koji ste unijeli je " + ponavljanje
				+ " i ponavlja se: " + brojac + " puta.");

		unos.close();
	}

}

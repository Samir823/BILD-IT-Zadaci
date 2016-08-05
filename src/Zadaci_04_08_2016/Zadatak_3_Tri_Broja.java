package Zadaci_04_08_2016;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak_3_Tri_Broja {

	public static void main(String[] args) {
		/*
		 * 3. Napisati metodu sa sljedeæim headerom koja ispisuje tri broja u
		 * rastuæem redosljedu: public static void displaySortedNumbers(double
		 * num1, double num2, double num3). Napisati program koji pita korisnika
		 * da unese tri broja te ispiše ta tri broja u rastuæem redosljedu.
		 */

		// Implementiramo scanner
		Scanner unos = new Scanner(System.in);
		// Inicijalizacija varijable okidac, koja sluzi za kontrolu do while
		// petlje
		boolean okidac = false;

		do {
			try {

				// Trazimo da korisnik unese 3 broja
				System.out.println("Molimo vas unesite 3 decimalna broja: ");
				double br1 = unos.nextDouble();
				double br2 = unos.nextDouble();
				double br3 = unos.nextDouble();

				// Pozivamo metodu i prosledjujemo joj vrijednosti koje je
				// korisnik odredio
				displaySortedNumbers(br1, br2, br3);
				okidac = false;// U slucaju da ne dodje do exceptiona okidac ce
								// ostati nepromjenjen, izaci ce iz petlje i
								// program ce zavrsiti
			} catch (Exception e) {// Exception nam sluzi da se program ne obori
									// i da omoguci korisniku novi unos
				System.out
						.println("Doslo je do greske, molimo vas da ponovite unos, unesite samo decimalne brojeve!!!");
				unos.nextLine();// nudimo korisniku da ponovo unosi brojeve
				okidac = true;// U slucaju da se dogodi exception okidac ide na
								// truei petlja nastavlja i omogucava korisniku
								// unos
			}

		} while (okidac);
		// zatvaramo scanner
		unos.close();
	}

	// metoda za prikaz brojeva u rastucem redoslijedu
	public static void displaySortedNumbers(double num1, double num2,
			double num3) {
		// kreiranje niza i prosledjivanje vrijednosti u njega od strane
		// korisnika
		double niz[] = new double[3];
		niz[0] = num1;
		niz[1] = num2;
		niz[2] = num3;
		// array.sort klasu koristimo za sortiranje niza
		Arrays.sort(niz);
		// for petljom ispisujemo niz
		
		System.out.println("Uneseni brojevi izgledaju ovako u rastucem redoslijedu: ");
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");

		}

	}

}

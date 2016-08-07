package Zadaci_06_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_1_Interesna_Stopa {

	public static void main(String[] args) {
		/*
		 * 1. Napisati program koji uèitava iznos investicije, godišnju
		 * interesnu stopu i broj godina te vraæa buduæu vrijednost investicije
		 * koristeæi se sljedeæom formulom: buducaVrijednostInvesticije =
		 * iznosInvesticije * (1 + mjesecnaInteresnaStopa)^brojGodina*12. Na
		 * primjer, ukoliko uneste kao iznos investicije 1000, 3.25 kao godišnju
		 * interesnu stopu i 1 kao broj godina program vam vraæa 1032.98 kao
		 * buducu vrijednost investicije.
		 */

		Scanner unos = new Scanner(System.in);// implementiranje scannera
		boolean on_off = false;// varijabla kontrolise petlju
		do {// petlja omogucava korisniku ponovan unos ako se desio exception
			try {// try catch hvata exceptione

				System.out.println("Unesite iznos investicije: ");// trazimo od
																	// korisnika
																	// da unese
																	// vrijednost

				double investicija = unos.nextInt();

				System.out.println("Unesite iznos godisnje interesne stope: ");

				double interesnaStopa = unos.nextDouble();

				System.out.println("Unesite broj godina: ");

				int godine = unos.nextInt();

				double buducaVrijednostInvesticije = Math.pow(// formula za
																// racunanje
																// buduce
																// vrijenosti
																// investicije
						(1 + interesnaStopa / (12 * 100)), godine * 12)
						* investicija;

				System.out.printf("Buduca vrijednost investicije je %1.2f KM",// ispis
						buducaVrijednostInvesticije);

				on_off = false;// varijabla ce promijeniti ili ostati na
								// vrijednosti false ako je prethodno doslo do
								// ex

			} catch (InputMismatchException ex) {
				System.out.println("Greska, unosite samo brojeve!!!");
				unos.nextLine();

				on_off = true;

			}
		} while (on_off);
		unos.close();
	}

}

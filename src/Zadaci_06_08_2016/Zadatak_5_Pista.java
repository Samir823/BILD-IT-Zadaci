package Zadaci_06_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_5_Pista {

	public static void main(String[] args) {
		/*
		 * 5. Ako imamo ubrzanje aviona a te brzinu pri kojoj avion uzlijeće v,
		 * možemo izračunati minimalnu dužinu piste potrebne da avion uzleti
		 * koristeći se sljedećom formulom: dužina = v * v / 2a. Napisati
		 * program koji pita korisnika da unese v u m/s i a u m/s² te ispisuje
		 * korisniku minimalnu dužinu piste. (Primjer: ukoliko unesemo 60 za
		 * brzinu i 3.5 za ubrzanje dužina piste je 514.286)
		 */

		Scanner unos = new Scanner(System.in);// kreiranje scannera

		boolean on_off = false;// varijabla kontrolise petlju

		do {// petljom omogucavamo korisniku drugi unos ako se desi exception

			try {// try catchom hvatamo exception

				System.out.println("Unesite ubrzanje aviona: ");// trazimo od
																// korisnika da
																// unese
																// vrijednosti

				double ubrzanje = unos.nextDouble();

				System.out.println("Unesite brzinu aviona: ");

				double brzina = unos.nextDouble();

				double duzina = (brzina * brzina) / (2 * ubrzanje);// formula za
																	// racunanje

				System.out.printf("Duzina piste je %1.1f m", duzina);// ispis
																		// rezultata
																		// vrsimo
																		// tako
																		// sto
																		// ispisujemo
																		// samo
																		// jedan
																		// broj
																		// iza
																		// decimalnog
																		// zareza

				on_off = false;// u slucaju da se dogodi ex promjenjivu vracamo
								// na prvobitno stanje i tako omogucimo programo
								// da zavrsi sa radom

			} catch (InputMismatchException ex) {
				System.out.println("Greska!!! Molimo vas da unosite brojeve");

				unos.nextLine();// omogucavamo korisniku drugi unos

				on_off = true;
			}

		} while (on_off);
		unos.close();

	}

}

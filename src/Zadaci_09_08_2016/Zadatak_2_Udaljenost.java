package Zadaci_09_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_2_Udaljenost {

	public static void main(String[] args) {
		/*
		 * 2. Great circle distance predstavlja udaljenost izmeðu dvije taèke na
		 * površine sfere. Neka nam (x1, y1) i (x2, y2) predstavljaju geografsku
		 * širinu i dužinu dvije taèke. Great circle distance izmeðu ove dvije
		 * taèke može biti izraèunata koristeæi se sljedeæom formulom: d =
		 * radius * arccos (sin(x1) X sin(x2) + cos(x1) * cos(x2) * cos(y1 -
		 * y2)). Napisati program koij pita korisnika da unese geografsku širinu
		 * i dužinu u stepenima dvije taèke na površini zemlje te mu ispisuje
		 * great circle distance. Prosjeèni radius zemlje je 6.371.01 km.
		 * Stepene koje korisnik unese trebamo promijeniti u radianse koristeæi
		 * se Math.toRadians metodom jer Java trigonometrijske metode koriste
		 * radianse. Širina i dužina u ovoj formuli se odnose na zapad i sjever.
		 * Koristimo negativne vrijednosti da oznaèimo istok i jug.
		 */

		Scanner unos = new Scanner(System.in);
		boolean on_off = false;

		do {

			try {

				System.out.println("Unesite koordinate (x1,y1)");// trazimo od
																	// korisnika
																	// unos
																	// koordinata

				double x1 = unos.nextDouble();// promjenjive za pohranu unosa
				double y1 = unos.nextDouble();

				System.out.println("Unesite koordinate (x2,y2)");

				double x2 = unos.nextDouble();
				double y2 = unos.nextDouble();

				double radius = 6371.01;// radius zemlje

				double udaljenost = radius// formula za dobijanje udaljenosti
											// izmedju tacaka
						* Math.acos(Math.sin(Math.toRadians(x1))
								* Math.sin(Math.toRadians(x2))
								+ Math.cos(Math.toRadians(x1))
								* Math.cos(Math.toRadians(x2))
								* Math.cos(Math.toRadians(y1)
										- Math.toRadians(y2)));

				System.out.printf(
						"distance izmedju ove dvije tacke je: %2.2f km ",
						udaljenost);

				on_off = false;
			} catch (InputMismatchException ex) {// try catch hvata ex
				System.out.println("Greska!!! Unos mora biti u vidu broja");
				unos.nextLine();
				on_off = true;
			}
		} while (on_off);
		unos.close();
	}

}

package Zadaci_03_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_5_Sortiranje_Redova_2D_Niza {

	public static void main(String[] args) {
		/*
		 * 5. Implementirati sljedeæu metodu da sortira redove u 2D nizu.
		 * 
		 * public static double[ ][ ] sortRows(double[ ][ ] array)
		 * 
		 * Napisati testni program koji pita korisnika da unese 3x3 matricu (ili
		 * da pita korisnika koliku matricu želi unijeti) te mu ispisuje na
		 * konzoli matricu sa sortiranim redovima - od najmanjeg broja do
		 * najveæeg.
		 */
		Scanner unos = new Scanner(System.in);
		boolean prekidac = false;

		// do while petlju koristimo da omogucimo korisniku da ponovo unese broj
		// ako bi doslo do exceptiona..
		do {
			try {
				// Trazimo od korisnika da unese broj kolona i redova

				System.out.print("Molimo vas unesite broj kolona: ");
				int kolona = unos.nextInt();
				System.out.println("Molimo vas unesite broj redova: ");
				int red = unos.nextInt();
				// Deklarisanje 2D niza
				double[][] m = new double[red][kolona];

				System.out.println("Unesite " + kolona + " kolone i " + red
						+ " reda ");
				// Korisnik unosi vrijednosti u 2D niz
				for (int i = 0; i < m.length; i++) {
					for (int j = 0; j < m[i].length; j++) {
						m[i][j] = unos.nextDouble();
					}
				}
				// Kreiranje novog niza i prosledjivanje prvobitnog koji je
				// sortiran

				double[][] sortirano = sortRows(m);

				// Ispis niza
				printMatrica(sortirano);

				prekidac = false;
			} catch (Exception e) {// try catchom "hvatamo" exceptione koji se
									// dese prilikom pogresnog unosa korisnika
				System.out.println("Doslo je do greske, unesite broj!!!");

				unos.nextLine();
				prekidac = true;
			}

		} while (prekidac);
		unos.close();

	}

	// Metoda ispisuje matricu
	public static void printMatrica(double[][] m) {

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("%2.1f ", m[i][j]);
			}
			System.out.println();
		}
	}

	// Motoda koja sotira redove
	public static double[][] sortRows(double[][] m) {

		double[][] sortiraniRedovi = new double[m.length][m[0].length];

		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m[0].length; j++)
				sortiraniRedovi[i][j] = m[i][j];

		// Petlja sortira redove
		for (int i = 0; i < sortiraniRedovi.length; i++) {

			for (int j = 0; j < sortiraniRedovi[0].length - 1; j++) {
				// Deklarisanje varijable koja ce uzimati najmanju vrijednost
				double najmanjaVrijednost = sortiraniRedovi[i][j];
				int minIndex = j;
				// petlja prolazi kroz niz i uzima najmanju vrijednost
				for (int kolona = j + 1; kolona < sortiraniRedovi[0].length; kolona++) {

					if (najmanjaVrijednost > sortiraniRedovi[i][kolona]) {
						najmanjaVrijednost = sortiraniRedovi[i][kolona];
						minIndex = kolona;
					}
				}

				if (minIndex != j) {
					sortiraniRedovi[i][minIndex] = sortiraniRedovi[i][j];
					sortiraniRedovi[i][j] = najmanjaVrijednost;
				}
			}
		}

		return sortiraniRedovi;
	}

}

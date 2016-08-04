package Zadaci_03_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_4_Lokacija_2D_Niza {

	public static void main(String[] args) {
		/*
		 * 4. Napisati metodu koja vraæa lokaciju najveæeg elementa u 2D nizu.
		 * Metoda treba da koristi sljedeæi header:
		 * 
		 * public static int[ ] locateLargest(double[ ][ ] a)
		 * 
		 * Napisati test program koji pita korisnika da unese 2D niz te mu
		 * ispisuje lokaciju najveæeg elementa u nizu.
		 */

		// Kreiranje scannera
		Scanner unos = new Scanner(System.in);

		// Varijabla prekidac kontrolise do while petlju
		boolean prekidac = false;

		// do while petlju koristimo da omogucimo korisniku da ponovo unese broj
		// ako bi doslo do exceptiona..
		do {

			try {
				// Pitamo korisnika da unese redove i kolone
				System.out.print("Molimo unesite broj redova: ");
				// dodjeljujemo vrijednost
				int red = unos.nextInt();
				System.out.print("Molimo unesite broj kolona: ");
				int kolona = unos.nextInt();

				// Kreiramo 2D niz

				double[][] niz = new double[red][kolona];

				// Korisnik unosi vrijednosti u 2D niz
				System.out.println("Unesite " + red + " reda and " + kolona
						+ " kolone: ");
				for (int i = 0; i < red; i++) {
					for (int k = 0; k < kolona; k++) {

						niz[i][k] = unos.nextDouble();
					}
				}

				int[] lokacija = locateLargest(niz);
				// Ispis lokacije i pozivanje metode najveceg elementa

				System.out.println("U matrici: \n");
				// pozivanje metode i ispis matrice
				printMatrica(niz);

				System.out.println("Najveci element se nalazi na lokaciji: "
						+ lokacija[0] + "," + lokacija[1]);
				prekidac = false;
			} catch (InputMismatchException ex) {//try catchom "hvatamo" exceptione koji se dese prilikom pogresnog unosa korisnika
				System.out
						.println("Doslo je do greske,pogresan unos, unesite cijeli broj!!!");
				unos.nextLine();
				prekidac = true;
			}

		} while (prekidac);

		unos.close();
	}

	// Metoda nam sluzi za pronalazak lokacije najveceg elementa
	public static int[] locateLargest(double[][] a) {

		// Inicijalizacija reda,kolone i najveceg elementa
		int maxRed = -2;
		int maxKolona = -2;
		double najveciBr = -2;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > najveciBr) {
					maxRed = i;
					maxKolona = j;
					najveciBr = a[i][j];
				}
			}
		}

		return new int[] { maxRed, maxKolona };

	}

	// Metoda omogucava ispis matrice
	public static void printMatrica(double[][] b) {
		for (int row = 0; row < b.length; row++) {
			for (int column = 0; column < b[row].length; column++) {
				System.out.print(b[row][column] + " ");

			}
			System.out.println();
		}

	}
}

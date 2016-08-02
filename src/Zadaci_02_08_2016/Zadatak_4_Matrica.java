package Zadaci_02_08_2016;

import java.util.Scanner;

public class Zadatak_4_Matrica {

	public static void main(String[] args) {

		/*
		 * 4. Napisati metodu koja ispisuje n x n matricu koriteæi sljedeæi
		 * header:
		 * 
		 * public static void printMatrix(int n)
		 * 
		 * Svaki element u matrici je ili 0 ili 1, generisan nasumièno. Napisati
		 * test program koji pita korisnika da unese n te ispisuje n x n
		 * matricu.
		 */

		// Kreiranje scannera
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite broj : ");

		int brojMatrice = unos.nextInt();
		unos.close();

		// Pozivanje metode
		printMatrix(brojMatrice);
	}

	// Metoda za kreiranje matrice
	public static void printMatrix(int n) {

		int[][] matrica = new int[n][n];

		// For petljom dodjeljujemo elemente dvodimenzionalnom nizu
		for (int redovi = 0; redovi < matrica.length; redovi++) {
			for (int kolone = 0; kolone < matrica[redovi].length; kolone++) {
				matrica[redovi][kolone] = (int) (Math.random() * 2);

			}

		}
		// Ispis dvodimenzionalnog niza/matrice
		for (int redovi = 0; redovi < matrica.length; redovi++) {
			for (int kolone1 = 0; kolone1 < matrica[redovi].length; kolone1++) {
				System.out.print(matrica[redovi][kolone1] + " ");
			}
			System.out.println();
		}
	}

}

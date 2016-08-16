package Zadaci_15_08_2016;

import java.util.Scanner;

public class Zadatak_5_Matrica {

	public static void main(String[] args) {
		/*
		 * 5. Napisati metodu koja ispisuje n x n matricu koristeæi se sljedeæim
		 * headerom: public static void printMatrix(int n). Svaki element u
		 * matrici je ili 0 ili 1, nasumièno generisana. Napisati test program
		 * koji pita korisnika da unese broj n te mu ispiše n x n matricu u
		 * konzoli
		 */

		Scanner unos = new Scanner(System.in);// kreiranje scannera

		System.out.println("Unesite broj: ");

		int n = unos.nextInt();

		unos.close();

		printMatrix(n);// pozivanje i ispis metode
	}

	public static void printMatrix(int n) {// metoda sortira i ispisuje matricu

		int[][] matrica = new int[n][n];

		for (int redovi = 0; redovi < matrica.length; redovi++) {// petlja unosi
																	// vrijednost
																	// u matricu
			for (int kolone = 0; kolone < matrica[redovi].length; kolone++) {
				matrica[redovi][kolone] = (int) (Math.random() * 2);

			}

		}
		for (int redovi = 0; redovi < matrica.length; redovi++) {// ispis
																	// matrice
			for (int kolone1 = 0; kolone1 < matrica[redovi].length; kolone1++) {
				System.out.print(matrica[redovi][kolone1] + " ");
			}
			System.out.println();
		}
	}
}
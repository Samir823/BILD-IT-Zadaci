package Zadaci_18_08_2016;

import java.util.Scanner;

public class Zadatak_5_Algebra_Add_Two_Matrices {

	public static void main(String[] args) {
		/*
		 * 8.5 (Algebra: add two matrices) Write a method to add two matrices.
		 * The header of the method is as follows: public static double[][]
		 * addMatrix(double[][] a, double[][] b) In order to be added, the two
		 * matrices must have the same dimensions and the same or compatible
		 * types of elements. Let c be the resulting matrix. Each element cij is
		 * aij + bij. For example, for two 3 * 3 matrices a and b, c is ￡ a11
		 * a12 a13 a21 a22 a23 a31 a32 a33 ≥ + ￡ b11 b12 b13 b21 b22 b23 b31 b32
		 * b33 ≥ = ￡ a11 + b11 a12 + b12 a13 + b13 a21 + b21 a22 + b22 a23 + b23
		 * a31 + b31 a32 + b32 a33 + b33 ≥ Write a test program that prompts the
		 * user to enter two 3 * 3 matrices and displays their sum. Here is a
		 * sample run: Enter matrix1: 1 2 3 4 5 6 7 8 9 Enter matrix2: 0 2 4 1
		 * 4.5 2.2 1.1 4.3 5.2 The matrices are added as follows 1.0 2.0 3.0 0.0
		 * 2.0 4.0 1.0 4.0 7.0 4.0 5.0 6.0 + 1.0 4.5 2.2 = 5.0 9.5 8.2 7.0 8.0
		 * 9.0 1.1 4.3 5.2 8.1 12.3 14.2
		 */

		Scanner input = new Scanner(System.in); // kreiranje scannera

		// ispis poruke korisniku
		System.out
				.println("Ovaj program omogucava kreiranje trece matrice na osnovu"
						+ " dvije unesene\n"
						+ "Uslov je da te dvije moraju biti istih dimenzija\n\nUnesite koliko redova zelite u prvoj matrici: ");

		int red = input.nextInt();

		System.out.println("\nUnesite koliko kolona zelite u prvoj matrici: ");

		int kolona = input.nextInt();

		System.out.println("Unesite cijele brojeve u prvu " + red + " x "
				+ kolona + " matricu: ");

		int prvaMat[][] = new int[red][kolona];// kreiranje prve matrice

		for (int redovi = 0; redovi < prvaMat.length; redovi++) {// unos
																	// vrijednosti
																	// u matricu

			for (int kolone = 0; kolone < prvaMat[redovi].length; kolone++) {
				prvaMat[redovi][kolone] = input.nextInt();
			}
		}
		System.out.println();
		print(prvaMat);// ispis prve matrice

		System.out.println("\nUnesite koliko redova zelite u drugoj matrici: ");
		int red2 = input.nextInt();
		System.out.println("Unesite koliko kolona zelite u drugoj matrici: ");
		int kol2 = input.nextInt();

		int drugaMat[][] = new int[red2][kol2];// kreiranje druge matrice

		if (prvaMat.length != drugaMat.length// ako nisu prva i druga matrica
												// istih dimenzija zavrsi
												// program
				|| prvaMat[0].length != drugaMat[0].length) {
			System.out.println("Matrice moraju biti istih dimezija !");
			System.exit(0);

		}
		System.out.println("Unesite cijele brojeve u drugu " + red2 + " x "
				+ kol2 + " matricu: ");

		for (int redovi = 0; redovi < drugaMat.length; redovi++) {// unos
																	// vrijednosti
																	// u drugu
																	// matricu

			for (int kolone = 0; kolone < drugaMat[redovi].length; kolone++) {
				drugaMat[redovi][kolone] = input.nextInt();

			}
		}
		print(drugaMat);

		double[][] result = addMatrix(prvaMat, drugaMat);

		System.out.println("Suma dvije matrice je rezultat treca matrica: ");

		for (int i = 0; i < result.length; i++) {// ispis trece matrice
			for (int j = 0; j < result[0].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();

		}
		input.close();
	}

	public static double[][] addMatrix(int[][] prvaMat, int[][] drugaMat) {// metoda
																			// kojom
																			// se
																			// dobiva
																			// treca
																			// matrica

		double[][] result = new double[prvaMat.length][drugaMat[0].length];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++)
				result[i][j] = prvaMat[i][j] + drugaMat[i][j];
		}
		return result;

	}

	public static void print(int[][] matrix) {// metoda za ispis matrica
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}
}

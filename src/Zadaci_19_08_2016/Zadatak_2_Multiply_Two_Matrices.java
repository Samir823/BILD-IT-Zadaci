package Zadaci_19_08_2016;

import java.util.Scanner;

public class Zadatak_2_Multiply_Two_Matrices {

	public static void main(String[] args) {
		/*
		 * (Algebra: multiply two matrices) Write a method to multiply two
		 * matrices. The header of the method is: public static double[][]
		 * multiplyMatrix(double[][] a, double[][] b) To multiply matrix a by
		 * matrix b, the number of columns in a must be the same as the number
		 * of rows in b, and the two matrices must have elements of the same or
		 * compatible types. Let c be the result of the multiplication. Assume
		 * the column size of matrix a is n. Each element cij is ai1 * b1j + ai2
		 * * b2j + c + ain * bnj.
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

		System.out.println("Unesite brojeve u prvu " + red + " x " + kolona
				+ " matricu: ");

		double[][] prvaMat = new double[red][kolona];// kreiranje prve matrice

		for (int redovi = 0; redovi < prvaMat.length; redovi++) {// unos
																	// vrijednosti
																	// u matricu

			for (int kolone = 0; kolone < prvaMat[redovi].length; kolone++) {
				prvaMat[redovi][kolone] = input.nextDouble();
			}
		}
		System.out.println();
		print(prvaMat);// ispis prve matrice

		System.out.println("\nUnesite koliko redova zelite u drugoj matrici: ");
		int red2 = input.nextInt();
		System.out.println("Unesite koliko kolona zelite u drugoj matrici: ");
		int kol2 = input.nextInt();

		double[][] drugaMat = new double[red2][kol2];// kreiranje druge matrice

		if (prvaMat.length != drugaMat.length// ako nisu prva i druga matrica
												// istih dimenzija zavrsi
												// program
				|| prvaMat[0].length != drugaMat[0].length) {
			System.out.println("Matrice moraju biti istih dimezija !");
			System.exit(0);

		}
		System.out.println("Unesite brojeve u drugu " + red2 + " x " + kol2
				+ " matricu: ");

		for (int redovi = 0; redovi < drugaMat.length; redovi++) {// unos
																	// vrijednosti
																	// u drugu
																	// matricu

			for (int kolone = 0; kolone < drugaMat[redovi].length; kolone++) {
				drugaMat[redovi][kolone] = input.nextDouble();

			}
		}
		print(drugaMat);

		double[][] result = addMatrix(prvaMat, drugaMat);

		System.out
				.println("Proizvod dvije  matrice je rezultat treca matrica: ");

		for (int i = 0; i < result.length; i++) {// ispis trece matrice
			for (int j = 0; j < result[0].length; j++) {
				System.out.printf("% 2.1f ", result[i][j]);
			}
			System.out.println();

		}
		input.close();
	}

	public static double[][] addMatrix(double[][] a, double[][] b) {// metoda
																	// kojom
																	// se
																	// dobiva
																	// treca
																	// matrica

		double[][] c = new double[a[0].length][b[0].length];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				for (int k = 0; k < a[0].length; k++) {
					c[i][j] = c[i][j] + a[i][k] * b[k][j];
				}
			}
		}
		return c;
	}

	public static void print(double[][] prvaMat) {// metoda za ispis matrica
		for (int i = 0; i < prvaMat.length; i++) {
			for (int j = 0; j < prvaMat[0].length; j++) {
				System.out.print(prvaMat[i][j] + " ");
			}
			System.out.println();
		}

	}
}

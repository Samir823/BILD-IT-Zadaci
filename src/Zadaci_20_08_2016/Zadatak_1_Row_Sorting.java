package Zadaci_20_08_2016;

import java.util.Scanner;

public class Zadatak_1_Row_Sorting {

	public static void main(String[] args) {
		/*
		 * 1. Chapter 8, zadatak 8.26 (Row sorting) Implement the following
		 * method to sort the rows in a twodimensional array. A new array is
		 * returned and the original array is intact. public static double[][]
		 * sortRows(double[][] m) Write a test program that prompts the user to
		 * enter a 3 * 3 matrix of double values and displays a new row-sorted
		 * matrix.
		 */

		double[][] m = new double[3][3];

		Scanner input = new Scanner(System.in);
		System.out.println("Unesi 3x3 matricu: ");
		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m[i].length; j++)
				m[i][j] = input.nextDouble();

		displayMatrix(m);
		System.out.println("Kada su redovi sortirani matrica izgeda ovako: ");

		double[][] sorted = sortRows(m);
		displayMatrix(sorted);

		input.close();
	}

	public static void displayMatrix(double[][] m) {// printanje matrice

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("%2.1f ", m[i][j]);
			}
			System.out.println("");
		}
	}

	public static double[][] sortRows(double[][] m) {// metoda za sortiranje
														// redova matrice

		double[][] sortedRows = new double[m.length][m[0].length];

		for (int i = 0; i < m.length; i++)
			for (int j = 0; j < m[0].length; j++)
				sortedRows[i][j] = m[i][j];

		for (int i = 0; i < sortedRows.length; i++) {

			for (int j = 0; j < sortedRows[0].length - 1; j++) {

				double currentMin = sortedRows[i][j];
				int minIndex = j;
				for (int column = j + 1; column < sortedRows[0].length; column++) {

					if (currentMin > sortedRows[i][column]) {
						currentMin = sortedRows[i][column];
						minIndex = column;
					}
				}

				if (minIndex != j) {
					sortedRows[i][minIndex] = sortedRows[i][j];
					sortedRows[i][j] = currentMin;
				}
			}
		}

		return sortedRows;

	}
}

package Zadaci_18_08_2016;

import java.util.Scanner;

public class Zadatak_4_Sum_Elements_Column_By_Column {

	public static void main(String[] args) {
		/*
		 * *8.1 (Sum elements column by column) Write a method that returns the
		 * sum of all the elements in a specified column in a matrix using the
		 * following header: public static double sumColumn(double[][] m, int
		 * columnIndex) Write a test program that reads a 3-by-4 matrix and
		 * displays the sum of each column. Here is a sample run: Enter a 3-by-4
		 * matrix row by row: 1.5 2 3 4 5.5 6 7 8 9.5 1 3 1 Sum of the elements
		 * at column 0 is 16.5 Sum of the elements at column 1 is 9.0 Sum of the
		 * elements at column 2 is 13.0 Sum of the elements at column 3 is 13.0
		 */
		Scanner input = new Scanner(System.in);
		int kol = 0;

		double[][] matrix = new double[3][4];// kreiranje matrice
		{
			System.out.println("Unesite elemente u matricu 3-4: ");

			for (int redovi = 0; redovi < matrix.length; redovi++) {// petlja za
																	// unosenje
																	// vrijednosti
																	// u matricu
				for (int kolone = 0; kolone < matrix[redovi].length; kolone++) {
					matrix[redovi][kolone] = input.nextDouble();

				}
			}
			System.out.println("Unesite kolonu koju zelite sumirati: ");
			kol = input.nextInt();

		}
		ispisMatrice(matrix);// ispis matrice

		System.out.println(sumColumn(matrix, kol));// pozivanje i sumiranje u
													// odredjenoj koloni
		input.close();
	}

	public static double sumColumn(double[][] m, int columnIndex) {// metoda
																	// vraca
																	// sumu u
																	// odredjenoj
																	// koloni

		double sum = 0;

		for (int i = 0; i < m.length; i++) {
			sum += m[i][columnIndex];
		}
		return sum;
	}

	public static void ispisMatrice(double[][] m) {// metoda ispisuje matricu
		for (int redovi = 0; redovi < m.length; redovi++) {
			for (int kolone1 = 0; kolone1 < m[redovi].length; kolone1++) {
				System.out.print(m[redovi][kolone1] + " ");
			}
			System.out.println();
		}
	}
}
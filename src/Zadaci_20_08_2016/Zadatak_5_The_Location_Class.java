package Zadaci_20_08_2016;

import java.util.Scanner;

public class Zadatak_5_The_Location_Class {

	public static void main(String[] args) {

		/*
		 * (The Location class) Design a class named Location for locating a
		 * maximal value and its location in a two-dimensional array. The class
		 * contains public data fields row, column, and maxValue that store the
		 * maximal value and its indices in a two-dimensional array with row and
		 * column as int types and maxValue as a double type. Write the
		 * following method that returns the location of the largest element in
		 * a two-dimensional array: public static Location
		 * locateLargest(double[][] a)
		 */

		Scanner input = new java.util.Scanner(System.in);

		System.out.print("Unesi broj redova: ");

		int redovi = input.nextInt();

		System.out.print("Unesi broj kolona: ");

		int kolone = input.nextInt();

		double[][] matrica = new double[redovi][kolone];//kreiranje matrice

		System.out.println("Unesi matricu: " + redovi + "X" + kolone);// unos
																		// vrijednosti
																		// u
																		// matricu
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				matrica[i][j] = input.nextDouble();
			}
		}

		displayMatrix(matrica);// ispis matrice
		Location lokacija = largest(matrica);
		// print result
		System.out.printf("\nLokacija najveceg elementa\n"
				+ "Najveci element je %1.1f\nNa poziciji (%d, %d)\n",
				lokacija.maxValue, lokacija.row, lokacija.column);
		input.close();
	}

	private static Location largest(double[][] m) {// metoda vraca najvecu
													// vrijednost i njezinu
													// lokaciju

		Location lokacija = new Location();// kreiranje objekta

		// pocetna vrijednost za najvecu vrijednost
		lokacija.maxValue = m[0][0];

		for (int red = 0; red < m.length; red++) {
			for (int kolona = 0; kolona < m[red].length; kolona++) {

				if (lokacija.maxValue < m[red][kolona]) {
					lokacija.maxValue = m[red][kolona];

					lokacija.row = red;
					lokacija.column = kolona;
				}
			}
		}
		return lokacija;
	}

	public static void displayMatrix(double[][] m) {// printanje matrice

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("%2.1f ", m[i][j]);
			}
			System.out.println("");
		}
	}
}

class Location {// kreiranje klase lokacija
	public int row;
	public int column;
	public double maxValue;

	public Location() {// kreiranje no arg konstruktora

	}

}

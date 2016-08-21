package Zadaci_20_08_2016;

import java.util.Scanner;

public class Zadatak_2_Strictly_Identical_Arrays {

	public static void main(String[] args) {
		/*
		 * (Strictly identical arrays) The two-dimensional arrays m1 and m2 are
		 * strictly identical if their corresponding elements are equal. Write a
		 * method that returns true if m1 and m2 are strictly identical, using
		 * the following header: public static boolean equals(int[][] m1,
		 * int[][] m2) Write a test program that prompts the user to enter two 3
		 * * 3 arrays of integers and displays whether the two are strictly
		 * identical.
		 */
		Scanner input = new Scanner(System.in);

		int[][] m = new int[3][3];// kreiranje prve matrice

		System.out.println("Unesite brojeve u prvu matricu");// unos vrijednosti
																// u prvu
																// matricu
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = input.nextInt();

			}
		}
		System.out.println("Unesite brojeve u drugu matricu");// kreiranje druge
																// matrice i
																// unos
																// vrijednosti u
																// nju
		int[][] m2 = new int[3][3];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m2[i][j] = input.nextInt();
			}
		}

		if (equals(m, m2)) {// pozivanje metode i ispis stanja
			System.out.println("Matrice su identicne");
		} else
			System.out.println("Matrice su razlicite");
		input.close();
	}

	/**
	 * metoda provjerava da li postoji razlika izmjedju dvije matrice i vraca
	 * true ili false
	 **/
	public static boolean equals(int[][] matrica1, int[][] matrica2) {

		for (int i = 0; i < matrica1.length; i++) {
			for (int j = 0; j < matrica1.length; j++) {
				if (matrica1[i][j] != matrica2[i][j]) {
					return false;

				}

			}
		}
		return true;
	}
}

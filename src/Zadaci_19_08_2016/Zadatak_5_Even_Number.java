package Zadaci_19_08_2016;

public class Zadatak_5_Even_Number {

	public static void main(String[] args) {
		/*
		 * 5. Chapter 8, zadatak 8. 22(Even number of 1s) Write a program that
		 * generates a 6-by-6 two-dimensional matrix filled with 0s and 1s,
		 * displays the matrix, and checks if every row and 1. every column have
		 * an even number of 1s.
		 */

		int[][] array = new int[6][6];// kreiranje niza

		for (int red = 0; red < array.length; red++) {// punjenje niza
			for (int kolona = 0; kolona < array[red].length; kolona++) {
				array[red][kolona] = (int) (Math.random() * 2);
				System.out.print(array[red][kolona] + " ");
			}
			System.out.println();
		}

		provjeraReda(array);
		provjeraKolone(array);

	}

	// matrica koja provjerava da li svaki red ima paran broj 1-ica
	public static void provjeraReda(int matrix[][]) {//metoda vraca ima li paran broj jedinica u redu

		int counter = 0; // brojac jedinica u matrici

		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[i].length; j++) {
				// if uslov za brojanje jedinica u redovima
				if (matrix[i][j] == 1) {
					counter++;
				}
			}

			if (counter % 2 == 0 && counter != 0) {
				System.out.println("Red " + i + " ima paran broj jedinica ");
				counter = 0;
			} else {
				System.out.println("Red " + i + " nema paran broj jedinica ");
				counter = 0;
			}
		}

	}

	public static void provjeraKolone(int matrix[][]) {//metoda vraca ima li paran broj jedinica u koloni

		int counter = 0; // brojac jedinica u matrici

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[j][i] == 1)
					counter++;
			}

			if (counter % 2 == 0 && counter != 0) {
				System.out.println("Kolona " + i + " ima paran broj jedinica ");
				counter = 0;
			} else {
				System.out
						.println("Kolona " + i + " nema paran broj jedinica ");
				counter = 0;
			}
		}

	}
}

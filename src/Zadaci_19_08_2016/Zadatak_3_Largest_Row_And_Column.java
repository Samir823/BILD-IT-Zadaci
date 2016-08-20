package Zadaci_19_08_2016;

public class Zadatak_3_Largest_Row_And_Column {

	public static void main(String[] args) {
		/*
		 * (Largest row and column) Write a program that randomly fills in 0s
		 * and 1s into a 4-by-4 matrix, prints the matrix, and finds the first
		 * row and column with the most 1s. Here is a sample run of the program:
		 * 0011 0011 1101 1010 The largest row index: 2 The largest column
		 * index: 2
		 */

		int[][] matrica = new int[4][4];// kreiranje matrice

		for (int i = 0; i < matrica.length; i++) {// punjenje matrice
			for (int j = 0; j < matrica[i].length; j++) {
				matrica[i][j] = (int) (Math.random() * 2);
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}

		int[] sumaRedova = sumirajRedove(matrica);// kreiranje nizova od
													// sumiranih kolona i redova
		int[] sumaKolona = sumirajKolone(matrica);

		int maxIndexZaRed = max(sumaRedova);
		int maxIndexZaKol = max(sumaKolona);

		// ispis poruke
		System.out.println("Najvise jedinica se nalazi u redu na  "
				+ indexOfMax(sumaRedova, maxIndexZaRed) + " indexu");

		System.out.println("Najvise jedinica se nalazi u koloni na "
				+ indexOfMax(sumaKolona, maxIndexZaKol) + " indexu");
	}

	public static int[] sumirajRedove(int[][] matrix) {// metoda za sumiranje
														// redova

		int[] sumR = new int[matrix.length];// kreiranje niza

		for (int i = 0; i < matrix.length; i++) {
			int sum = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				sum += matrix[i][j];
			}
			sumR[i] = sum;
		}
		return sumR;
	}

	public static int[] sumirajKolone(int[][] matrix) {// metoda vraca sumu
														// redova

		int[] sumC = new int[matrix.length];

		for (int i = 0; i < matrix.length; i++) {
			int sum = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				sum += matrix[j][i];
			}
			sumC[i] = sum;
		}
		return sumC;
	}

	public static int max(int[] array) {// metoda vraca niz u kojem se najvise
										// ponavlja jedinica
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}

	public static int indexOfMax(int[] array, int maxNum) {// vraca index niza u
															// kojem se najvise
															// ponavlja jedinica
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (maxNum == array[i]) {
				index = i;
				break;
			}
		}
		return index;
	}
}

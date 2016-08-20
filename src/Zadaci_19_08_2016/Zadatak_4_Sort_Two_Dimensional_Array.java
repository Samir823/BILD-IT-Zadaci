package Zadaci_19_08_2016;

public class Zadatak_4_Sort_Two_Dimensional_Array {

	public static void main(String[] args) {
		/*
		 * 4. Chapter 8, zadatak 8.16(Sort two-dimensional array) Write a method
		 * to sort a two-dimensional array using the following header: public
		 * static void sort(int m[][]) The method performs a primary sort on
		 * rows and a secondary sort on columns. For example, the following
		 * array {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}} will be sorted to
		 * {{1, 1},{1, 2},{1, 7},{4, 1},{4, 2},{4, 5}}.
		 */

		int[][] matrica = { { 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 1, 1 },// kreiranje
				// matrice
				{ 4, 1 } };

		sort(matrica);// poziv i ispis metode

	}

	public static void sort(int m[][]) { // metoda sortira redove pa tek onda
											// kolone

		for (int i = 0; i < m.length - 1; i++) {
			for (int j = 0; j < m.length - i - 1; j++) {

				if (sum(m[j]) > sum(m[j + 1])) {
					int[] tmp = m[j];
					m[j] = m[j + 1];
					m[j + 1] = tmp;

				}
			}
		}

		for (int i = 0; i < m.length - 1; i++) {
			for (int j = 0; j < m.length - i - 1; j++) {

				if (m[j][0] > m[j + 1][0]) {
					int[] tmp = m[j];
					m[j] = m[j + 1];
					m[j + 1] = tmp;

				}
			}
		}

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static int sum(int[] m) {// metoda vraca sumu u redovima
		int sum = 0;
		for (int i : m) {
			sum += i;
		}
		return sum;
	}

}
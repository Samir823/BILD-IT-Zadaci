package Zadaci_06_09_2016;

public class Zadatak_3_Sum_series {

	public static void main(String[] args) {
		/*
		 * 18.4 (Sum series) Write a recursive method to compute the following
		 * series: m(i) = 1 + 1 2 + 1 3 + c + 1 i Write a test program that
		 * displays m(i) for i = 1, 2, . . ., 10.
		 */

		System.out.printf("%.2f", sum(10));

	}

	public static double sum(double n) {

		if (n <= 1)
			return n;
		return 1 / n + sum(n - 1);

	}

}
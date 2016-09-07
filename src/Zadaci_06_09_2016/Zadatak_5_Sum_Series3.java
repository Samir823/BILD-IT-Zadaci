package Zadaci_06_09_2016;

public class Zadatak_5_Sum_Series3 {
	/*
	 * *18.6 (Sum series) Write a recursive method to compute the following
	 * series: m(i) = 1 2 + 2 3 + c + i i + 1 Write a test program that displays
	 * m(i) for i = 1, 2, . . ., 10.
	 */

	public static void main(String[] args) {

		System.out.printf("%.2f", sum(10));

	}

	public static double sum(double n) {

		if (n < 1)
			return n;
		return n / ((2 * n) + 1) + sum(n - 1);

	}

}

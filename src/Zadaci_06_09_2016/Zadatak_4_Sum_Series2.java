package Zadaci_06_09_2016;

public class Zadatak_4_Sum_Series2 {

	public static void main(String[] args) {
		/*
		 * 18.5 (Sum series) Write a recursive method to compute the following
		 * series: m(i) = 1 3 + 2 5 + 3 7 + 4 9 + 5 11 + 6 13 + c + i 2i + 1
		 * Write a test program that displays m(i) for i = 1, 2, . . ., 10.
		 */

		System.out.printf("%.2f", sum(10));

	}

	public static double sum(double n) {

		if (n < 1)
			return 0;
		return (n / (n + 1)) + sum(n - 1);

	}

}
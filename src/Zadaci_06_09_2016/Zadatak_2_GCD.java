package Zadaci_06_09_2016;

import java.util.Scanner;

public class Zadatak_2_GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out
				.println("Enter two integers you want to find greatest common divisor for:");
		System.out.println(gcd(input.nextInt(), input.nextInt()));
		input.close();
	}

	// Recoursive method that returns greatest common divisor for two integers

	public static int gcd(int a, int b) {
		// base case
		if (a == 0 || b == 0)
			return a + b;
		return gcd(b, a % b);

	}

}
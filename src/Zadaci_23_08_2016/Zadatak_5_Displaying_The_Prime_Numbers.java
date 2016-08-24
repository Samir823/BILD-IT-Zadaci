package Zadaci_23_08_2016;

public class Zadatak_5_Displaying_The_Prime_Numbers {

	public static void main(String[] args) {
		/*
		 * *10.6 (Displaying the prime numbers) Write a program that displays
		 * all the prime numbers less than 120 in decreasing order. Use the
		 * StackOfIntegers class to store the prime numbers (e.g., 2, 3, 5, ...)
		 * and retrieve and display them in reverse order.
		 */

		System.out.println("Printanje prime brojeva ispod 120.. ");

		StackOfIntegers stack = new StackOfIntegers(20);
		// ako je broj prost pohranjuje se u stack
		for (int i = 2; i < 120; i++) {
			if (isPrime(i)) {
				stack.push(i);
			}
		}
		// stampanje dok god ima ista u stacku
		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
	}

	public static boolean isPrime(int n) {// metoda za pronalazak prime broja

		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				count++;
		}
		if (count == 2)
			return true;
		else
			return false;

	}

}

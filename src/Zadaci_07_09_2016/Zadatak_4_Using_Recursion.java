package Zadaci_07_09_2016;

import java.util.Scanner;

public class Zadatak_4_Using_Recursion {

	public static void main(String[] args) {
		/*
		 * *18.11 (Sum the digits in an integer using recursion) Write a
		 * recursive method that computes the sum of the digits in an integer.
		 * Use the following method header: public static int sumDigits(long n)
		 * For example, sumDigits(234) returns 2 + 3 + 4 = 9. Write a test
		 * program that prompts the user to enter an integer and displays its
		 * sum.
		 */
		Scanner input = new Scanner(System.in);		//creating new Scanner object
		System.out.println("Enter your number: ");
		long n = input.nextLong();			//number input
		input.close();
		
		System.out.println("Sum is: " + sumDigits(n));		//calling method and print result
	}
	
	/* Recursive method for computing the sum of digits in number */
	public static int sumDigits(long n) {
		int sum = 0;
		if (n > 0) {
			sum += n % 10;
			return sum += sumDigits(n / 10);	//add digit to sum
		}
		return sum;
	}
}

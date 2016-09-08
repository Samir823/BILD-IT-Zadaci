package Zadaci_07_09_2016;

import java.util.Scanner;

public class Zadatak_2_Print_The_Characters_In_A_String_Reversely {

	public static void main(String[] args) {
		/*
		 * 18.9 (Print the characters in a string reversely) Write a recursive
		 * method that displays a string reversely on the console using the
		 * following header: public static void reverseDisplay(String value) For
		 * example, reverseDisplay("abcd") displays dcba. Write a test program
		 * that prompts the user to enter a string and displays its reversal.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string:");
		reverseDisplay(input.nextLine());
		input.close();
	}

	// recursive method that prints string in reversed order
	public static void reverseDisplay(String value) {
		// base case(if string only have 1 letter we print that letter)
		if (value.length() == 1)
			System.out.print(value);
		// printing out last letter and use recursion to remove it afterwards
		else {
			System.out.print(value.charAt(value.length() - 1));
			reverseDisplay(value.substring(0, value.length() - 1));
		}

	}

}
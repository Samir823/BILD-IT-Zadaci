package Zadaci_07_09_2016;

import java.util.Scanner;

public class Zadatak_3_Occurrences_Of_A_Specified_Character {

	public static void main(String[] args) {
		/*
		 * (Occurrences of a specified character in a string) Write a recursive
		 * method that finds the number of occurrences of a specified letter in
		 * a string using the following method header: public static int
		 * count(String str, char a) For example, count("Welcome", 'e') returns
		 * 2. Write a test program that prompts the user to enter a string and a
		 * character, and displays the number of occurrences for the character
		 * in the string.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string: ");
		// taking string from user
		String str = input.nextLine();
		System.out.println("Enter character: ");
		// taking character from user
		char ch = input.next().charAt(0);
		// printing out result
		input.close();
		System.out.println(count(str, ch));

	}

	// method that finds and returns how many times character is repeated in the
	// string

	public static int count(String str, char a) {
		if (str.length() < 1)
			return 0;
		// if characters match increment by 1
		else if (str.charAt(str.length() - 1) == a)
			return 1 + count(str.substring(0, str.length() - 1), a);
		// else just use recursion to remove last char
		else
			return 0 + count(str.substring(0, str.length() - 1), a);

	}

}
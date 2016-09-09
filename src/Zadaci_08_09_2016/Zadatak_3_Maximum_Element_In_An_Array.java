package Zadaci_08_09_2016;

import java.util.Scanner;

public class Zadatak_3_Maximum_Element_In_An_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in); // creating new object
		System.out.println("Enter string:");
		String s = input.next(); // string input
		System.out.println("Enter character:");
		char ch = input.next().charAt(0); // character input
		input.close();

		System.out.println("Number of occurrences: " + count(s, ch)); // print
																		// number
																		// of
																		// occurrences
	}

	/* Recursive method for counting occurrences of a specified character */
	public static int count(String str, char a) {
		int count = 0;
		if (str.length() != 0) {
			if (str.charAt(0) == a) {
				count++;
			}
			return count += count(str.substring(1), a); // calling method
														// without first char
		}
		return count;
	}
}
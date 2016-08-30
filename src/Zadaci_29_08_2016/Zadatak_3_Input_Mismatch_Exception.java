package Zadaci_29_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_3_Input_Mismatch_Exception {

	public static void main(String[] args) {
		/*
		 * *12.2 (InputMismatchException) Write a program that prompts the user
		 * to read two integers and displays their sum. Your program should
		 * prompt the user to read the number again if the input is incorrect.
		 */

		Scanner input = new Scanner(System.in);
		System.out.print("Unesite dva cijela broja: ");
		int first = 0;
		int second = 0;

		boolean isGood = false;

		while (!isGood) {

			try {
	first = input.nextInt();
				second = input.nextInt();
				isGood = true;
			} catch (InputMismatchException ex) {

				input.nextLine();
				System.out.println("Pogresan unos...");
				System.out.print("Unesi dva cijela broja: ");

			}
		}
		// ispis sume
		System.out.println("Zbir brojeva " + first + " + " + second + " = "
				+ (first + second));

		input.close();
	}

}

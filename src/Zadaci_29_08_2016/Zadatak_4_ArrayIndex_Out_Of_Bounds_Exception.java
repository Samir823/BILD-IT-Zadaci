package Zadaci_29_08_2016;

import java.util.Scanner;

public class Zadatak_4_ArrayIndex_Out_Of_Bounds_Exception {

	public static void main(String[] args) {
		/*
		 * *12.3 (ArrayIndexOutOfBoundsException) Write a program that meets the
		 * following requirements: ■ Creates an array with 100 randomly chosen
		 * integers. ■ Prompts the user to enter the index of the array, then
		 * displays the corresponding element value. If the specified index is
		 * out of bounds, display the message Out of Bounds.
		 */
		// Napravimo niz i ogranicimo ga sa 100

		Scanner input = new Scanner(System.in);
		int[] array = new int[100];

		// Unesemo random brojeve u niz
		for (int i = 0; i < 100; i++) {
			array[i] = (int) (Math.random() * 100);
		}
		// Uzimamo od korisnika index
		System.out.println("Enter the index: ");
		int index = input.nextInt();

		// Stampamo odredjen index u okviru niza
		try {
			System.out.println("Element on index " + index + " is: "
					+ array[index]);
			// Stampamo poruku ako index ne postoji
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Out of bounds.");
		}
	}
}

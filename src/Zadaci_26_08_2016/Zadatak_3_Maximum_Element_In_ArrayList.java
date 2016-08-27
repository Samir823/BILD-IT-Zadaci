package Zadaci_26_08_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_3_Maximum_Element_In_ArrayList {

	public static void main(String[] args) {
		/*
		 * 11.4 (Maximum element in ArrayList) Write the following method that
		 * returns the maximum value in an ArrayList of integers. The method
		 * returns null if the list is null or the list size is 0. public static
		 * Integer max(ArrayList<Integer> list)Write a test program that prompts
		 * the user to enter a sequence of numbers ending with 0, and invokes
		 * this method to return the largest number in the input.
		 */

		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.print("Enter input end with zero to stop: ");
		int temp;
		do {
			temp = input.nextInt();
			if (temp != 0) {
				list.add(temp);
			}
		} while (temp != 0);

		System.out.println("Max number is " + max(list));
	}

	public static Integer max(ArrayList<Integer> list) {

		if (list == null || list.isEmpty())
			return null;

		int max = list.get(0);
		for (int i : list) {
			if (i > max) {
				max = i;
			}
		}

		return max;

	}

}

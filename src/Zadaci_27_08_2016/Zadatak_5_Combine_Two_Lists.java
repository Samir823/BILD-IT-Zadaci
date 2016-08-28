package Zadaci_27_08_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_5_Combine_Two_Lists {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * 11.14 (Combine two lists) Write a method that returns the union of
		 * two array lists of integers using the following header: public static
		 * ArrayList<Integer> union( ArrayList<Integer> list1,
		 * ArrayList<Integer> list2)
		 */

		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		System.out.println("Unesite 5 cijelih brojeva u prvu array listu:");
		// unos prvih 5 integera

		list1.add(input.nextInt());
		list1.add(input.nextInt());
		list1.add(input.nextInt());
		list1.add(input.nextInt());
		list1.add(input.nextInt());
		System.out.println("Unesite 5 cijelih brojeva u drugu array listu:");
		// unos sledecih 5 integera
		list2.add(input.nextInt());
		list2.add(input.nextInt());
		list2.add(input.nextInt());
		list2.add(input.nextInt());
		list2.add(input.nextInt());
		System.out.println("Kombinovana lista je:");
		for (int ex : union(list1, list2)) {
			System.out.print(ex + " "); // ispis kombiniranih nizova
		}
	}

	// metoda vraca spojen niz
	public static ArrayList<Integer> union(ArrayList<Integer> list1,
			ArrayList<Integer> list2) {
		list1.addAll(list2); // dodavanje liste2 u listu1
		return list1;
	}

}
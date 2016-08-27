package Zadaci_26_08_2016;

import java.util.ArrayList;

public class Zadatak_5_Shuffle_ArrayList {

	public static void main(String[] args) {
		/*
		 * 11.7 (Shuffle ArrayList) Write the following method that shuffles the
		 * elements in an ArrayList of integers. public static void
		 * shuffle(ArrayList<Integer> list)
		 */
		// array list object
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			// adding numbers to the list
			list.add(i);
		}
		System.out.println("Original list:" + list);

		System.out.println("Shuffling list :");
		// invoking the shuffle method
		shuffle(list);

	}

	public static void shuffle(ArrayList<Integer> list) {
		// loop that will iterate as many time as list have elements
		for (int i = 0; i < list.size(); i++) {
			// temp value that stores value of element we remove
			int num = list.get(i);
			// removing element
			list.remove(list.get(i));
			// creating random index
			int random = (int) (Math.random() * list.size() - 1);
			// //adding back the value of element we removed at random index
			list.add(random, num);
		}
		// printing out new "shuffled" list
		System.out.println(list);

	}

}

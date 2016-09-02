package Zadaci_01_09_2016;

import java.util.ArrayList;

public class Zadatak_4_Shuffle_ArrayList {

	public static void main(String[] args) {
		/*
		 * *13.2 (Shuffle ArrayList) Write the following method that shuffles an
		 * ArrayList of numbers: public static void shuffle(ArrayList<Number>
		 * list)
		 */

		
		ArrayList<Integer> list = new ArrayList<>();//kreiranje array liste
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		shuffle(list);//pozivanje metode

	}

	public static void shuffle(ArrayList<Integer> list) {
		
		for (int i = 0; i < list.size(); i++) {
			
			int num = list.get(i);
			
			list.remove(list.get(i));
			
			int random = (int) (Math.random() * list.size() - 1);
			
			list.add(random, num);
		}
	
		System.out.println(list);

	}

}
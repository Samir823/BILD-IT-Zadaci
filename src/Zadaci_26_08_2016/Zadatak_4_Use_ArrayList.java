package Zadaci_26_08_2016;

import java.sql.Date;
import java.util.ArrayList;

public class Zadatak_4_Use_ArrayList {

	public static void main(String[] args) {
		/*
		 * 11.6 (Use ArrayList) Write a program that creates an ArrayList and
		 * adds a Loan object, a Date object, a string, and a Circle object to
		 * the list, and use a loop to display all the elements in the list by
		 * invoking the object’s toString() method.
		 */

		ArrayList<Object> list = new ArrayList<>();
		// add Circle object to the list
		list.add(new Circle(2));
		// add a string to the list
		list.add("Hello I'm a string");
		// add a Date object to the list
		list.add(new Date(0));
		// add a Loan object to the list
		list.add(new Loan(2500));

	}

}

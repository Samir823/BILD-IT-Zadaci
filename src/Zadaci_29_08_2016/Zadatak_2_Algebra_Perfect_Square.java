package Zadaci_29_08_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_2_Algebra_Perfect_Square {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * **11.17 (Algebra: perfect square) Write a program that prompts the
		 * user to enter an integer m and find the smallest integer n such that
		 * m * n is a perfect square. (Hint: Store all smallest factors of m
		 * into an array list. n is the product of the factors that appear an
		 * odd number of times in the array list. For example, consider m = 90,
		 * store the factors 2, 3, 3, 5 in an array list. 2 and 5 appear an odd
		 * number of times in the array list. So, n is 10.) Here are sample
		 * runs:
		 */

		System.out.print("Unesite cijeli broj m: ");
		int m = checkInput(); // 
		System.out
				.println("Najmanji broj za savrseni kvadrat "
						+ getN(m) + "\nm*n je " + m * getN(m));
	}

	// returns n
	public static int getN(int m) {
		ArrayList<Integer> list = new ArrayList<>();// array lista za integere
		int i = 2; // 
		while (m != 1) {
			if (m % i == 0) { // dobiti najmanji faktor
				list.add(i);
				m /= i;
			} else
				i++;
		}
		int pom = 1, count = 0;
		
		for (int j = 0; j < list.size(); j++) {
			count = 0;
			for (int k = 0; k < list.size(); k++) {
				if (list.get(j) == list.get(k)) {
					count++;
				}
			}
			
			if (count % 2 == 1)
				pom *= list.get(j);

		}
		return pom;

	}


	public static int checkInput() {

		int num = 0;
		boolean error = true; 

		do {
			try {
				num = input.nextInt();
				
				error = false;
			} catch (InputMismatchException e) {
				System.out.print("Pogresan unos, pokusaj ponovo:  ");
				input.nextLine();
			}
		} while (error);

		return num;
	}
}
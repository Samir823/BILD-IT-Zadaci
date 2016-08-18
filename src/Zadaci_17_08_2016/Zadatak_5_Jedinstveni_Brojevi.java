package Zadaci_17_08_2016;

import java.util.ArrayList;

import java.util.Scanner;

public class Zadatak_5_Jedinstveni_Brojevi {

	public static void main(String[] args) {
		/*
		 * 5. Napisati program koji uèitava 10 brojeva te ispisuje koilko je
		 * jedinstvenih brojeva unijeto te sve jedinstvene brojeve koji su
		 * unijeti, razmaknute jednim spaceom. Ukoliko se neki broj pojavljuje
		 * više puta, broj treba ispisati samo jednom.
		 */
		Scanner input = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>();// kreiranje array liste
		System.out.println("Unesite 10 cijelih brojeva:");
		for (int i = 0; i < 10; i++) {
			int num = input.nextInt();
			if (!list.contains(num)) {//dodaj brojeve u listu ako se broj ne nalazi u listi
				list.add(num);
			}

		}
		System.out.println("Jedinstveni brojevi su: ");
		for (Integer integer : list) {// ispi brojeva
			System.out.println(integer);

		}
		input.close();
	}

}

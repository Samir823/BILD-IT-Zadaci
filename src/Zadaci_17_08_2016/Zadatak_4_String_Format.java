package Zadaci_17_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_4_String_Format {

	public static void main(String[] args) {
		/*
		 * 4. Napisati metodu sa sljedeæim headerom: public static String
		 * format(int number, int width) koja vraæa string broja sa prefiksom od
		 * jedne ili više nula. Velièina stringa je width argument. Na primjer,
		 * ukoliko pozovemo metodu format(34, 4) metoda vraæa 0034, ukoliko
		 * pozovemo format(34, 5) metoda vraæa 00034. Ukoliko je uneseni broj
		 * veæi nego width argument, metoda vraæa samo string broja. Npr.
		 * ukoliko pozovemo format(34, 1) metoda vraæa 34.
		 */

		Scanner input = new Scanner(System.in);

		boolean on_off = false;

		do {
			try {

				System.out.println("Unesite broj i sirinu broja: ");

				int br1 = input.nextInt();// inicijalizacija 2 varijable u koje
											// ce biti pohranjen korisnikov unos

				int sirina = input.nextInt();

				System.out.println(format(br1, sirina));// pozivanje metode

				on_off = false;
			} catch (InputMismatchException ex) {
				System.out.println("Greska!!! Unesite ponovo");
				input.nextLine();
				on_off = true;
			}

		} while (on_off);
		input.close();
	}

	public static String format(int number, int width) {// metoda vraca string

		String a = "";
		String br = number + "";

		for (int i = 0; i < width - br.length(); i++) {// petlja broji koliko ce
														// dodijeliti 0 broju
			a += '0';
		}

		return a + number;
	}

}

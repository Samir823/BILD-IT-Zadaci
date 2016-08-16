package Zadaci_15_08_2016;

import java.util.Scanner;

public class Zadatak_4_Zbir_Cifara {

	public static void main(String[] args) {
		/*
		 * 4. Napisati metodu koja izraèunava zbir svih brojeva u cijelom broju.
		 * Koristite sljedeæi header: public static int sumDigits(long n). Na
		 * primjer, ako pozovemo metodu i proslijedimo joj broj 234
		 * (sumDigits(234)) metoda treba da vrati 9. (2 + 3 + 4 = 9)
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Unesite cijeli pozitivan broj u long tipu broja: ");

		long num = input.nextLong();// u promjenjivu pohranjujemo korisnikov
									// unos

		System.out.println("Suma cifara broja: " + num + "\nIznosi: "
				+ sumDigits(num));// poziv i ispis metode

		input.close();

	}

	public static int sumDigits(long n) {// metoda sumira svaku cifru broja koji
											// joj se proslijedi

		long num = n;
		int sum = 0;

		while (num > 0) {

			sum += num % 10;
			num = num / 10;

		}
		return sum;
	}

}

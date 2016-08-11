package Zadaci_10_08_2016;

import java.util.Scanner;

public class Zadatak_5_Substring {

	public static void main(String[] args) {
		/*
		 * 5. Napisati program koji pita korisnika da unese dva stringa te
		 * provjerava i ispisuje da li je drugi string substring prvog stringa.
		 * Na primjer, ukoliko korisnik unese ABCD kao prvi string a BC kao
		 * drugi string program mu ispisuje da je BC substring ABCD stringa.
		 */

		Scanner input = new Scanner(System.in);// kreiranje scannera

		System.out.println("Unesite pvi string: ");// trazimo od korisnika da
													// unese 2 stringa

		String str1 = input.nextLine();

		System.out.println("Unesite drugi string: ");

		String str2 = input.nextLine();

		if (str1.contains(str2)) {// za provjeru da li je drugi string sadrzan u
									// prvom koristimo metodu contains();
			System.out.println("String " + str2
					+ " je substring prvog stringa: " + str1);

		} else
			System.out.println("String " + str2 + " nije substring " + str1
					+ " stringa");
		input.close();
	}

}

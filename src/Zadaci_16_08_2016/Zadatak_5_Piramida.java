package Zadaci_16_08_2016;

import java.util.Scanner;

public class Zadatak_5_Piramida {

	public static void main(String[] args) {
		/*
		 * 5. Napisati program koji pita korisnika da unese cijeli broj te
		 * ispisuje piramidu svih brojeva do tog broja. (Na primjer, ukoliko
		 * korisnik unese 7 vrh piramide je broj 1, red ispod vrha piramide je 2
		 * 1 2, red ispod je 3 2 1 2 3, red ispod 4 3 2 1 2 3 4 itd.)
		 */

	Scanner input = new Scanner(System.in);
	System.out.println("Unesite cijeli broj: ");
	int number = input.nextInt();
	input.close();
	// vanjska petlja prolazi sve brojeve od 1 do unesenog broja
	for (int i = 1; i <= number; i++) {
		// petlja za razmake
		for (int j = number - 1; j >= i; j--) {
			System.out.print("  ");
		}
		// petlja za lijevu stranu piramide
		for (int k = i; k > 0; k--) {
			System.out.print(" " + k);
		}
		// petlja za desnu stranu piramide
		for (int m = 2; m <= i; m++) {
			System.out.print(" " + m);
		}
		// prelazak u novi red
		System.out.println();
	}
}

}

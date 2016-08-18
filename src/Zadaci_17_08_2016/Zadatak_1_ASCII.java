package Zadaci_17_08_2016;


import java.util.Scanner;

public class Zadatak_1_ASCII {

	public static void main(String[] args) {
		/*
		 * 1. Napisati program koji prima ASCII kod (cijeli broj izmeðu 0 i 127)
		 * te ispisuje koji je to karakter. Na primjer, ukoliko korisnik unese
		 * 69 kao ASCII kod, program mu ispisuje da je karakter sa tim brojem
		 * karakter E.
		 */

		System.out.println("Unesite broj u rasponu od 0 do 127: ");// ispis
																	// poruke
																	// korisniku

		Scanner input = new Scanner(System.in);

		int br = input.nextInt();// promjenjiva za korisnikov unos

		System.out.println("ASCII karatker za broj " + br + " je \""// ispis
																	// poruke
				+ ((char) (br)) + "\"" + ".");

		input.close();
	}

}

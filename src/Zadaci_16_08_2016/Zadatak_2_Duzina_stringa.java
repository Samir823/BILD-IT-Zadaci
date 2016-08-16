package Zadaci_16_08_2016;

import java.util.Scanner;

public class Zadatak_2_Duzina_stringa {

	public static void main(String[] args) {
		/*
		 * 2. Napisati program koji pita korisnika da unese neki string te mu
		 * ispisuje dužinu tog stringa kao i prvo slovo stringa.
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Unesite string: ");

		String korisnik = input.nextLine();// promjenjiva u koju smjestamo
								// string

		input.close();
		
		char prvoSlovo = korisnik.charAt(0);// varijabla u koju ce biti
											// pohranjeno prvo slovo stringa

		int duzinaStringa = korisnik.length();// duzina stringa

		for (int i = 0; i < korisnik.length(); i++) {// pronalazak prvog slova

			if (Character.isLetter(korisnik.charAt(i))) {
				prvoSlovo = korisnik.charAt(i);
				break;

			}

		}
		// Ispis
		System.out.println("Duzina stringa \"" + korisnik + "\"\nJe: "
				+ duzinaStringa + "\nPrvo slovo je: " + prvoSlovo);

	}

}

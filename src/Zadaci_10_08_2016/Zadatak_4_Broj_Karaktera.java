package Zadaci_10_08_2016;

import java.util.Scanner;

public class Zadatak_4_Broj_Karaktera {

	public static void main(String[] args) {
		/*
		 * 4. Napisati metodu koja pronalazi broj ponavljanja odreðenog
		 * karaktera u stringu. Metoda treba da koristi sljedeæi header: public
		 * static int count(String str, char a). Na primjer, ukoliko pozovemo
		 * metodu na sljedeæi naèin: count("Welcome", e) metoda treba da vrati
		 * 2. Napisati program koji pita korisnika da unese string i koji
		 * karakter želi da prebroji u datom stringu te mu ispiše koliko se puta
		 * odreðeni karakter ponovio u zadatom stringu.
		 */

		Scanner input = new Scanner(System.in);// kreiranje scannera

		System.out.println("Unesite string/recenicu: ");
		String strUser = input.nextLine();// promjenjiva u koju pohranjujemo
											// korisnikov unos

		System.out
				.println("Unesite karakter ukoliko zelite znati koliko se puta ponovio u stringu/recenici: ");

		String ch = input.nextLine();// string koristimo iako je 1 element, ne
										// moze se direktno unijeti ch

		char chUser = ch.charAt(0);// promjenjiva kojoj dodjeljujemo korisnikov
									// karakter

		if (count(strUser, chUser) == 0) {// pozivanje metode i ispis poruke ako
											// nije bilo karaktera u stringu
			System.out.println("Karakter ne postoji u datom stringu");
		} else

			System.out.printf("Karakter %s nalazi se na %d mjesta ", chUser,// ispis
																			// stanja
																			// ako
																			// se
																			// karakter
																			// nalazio
																			// u
																			// recenici
					count(strUser, chUser));
		input.close();
	}

	public static int count(String str, char a) {// metoda koja vraca broj
													// ponavljanja

		int count2 = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == a) {
				count2++;

			}

		}

		return count2;

	}

}

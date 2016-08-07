package Zadaci_06_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_3_Palindrom {

	public static void main(String[] args) {
		/*
		 * 3. Napisati metode sa sljedeæim headerima: public static int
		 * reverse(int number) i public static boolean isPalindrome(int number).
		 * Prva metoda prima cijeli broj kao argument i vraæa isti ispisan
		 * naopako. (npr. reverse(456) vraæa 654.) Druga metoda vraæa true
		 * ukoliko je broj palindrom a false ukoliko nije. Koristite reverse
		 * metodu da implementirate isPalindrome metodu. Napišite program koji
		 * pita korisnika da unese broj te mu vrati da li je broj palindrome ili
		 * ne.
		 */

		Scanner unos = new Scanner(System.in);// Kreiranje scannera

		boolean on_off = false;// promjenjiva kontrolise petlju

		do {// petlja omogucava korisniku ponovan unos
			try {// try catch hvata exception

				// unos broja
				System.out
						.print("Unesite cijeli broj koji zelite provjeriti da li je palindrom: ");// zahtijevamo
				// od
				// korisnika
				// unos
				int broj = unos.nextInt();
				// poziv i ispis metode
				if (isPalindrome(broj))
					System.out.print("Broj: " + broj + "je palindrom");// ispis
																		// stanja
				else
					System.out.print("Broj: " + broj + " nije palindrom");

				on_off = false;

			} catch (InputMismatchException ex) {
				System.out.println("Greska!!! Unesite samo brojeve");
				unos.nextLine();// omogucava korisniku drugi unos

				on_off = true;
			}

		} while (on_off);

		unos.close();
	}

	// metoda vraca obrnut broj
	public static int reverse(int broj) {
		int obrnut = 0;
		while (broj != 0) {// petlja ide dok ne dodje do vrijednosti 0
			obrnut = obrnut * 10;
			obrnut = obrnut + broj % 10;
			broj = broj / 10;
		}
		return obrnut;

	}

	// provjera da li je broj palindrom
	public static boolean isPalindrome(int broj) {

		if (broj < 0) // negativni brojevi nisu palindromi
			return false;

		if (reverse(broj) == broj)// ako broj ostaje nepromjenjen nakon sto su
									// obrznute cifre broj je palindrom
			return true;

		return false;
	}
}

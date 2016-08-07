package Zadaci_06_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_4_String {

	public static void main(String[] args) {
		/*
		 * 4. Napisati program koji pita korisnika da unese neki string te mu
		 * ispisuje sve karaktere koji se nalaze na neparnim pozicijama. Na
		 * primjer, ako korisnik unese string Beijing Chicago, program vraæa
		 * BiigCiao.
		 */

		Scanner unos = new Scanner(System.in);// kreiranje scannera

		boolean on_off = false;// varijabla za kontrolu petlje

		do {

			try {

				System.out.println("Unesite string: ");

				String korisnik = unos.nextLine();

				for (int i = 0; i < korisnik.length(); i += 2) {// u petlji
																// povecavamo i
																// za +2 i tako
																// prolazimo
																// kroz "nase"
																// neparne
																// pozicije
																// stringa

					System.out.print(korisnik.charAt(i));// ispis stringa

				}

				on_off = false;// u slucaju da se dogodio exception, vracamo
								// vrijednost na false da bi program normalno
								// zavrsio sa radom

			} catch (InputMismatchException e) {
				System.out.println("Greska!!! Unesite string");
				unos.nextLine();// omogucavamo korisniku novi unos, poslije
								// exceptiona (ako se desi)
				on_off = true;

			}
		} while (on_off);
		unos.close();
	}
}

package Zadaci_08_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_1_Tri_Nasumicna {

	public static void main(String[] args) {
		/*
		 * 1. Napisati program koji ispisuje tri nasumièna cijela broja te pita
		 * korisnika da unese njihov zbir. Ukoliko korisnik pogriješi, program
		 * ispisuje pitanje ponovo sve sa porukom da pokuša ponovo. Ukoliko
		 * korisnik unese taèan odgovor, program mu èestita i završava sa radom.
		 */

		Scanner unos = new Scanner(System.in);// kreiranje scannera
		int tacanOdgovor = 0;// deklarisanje promjenjive koja ce odredjivati
								// tacan odgovor
		int korisnikOdgovor = 0;// promjenjiva za korisnikov odgovor

		do {
			try {

				int broj1 = (int) (Math.random() * 10);// odredjujemo 3
														// nasumicna broja
														// Math.r metodom
				int broj2 = (int) (Math.random() * 10);
				int broj3 = (int) (Math.random() * 10);

				tacanOdgovor = broj1 + broj2 + broj3;

				System.out.print("Molimo vas da unesete odgovor: " + broj1
						+ " + "// trazimo od korisnika da unese odgovor
						+ broj2 + " + " + broj3 + " = ");

				korisnikOdgovor = unos.nextInt();

				if (korisnikOdgovor == tacanOdgovor) {// provjeravamo tacnost
														// odgovora
					System.out.println("Odgovor je tacan.");
					// break;
				} else {
					System.out
							.println("Odgovor je netacan pokusajte s drugim pitanjem");
				}

			} catch (InputMismatchException ex) {// try catch hvata exceptione,
													// ako dodje do pogresnog
													// unosa
				System.out.println("Greska!!! Molimo vas da unosite brojeve");
				unos.nextLine();// omogucava korisniku drugi unos
			}
		} while (tacanOdgovor > korisnikOdgovor// petlja ce se ponavljati sve
												// dok unos ne bude tacan
				|| tacanOdgovor < korisnikOdgovor);
		unos.close();

	}

}

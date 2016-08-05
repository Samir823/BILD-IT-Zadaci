package Zadaci_05_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_4_10_Cijelih_Brojeva {

	public static void main(String[] args) {
		/*
		 * 4. Napisati program koji prima 10 cijelih brojeva te ih ispisuje u
		 * obrnutom redosljedu.
		 */

		Scanner unos = new Scanner(System.in);// Kreiranje scannera

		boolean okidac = false;// Varijabla kontrolise do while petlju

		int niz[] = new int[10];// Kreiranje niza od 10 mjesta
		do {
			try {

				System.out
						.println("Molimo vas da unesete 10 cijelih brojeva: ");// Trazimo
																				// od
																				// korisnika
																				// da
																				// unese
																				// vrijednost
																				// u
																				// niz

				for (int i = 0; i < niz.length; i++) {// For petljom unosimo
														// vrijednost u niz
					System.out.println("Unesite broj na poziciji " + i);
					niz[i] = unos.nextInt();
				}
				okidac = false;// U slucaju da ne dodje do exceptiona program ce
								// zavrsiti s radom

			} catch (InputMismatchException e) {// U slucaju da korisnik unese
												// slovo ili nesto drugo osim
												// broja try catch ce uhvatiti
												// exception i program ce
												// normalno nastaviti s radom

				System.out
						.println("Greska!!! Ne unosite nista drugo osim broja");
				unos.nextLine();// Omogucavamo korisniku novi unos
				okidac = true;// U slucaju exceptiona okidac ide na true i
								// program nastavlja s radom
			}
		} while (okidac);
		System.out
				.println("Slijedi obrnut redoslijed brojeva koje ste unijeli");
		for (int i = niz.length; i > 0; i--) {// For petljom ispisujemo niz u
												// obrnutom redoslijedu
			System.out.print(niz[i - 1] + " ");
		}
		unos.close();// Zatvaramo scanner
	}

}

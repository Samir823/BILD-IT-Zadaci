package Zadaci_04_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_1_Najmanji_Faktori {

	public static void main(String[] args) {
		/*
		 * 1. Napisati program koji pita korisnika da unese neki cijeli broj te
		 * ispisuje njegove najmanje faktore u rastuæem redosljedu. Na primjer,
		 * ukoliko korisnik unese 120 program treba da ispiše 2, 2, 2, 3, 5. (2
		 * * 2 * 2 * 3 * 5 = 120)
		 */

		Scanner unos = new Scanner(System.in); // kreiranje scannera
		boolean prekidac = false; // varijbla kontrolise do while petlju
		do {
			try {
				System.out
						.println("Molimo vas da unesete cijeli pozitivan broj: ");// trazimo
																					// od
																					// korisnika
																					// da
																					// unese
																					// vrijednost
				int broj = unos.nextInt();

				int najmanjiFaktor = 2; // varijabla predstavlja najmanji faktor
				System.out.println("Najmanji faktori broja: " + broj
						+ " u rastucem redoslijedu su: ");

				while (broj > 1) { // uslov za ponavljanje petlje
					if (broj % najmanjiFaktor == 0) { // ako je broj djeljiv sa
														// brojem
														// "najmanjiFaktor",
														// onda je i faktor tog
														// broja
						broj = broj / najmanjiFaktor; // varijabli broj dodijeli
														// novu vrijednost
						System.out.print(najmanjiFaktor + " "); // ispisi
																// dobiveni
																// faktor
					} else
						najmanjiFaktor++; // ako broj nije djeljiv sa varijablom
											// najmanjiFaktor, povecaj za +1 i
											// ponovo dijeli sa brojem
				}
				prekidac = false; // ako se nije desio exception, prekidac
									// ostaje na false i izlazi iz petlje
			} catch (InputMismatchException ex) { // try catch hvata exception i
													// sprecava pad programa
				System.out
						.println("Greska!!! Molimo vas da ne unosite nista osim broja: ");
				unos.nextLine();
				prekidac = true;// u slucaju exceptiona prekidac ide na true i
								// nastavlja/ omogucava korisniku drugi unos
			}
		} while (prekidac);
		unos.close();
	}

}

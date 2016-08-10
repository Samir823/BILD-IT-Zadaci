package Zadaci_09_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_1_Dan_U_Sedmici {

	public static void main(String[] args) {
		/*
		 * 1. Napisati program koji pita korisnika da unese cijeli broj za
		 * današnji dan u sedmici (0 za ponedjeljak, 1 za utorak...) i da unese
		 * broj dana nakon današnjeg dana te mu ispiše koji je to dan u
		 * buduænosti. (Primjer: ako korisnik unese 1 kao današnji dan a 3 kao
		 * dan u buduænosti program mu ispisuje da je danas utorak a dan u
		 * buduænosti je petak.)
		 */

		Scanner unos = new Scanner(System.in);
		boolean on_off = false;

		do {

			try {

				String[] dani = { "ponedjeljak", "utorak", "srijeda",// niz
																		// predstavlja
																		// dane
																		// u
																		// sedmici
						"èetvrtak", "petak", "subota", "nedjelja" };

				System.out
						.println("Unesite broj od 0 do 6, koji predstavljaju dane u sedmici (0 je ponedjeljak) ): ");
				int danasnji = unos.nextInt();// trazimo od korisnika da unese
												// vrijednost
				System.out
						.println("Odabrali ste : "
								+ dani[danasnji]
								+ "\nUnesite broj dana za ukoliko zelite saznati dan u buducnosti: ");
				int daniBuducnosti = unos.nextInt();
				unos.close();
				int daniFormula = (danasnji + daniBuducnosti) % 7;// formula za
																	// racunanje
																	// dana u
																	// sedmici

				for (int i = danasnji; i < dani.length + danasnji;) {// petlja
																		// prolazi
																		// kroz
																		// niz
																		// kojima
																		// su
																		// prethodno
																		// odredjene
																		// pozicije
					dani[i] = dani[danasnji];

					System.out.println("Dan koji ste odabrali je: " + dani[i]);// ispis
					dani[i] = dani[daniFormula];
					System.out.println("Za " + daniBuducnosti
							+ " dana bit ce: " + dani[i]);
					break;
				}

				on_off = false;
			} catch (InputMismatchException ex) {// u slucaju ex try catch
													// spreceva pad programa
				System.out.println("Greska!!! Unos mora biti u brojevima");
				unos.nextLine();// omogucava korisniku drugi unos
				on_off = true;
			}
		} while (on_off);
		unos.close();
	}
}

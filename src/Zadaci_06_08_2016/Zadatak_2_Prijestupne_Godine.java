package Zadaci_06_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_2_Prijestupne_Godine {

	public static void main(String[] args) {
		/*
		 * 2. Napisati program koji ispisuje sve prijestupne godine, 10 po
		 * liniji, u rasponu godina koje korisnik unese. Program pita korisnika
		 * da unese poèetnu godinu, krajnju godinu te ispisuje sve godine u tom
		 * rasponu. Razmak izmeðu godina treba biti jedan space.
		 */
		Scanner unos = new Scanner(System.in);

		System.out.println("Unesite pocetnu i krajnju godinu: ");

		boolean on_off = false;// deklarisanje varijable koja kontrolise do
								// while petlju

		do {
			try {

				int pocetnaGodina = unos.nextInt();

				int krajnjaGodina = unos.nextInt();

				int brojPrestupnihGod = 0; // brojac prestupnih godina

				// petlja prolazi sve godine od pocetne do krajnje
				for (int i = pocetnaGodina; i <= krajnjaGodina; i++) {

					// ako je godina prestupna, povecavamo broj prestupnih
					// godina
					if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {
						brojPrestupnihGod++;

						// ako je broj prestupnih godina djeljiv sa 10,
						// ispisujemo
						// godinu u novom redu

						if (brojPrestupnihGod % 10 == 0) {
							System.out.println(i);

						} else { // ako nije vec ispisano 10 prestupnih godina,
									// ispisujemo godinu u liniji sa razmakom
							System.out.print(i + " ");
						}

					}
				}
				on_off = false;
			} catch (InputMismatchException e) {// try catchom hvatamo
												// exceptione
				System.out.println("Greska!!! Unesite broj");
				unos.nextLine();// omogucavamo korisniku drugi unos

				on_off = true;
			}
		} while (on_off);// do while petljom omogucavamo korisniku drugi unos
							// ako dodje do exceptiona
		unos.close();
	}
}

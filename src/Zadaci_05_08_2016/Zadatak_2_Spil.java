package Zadaci_05_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_2_Spil {

	public static void main(String[] args) {
		/*
		 * 2. Napisati program koji simulira nasumièno izvlaèenje karte iz špila
		 * od 52 karte. Program treba ispisati koja karta je izvuèena (A, 2, 3,
		 * 4, 5, 6, 7, 8, 9, 10, J, Q ili K) te znak u kojem je data karta
		 * (Srce, Pik, Djetelina, Kocka). Primjer: Karta koju ste izvukli je 10
		 * u znaku kocke.
		 */

		int[] spil = new int[52];// kreiranje niza u duzine jednog spila od 52
									// karte
		String[] karte = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10",// kreiranje
																				// niza
																				// i
																				// iniciranje
																				// svake
																				// karte
																				// pojedinacno
				"J", "Q", "K" };
		String boja[] = { "Srce", "Kocka", "Mak", "List" };// kreiranje niza
															// znakova

		for (int i = 0; i < spil.length; i++) {// petljom dodjeljujemo spilu
												// vrijednosti od 0 do 52
			spil[i] = i;
		}

		for (int i = 0; i < spil.length; i++) {// petljom unosimo vrijednosti u
												// niz
			int index = (int) (Math.random() * spil.length);// inicijaliziramo
															// index varijablu i
															// proslijedjujemo
															// joj vrijednost
															// math.random
															// metodom
			int temp = spil[i];// deklarisanje promjenjive temp, koja preuzima
								// vrijednost o niza spil na odredjenoj poziciji
			spil[i] = spil[index];
			spil[index] = temp; // spil preuzima vrijednost od tempa

		}

		System.out.println("Koliko zelite izvuci karata? Unesite broj: ");
		Scanner unos = new Scanner(System.in);
		boolean prekidac = false;// prekidac omogucava kontrolu do while petlje

		do {
			try {

				int korisnik = unos.nextInt();

				System.out.println("Racunar je odabrao ovih " + korisnik
						+ " karata za vas\n");

				for (int i = 0; i < korisnik; i++) {// petlja omogucava odabir
													// vise karata
					String boja2 = boja[spil[i] / 13];
					String spil2 = karte[spil[i] % 13];
					System.out.println("Izvucena karta je : " + spil2 + "  "
							+ boja2);// ispis

				}
				prekidac = false;// prekidac ostaje na false ako se nije desio
									// exceprion
			} catch (InputMismatchException ex) {// try catch hvata exception,
													// omogucava korisniku drugi
													// unos
				System.out.println("Greska!!! Molimo vas da unesete broj");
				unos.nextLine();
				prekidac = true;
			}
		} while (prekidac);
		unos.close();

	}
}

package Zadaci_12_08_2016;

import java.util.ArrayList;
import java.util.Scanner;

import sun.swing.text.CountingPrintable;

public class Zadatak_5_Broj_Ponavljanja {

	public static void main(String[] args) {
		/*
		 * 5. Napisati program koji uèitava cijele brojeve u rasponu od 1 do 100
		 * te broji i ispisuje koliko je koji broj puta unijet. Pretpostavimo da
		 * nula prekida unos brojeva. Ukoliko unesemo sljedeæi niz brojeva 2 5 6
		 * 23 42 58 2 6 0 program nam ispisuje da se broj 2 ponavlja 2 puta,
		 * broj 5 jednom, broj 6 2 puta, broj 23 jednom, itd.
		 */

		Scanner input = new Scanner(System.in);// kreiranje scannera

		System.out.println("Unesite brojeve, broj 0 prekida unos: ");

		int num = input.nextInt();

		ArrayList<Integer> list = new ArrayList<Integer>();// kreiranje
															// arrayListe

		while (num != 0) {// petlja ide dok korisnik ne unese 0

			if (num > 1 && num < 100) {

				list.add(num);

			} else {
				System.out
						.println("Pogresan unos, u obzir ulaze brojevi od 1 do 100");
			}
			num = input.nextInt();

		}
		java.util.Collections.sort(list);// sortiranje liste zbog lakseg ispisa
											// i pronalaska brojeva koji se
											// ponavljaju

		poredak(list);// pozivanje metode
	}

	public static void poredak(ArrayList<Integer> lista) {// metoda sortira i
															// ispisuje koliko
															// se puta broj
															// ponovio

		int ponavljanje = 0;

		int startNum = lista.get(0);// pocetni broj

		for (int i = 0; i < lista.size(); i++) {// petlja prolazi kroz listu

			if (lista.get(i) == startNum) {// ako je tru, ponavljanje se
											// povecava za 1
				ponavljanje++;

			} else if ((lista.get(i) != startNum)) {
				System.out.println("Broj " + startNum + " ponovio se: "// ispis
																		// broja
																		// i
																		// koliko
																		// se
																		// puta
																		// ponovio
						+ ponavljanje + " puta");
				ponavljanje = 0;// vracanje promjenjive na pocetnu vrijednost
				startNum = lista.get(i);// pocetni broj preuzima vrijednost sa
										// indexa na kome se nalazi slijedeci
										// veci broj
				i--;// smanjujemo i da bi petlja nastavila do zadnjeg indexa
					// (inace izadje :D)

			}

		}
		System.out.println("Broj " + startNum + " ponovio se: " + ponavljanje// ova
																				// linija
																				// koda
																				// je
																				// zbog
																				// ispisa
																				// broja
																				// sa
																				// zadnjeg
																				// indexa
																				// :D
																				// (ostavio
																				// sam
																				// 2
																				// h
																				// zbog
																				// nje)
				+ " puta");

	}

}

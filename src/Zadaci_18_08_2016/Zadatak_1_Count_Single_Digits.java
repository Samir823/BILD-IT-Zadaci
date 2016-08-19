package Zadaci_18_08_2016;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak_1_Count_Single_Digits {

	public static void main(String[] args) {
		/*
		 * 1. Chapter 7, zadatak 7.7. (Count single digits) Write a program
		 * that generates 100 random integers between 0 and 9 and displays the
		 * count for each number. (Hint: Use an array of ten integers, say
		 * counts, to store the counts for the number of 0s, 1s, . . . , 9s.)
		 */

		Scanner input = new Scanner(System.in);// kreiranje scannera

		int niz[] = new int[100];// kreiranje niza od 100 mjesta za random
									// brojeve

		for (int i = 0; i < niz.length; i++) {// dodjeljivanje nizu random
												// brojeve
			niz[i] = (int) (Math.random() * 10);
		}
		Arrays.sort(niz);// sortiranje niza

		poredak(niz);// pozivanje metode

		input.close();
	}

	public static void poredak(int[] a) {// metoda sortira i
											// ispisuje koliko
											// se puta broj
											// ponovio

		int ponavljanje = 0;

		int startNum = a[0];// pocetni broj

		for (int i = 0; i < a.length; i++) {// petlja prolazi kroz listu

			if (a[i] == startNum) {// ako je tru, ponavljanje se
									// povecava za 1
				ponavljanje++;

			} else if ((a[i] != startNum)) {
				System.out.println("Broj " + startNum + " ponovio se: "// ispis
																		// broja
																		// i
																		// koliko
																		// se
																		// puta
																		// ponovio
						+ ponavljanje + " puta");
				ponavljanje = 0;// vracanje promjenjive na pocetnu vrijednost
				startNum = a[i];// pocetni broj preuzima vrijednost sa
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

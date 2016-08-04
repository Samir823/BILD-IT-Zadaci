package Zadaci_03_08_2016;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak_2_Najmanji_Element {

	public static void main(String[] args) {
		/*
		 * 2. Napisati metodu koja nalazi najmanji element u nizu decimalnih
		 * vrijednosti koristeæi se sljedeæim headerom:
		 * 
		 * public static double min(double[ ] array)
		 * 
		 * Napišite potom test program koji pita korisnika da unese deset
		 * brojeva te poziva ovu metodu da vrati najmanji element u nizu.
		 */

		// Kreiranje scannera;
		Scanner unos = new Scanner(System.in);

		// Kreiranje niza
		double niz[] = new double[10];

		// Varijabla koja kontrolise do while petlju
		boolean okidac = false;

		// do while petlja omogucava korisniku da se vrati na pocetak programa u
		// slucaju greske, s tim da ne mora ponovo pokretati program

		do {
			try {

				System.out.println("Molimo unesite 10 decimalnih brojeva: ");

				// for petljom unosimo vrijednost u niz
				for (int i = 0; i < niz.length; i++) {
					niz[i] = unos.nextDouble();

				}
				System.out.println("Najmanji element od unesenih je "
						+ min(niz));
				okidac = false;
			} catch (Exception e) {//try catchom "hvatamo" exceptione koji se dese prilikom pogresnog unosa korisnika
				System.out
						.println("Doslo je do greske, molimo vas unesite decimalan broj: ");
				unos.nextLine();
				okidac = true;
			}

		} while (okidac);
		unos.close();

	}

	// metoda nam omogucava pronalazak najmanje vrijednosti
	public static double min(double[] array) {
		double najmanjaVri = 0;

		// Array sort klasom smo poredali elemente niza od najmanjeg ka
		// najvecem.
		Arrays.sort(array);

		// logicno najmanja vrijednost ce biti na prvoj poziciji
		najmanjaVri = array[0];

		return najmanjaVri;

	}
}

package Zadaci_13_08_2016;

import java.util.Scanner;

public class Zadatak_1_Napojnica {

	public static void main(String[] args) {
		/*
		 * 1. (Izra�unavanje napojnice) Napisati program koji u�itava ukupan
		 * iznos ra�una koji treba uplatiti kao i procenat tog ra�una kojeg
		 * �elimo platiti kao napojnicu te izra�unava ukupan ra�un i napojnicu.
		 * Na primjer, ukoliko korisnik unese 10 kao ra�un i 15 % kao procenat
		 * za napojnicu program treba da ispi�e da je ukupan ra�un za uplatiti
		 * 11.5 a napojnica 1.5.
		 */

		// napraviti novi Scanner
		Scanner unos = new Scanner(System.in);

		// pitati korisnika da unese iznos racuna
		System.out.print("Unesite iznos racuna u KM: ");

		// uzeti unos od korisnika i dodijeliti varijabli
		double iznosRacuna = unos.nextDouble();

		// pitati korisnika da unese iznos napojnice
		System.out.print("Unesite napojnicu u procentima: ");

		// uzeti unos od korisnika i dodijeliti varijabli
		double napojnicaProcenat = unos.nextDouble();

		// zatvoriti Scanner
		unos.close();

		// izracunati iznos napojnica
		double napojnicaIznos = (iznosRacuna * napojnicaProcenat) / 100;

		// ispisati rezultat korisniku
		System.out.println("Iznos napojnice: " + napojnicaIznos + " KM.");
		System.out.println("Ukupan iznos racuna "
				+ (iznosRacuna + napojnicaIznos) + " KM.");

	}

}

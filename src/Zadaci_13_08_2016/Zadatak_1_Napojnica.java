package Zadaci_13_08_2016;

import java.util.Scanner;

public class Zadatak_1_Napojnica {

	public static void main(String[] args) {
		/*
		 * 1. (Izraèunavanje napojnice) Napisati program koji uèitava ukupan
		 * iznos raèuna koji treba uplatiti kao i procenat tog raèuna kojeg
		 * želimo platiti kao napojnicu te izraèunava ukupan raèun i napojnicu.
		 * Na primjer, ukoliko korisnik unese 10 kao raèun i 15 % kao procenat
		 * za napojnicu program treba da ispiše da je ukupan raèun za uplatiti
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

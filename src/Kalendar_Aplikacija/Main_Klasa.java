package Kalendar_Aplikacija;

import java.io.IOException;
import java.util.Scanner;

public class Main_Klasa {

	public static void main(String[] args) throws IOException {

		Kalendar_Detalji kalendar = new Kalendar_Detalji();// kreiranje objekta
															// kalendar
		Scanner unos = new Scanner(System.in);// kreiranje scannera

		System.out.println("Unesite godinu: ");// trazimo od korisnika da unese
												// vrijednost

		int godina = kalendar.provjeraUnosa();

		System.out.println("Unesite mjesec: ");
		int mjesec = kalendar.provjeraUnosa();

		kalendar.printajMjesec(godina, mjesec);// pozivanje metode

		boolean exit = false;

		do {
			// ispis koraka i opcija koje korisnik moze odabrati
			System.out
					.println("\n Molimo vas rednim brojem od 0 do 3 odaberite naredni korak ");
			System.out
					.println("____________________________________________________________");
			System.out
					.println("      [1] Unesite remainder/ note za odredjeni dan:");
			System.out
					.println("------------------------------------------------------------");
			System.out.println("      [2] Ako zelite odabrati drugi mjesec:");
			System.out
					.println("------------------------------------------------------------");
			System.out
					.println("      [3] Ako zelite pogledati sve remaindere:");
			System.out
					.println("------------------------------------------------------------");

			System.out.println("      [0] exit:");
			System.out
					.println("____________________________________________________________");

			switch (kalendar.provjeraUnosa()) {// koristenje selekcije switch i
												// davanje korisniku vise opcija

			case 1:
				kalendar.remainderZaOdredjeniDan(mjesec, godina);// motoda
																	// omogucava
																	// korisniku
																	// unos
																	// podsjetnika
				break;
			case 2:
				kalendar.odabirDrugogMjeseca();// korisniku omogucava drugi unos
												// a da ne mora izaci iz
												// programa
				break;
			case 3:
				kalendar.pregledSvihRemaindera();// pregled svih unosa
				break;

			case 0:
				exit = true;
				System.out.println("Dovidjenja!!!");
				break;
			default:
				System.out.println("Broj koji ste unijeli nema funkciju!!!");
			}

		} while (!exit);
		unos.close();

	}
}

package Zadaci_02_08_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadatak_3_File {

	public static void main(String[] args) throws FileNotFoundException {
		/*
		 * 3. Napišite program koji æe brojati broj karaktera, rijeèi i linija
		 * teksta u nekom fileu. Rijeèi trebaju biti odvojene jednim spaceom.
		 * Ime file proslijediti kao argument u vaš program.
		 */

		// definisanje skenera
		Scanner unos = new Scanner(System.in);

		// unos imena fajla
		System.out.print("Molimo unesite ime fajla: ");
		String ime = unos.next();
		unos.close();

		// definisanje objekta file
		File file = new File(ime);
		Scanner unosfilea;

		// deklarisanje brojaca za karaktere, rijeci i linije
		int brojKaraktera = 0;
		int brojRijeci = 0;
		int brojLinija = 0;

		// skener cita fajl
		unosfilea = new Scanner(file);

		// petlja while ide do posljednjeg karaktera
		while (unosfilea.hasNext()) {
			
			// dodojeljivanje stringu rijeci u fajlu i njihovo brojanje

			String word = unosfilea.next();
			brojRijeci++;
		}
		// zatvaranje scannera
		unosfilea.close();

		// novi skener za fajl
		Scanner unosfilea2 = new Scanner(file);

		// uslov za skener
		while (unosfilea2.hasNextLine()) {

			// dodojeljuje stringu svaku liniju fajla i broji linije
			String text = unosfilea2.nextLine();
			brojLinija++;

			// sacuva dati string i ukloni razmake u stringu kako bi se
			// pobrojali karakteri

			text = text.replace(" ", "");
			for (int i = 0; i < text.length(); i++) {
				brojKaraktera++;
			}
		}

		unosfilea2.close();

		// ispis razultata
		System.out.println("Broj karaktera u fajlu je: " + brojKaraktera
				+ "\nBroj rijeci u fajlu je: " + brojRijeci
				+ "\nBroj linija u fajlu je: " + brojLinija);

	}

}

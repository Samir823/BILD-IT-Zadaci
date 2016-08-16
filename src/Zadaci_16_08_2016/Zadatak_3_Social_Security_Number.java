package Zadaci_16_08_2016;

import java.util.Scanner;

public class Zadatak_3_Social_Security_Number {

	public static void main(String[] args) {
		/*
		 * 3. Napisati program koji pita korisnika da unese Social Security
		 * Number (SSN) u formatu DDD-DD-DDDD gdje D predstavlja broj. Program
		 * treba da provjerava da li je broj unesešen u ispravnom formatu.
		 * Ukoliko nije, program pita korisnika da pokuša ponovo. Ukoliko jeste
		 * unešen u pravom formatu, program završava sa radom.
		 */

		// novi Scanner
		Scanner unos = new Scanner(System.in);
		// ispis poruke
		System.out.print("Unesite SSN: ");
		// uzimanje unosa od korisnika

		boolean validSsn = true;

		do {// petlja se izvrsava dok unos ne bude validan

			String ssn = unos.nextLine();
			// promjenljiva koja oznacava da li je ssn validan
			// zatvaranje Scannera

			// ako je duzina ssn-a razlicita od 11, ssn nije validan
			if (ssn.length() != 11) {
				validSsn = false;
			} else { // ako je duzina jednaka 11, nastavljamo provjeru svih
						// simbola
				// petlja prolazi cijeli ssn
				for (int i = 0; i < ssn.length(); i++) {

					// ako karakter na indeksu 3 ili na indeksu 6 nije crtica
					// (-)
					// onda ssn nije validan
					if (i == 3 || i == 6) {

						if (ssn.charAt(i) != '-') {
							validSsn = false;
							break;
						}
					}
					// ako karakter na ostalim indeksima nije broj
					// ssn nije validan
					else {

						if (!Character.isDigit(ssn.charAt(i))) {
							validSsn = false;
							break;
						}
					}

				}
			}

			// ako promjenljiva validSnn ima vrijednost true, onda je ssn
			// validan
			if (validSsn) {
				System.out.println(ssn + " je validan ssn broj.");
				break;
			} else {
				System.out.println(ssn
						+ " nije validan ssn broj.\nPokusajte ponovo: ");// ispis
																			// poruke
																			// i
																			// omoguavanje
																			// korisniku
																			// ponovnog
																			// unosa
				validSsn = true;
			}

		} while (validSsn);
		unos.close();
	}

}

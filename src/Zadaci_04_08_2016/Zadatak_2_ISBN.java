package Zadaci_04_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_2_ISBN {

	public static void main(String[] args) {
		/*
		 * 2. ISBN-10 (International Standard Book Number) se sadrži od 10
		 * brojeva: d1 d2 d3 d4 d5 d6 d7 d8 d9 d10. Posljednji broj, d10, služi
		 * kao checksum i njega izraèunavamo iz prvih devet brojeva koristeæi se
		 * sljedeæom formulom: (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6
		 * * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11. Ukoliko je checksum 10, zadnji
		 * broj oznaèavamo sa X u skladu sa ISBN-10 konvencijom. Napisati
		 * program koji pita korisnika da unese prvih 9 brojeva te ispiše
		 * desetocifreni ISBN-10 broj. (Primjer: ukoliko unesemo, kao prvih 9
		 * brojeva, 013601267 program nam ispisuje 0136012671 kao ISBN-10 broj.
		 * Ukoliko unesemo 013031997 kao prvih 9 brojeva, program nam ispisuje
		 * 013031997X kao ISBN-10 broj)
		 */

		// Kreiramo scanner
		Scanner unos = new Scanner(System.in);

		// Kreiramo varijablu okidac,koja nam sluzi za kontrolu do while petlje
		boolean okidac = false;
		// Kreiramo niz
		int[] broj = new int[9];
		// Zatrazimo od korisnika da unese brojeve
		System.out.println("Unesite 9 brojeva: ");

		int desetiBr = 0;
		do {
			try {

				// Implementiramo korisnikov unos u niz
				for (int i = 0; i < broj.length; i++) {
					broj[i] = unos.nextInt();
					desetiBr += broj[i] * (i + 1);
				}
				okidac = false;// U slucaju da ne dodje do exceptiona okidac ce
				// ostati nepromjenjen, izaci ce iz petlje i
				// program ce zavrsiti
			} catch (InputMismatchException ex) {
				// Exception nam sluzi da se program ne obori
				// i da omoguci korisniku novi unos
				System.out
						.println("Doslo je do greske, molimo vas da ne unosite nista osim broja!!!");
				unos.nextLine();
				okidac = true;
			}
		} while (okidac);
		// Prolazimo kroz petlju i printamo je
		for (int e : broj) {
			System.out.print(e);
		}
		int br = desetiBr % 11;// varijabli br proslijedjujemo ostatak
								// dijeljenja sa brojem 11
		if (br == 10) {
			System.out.print("x");//ako je br jednak broju 10, onda ispisujemo x
		} else {
			System.out.print(br);//ispisujemo br
		}
		unos.close();

	}

}

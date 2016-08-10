package Zadaci_09_08_2016;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;



public class Zadatak_4_Najveci_Broj {

	public static void main(String[] args) {
		/*
		 * 4. Napišite program koji uèitava neodreðen broj cijelih brojeva (unos
		 * prekida nula), pronalazi najveæi od unijetih brojeva te ispisuje
		 * koliko se najveæi broj puta ponovio. Na primjer, ukoliko unesemo 3 5
		 * 2 5 5 5 0 program ispisuje da je najveæi broj 5 te ispisuje da se
		 * isti ponavlja 4 puta.
		 */

		Scanner unos = new Scanner(System.in);// kreiranje scannera
		System.out.println("Unosite brojeve, 0 prekida unos: ");

		boolean on_off = false;// promjenjivoj kontrolisemo petlju

		ArrayList<Integer> niz = new ArrayList<Integer>();// kreiranje
															// arrayListe
		do {// petlja omogucava korisniku unos ako bi se desio ex

			try {

				int broj = 1;

				while (broj != 0) {// petlja se ponavlja dok korisnik ne unese 0
					broj = unos.nextInt();// omoguvaca korisniku unos

					niz.add(broj);// dodavanje elemenata nizu
				}
				sort(niz);// pozivanje metode i ispisivanje stanja

				on_off = false;

			} catch (InputMismatchException ex) {// try catch hvata ex
				System.out
						.println("Pogresan unos!!!Unos mora biti u vidu broja");
				unos.nextLine();

				on_off = true;

			}

		} while (on_off);
		unos.close();
	}

	public static void sort(ArrayList<Integer> niz) {// metoda pronalazi najveci
														// element i racuna
														// koliko se puta
														// ponovio

		int najveciElement = 0;
		int brojPonavljanja = 0;

		for (int i = 0; i < niz.size(); i++) {// petlja prolazi kroz niz
			if (najveciElement == niz.get(i)) {// selekcija za provjeravanje
												// jednakosti dosadasnjeg
												// najveceg elementa i elementa
												// na odredjenoj poziciji u nizu
				brojPonavljanja++;
				continue;// ako je uslov tacan petlja prelazi na slijedecu
							// iteraciju
			}
			if (niz.get(i) > najveciElement) {// ako je broj na odredjenoj
												// poziciji veci nego dosadasnji
												// najveci, on postaje taj broj
				najveciElement = niz.get(i);
				brojPonavljanja = 1;

			}
		}
		System.out.printf("Najveci element je: %2d\nPonavlja se: %2d",// ispis
				najveciElement, brojPonavljanja);
	}

}
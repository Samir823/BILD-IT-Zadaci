package Zadaci_02_08_2016;

public class Zadatak_1_Prestupne_Godine {

	public static void main(String[] args) {
		/*
		 * 1. Napisati program koji ispisuje sve prestupne godine, 10 po liniji,
		 * od godine 101 do 2100, odvojene jednim spaceom. Takoðer ispisati i
		 * ukupan broj prijestupnih godina u ovom vremenskom periodu.
		 */

		int pocetnaGodina = 101;

		int posljednjaGodina = 2100;

		int brojPrestupnihGod = 0; // brojac prestupnih godina

		// petlja prolazi sve godine od pocetne do krajnje
		for (int i = pocetnaGodina; i <= posljednjaGodina; i++) {

			// ako je godina prestupna, povecavamo broj prestupnih godina
			if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {
				brojPrestupnihGod++;

				// ako je broj prestupnih godina djeljiv sa 10, ispisujemo
				// godinu u novom redu

				if (brojPrestupnihGod % 10 == 0) {
					System.out.println(i);

				} else { // ako nije vec ispisano 10 prestupnih godina,
							// ispisujemo godinu u liniji sa razmakom
					System.out.print(i + " ");

				}

			}
		}
		System.out.println("\nUkupan broj prestupnih godina je: "
				+ brojPrestupnihGod);

	}
}

package Zadaci_16_08_2016;

public class Zadatak_4_Datum_I_Tacno_Vrijeme {

	public static void main(String[] args) {
		/*
		 * 4. Napisati metodu koja vraæa datum i trenutaèno vrijeme.
		 */

	

		convertMillisToTime(System.currentTimeMillis());//poziv metode
	}
		public static void convertMillisToTime(long millis) {

			long sec = (millis / 1000) % 60; // pretvaranje u sekunde
			long min = (millis / 1000 / 60) % 60; // pretvaranje u minute
			long hour = (millis / 1000 / 60 / 60) % 24; // pretvaranje u sate

			System.out.print("Trenutno vrijeme: " + (hour + 2) + ":" + min + ":" + sec);// ispis,
																		// posto je
																		// nasa
																		// vremenska
																		// zona +2
																		// dodjamo
																		// satima

		



			long sumaDay = (millis / 1000 / 60 / 60 / 24);// od 1970 se racuna
															// vrijeme

			int year = 1970;// startna godina

			while (sumaDay > numberOfDayInAYear(year)) {// petlja se izvrsava sve
														// dok je vise od dana te
														// godine

				sumaDay -= numberOfDayInAYear(year);

				year++;
			}

			int moon = 1;
			// provjera koliko je ostalo dana od ukupno mjeseci za odredjeni mjesec
			while (sumaDay > dobitiBrojDanaUmjesecu(year, moon)) {
				// dani se smanjuju za broj dana u odredjenom mjesecu
				sumaDay -= dobitiBrojDanaUmjesecu(year, moon);
				// povecanje mjeseca do sadasnjeg
				moon++;

			}

			System.out.print("\nDatum: "+(sumaDay + 1) + ". " + dobiImeMjeseca(moon) + ", "
					+ year+" godine");

		}

		// racunanje broja dana u godini, zavisno da li je god prestupna
		public static int numberOfDayInAYear(int year) {

			int day = 0;
			// if uslov za prestupnu godinu
			if (daLiJePrestupna(year)) {
				day = 366;
			} else {
				day = 365;
			}
			return day;
		}

		// racnanje broja dana u mjesecu

		private static int dobitiBrojDanaUmjesecu(int year, int moon) {// metoda
			// vraca
			// broj
			// dana
			// u
			// odredjenom
			// mjesecu
			if (moon == 1 || moon == 3 || moon == 5 || moon == 7 || moon == 8
					|| moon == 10 || moon == 12) {
				return 31;
			}
			if (moon == 4 || moon == 6 || moon == 9 || moon == 11) {
				return 30;
			}
			if (moon == 2) {
				return daLiJePrestupna(year) ? 29 : 28;
			}
			return 0;// Ako je netacan mjesec
		}

		private static boolean daLiJePrestupna(int year) {// metoda ispituje da li
			// je godina prestupna

			return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
		}

		public static String dobiImeMjeseca(int moon) {// metoda vraca ime mjeseca
			String nameMoon = "";
			switch (moon) {
			case 1:
				nameMoon = "Januar";

				break;
			case 2:
				nameMoon = "Februar";

				break;
			case 3:
				nameMoon = "Mart";

				break;
			case 4:
				nameMoon = "April";

				break;
			case 5:
				nameMoon = "Maj";

				break;
			case 6:
				nameMoon = "Juni";

				break;
			case 7:
				nameMoon = "Juli";

				break;
			case 8:
				nameMoon = "Avgust";
				break;
			case 9:
				nameMoon = "Septembar";

				break;
			case 10:
				nameMoon = "Oktobar";

				break;
			case 11:
				nameMoon = "Novembar";

				break;
			case 12:
				nameMoon = "Decembar";

				break;

			}
			return nameMoon;
		}
	}


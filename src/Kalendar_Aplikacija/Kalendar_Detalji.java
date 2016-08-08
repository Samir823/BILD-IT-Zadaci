package Kalendar_Aplikacija;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Kalendar_Detalji {

	static File file = new File("src/Kalendar_Aplikacija.txt");// Kreiramo file
																// u koji
																// pohranjujemo
																// podsjetnik i
																// unosimo
																// njegovu
																// lokaciju

	static Scanner unos = new Scanner(System.in);// kreiranje scannera

	public void printajMjesec(int godina, int mjesec) {// metoda preko koje se
														// printa kalendar

		kreirajTijeloMjeseca(godina, mjesec);
	}

	private static void kreirajTijeloMjeseca(int godina, int mjesec) {// metoda
																		// koja
																		// kreira
																		// tijelo
																		// mjeseca

		Calendar kalendar = new GregorianCalendar(godina, mjesec - 1, 1); // implementiranje
																			// kalendara
																			// za
																			// odredjen
																			// mjesec
		System.out.println();
		System.out.print("        " + dobiImeMjeseca(mjesec)); // ispis imena
																// mjeseca na
																// osnovu broja
																// mjeseca
		System.out.print(" " + kalendar.get(GregorianCalendar.YEAR)); // ispis
																		// godine
		System.out.println("\n----------------------------------");
		System.out.println("Ned  Pon  Uto  Sri  Cet  Pet  Sub");
		int pocetniDan = kalendar.get(Calendar.DAY_OF_WEEK); // pocetni dan u
																// mjesecu
		for (int i = 1; i < pocetniDan; i++) { // petlja za ispis praznih mjesta
												// prije pocetnog dana
			System.out.print("     ");
		}
		for (int i = 1; i <= kalendar.getActualMaximum(Calendar.DAY_OF_MONTH); i++) { // ispis
																						// dana
																						// do
																						// zadnjeg
																						// dana
																						// u
																						// konkretnom
																						// mjesecu
			System.out.printf("%3d  ", i); // formatiran ispis
			if ((i + (pocetniDan - 1)) % 7 == 0) { // ako je ispisano 7 dana
													// predji u novi red
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("-----------------------------------");
		System.out.println();
	}

	private static int dobitiBrojDanaUmjesecu(int godina, int mjesec) {// metoda
																		// vraca
																		// broj
																		// dana
																		// u
																		// odredjenom
																		// mjesecu
		if (mjesec == 1 || mjesec == 3 || mjesec == 5 || mjesec == 7
				|| mjesec == 8 || mjesec == 10 || mjesec == 12) {
			return 31;
		}
		if (mjesec == 4 || mjesec == 6 || mjesec == 9 || mjesec == 11) {
			return 30;
		}
		if (mjesec == 2) {
			return daLiJePrestupna(godina) ? 29 : 28;
		}
		return 0;// Ako je netacan mjesec
	}

	private static int dobitiPocetniDan(int godina, int mjesec) {
		final int START_DAY_FOR_JAN_1_1800 = 3;
		// dobiti ukupan broj dana od 1_1_1800 do mjesec/1/godina
		int ukupanBrojDana = dobitiUkupanBrojDana(godina, mjesec);

		// vrati pocetni dan za mjesec/1/godina

		return (ukupanBrojDana + START_DAY_FOR_JAN_1_1800) % 7;

	}

	private static int dobitiUkupanBrojDana(int godina, int mjesec) {// dobiti
																		// ukupan
																		// broj
																		// dana
																		// od
																		// 1.januara.1800
		int ukupno = 0;
		// dobiti ukupan broj dana od 1800 do unesene godine
		for (int i = 1800; i < godina; i++) {
			if (daLiJePrestupna(i)) {
				ukupno = ukupno + 366;

			} else
				ukupno = ukupno + 365;
		}

		for (int i = 1; i < mjesec; i++) {
			ukupno = ukupno + dobitiBrojDanaUmjesecu(godina, mjesec);
		}
		return ukupno;

	}

	private static boolean daLiJePrestupna(int godina) {// metoda ispituje da li
														// je godina prestupna

		return godina % 400 == 0 || (godina % 4 == 0 && godina % 100 != 0);
	}

	public static String dobiImeMjeseca(int mjesec) {// metoda vraca ime mjeseca
		String imeMjeseca = "";
		switch (mjesec) {
		case 1:
			imeMjeseca = "Januar";

			break;
		case 2:
			imeMjeseca = "Februar";

			break;
		case 3:
			imeMjeseca = "Mart";

			break;
		case 4:
			imeMjeseca = "April";

			break;
		case 5:
			imeMjeseca = "Maj";

			break;
		case 6:
			imeMjeseca = "Juni";

			break;
		case 7:
			imeMjeseca = "Juli";

			break;
		case 8:
			imeMjeseca = "Avgust";
			break;
		case 9:
			imeMjeseca = "Septembar";

			break;
		case 10:
			imeMjeseca = "Oktobar";

			break;
		case 11:
			imeMjeseca = "Novembar";

			break;
		case 12:
			imeMjeseca = "Decembar";

			break;

		}
		return imeMjeseca;
	}

	public void odabirDrugogMjeseca() {// metoda omogucava korisniku da odabere
										// drugi mjesec i godinu
		System.out.println("Unesite godinu: ");
		int godina = provjeraUnosa();
		System.out.println("Unesite mjesec: ");
		int mjesec = provjeraUnosa();
		printajMjesec(godina, mjesec);

	}

	public void pregledSvihRemaindera() throws FileNotFoundException {// metoda
																		// omogucava
																		// pregled
																		// svih
																		// podsjetnika
		System.out.println("\n______________________________________");

		Scanner izlaz = new Scanner(file);

		while (izlaz.hasNextLine()) {// petlja ide do posljednje linije

			String print = izlaz.nextLine();
			System.out.println(print);// ispis remaindera
		}
		izlaz.close();
	}

	public void remainderZaOdredjeniDan(int mjesec, int godina)//metoda pomocu koje unosimo remaindere u fajl
			throws IOException {

		BufferedWriter kal = new BufferedWriter(new FileWriter(file, true));

		System.out.println("\n_____________________________________________________");
		System.out
				.print("Unesite datum vezan za podsjetnik koji zelite napraviti: ");
		boolean prekidac = true;
		int datum = 0;
		// while incorrect will loop
		while (prekidac) {
			datum = provjeraUnosa();
			
			if (datum < dobitiBrojDanaUmjesecu(godina, mjesec) && datum > 0) {//ako datum nije u opsegu datog mjeseca izadji iz petlje
				prekidac = false;
			} else {
				System.out.print("Pogresan unos: ");
			}
		}
		System.out.println("Napomenu unijeti u jednoj liniji: ");
		unos.nextLine();
		String str1 = unos.nextLine();

		// Kada korisnik unese podsjetnik on ce biti upisan u fajl kao i datum
		kal.write(datum + ". " + dobiImeMjeseca(mjesec) + " " + godina + ".  "
				+ str1 + "\n");
		kal.close();
		System.out.println("\n_________________________________________");
	}

	public int provjeraUnosa() {// metoda provjerava svaki unos, skracuje kod,
								// jer se na jednom mjestu nalazi try catch koji
								// "hvata" exceptione

		int broj = 0;
		boolean prekidac = true;

		do {
			try {
				broj = unos.nextInt();
				if (broj < 0)
					throw new InputMismatchException(
							"Unijeli ste negativan broj");

				prekidac = false;
			} catch (InputMismatchException ex) {
				System.out.print("Pogresan unos, molimo pokusajte ponovo:  ");
				unos.nextLine();
				prekidac = true;
			}

		} while (prekidac);

		return broj;
	}

}

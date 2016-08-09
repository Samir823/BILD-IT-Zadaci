package Zadaci_08_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_2_Dani_U_Mjesecu {

	public static void main(String[] args) {
		/*
		 * 2. Napisati program koji pita korisnika da unese mjesec i godinu te
		 * mu ispiše broj dana u datom mjesecu. Na primjer, ukoliko korisnik
		 * unese kao godinu 2012 a kao mjesec 2, program treba ispisati da je
		 * Februar 2012 imao 29 dana. Ukoliko korisnik unese kao godinu 2015 a
		 * kao mjesec 3, program treba ispisati da je Mart 2015 imao 31 dan.
		 */

		Scanner unos = new Scanner(System.in);// kreiranje scannera

		boolean on_off = false;// varijabla za kontrolu petlje

		do {// petlja omogucava korisniku ponovan unos

			try {

				System.out.print("Unesite godinu: ");// zahtjev korisniku da
														// unese godinu i mjesec

				int godina = unos.nextInt();

				System.out.print("Unesite mjesec, brojevima od 1 do 12: ");

				int mjesec = unos.nextInt();

				System.out.println("U godini " + godina
						+ " mjesec "// pozivanje metoda i ispis njihovog stanja
						+ dobiImeMjeseca(mjesec) + " ima "
						+ dobitiBrojDanaUmjesecu(godina, mjesec) + " dana");

				on_off = false;
			} catch (InputMismatchException ex) {// u slucaju ex try cathom ih
													// hvatamo
				System.out.println("Greska!!! Unos mora biti u brojevima");

				unos.nextLine();// omogucava korisniku drugi unos

				on_off = true;
			}
		} while (on_off);
		unos.close();
	}

	// metodom dobivamo broj dana u mjesecu
	private static int dobitiBrojDanaUmjesecu(int godina, int mjesec) {
		if (mjesec == 1 || mjesec == 3 || mjesec == 5 || mjesec == 7// mjeseci
																	// koji
																	// imaju po
																	// 31 dan
				|| mjesec == 8 || mjesec == 10 || mjesec == 12) {
			return 31;
		}
		if (mjesec == 4 || mjesec == 6 || mjesec == 9 || mjesec == 11) {// mjeseci
																		// koji
																		// imaju
																		// po 30
																		// dana
			return 30;
		}
		if (mjesec == 2) {
			return daLiJePrestupna(godina) ? 29 : 28;// pozivanje druge metode
														// koja provjerava da li
														// je godina prestupna
		}
		return 0;// Ako je netacan mjesec
	}

	// metoda provjerava da li je godina prestupna, ako jeste februar tada ima
	// 29 dana
	private static boolean daLiJePrestupna(int godina) {

		return godina % 400 == 0 || (godina % 4 == 0 && godina % 100 != 0);
	}

	// metoda pomocu koje se dobija ime mjeseca
	public static String dobiImeMjeseca(int mjesec) {
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
		default:
			System.out.println("Ne postoji mjesec pod tim brojem: ");
			System.exit(0);// Ako unos korisnika nije u okviru od 1 do 12
							// program zavrsava s radom

		}
		return imeMjeseca;
	}

}

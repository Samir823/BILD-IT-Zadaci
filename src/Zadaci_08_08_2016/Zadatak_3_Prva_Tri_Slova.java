package Zadaci_08_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_3_Prva_Tri_Slova {

	public static void main(String[] args) {
		/*
		 * 3. Napisati program koji pita korisnika da unese godinu i prva tri
		 * slova imena mjeseca (prvo slovo uppercase) te mu ispiše broj dana u
		 * tom mjesecu. Na primjer, ukoliko korisnik kao godinu unese 2001 a kao
		 * mjesec Jan program mu ispisuje da Jan 2011 ima 31 dan.
		 */

		Scanner unos = new Scanner(System.in);

		boolean on_off = false;// varijabla za kontrolu petlje

		do {// petlja omogucava korisniku ponovan unos

			try {

				System.out.print("Unesite godinu: ");// zahtjev korisniku da
														// unese godinu i mjesec

				int godina = unos.nextInt();

				System.out
						.println("Unesite prva tri slova imena mjeseca, slova moraju biti velika: ");

				String mjesec = unos.next();

				System.out.println("U godini " + godina
						+ " mjesec "// pozivanje metoda i ispis njihovog stanja
						+ dobiImeMjeseca(mjesec) + " ima "
						+ dobitiBrojDanaUmjesecu(godina, mjesec) + " dana");

				on_off = false;
			} catch (InputMismatchException ex) {// u slucaju ex try cathom ih
													// hvatamo
				System.out.println("Greska!!! Pogresan unos, pokusajte ponovo");

				unos.nextLine();// omogucava korisniku drugi unos

				on_off = true;
			}
		} while (on_off);
		unos.close();
	}

	// metodom dobivamo broj dana u mjesecu
	private static int dobitiBrojDanaUmjesecu(int godina, String mjesec) {
		if (mjesec.equals("JAN") || mjesec.equals("MAR")
				|| mjesec.equals("MAJ")
				|| mjesec.equals("JUL")// mjeseci koji imaju po 31 dan
				|| mjesec.equals("AVG") || mjesec.equals("OKT")
				|| mjesec.equals("DEC")) {
			return 31;
		}
		if (mjesec.equals("APR") || mjesec.equals("JUN")
				|| mjesec.equals("SEP") || mjesec.equals("OKT")) {// mjeseci
																	// koji
																	// imaju po
																	// 30 dana
			return 30;
		}
		if (mjesec.equals("FEB")) {
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
	public static String dobiImeMjeseca(String mjesec) {
		String imeMjeseca = "";
		switch (mjesec) {
		case "JAN":
			imeMjeseca = "Januar";

			break;
		case "FEB":
			imeMjeseca = "Februar";

			break;
		case "MAR":
			imeMjeseca = "Mart";

			break;
		case "APR":
			imeMjeseca = "April";

			break;
		case "MAJ":
			imeMjeseca = "Maj";

			break;
		case "JUN":
			imeMjeseca = "Juni";

			break;
		case "JUL":
			imeMjeseca = "Juli";

			break;
		case "AVG":
			imeMjeseca = "Avgust";
			break;
		case "SEP":
			imeMjeseca = "Septembar";

			break;
		case "OKT":
			imeMjeseca = "Oktobar";

			break;
		case "NOV":
			imeMjeseca = "Novembar";

			break;
		case "DEC":
			imeMjeseca = "Decembar";

			break;
		default:
			System.out.println("Pogresan unos, pokusajte ponovo ");
			System.exit(0);

		}
		return imeMjeseca;
	}

}

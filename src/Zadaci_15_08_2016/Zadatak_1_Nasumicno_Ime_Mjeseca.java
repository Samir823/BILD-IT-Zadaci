package Zadaci_15_08_2016;

public class Zadatak_1_Nasumicno_Ime_Mjeseca {

	public static void main(String[] args) {
		/*
		 * 1. Napisati program koji nasumièno generiše cijeli broj izmeðu 1 i 12
		 * te ispisuje ime mjeseca za taj broj. (Januar za 1, Ferbruar za 2....)
		 */

		System.out.println(dobiImeMjeseca((int) (Math.random() * 12 + 1)));// pozivanje
																			// metode
																			// i
																			// proslijedjivanje
																			// random
																			// broja

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

}

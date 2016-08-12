package Zadaci_11_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_4_Minute_U_Dane {

	public static void main(String[] args) {
		/*
		 * 4. Napisati program koji pita korisnika da unese broj minuta (npr. 1
		 * milijardu) te ispiše korisniku koliko je to u godinama i danima. Zbog
		 * jednostavnosti, pretpostavimo da godina ima 365 dana.
		 */

		Scanner input = new Scanner(System.in);// kreiranje scannera

		boolean on_off = false;
		do {
			try {

				System.out.println("Unesite broj minuta (npr 1 milijardu) : ");

				int minutes = input.nextInt();

				int year = minutes / 525600;// ukupno minuta u godini
				int remainingMinutes = minutes % 525600;// ostatak minuta
				int day = remainingMinutes / 1440;// broj dana

				System.out.println(minutes + " Minuta je priblizno " + year// ispis
						+ " godina i " + day + " dana.");
				on_off = false;
			} catch (InputMismatchException ex) {// try catch hvata ex i srecava
													// pad programa
				System.out.println("Greska!!! Unos mora biti u vidu broja");
				input.nextLine();
				on_off = true;
			}
		} while (on_off);
		input.close();
	}

}

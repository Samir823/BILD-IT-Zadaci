package Zadaci_10_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_2_Twin_Prime {

	public static void main(String[] args) {
		/*
		 * 2. Twin prime brojevi su par prostih brojeva koji se razlikuju za 2.
		 * Na primjer, brojevi 3 i 5 su twin primes, brojevi 5 i 7 i 11 i 13 su
		 * takoðer twin primes. Napisati program koji ispisuje sve twin prime
		 * brojeve manje od 10000, 10 parova po liniji.
		 */

		Scanner input = new Scanner(System.in);// kreiranje scannera

		boolean on_off = false;// varijabla kontrolise petlju

		do {// petlja omogucava korisniku drugi unos ako je doslo do ex
			try {

				System.out
						.print("Do kojeg broja zelite saznati Twin prime brojeve : ");

				int lastNum = input.nextInt();// kreiranje varijable za pohranu
												// korisnikovog unosa

				int newLine = 0;// varijabla odredjuje prelazak u novi red, kada
								// vrijednost bude 10

				System.out.println("Twin prime su: ");
				for (int i = 0; i <= lastNum; i++) {

					if (isPrime(i) == true && isPrime(i + 2) == true) {// pozivanje
																		// metode
																		// i
																		// printanje
																		// stanja
						System.out.print("(" + i + "," + (i + 2) + ") ");
						newLine++;

					}
					if (newLine == 10) {
						System.out.println();
						newLine = 0;// ako je uslov ispunjen i preslo se u novi
									// red, varijabla se resetuje na pocetnu
									// vrijednost

					}
				}
				on_off = false;
			} catch (InputMismatchException ex) {// sprecava pad programa
				System.out.println("Greska!!! Unos mora biti u vidu broja");
				input.nextLine();
				on_off = true;
			}
		} while (on_off);
		input.close();
	}

	static boolean isPrime(int n) // metoda pronalazi prime broj
	{
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				count++;
		}
		if (count == 2)
			return true;
		else
			return false;
	}

}

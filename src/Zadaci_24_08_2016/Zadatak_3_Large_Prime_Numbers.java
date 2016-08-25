package Zadaci_24_08_2016;

import java.math.BigInteger;

public class Zadatak_3_Large_Prime_Numbers {

	public static void main(String[] args) {
		/*
		 * *10.18 (Large prime numbers) Write a program that finds five prime
		 * numbers larger than Long.MAX_VALUE.
		 */

		// counter
		int brojac = 0;
		// BigInteger object with value of maximum value of long number
		BigInteger broj = BigInteger.valueOf(Long.MAX_VALUE);

		while (brojac < 5) {// petlja se izvrsava dok brojac ne postigne
							// vrijednost 5
			// pozivanje metode isProbablePrime iz BigInteger clase, ako je broj
			// prime onda povecamo brojac za 1

			if (broj.isProbablePrime(1)) {
				System.out.println(broj);
				brojac++;
			}
			// za svaku iteraciju povecamo broj za 1
			broj = broj.add(BigInteger.ONE);
		}
	}

}
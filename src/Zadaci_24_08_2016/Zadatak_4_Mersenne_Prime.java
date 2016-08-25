package Zadaci_24_08_2016;

import java.math.BigInteger;

public class Zadatak_4_Mersenne_Prime {

	public static void main(String[] args) {
		/*
		 * *10.19 (Mersenne prime) A prime number is called a Mersenne prime if
		 * it can be written in the form 2p - 1 for some positive integer p.
		 * Write a program that finds all Mersenne primes with p … 100 and
		 * displays the output as shown below. (Hint: You have to use BigInteger
		 * to store the number, because it is too big to be stored in long. Your
		 * program may take several hours to run.) p 2^p – 1 2 3 3 7 5 31
		 */

		// BigInteger object with value of 2
		BigInteger two = new BigInteger("2");
		// printing out the "header"
		System.out.println("p\tp^2-1\n");
		// petlja provjerava prvih 100 "p" brojeva
		for (int i = 0; i <= 100; i++) {
			// BigInteger objekt sa vrijednosti 2^i
			BigInteger number = two.pow(i);

			BigInteger marsennePrime = number.subtract(BigInteger.ONE);
			// ako je marsenne broj prime printamo ga
			if (marsennePrime.isProbablePrime(1)) {
				System.out.println(i + "\t" + marsennePrime);
			}
		}
	}

}

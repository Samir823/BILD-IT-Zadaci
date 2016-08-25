package Zadaci_24_08_2016;

import java.math.BigDecimal;

public class Zadatak_5_Divisible_By_5_Or_6 {

	public static void main(String[] args) {
		/*
		 * 10.21 (Divisible by 5 or 6) Find the first ten numbers greater than
		 * Long.MAX_VALUE that are divisible by 5 or 6.
		 */

		String numString = "" + 1;
		// creating a 50 digit decimal number
		for (int i = 0; i < 49; i++) {

			numString += "0";
		}

		BigDecimal hugeNum = new BigDecimal(numString);
		int brojac = 0;
		while (brojac < 10) {

			// Provjeriti da li je veliki broj djeljiv sa 2 ili 3
			BigDecimal remainder5 = hugeNum.remainder(new BigDecimal(5));
			BigDecimal remainder6 = hugeNum.remainder(new BigDecimal(6));
			// ako je ostatak od broja jednak 0 printaj veliki broj i povecaj
			// brojac za 1

			if (remainder5.equals(BigDecimal.ZERO)
					|| remainder6.equals(BigDecimal.ZERO)) {
				brojac++;
				System.out.println(brojac + ": " + hugeNum);
			}
			hugeNum = hugeNum.add(BigDecimal.ONE);
		}

	}

}

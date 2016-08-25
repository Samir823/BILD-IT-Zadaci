package Zadaci_24_08_2016;

import java.math.BigDecimal;

public class Zadatak_1_Divisible_By_2_Or_3 {

	public static void main(String[] args) {
		/*
		 * *10.16 (Divisible by 2 or 3) Find the first ten numbers with 50
		 * decimal digits that are divisible by 2 or 3.
		 */

		String s = "1";
		for (int i = 0; i < 49; i++) {		//kreiranje prvog broja sa 50 cifri
			s = s + "0";
		}
		BigDecimal num = new BigDecimal(s);
		int counter = 0;
		while (counter < 10) {		
			if (num.remainder(new BigDecimal(2)).equals(BigDecimal.ZERO) || 	//broj mora biti djeljiv sa
				num.remainder(new BigDecimal(3)).equals(BigDecimal.ZERO)) {		//2 ili 3
				counter++;
				System.out.println(num);		//printaj ako je broj djeljiv 2 ili 3, 
			}
			num = num.add(BigDecimal.ONE);		//dodajemo 1 na broj u stringu
		}
	
	}
}

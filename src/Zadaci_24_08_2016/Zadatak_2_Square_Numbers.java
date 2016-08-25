package Zadaci_24_08_2016;
import java.math.BigDecimal;

public class Zadatak_2_Square_Numbers {

	public static void main(String[] args) {
		/*
		 * *10.17 (Square numbers) Find the first ten square numbers that are
		 * greater than Long.MAX_VALUE. A square number is a number in the form
		 * of n2. For example, 4, 9, and 16 are square numbers. Find an
		 * efficient approach to run your program fast.
		 */


		
				int brojac = 0;
				long first = (long) Math.sqrt(Long.MAX_VALUE);		//korijen od max long broja je startni broj od koga se pocinje brojat
				BigDecimal num = new BigDecimal(first);
				
				while (true) {
					num = num.add(BigDecimal.ONE);				
					BigDecimal square = num.multiply(num);		//za svaki n2 koji je veci od Long max ispisati u konzoli
					System.out.println(square);
					brojac++;			
					if (brojac == 10) {		
						break;	
					}
				}
			}
}


package Zadaci_12_08_2016;

public class Zadatak_3_IsPrime {

	public static void main(String[] args) {
		/*
		 * 3. Napisati metodu sa sljedeæim headerom: public static int
		 * isPrime(int n) koja provjerava da li je broj prost/prime. Napsati
		 * test program koji poziva ovu metodu i ispisuje sve proste brojeve u
		 * rasponu od 0 do 100000.
		 */

		for (int i = 0; i < 100000; i++) {// petlja prolazi sve brojeve
			if (isPrime(i) != 0) {// ako nije 0 ispisuj broj
				System.out.println(i + " ");
			}

		}

	}

	public static int isPrime(int n) {// metoda za pronalazak prime broja

		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				count++;
		}
		if (count == 2)
			return n;
		else
			return 0;

	}

}

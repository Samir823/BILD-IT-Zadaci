package Zadaci_13_08_2016;

public class Zadatak_4_Palindrome_Prime {

	public static void main(String[] args) {
		/*
		 * 4. Palindrome prime je prosti broj koji je takoðer i palindrom. Na
		 * primjer, 131 je palindrome prime, kao i brojevi 313 i 757. Napisati
		 * program koji ispisuje prvih 100 palindrome prime brojeva, 10 brojeva
		 * po liniji.
		 */

		int brojac = 0;// varijabla oznacava koliko se puta broj palindrom prime
						// ispisao

		for (int i = 0; brojac < 100; i++) {// for petlja ide dok se ne ispise i
											// 100 broj

			if (isPrime(i) && isPalindrome(i)) {// ako je tvrdnja tacna ispisi
												// broj
				brojac++;
				System.out.print(i + " ");// ispis
				if (brojac % 10 == 0) {
					System.out.println();// prelazak u novi red
				}

			}
		}
	}

	public static boolean isPalindrome(int broj) {// metoda pronalazi palindrom
													// broj

		if (broj < 0) // negativni brojevi nisu palindromi
			return false;

		if (reverse(broj) == broj) {// ako broj ostaje nepromjenjen nakon sto su
									// obrnute cifre broj je palindrom
			return true;
		} else {
			return false;
		}

	}

	static boolean isPrime(int n) { // metoda pronalazi prost broj

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

	public static int reverse(int number) {// metoda omogucava suprotan
											// redoslijed cifara unesenog broja

		int reversenum = 0;

		while (number != 0) {
			reversenum = reversenum * 10;
			reversenum = reversenum + number % 10;
			number = number / 10;
		}

		return reversenum;
	}

}

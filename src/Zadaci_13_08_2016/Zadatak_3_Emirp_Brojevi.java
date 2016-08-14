package Zadaci_13_08_2016;

public class Zadatak_3_Emirp_Brojevi {

	public static void main(String[] args) {
		/*
		 * 3. Emirp brojevi (prime unazad) je nepalindromski prosti broj koji je
		 * prosti broj i kada ispišemo naopako. Na primjer, broj 17 i broj 71 su
		 * prosti brojevi tako da su brojevi i 17 i 71 emirp brojevi. Napisati
		 * program koji ispisuje prvih 100 emirp brojeva, 10 brojeva po liniji.
		 */

		int count = 0;//varijabla broji koliko se puta ispisao prime unazad

		for (int i = 0; count < 100; i++) {

			if (isPrime(i) && isPrime(reverse(i)) && !isPalindrome(i)) {//ako je selekcija tacna broj se ispisuje
				count++;
				System.out.print(i + " ");//ispis
				if (count % 10 == 0) {
					System.out.println();
				}

			}
		}
	}

	// }
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
}

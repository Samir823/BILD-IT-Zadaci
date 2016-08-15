package II_Mini_Projekat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Credit_card_number_validation {

	public static void main(String[] args) {
		/*
		 * **6.31 (Financial: credit card number validation) Credit card numbers
		 * follow certain patterns. A credit card number must have between 13
		 * and 16 digits. It must start with: ■ 4 for Visa cards ■ 5 for Master
		 * cards ■ 37 for American Express cards ■ 6 for Discover cards In 1954,
		 * Hans Luhn of IBM proposed an algorithm for validating credit card
		 * numbers. The algorithm is useful to determine whether a card number
		 * is entered correctly or whether a credit card is scanned correctly by
		 * a scanner. Credit card numbers are generated following this validity
		 * check, commonly known as the Luhn check or the Mod 10 check, which
		 * can be described as follows (for illustration, consider the card
		 * number 4388576018402626): 1. Double every second digit from right to
		 * left. If doubling of a digit results in a two-digit number, add up
		 * the two digits to get a single-digit number.
		 */

		System.out
				.println("Unesite broj kreditne kartice, broj mora biti u long formatu: ");

		Scanner input = new Scanner(System.in);
		long number = input.nextLong();

		if (isValid(number)
				&& (prefixMatched(number, 4) || prefixMatched(number, 5)
						|| prefixMatched(number, 6) || prefixMatched(number, 37))) {
			System.out.println(number + "\n Broj je validan");// ako je true
																// ispisi da je
																// broj validan

		} else
			System.out.println(number + "\n Broj nije validan");// ako je false
																// ispisi da
																// nije valida
		input.close();
	}

	public static boolean isValid(long number) {// vraca true ako je broj
												// kartice validan

		int firstPrefix = (int) getPrefix(number, 1);
		if (firstPrefix != 4 && firstPrefix != 5 && firstPrefix != 3
				&& firstPrefix != 6) {
			return false;
		}

		if (firstPrefix == 3) {
			int secondPrefix = (int) getPrefix(number, 2);
			if (secondPrefix != 37) {
				return false;
			}
		}

		if ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 != 0) {// provjera
																				// sume
			return false;
		}

		return true;

	}

	public static int sumOfDoubleEvenPlace(long number) {// prolazeci kroz broj
															// uzima svaku drugu
															// cifru
		// i udupla je te ukoliko bude jednocifren broj dodajemo sumi a ako je
		// br dvocifren sumi dodajemo zbir njegovih cifara

		int n = getSize(number);
		int sum = 0;

		for (int i = 2; i <= n; i += 2) {
			sum += getDigit(2 * getDigitFromIndex(number, i));
		}

		return sum;

	}

	public static int getDigitFromIndex(long number, int index) {
		int digit;
		digit = (int) (((number / Math.pow(10, index - 1))) % 10);
		return digit;
	}

	public static int sumOfOddPlace(long number) {// Metoda koja vraca zbir svih
													// brojeva koji se nalaze na
													// neparnim mjestima u broju

		int sum = (int) (number % 10);
		number /= 10;
		while (number / 100 != 0) {
			// get first digit of last two
			int num = (int) (number % 100 / 10);
			number /= 100;
			sum += num;
		}
		return sum;
	}

	public static boolean prefixMatched(long number, int d) {// Metoda koja
																// vraca true
																// ako se prve
																// cifre broja
																// (nume)
																// poklapaju sa
																// brojem koji
																// provjeravamo

		if (getPrefix(number, getSize(d)) == d) {
			return true;
		}
		return false;

	}

	public static int getDigit(int number) {// vraca broj ako je jednocifren ili
											// zbir cifara

		if (number <= 9) {
			return number;
		} else {
			int firstDigit = number % 10;
			int secondDigit = (number / 10);
			return firstDigit + secondDigit;
		}
	}

	public static int getSize(long d) {// vraca broj cifara
		int count = 1;
		while (d / 10 != 0) {
			d /= 10;
			count++;
		}
		return count;
	}

	public static long getPrefix(long number, int k) {// vraca prefix
		String num = Long.toString(number);// petvara broj u string
		if (num.length() < k) {
			return number;
		}
		return Long.valueOf(num.substring(0, k));
	}
}
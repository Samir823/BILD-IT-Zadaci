package Zadaci_23_08_2016;

public class Zadatak_2_The_MyInteger_Class {

	public static void main(String[] args) {
		/*
		 * 10.3 (The MyInteger class) Design a class named MyInteger. The class
		 * contains: ■ An int data field named value that stores the int value
		 * represented by this object. ■ A constructor that creates a MyInteger
		 * object for the specified int value. ■ A getter method that returns
		 * the int value. ■ The methods isEven(), isOdd(), and isPrime() that
		 * return true if the value in this object is even, odd, or prime,
		 * respectively. ■ The static methods isEven(int), isOdd(int), and
		 * isPrime(int) that return true if the specified value is even, odd, or
		 * prime, respectively. ■ The static methods isEven(MyInteger),
		 * isOdd(MyInteger), and isPrime(MyInteger) that return true if the
		 * specified value is even, odd, or prime, respectively. ■ The methods
		 * equals(int) and equals(MyInteger) that return true if the value in
		 * this object is equal to the specified value. ■ A static method
		 * parseInt(char[]) that converts an array of numeric characters to an
		 * int value. ■ A static method parseInt(String) that converts a string
		 * into an int value. Draw the UML diagram for the class and then
		 * implement the class. Write a client program that tests all methods in
		 * the class.
		 */

		MyInteger n1 = new MyInteger(5);// kreiranje objekta

		System.out.println("n1 is even? " + n1.isEven());// provjera da li je br
															// paran
		System.out.println("n1 is prime? " + n1.isPrime());// provjerava da li
															// je broj prost
		System.out.println("15 is prime? " + MyInteger.isPrime(7));

		char[] chars = { '3', '5', '3', '9' };// kreiranje niza karaktera
		System.out.println(MyInteger.parseInt(chars));

		String s = "3539";
		System.out.println(MyInteger.parseInt(s));

		MyInteger n2 = new MyInteger(24);// kreiranje drugog objekta i ispis
											// provjere broja
		System.out.println("n2 is odd? " + n2.isOdd());
		System.out.println("45 is odd? " + MyInteger.isOdd(45));
		System.out.println("n1 is equal to n2? " + n1.equals(n2));
		System.out.println("n1 is equal to 5? " + n1.equals(5));
	}
}

class MyInteger {// kreiranje klase

	// data field
	int value;

	MyInteger(int newValue) {// konstruktor prima arg
		value = newValue;
	}

	// geter
	public int getValue() {
		return value;
	}

	// metoda provjerava da li je broj paran
	public static boolean isEven(int n) {
		return (n % 2 == 0);
	}

	// metoda provjerava da li je broj neparan
	public static boolean isOdd(int n) {
		return !isEven(n);
	}

	public static boolean isPrime(int n) {
		for (int f = 2; f < n / 2; f++) {
			if (n % f == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isEven(MyInteger n) {
		return n.isEven();
	}

	public static boolean isOdd(MyInteger n) {
		return n.isOdd();
	}

	public static boolean isPrime(MyInteger n) {
		return n.isPrime();
	}

	public boolean isEven() {
		return isEven(value);
	}

	public boolean isOdd() {
		return isOdd(value);
	}

	public boolean isPrime() {
		return isPrime(value);
	}

	public boolean equals(int n) {
		return (value == n);
	}

	public boolean equals(MyInteger n) {
		return equals(n.getValue());
	}

	public static int parseInt(String s) {
		return Integer.parseInt(s);
	}

	public static int parseInt(char[] s) {
		return parseInt(new String(s));
	}
}
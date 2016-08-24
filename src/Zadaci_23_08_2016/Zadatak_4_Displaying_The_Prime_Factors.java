package Zadaci_23_08_2016;

import java.text.MessageFormat;
import java.util.Scanner;

public class Zadatak_4_Displaying_The_Prime_Factors {

	public static void main(String[] args) {
		/*
		 * *10.5 (Displaying the prime factors) Write a program that prompts the
		 * user to enter a positive integer and displays all its smallest
		 * factors in decreasing order. For example, if the integer is 120, the
		 * smallest factors are displayed as 5, 3, 2, 2, 2. Use the
		 * StackOfIntegers class to store the factors (e.g., 2, 2, 2, 3, 5) and
		 * retrieve and display them in reverse order.
		 */

		Scanner input = new Scanner(System.in);
		System.out.print("Unesite pozitivan cijeli broj: ");
		int num = input.nextInt();

		StackOfIntegers stack = new StackOfIntegers(20);

		int factor = 2;// varijabla faktor ima pocetnu vrijednost 2
		while (factor <= num) {// petlja se izvrsava dok je faktor manji od
								// unosa
			if (num % factor == 0) {
				stack.push(factor);
				num /= factor;
			} else {
				factor++;
			}
		}
		while (!stack.empty()) {// ispisuj dok stack ne bude prazan
			System.out.print(stack.pop() + " ");
		}

		input.close();
	}

}

class StackOfIntegers {// kreiranje klase

	// data field
	private int[] elementi;
	private int size;

	// kreiranje stacka od 18 mjesta
	public StackOfIntegers() {
		this(18);
	}

	// stack kome se odredjuje kapacitet
	public StackOfIntegers(int capacity) {
		elementi = new int[capacity];
	}

	public int push(int value) {
		if (size >= elementi.length) {
			int[] temp = new int[elementi.length * 2];
			System.arraycopy(elementi, 0, temp, 0, elementi.length);
			elementi = temp;
		}

		return elementi[size++] = value;
	}

	public int pop() {
		return elementi[--size];
	}

	public int peek() {
		return elementi[size - 1];
	}

	public boolean empty() {
		return size == 0;
	}

	public int getSize() {
		return size;
	}
}
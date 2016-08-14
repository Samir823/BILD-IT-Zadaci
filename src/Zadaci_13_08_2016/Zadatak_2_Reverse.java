package Zadaci_13_08_2016;

import java.util.Scanner;

public class Zadatak_2_Reverse {

	public static void main(String[] args) {
		/*
		 * 2. Napišite metodu sa sljedeæim headerom koja vraæa naopako ispisan
		 * broj koji joj je proslijeğen kao argument: public static void
		 * reverse(int number). Na primjer, reverse(3456) treba da vrati 6543.
		 * Napisati program koji pita korisnika da unese neki cijeli broj te mu
		 * vrati isti ispisan naopako.
		 */

		Scanner input = new Scanner(System.in);//kreiranje scannera
		System.out.println("Unesi broj: ");
		int n = input.nextInt();

		reverse(n);//pozivanje metode
		
		input.close();
	}

	public static void reverse(int number) {//metoda omogucava suprotan redoslijed cifara unesenog broja
		
		int reversenum = 0;

	
		while (number != 0) {
			reversenum = reversenum * 10;
			reversenum = reversenum + number % 10;
			number = number / 10;
		}

		System.out.println("Naopako broj : " + reversenum);
	}
	
}

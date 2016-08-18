package Zadaci_17_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_3_Short_Broj {

	public static void main(String[] args) {
		/*
		 * 3. U javi, short vrijednost se sprema u samo 16 bita. Napisati
		 * program koji pita korisnika da unese short broj te mu ispiše svih 16
		 * bita za dati cijeli broj. Na primjer, ukoliko korisnik unese broj 5 -
		 * program mu ispisuje 0000000000000101
		 */

	
		
		
		short num = checkInput();//provjera unosa
		
		System.out.println(String.format("%016d", Integer.parseInt(Integer.toBinaryString(num))));
	}
	public static short checkInput() {//metoda za provjeru unosa
		short a = 0;
		boolean on_off = true;
		Scanner input = new Scanner(System.in);

		do {
			try {
				System.out.println("Unesite short broj:");
				a=input.nextShort();
				
				on_off = false;

			} catch (InputMismatchException ex) {
				System.out.println("Doslo je do greske!!! Pokusajte ponovo: ");
				input.nextLine();
			}
			// petlja se izvrsava dok postoji greska
		} while (on_off);

		input.close();
		return a;
	}
}



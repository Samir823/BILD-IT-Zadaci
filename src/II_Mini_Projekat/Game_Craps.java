package II_Mini_Projekat;

import java.util.Scanner;

import com.sun.swing.internal.plaf.basic.resources.basic;

public class Game_Craps {

	public static void main(String[] args) {
		/*
		 * **6.30 (Game: craps) Craps is a popular dice game played in casinos.
		 * Write a program to play a variation of the game, as follows: Roll two
		 * dice. Each die has six faces representing values 1, 2, …, and 6,
		 * respectively. Check the sum of the two dice. If the sum is 2, 3, or
		 * 12 (called craps), you lose; if the sum is 7 or 11 (called natural),
		 * you win; if the sum is another value (i.e., 4, 5, 6, 8, 9, or 10), a
		 * point is established. Continue to roll the dice until either a 7 or
		 * the same point value is rolled. If 7 is rolled, you lose. Otherwise,
		 * you win. Your program acts as a single player. Here are some sample
		 * runs.
		 */



		System.out.println("Kocke su bacene: ");

		int dice1 = (int) (Math.random() * 6 + 1);// dodjeljivanje vrijednosti
													// od 1 do 6 prvoj i drugoj
													// kocki, Math.random()
													// metodom
		int dice2 = (int) (Math.random() * 6 + 1);

		int suma = dice1 + dice2;

		if (suma == 2 || suma == 3 || suma == 12) {// selekcija provjerava da li
													// je suma jednaka brojevima
													// u zagradi
			System.out.println("Izabrali ste: " + dice1 + " + " + dice2 + " = "// ispis
																				// poruke
					+ suma + "\nIzgubili ste");
		} else if (suma == 7 || suma == 11) {
			System.out.println("Izabrali ste: " + dice1 + " + " + dice2 + " = "
					+ suma + "\nPobijedili ste");

		} else if (suma == 4 || suma == 5 || suma == 6 || suma == 8
				|| suma == 9 || suma == 10) {
			int point = suma;

			System.out.println("Izabrali ste: " + dice1 + " + " + dice2 + " = "
					+ suma + "\nCilj je: " + point);

			do {// u slucaju da se nasumicno doslo do point zbira kocka se
				// ponovo baca

				dice1 = (int) (Math.random() * 6 + 1);
				dice2 = (int) (Math.random() * 6 + 1);
				suma = dice1 + dice2;
				

				if (point == suma) {
					System.out.println("Izabrali ste: " + dice1 + " + " + dice2
							+ " = " + suma + "\nPobijedili ste: ");// ako je
																	// provjera
																	// tacna,
																	// ispisi i
																	// izadji iz
																	// petlje
					break;
				} else if (suma == 7) {
					System.out.println("Izabrali ste: " + dice1 + " + " + dice2
							+ " = " + suma + "\nIzgubili ste");
					break;
				}

			} while (suma != 7 || suma != point);// petlja se krece dok
													// rezultat(suma) nije 7 ili
													// point broj

		}
	}
}

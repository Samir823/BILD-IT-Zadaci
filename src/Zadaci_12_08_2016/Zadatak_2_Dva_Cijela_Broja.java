package Zadaci_12_08_2016;

import java.util.Scanner;

public class Zadatak_2_Dva_Cijela_Broja {

	public static void main(String[] args) {
		/*
		 * 2. Napisati program koji pita korisnika da unese dva cijela,
		 * pozitivna broja te ispisuje najveæi i najmanji zajednièki djelilac za
		 * ta dva broja.
		 */

		// novi Scanner
		Scanner input = new Scanner(System.in);

		System.out.print("Unesite prvi broj: ");
		int firstNumber = input.nextInt(); // prvi broj
		System.out.print("\nUnesite drugi broj: ");
		int secondNumber = input.nextInt(); // drugi broj

		input.close(); // zatvaranje Scannera
		int greatestCommonDivisor = 1; // najveci zajednicki djelilac
		int lowestCommonDivisor = 1; // najmanji zajednicki djelilac
		int count = 0; // brojac

		// ako je prvi broj veci od drugog, zamijeniti im vrijednosti, jer
		// petlja ide do manjeg broja
		if (firstNumber > secondNumber) {
			int temp = firstNumber;
			firstNumber = secondNumber;
			secondNumber = temp;
		}

		// petlja se vrti do manjeg broja i ispituje da li su oba broja djeljiva
		// sa kontrolnom varijablom i
		for (int i = 2; i <= firstNumber; i++) {
			// ako su oba broja djeljiva sa "i" onda najveci zajednicki djelilac
			// postaje vrijednost i
			if (firstNumber % i == 0 && secondNumber % i == 0) {
				count++;
				greatestCommonDivisor = i;
			}
			// prvi zajednicki djelilac je najmanji zajednicki djelilac
			if (count == 1) {
				lowestCommonDivisor = i;
			}
		}

		// ispis najmanjeg zajednickog djelioca
		System.out.println("Najmanji zajednicki djelilac: "
				+ lowestCommonDivisor);
		// ispis najveceg zajednickog djelioca
		System.out.println("Najveci zajednicki djelilac: "
				+ greatestCommonDivisor);

	}

}

package III_Mini_Projekat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Connect_four {
	/*
	 * 8.20 (Game: connect four) Connect four is a two-player board game in
	 * which the players alternately drop colored disks into a seven-column,
	 * six-row vertically suspended grid, as shown below.The objective of the
	 * game is to connect four same-colored disks in a row, a column, or a
	 * diagonal before your opponent can do likewise. The program prompts two
	 * players to drop a red or yellow disk alternately. In the preceding
	 * figure, the red disk is shown in a dark color and the yellow in a light
	 * color. Whenever a disk is dropped, the program redisplays the board on
	 * the console and determines the status of the game (win, draw, or
	 * continue).
	 */

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int[][] values = new int[6][7];// kreiranje tabele od 6 kolona i 7
										// redova
		int brDiskova = 0; //varijabla broji unos krugova/diskova
		String igrac;//varijabla koristi za odredjivanje igraca
		int krug;

		do {

			brDiskova++;
			if (brDiskova % 2 == 0) {
				igrac = "Crveni";
				krug = 1;
			} else {
				igrac = "Zuti";
				krug = 2;
			}

			System.out.print("Ubaci " + igrac + " krug u kolonu (0–6):");
			int kolona = inputChack();
			for (int i = values.length - 1; i >= 0; i--) {//petlja se izvrsava dok postoji mjesta u tabeli
				if (values[i][kolona] == 0) {
					values[i][kolona] = krug;
					break;
				}
				if (i == 0)
					System.out.println("Kolona je popunjena probaj drugi unos");
			}
			displayBoard(values);

		} while (checkBoard(values) == false && brDiskova != 6 * 7);

		if (checkBoard(values)) {
			System.out.println(igrac + " Igrac je pobijedio");

		} else {
			System.out.println(" Nerijeseno je ");
		}

	}

	// metoda printa i prikazuje tabelu
	public static void displayBoard(int[][] values) {

		for (int i = 0; i < values.length; i++) {
			System.out.print("|");
			for (int j = 0; j < values[i].length; j++) {
				char c;
				if (values[i][j] == 1) {
					c = 'R';
				} else if (values[i][j] == 2) {
					c = 'Y';
				} else {
					c = ' ';
				}

				System.out.print(c + "|");
			}
			System.out.println();
		}

		for (int i = 0; i <= values.length * 2; i++) {
			System.out.print("-");
		}

		System.out.println();

	}

	public static boolean checkBoard(int[][] values) {

		return checkVer(values) || checkHor(values) || checkDia(values);

	}

	// metoda prolazi kroz niz vertikalno
	public static boolean checkVer(int[][] values) {

		for (int i = 0; i < values[0].length; i++) {
			int start = values[0][i];
			int count = 1;
			for (int j = 1; j < values.length; j++) {
				if (start == values[j][i] && start != 0) {
					count++;
				} else {
					start = values[j][i];
					count = 1;
				}

				if (count == 4) {
					return true;
				}
			}
		}

		return false;

	}

	// metoda prolazi kroz niz horizontalno
	public static boolean checkHor(int[][] values) {

		for (int i = 1; i < values.length; i++) {
			int start = values[i][0];
			int count = 1;
			for (int j = 1; j < values[i].length; j++) {
				if (start == values[i][j] && start != 0) {
					count++;
				} else {
					start = values[i][j];
					count = 1;
				}

				if (count == 4) {
					return true;
				}
			}
		}

		return false;

	}

	public static boolean checkDia(int[][] values) {

		// From upper left to lower right
		// Go through the row

		// petlja prolazi kroz red u tabeli od gornjeg lijevog ka donjem desnom
		// uglu
		for (int i = 0; i < values.length; i++) {
			int start = values[i][0];
			int count = 1;
			for (int j = i + 1, k = 1; j < values.length
					&& k < values[0].length; j++, k++) {
				if (start == values[j][k] && start != 0) {
					count++;
				} else {
					start = values[j][k];
					count = 1;
				}
				if (count == 4) {
					return true;
				}
			}
		}

		// petlja prolazi kroz kolonu

		for (int i = 0; i < values[0].length; i++) {
			int start = values[0][i];
			int count = 1;
			for (int j = i + 1, k = 1; j < values[0].length
					&& k < values.length; j++, k++) {
				if (start == values[k][j] && start != 0) {
					count++;
				} else {
					start = values[k][j];
					count = 1;
				}

				if (count == 4) {
					return true;
				}
			}
		}

		// petlja prolazi kroz kolonu u tabeli od gornjeg desnog ka donjem
		// lijevom uglu

		for (int i = 0; i < values[0].length; i++) {
			int start = values[0][i];
			int count = 1;
			for (int j = 1, k = i - 1; j < values.length && k >= 0; j++, k--) {
				if (start == values[j][k] && start != 0) {
					count++;
				} else {
					start = values[j][k];
					count = 1;
				}
				if (count == 4) {
					return true;
				}
			}
		}

		//petlja prolazi kroz redove
		for (int i = 0; i < values.length; i++) {
			int start = values[i][values[i].length - 1];
			int count = 1;
			for (int j = i + 1, k = values[0].length - 2; j < values.length
					&& k >= 0; j++, k--) {
				if (start == values[j][k] && start != 0) {
					count++;
				} else {
					start = values[j][k];
					count = 1;
				}
				if (count == 4) {
					return true;
				}
			}
		}

		return false;

	}

	public static int inputChack() {// metoda provjerava unos korisnika

		int unos = 0; // pocetna vrijednost
		boolean on_off = true; // kontrolna promjenljiva
		do {
			try {
				unos = input.nextInt();

				/**
				 * ako je unos veci od 6 i manji od 0 petlja ce se ponovo
				 * izvrsiti, u suprotnom izaci ce iz programa
				 **/
				if (unos <= 6 || unos < 0)
					on_off = false;
				else
					System.out.println("Pogresan unos. Pokusajte ponovo: ");

			} catch (InputMismatchException ex) {
				System.out.println("Doslo je do greske!!! Pokusajte ponovo: ");
				input.nextLine();// omogucavamo korisniku drugi unos
			}
		} while (on_off);
		return unos;

	}

}

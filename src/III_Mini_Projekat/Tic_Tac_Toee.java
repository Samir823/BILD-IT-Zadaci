package III_Mini_Projekat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tic_Tac_Toee {

	static Scanner input = new Scanner(System.in);// kreiranje scennera na nivou
													// klase
	public static int brojac = 0;

	public static void main(String[] args) {

		// Scanner input = new Scanner(System.in);

		int[][] tabela = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };// kreiranje
																	// tabele

		char[][] ixoxTabla = new char[3][3];

		boolean krajIgre = false;

		while (krajIgre == false) {
			playerX(tabela, ixoxTabla);
			if (isWin(ixoxTabla)) {
				System.out.println("Igrac \"X\" je pobijedio!");
				System.exit(0);
			}
			if (getCounter() == 9) {
				System.out.println("Nerijeseno je.");
				System.exit(1);
			}
			playerO(tabela, ixoxTabla);
			if (isWin(ixoxTabla)) {
				System.out.println("Igrac \"O\" je pobijedio!");
				System.exit(2);
			}
			System.out.println("brojac: " + getCounter());
		}

	}

	public static void displayTable(char[][] xoTable) {// metoda ispisuje tabelu
		for (int i = 0; i < xoTable.length; i++) {
			System.out.println(" -------------");
			for (int j = 0; j < xoTable[i].length; j++) {
				System.out.print(" | ");
				System.out.print(xoTable[i][j]);
			}
			System.out.println(" | ");
		}
		System.out.println(" -------------");
	}

	// Metoda vraca stanje vezano za igraca "X"
	public static void playerX(int[][] table, char[][] xoTable) {

		System.out.println("Unesite red (0, 1, ili 2) za igraca X: ");
		int red = inputChack();

		System.out.println("Unesite kolonu (0, 1, ili 2) za igraca X: ");
		int kolona = inputChack();

		brojac++;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (table[red][kolona] == table[i][j]) {
					while (xoTable[red][kolona] == 'X'
							|| xoTable[red][kolona] == 'O') {
						System.out.println("Polje " + table[i][j]
								+ " je popunjeno, pokusaj ponovo.");
						System.out
								.println("Unesite red (0, 1, or 2) za igraca X: ");
						red = inputChack();

						System.out
								.println("Unesite kolonu (0, 1, or 2) za igraca X: ");
						kolona = inputChack();
					}
					if (xoTable[i][j] != 'X' && xoTable[i][j] != 'O') {
						xoTable[i][j] = 'X';
					}
				}
			}
		}
		displayTable(xoTable);
	}

	// metoda vraca stanje vezano za igraca "O"
	public static void playerO(int[][] table, char[][] xoTable) {

		System.out.println("Unesite red (0, 1, or 2) za igraca O: ");
		int row = inputChack();

		System.out.println("Unesite kolonu (0, 1, or 2) za igraca O: ");
		int column = inputChack();

		brojac++;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (table[row][column] == table[i][j]) {
					while (xoTable[row][column] == 'X'
							|| xoTable[row][column] == 'O') {
						System.out.println("Polje " + table[i][j]
								+ " je popunjeno, pokusaj ponovo.");
						System.out
								.println("Unesite red (0, 1, or 2) za igraca O: ");
						row = inputChack();

						System.out
								.println("Unesite kolonu (0, 1, or 2) za igraca O: ");
						column = inputChack();
					}
					if (xoTable[i][j] != 'O' && xoTable[i][j] != 'X') {
						xoTable[i][j] = 'O';
					}
				}
			}
		}
		displayTable(xoTable);
	}

	// metoda provjerava pobjednika
	public static boolean isWin(char[][] xoTable) {
		boolean win = false;
		for (int i = 0; i < xoTable.length; i++) {
			for (int j = 0; j < xoTable.length; j++) {
				if (xoTable[i][0] == 'X' && xoTable[i][1] == 'X'
						&& xoTable[i][2] == 'X' || xoTable[0][j] == 'X'
						&& xoTable[1][j] == 'X' && xoTable[2][j] == 'X'
						|| xoTable[0][0] == 'X' && xoTable[1][1] == 'X'
						&& xoTable[2][2] == 'X' || xoTable[0][2] == 'X'
						&& xoTable[1][1] == 'X' && xoTable[2][0] == 'X') {
					win = true;
				} else if (xoTable[i][0] == 'O' && xoTable[i][1] == 'O'
						&& xoTable[i][2] == 'O' || xoTable[0][j] == 'O'
						&& xoTable[1][j] == 'O' && xoTable[2][j] == 'O'
						|| xoTable[0][0] == 'O' && xoTable[1][1] == 'O'
						&& xoTable[2][2] == 'O' || xoTable[0][2] == 'O'
						&& xoTable[1][1] == 'O' && xoTable[2][0] == 'O') {
					win = true;
				}
			}
		}
		return win;
	}

	// metoda provjerava da li je nerijesen rezultat
	public static int getCounter() {
		return brojac;
	}

	// metoda za provjeru unosa podataka
	public static int inputChack() {
		int unos = 0; // pocetna vrijednost
		boolean inputCheck = true; // kontrolna promjenljiva
		do {
			try {
				unos = input.nextInt(); // ucitavanje unosa i provjera da li
										// odgovara jednom od ponudjenih
				if (unos == 0 || unos == 1 || unos == 2)
					inputCheck = false;
				else
					System.out.println("Pogresan unos. Pokusajte ponovo: "); // ako
																				// nije
																				// ispisi
																				// poruku

			} catch (InputMismatchException ex) { // u slucaju pogresnog unosa
				System.out.println("Pogresan unos. Pokusajte ponovo: ");
				input.nextLine();
			}
		} while (inputCheck);
		return unos;
	}
}
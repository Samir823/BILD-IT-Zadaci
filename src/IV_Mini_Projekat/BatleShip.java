package IV_Mini_Projekat;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class BatleShip {

	static Scanner input = new Scanner(System.in);

	static int[][] board = new int[5][5];
	static int[][] ships = new int[3][2];
	static int[] shoot = new int[2];
	static int attempts = 0, shotHit = 0;

	public static void main(String[] args) {

		initBoard(board);
		initShips(ships);

		System.out.println();

		do {
			System.out
					.println("Ako se zelite predati i odustati od igre unesite \"0\" \n");

			showBoard(board);
			shoot(shoot);
			attempts++;

			if (hit(shoot, ships)) {
				hint(shoot, ships, attempts);
				shotHit++;
			} else
				hint(shoot, ships, attempts);

			changeboard(shoot, ships, board);

		} while (shotHit != 3);

		System.out
				.println("\n\n\nBattleship igra je gotova! Pogodili ste tri broda u "
						+ attempts + " pokusaja");
		showBoard(board);
	}

	public static void initBoard(int[][] board) {
		for (int row = 0; row < 5; row++)
			for (int column = 0; column < 5; column++)
				board[row][column] = -1;
	}

	public static void showBoard(int[][] board) {
		System.out.println("\t1 \t2 \t3 \t4 \t5");
		System.out.println();

		for (int row = 0; row < 5; row++) {
			System.out.print((row + 1) + "");
			for (int column = 0; column < 5; column++) {
				if (board[row][column] == -1) {
					System.out.print("\t" + "-");
				} else if (board[row][column] == 0) {
					System.out.print("\t" + "O");
				} else if (board[row][column] == 1) {
					System.out.print("\t" + "X");
				}

			}
			System.out.println();
		}

	}

	public static void initShips(int[][] ships) {
		Random random = new Random();

		for (int ship = 0; ship < 3; ship++) {
			ships[ship][0] = random.nextInt(5);
			ships[ship][1] = random.nextInt(5);

			for (int last = 0; last < ship; last++) {
				if ((ships[ship][0] == ships[last][0])
						&& (ships[ship][1] == ships[last][1]))
					do {
						ships[ship][0] = random.nextInt(5);
						ships[ship][1] = random.nextInt(5);
					} while ((ships[ship][0] == ships[last][0])
							&& (ships[ship][1] == ships[last][1]));
			}

		}
	}

	public static void shoot(int[] shoot) {
		Scanner input = new Scanner(System.in);

		System.out.print("Row: ");
		shoot[0] = takeInput();
		shoot[0]--;

		System.out.print("Column: ");
		shoot[1] = takeInput();
		shoot[1]--;

	}

	public static boolean hit(int[] shoot, int[][] ships) {

		for (int ship = 0; ship < ships.length; ship++) {
			if (shoot[0] == ships[ship][0] && shoot[1] == ships[ship][1]) {
				System.out.printf(
						"Pogodjeni brod je lociran na koti (%d,%d)\n",
						shoot[0] + 1, shoot[1] + 1);
				return true;

			}
		}
		return false;
	}

	public static void hint(int[] shoot, int[][] ships, int attempt) {
		int row = 0, column = 0;

		for (int line = 0; line < ships.length; line++) {
			if (ships[line][0] == shoot[0])
				row++;
			if (ships[line][1] == shoot[1])
				column++;
		}

		System.out.println("\n" + attempt + " Pokusaj\n");
	}

	public static void changeboard(int[] shoot, int[][] ships, int[][] board) {
		if (hit(shoot, ships))
			board[shoot[0]][shoot[1]] = 1;
		else
			board[shoot[0]][shoot[1]] = 0;

	}

	private static void sumiranje() {
		System.out.println("\n\n\nIzgubili ste! Pogodili ste " + shotHit
				+ " broda\nPreostalo je jos " + (3 - shotHit) + " broda");
		showBoard(board);
		System.exit(1);

	}

	public static int takeInput() {

		boolean isGood = false;
		int userInput = 0;
		while (!isGood) {
			try {
				userInput = input.nextInt();

				if (userInput == 0) {

					sumiranje();

				}

				if (userInput >= 1 && userInput <= 5) {
					isGood = true;
				} else {
					// Ako korisnik unese broj manji od 1 ili veci od 5
					System.out
							.print("Promasaj, izasli ste van terena, odaberite brojeve u rasponu od (1-5):");
				}
			} catch (InputMismatchException ex) {
				System.out
						.println(" Pogresan unos, unesite broj izmedju 1 i 5");
				isGood = false;

			} finally {
				input.nextLine();
			}

		}

		return userInput;
	}

}

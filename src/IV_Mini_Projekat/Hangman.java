package IV_Mini_Projekat;

import java.util.ArrayList;
import java.util.Scanner;

public class Hangman {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// getting random word from string
		String[] words = { "racunar", "kuca", "fasada", "kockica", "automobil",
				"posao", "lokacija", "fudbal", "dijamant", "meditacija" };
		int r = (int) (Math.random() * 10);
		final String WORD = words[r];

		int countMistake = 0; // brojac pogresnih slova
		ArrayList<Character> list = new ArrayList<>(); // lista tacnih slova
		ArrayList<Character> wrongList = new ArrayList<>();// lista pogresnih
															// slova
		while (countMistake < 7) {

			System.out.println("_____________________________________");
			printGame(WORD, countMistake);
			printWord(WORD, list, wrongList);
			System.out.print("\nPogodi slovo: ");
			boolean enter = true;
			char letter = 'a';
			while (enter) {
				letter = input.next().charAt(0);

				if (list.contains(letter) || wrongList.contains(letter))
					System.out.print("Vec uneseno, unesi drugo: ");
				else
					enter = false;
			}
			if (contains(WORD, letter)) {
				list.add(letter);
				printGame(WORD, countMistake);
				printWord(WORD, list, wrongList);
				System.out.println("\n____________________________________");
				System.out.print("Zelite pogoditi rijec(1-DA,2-NE)? ");
				int answer = input.nextInt();
				if (answer == 1) {
					System.out.println("Vas odgovor je: ");
					String guess = input.next();
					if (guess.equals(WORD)) {
						System.out.println("Tacno! Cestitamo!");
						System.exit(1);
					}
				}
			} else {// ako je rijec pogresna
				countMistake++;
				wrongList.add(letter);
			}
			if (countMistake == 6) {
				System.out.println("Izgubili ste!");
				System.exit(1);
			}
		}
	}

	// Metoda provjerava da li ima karaktera u rijeci
	public static boolean contains(String word, char ch) {
		for (int i = 0; i < word.length(); i++) {
			if (ch == word.charAt(i)) {
				return true;
			}
		}
		return false;
	}

	public static void printGame(String word, int count) {
		System.out.println("_________");
		System.out.println("         |\n         |");
		switch (count) {
		case 0:
			System.out.println("\n\n\n");
			break;
		case 1:
			System.out.println("         O\n\n\n");
			break;
		case 2:
			System.out.println("         O");
			System.out.println("         |\n         |\n");
			break;
		case 3:
			System.out.println("         O");
			System.out.print("        \\");
			System.out.println("|\n         |\n");
			break;
		case 4:
			System.out.println("         O");
			System.out.print("        \\");
			System.out.println("|/\n         |\n");
			break;
		case 5:
			System.out.println("         O");
			System.out.print("        \\");
			System.out.println("|/\n         |");
			System.out.println("        /");
			break;
		case 6:
			System.out.println("         O");
			System.out.print("        \\");
			System.out.println("|/\n         |");
			System.out.println("        / \\");
			break;
		}

	}

	public static void printWord(String word, ArrayList<Character> list,
			ArrayList<Character> wrongList) {
		for (int i = 0; i < word.length(); i++) {
			if (list.contains(word.charAt(i)))

				System.out.print(word.charAt(i) + " ");
			else
				System.out.print("_ ");
		}
		System.out.println();
		if (!wrongList.isEmpty()) {
			System.out.print("\nWrong letters: ");
			for (char e : wrongList) {
				System.out.print(e + " ");
			}
			System.out.println();
		}
	}

}

package Zadaci_31_08_2016;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_4_Process_Scores_In_A_Text_File_On_The_Web {

	public static void main(String[] args) {
		/*
		 * **12.23 (Process scores in a text file on the Web) Suppose that the
		 * text file on the Web http://cs.armstrong.edu/liang/data/Scores.txt
		 * contains an unspecified number of scores. Write a program that reads
		 * the scores from the file and displays their total and average. Scores
		 * are separated by blanks.
		 */

		ArrayList<Integer> scores = new ArrayList<>();
		try {
			URL url = new URL("http://cs.armstrong.edu/liang/data/Scores.txt");
			Scanner input = new Scanner(url.openStream());
			while (input.hasNextInt()) {

				scores.add(input.nextInt());
			}

		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}

		System.out.println("Scores = " + scores);
		System.out.println("Total = " + getTotal(scores));
		System.out.println("Average = " + getAverage(scores));

	}

	private static double getAverage(ArrayList<Integer> scores) {

		double total = getTotal(scores);

		return total / scores.size();
	}

	private static int getTotal(ArrayList<Integer> scores) {

		int total = 0;
		for (int score : scores) {
			total += score;
		}

		return total;
	}
}
package Zadaci_30_08_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_5_Write_Read_Data {

	public static void main(String[] args) {
		/*
		 * *12.15 (Write/read data) Write a program to create a file named
		 * Exercise12_15.txt if it does not exist. Write 100 integers created
		 * randomly into the file using text I/O. Integers are separated by
		 * spaces in the file. Read the data back from the file and display the
		 * data in increasing order.
		 */

		int numberOfScores = (int) (Math.random() * 100 + 100);
		try {
			PrintWriter output = new PrintWriter("scores.txt");
			output.write(randomNumbers(numberOfScores));
			output.close();
			System.out.println("Saved " + numberOfScores
					+ " scores to scores.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Scanner input = new Scanner(System.in);
		System.out.print("Enter filename: ");
		File filename = new File(input.next());
		input.close();

		if (!filename.exists()) {
			System.out.println(filename + " does not exist.");
			System.exit(1);
		}
		// Creating arrayList to hold an unspecified number of scores
		ArrayList<Integer> scores = new ArrayList<>();
		try {
			input = new Scanner(filename);
			while (input.hasNextInt()) {
				scores.add(input.nextInt());
			}
			System.out.println("Read " + scores.size() + " scores from "
					+ filename);
		} catch (FileNotFoundException ex) {

			System.out.println("Error reading " + filename);
			ex.printStackTrace();
		}
	}

	public static String randomNumbers(int size) {

		String s = "";
		for (int i = 0; i < size; i++) {
			s += " " + (int) (Math.random() * 100);
		}

		return s;
	}
}
package Zadaci_27_08_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_1_Largest_Rows_And_Columns {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * 11.9 (Largest rows and columns) Write a program that randomly fills
		 * in 0s and 1s into an n-by-n matrix, prints the matrix, and finds the
		 * rows and columns with the most 1s. (Hint: Use two ArrayLists to store
		 * the row and column indices with the most 1s.) Here is a sample run of
		 * the program:
		 */

		int n;
		if (args.length < 1) {
			System.out.print("Unesite velicinu niza: ");
			n = input.nextInt();
		} else {
			n = Integer.parseInt(args[0]);
			System.out.println("Uzimamo proslijedjeni argument " + args[0]
					+ ":");
		}

		boolean[][] bitField = new boolean[n][n];
		bitField = populateArray(bitField);

		System.out.println("Nasumican array je" + printArray(bitField));

		System.out.println("Najveci index reda: " + largestDim(bitField, true));
		System.out.println("Najveci index kolone: "
				+ largestDim(bitField, false));
	}

	private static boolean[][] populateArray(boolean[][] bitField) {
		java.util.Random random = new java.util.Random();
		for (boolean[] row : bitField)
			for (int i = 0; i < row.length; i++)
				row[i] = random.nextBoolean();
		return bitField;
	}

	//
	private static String printArray(boolean[][] bitField) {
		String output = "";
		for (boolean row[] : bitField) {
			output += "\n";
			for (boolean cell : row)
				output += cell ? "1" : "0";
		}
		return output;
	}

	private static String largestDim(boolean[][] bitField, boolean byRows) {
		int largestCount = 0;
		ArrayList<Integer> indices = new ArrayList<>();
		for (int i = 0; i < bitField.length; i++) {
			int count = 0;
			for (int j = 0; j < bitField[i].length; j++) {
				boolean cell = byRows ? bitField[i][j] : bitField[j][i];
				count += cell ? 1 : 0;
			}
			if (largestCount < count) {
				indices.clear();
				largestCount = count;
			}
			if (count == largestCount)
				indices.add(i);
		}

		String stringRep = indices.toString();

		return stringRep.substring(1, stringRep.length() - 1);
	}
}
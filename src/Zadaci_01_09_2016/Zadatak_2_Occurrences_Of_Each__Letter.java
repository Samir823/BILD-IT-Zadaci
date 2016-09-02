package Zadaci_01_09_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadatak_2_Occurrences_Of_Each__Letter {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		System.out.println("Enter a filename:");
		String fileName = input.next();
		input.close();
		File file = new File("D:\\" + fileName);	//kreiranje putanje fajla
		Scanner read = new Scanner(file);			//kreiranje objekta Scanner
		String alphabet = "abcdefghijklmnopqrstuvwxyz";		//string za uporedjivanje
		int[] count = new int[alphabet.length()];		//brojac slova
		while (read.hasNextLine()) {
			String s = read.next();
			for (int i = 0; i < s.length(); i++) {
				for (int j = 0; j < alphabet.length(); j++) {
					if (s.toLowerCase().charAt(i) == alphabet.charAt(j)) {	//ako pronadjemo isto slovo, smjestiti ga u isti index
						count[j]++;
					}
				}
			}
		}
		read.close();
		//ispis svih slova i njihovih brojaca
		for (int i = 0; i < alphabet.length(); i++) {
			System.out.printf("Number of %c's: %d\n", alphabet.toUpperCase().charAt(i), count[i]);
		}
	}
}


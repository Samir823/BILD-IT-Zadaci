package Zadaci_31_08_2016;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;

public class Zadatak_5_Create_Large_Dataset {

	public static void main(String[] args) throws Exception {
		/*
		 * *12.24 (Create large dataset) Create a data file with 1,000 lines.
		 * Each line in the file consists of a faculty member’s first name, last
		 * name, rank, and salary. The faculty member’s first name and last name
		 * for the ith line are FirstNamei and LastNamei. The rank is randomly
		 * generated as assistant, associate, and full. The salary is randomly
		 * generated as a number with two digits after the decimal point. The
		 * salary for an assistant professor should be in the range from 50,000
		 * to 80,000, for associate professor from 60,000 to 110,000, and for
		 * full professor from 75,000 to 130,000. Save the file in Salary.txt.
		 * Here are some sample data: FirstName1 LastName1 assistant 60055.95
		 * FirstName2 LastName2 associate 81112.45 . . . FirstName1000
		 * LastName1000 full 92255.21
		 */

		File file = new File("Salary.txt");

		// ukoliko ne postoji fajl zavrsava se program
		if (!file.exists()) {
			System.out.println("File not exists.");
		} else {
			PrintWriter write = new PrintWriter(file);

			// upisivanje u fajl 1000 osoba
			for (int i = 1; i < 1001; i++) {

				write.println("FirstName" + i + ", LastName" + i
						+ rankAndSalary());

			}
			write.close();
			System.out.println("Finish.");
		}
	}

	// metoda vraca tip profesora i platu
	public static String rankAndSalary() {

		String str = "";
		switch (1 + (int) (Math.random() * 3)) {
		// za docenta
		case 1:
			str = ", assistant " + salary(1);
			break;
		// za vanrednog profesora
		case 2:
			str = ", associate " + salary(2);
			break;
		// za redovnog profesora
		case 3:
			str = ", full profesor " + salary(3);
			break;
		}
		return str;

	}

	// vraca platu za odredjenu vrstu profesora
	public static String salary(int i) {

		double salary = 0;
		switch (i) {
		// asistent profesor, plata od 50.000 to 80.000,
		case 1:
			salary = 50000 + (Math.random() * 30001);
			break;

		// plata od 60,000 to 110,000,
		case 2:
			salary = 60000 + (Math.random() * 50001);
			break;

		// puno radno vrijeme 75,000 to 130,000
		case 3:
			salary = 75000 + (Math.random() * 55001);
			break;
		}
		return String.format("%.2f", salary);

	}
}
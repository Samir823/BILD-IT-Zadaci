package Zadaci_19_08_2016;

import java.util.Scanner;

public class Zadatak_1_Weekly_Hours {

	public static void main(String[] args) {
		/*
		 * 1. Chapter 8, zadatak 8.4**8.4 (Compute the weekly hours for each
		 * employee) Suppose the weekly hours for all employees are stored in a
		 * two-dimensional array. Each row records an employee’s seven-day work
		 * hours with seven columns. For example, the following array stores the
		 * work hours for eight employees. Write a program that displays
		 * employees and their total hours in decreasing order of the total
		 * hours. Su M T W Th F Sa Employee 0 2 4 3 4 5 8 8 Employee 1 7 3 4 3 3
		 * 4 4 Employee 2 3 3 4 3 3 2 2 Employee 3 9 3 4 7 3 4 1 Employee 4 3 5
		 * 4 3 6 3 8 Employee 5 3 4 4 6 3 4 4 Employee 6 3 7 4 8 3 8 4 1.
		 * Employee 7 6 3 5 9 2 7 9
		 */

		Scanner unos = new Scanner(System.in);

		int[] uposlenici = new int[8];

		int[][] sati = new int[8][7];

		for (int i = 0; i < uposlenici.length; i++) {
			uposlenici[i] = i;

		}
		for (int red = 0; red < sati.length; red++) {
			for (int kolona = 0; kolona < sati[red].length; kolona++) {
				sati[red][kolona] = (int) (Math.random() * 10);
			}
		}
		System.out.println("                 Pon Uto Sri Èet Pet Sub Ned");//ispis dana u sedmici
		for (int red = 0; red < sati.length; red++) {
			System.out.print("Uposlenik: " + uposlenici[red] + " ima ");//ispis uposlenika
			for (int kolona = 0; kolona < sati[red].length; kolona++) {//ispis sedmicni sati

				System.out.print(" " + sati[red][kolona] + "  ");

			}
			System.out.println();
			unos.close();
		}

	}
}


package Zadaci_01_08_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_1 {
	/*
	 * 1. Napisati sljedeæu metodu koja vraæa najveæu vrijednosti u ArrayListu
	 * Integera. Metoda vraæa null ukoliko je lista null iil ukoliko lista
	 * sadrži 0 elemenata. public static Integer max(ArrayList<Integer> list)
	 */

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<Integer>();

		System.out.println("Unesite brojeve u listu, nula prekida unos: ");

		//Varijabla za kontrolisanje do while petlje
		boolean prekidac = false;

		// Do while petlja nas vraca na pocetak u slucaju pogresnog unosa
		do {

			try {
				for (int i = 0; i >= lista.size(); i++) {
					int a = unos.nextInt();
					if (a == 0) {
						break;

					}
					lista.add(a);
				}
				prekidac = false;
			}

			catch (InputMismatchException ex) {
				System.out.println("Unijeli ste slovo, molimo unesite broj");
				unos.next();
				lista.clear();

				prekidac = true;

			}

		} while (prekidac);
		System.out.println("Najveci broj je : " + (max(lista)));

		unos.close();
	}

	// Metoda za pronalazenje najvece vrijednosti u ArrayListi

	public static Integer max(ArrayList<Integer> list) {
		int najveciBr = 0;

		if (list.size() == 0) {
			return null;
		}
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > najveciBr) {
				najveciBr = list.get(i);
			}

		}

		return najveciBr;

	}

}

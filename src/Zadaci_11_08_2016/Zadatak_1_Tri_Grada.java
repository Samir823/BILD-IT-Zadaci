package Zadaci_11_08_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak_1_Tri_Grada {

	public static void main(String[] args) {
		/*
		 * 1. Napisati program koji pita korisnika da unese imena tri grada te
		 * ih ispiše u abecednom redu. Na primjer, ukoliko korisnik unese
		 * Chicago, Los Angeles i Atlanta kao gradove, program vraæa Atlanta,
		 * Chicago, Los Angeles.
		 */

		Scanner input = new Scanner(System.in);// kreiranje scannera

		ArrayList<String> list = new ArrayList<String>();// kreiranje arrayListe

		System.out
				.println("Unesite imena 3 grada, koja zelite da se sortiraju u abecednom redoslijedu: ");

		for (int i = 0; i < 3; i++) {// dodavanje unosa u listu
			list.add(input.nextLine());

		}
		Collections.sort(list);// sortiranje
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));// ispisivanje stanja liste
		}
		input.close();
	}

}

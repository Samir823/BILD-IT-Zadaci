package Zadaci_12_08_2016;

public class Zadatak_1_Tablica {

	public static void main(String[] args) {
		/*
		 * 1. Pretpostavimo da se registarska tablica za auto sastoji od tri
		 * uppercase karaktera i 4 broja u sljedeæem formatu AAA-1234. Napisati
		 * program koji nasumièno generiše tablicu.
		 */

		//Ipis tablica i odabir nasumicnih slova i brojeva radimo pomocu Math.random () metode
		System.out.println((char) ((int) ((Math.random() * 26) + 65)) + ""
				+ (char) ((int) ((Math.random() * 26) + 65)) + ""
				+ (char) ((int) ((Math.random() * 26) + 65)) + "-"
				+ (int) (Math.random() * 10) + "" + (int) (Math.random() * 10)
				+ "" + (int) (Math.random() * 10) + (int) (Math.random() * 10));

	}
}
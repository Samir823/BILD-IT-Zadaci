package Zadaci_10_08_2016;

public class Zadatak_3_Broj_Kombinacija {

	public static void main(String[] args) {
		/*
		 * 3. Napisati program koji ispisuje sve mogu�e kombinacije za biranje
		 * dva broja u rasponu od 1 do 7. Tako�er, program ispisuje broj svih
		 * mogu�ih kombinacija. Dakle, program treba da ispi�e sve mogu�e parove
		 * brojeva u datom rasponu, krenuv�i sa 1 2, 1 3, 1 4, itd. Broj mogu�ih
		 * kombinacija je 21.
		 */

		int num1 = 1;// kreiranje dvije promjenjive
		int num2 = 7;

		int kombinacija = 0;// promjenjiva u koju pohranjujemo broj kombinacija

		for (int i = num1; i <= num2; i++) {// kreiranje ugnjezdene petlje

			for (int j = i; j < num2; j++) {

				if (num1 != num2) {// povecanje varijable kombinacija ako su
									// brojevi razliciti
					kombinacija++;
				}

			}

		}
		System.out.println("Broj kombinacija je " + kombinacija);// ispis

	}

}

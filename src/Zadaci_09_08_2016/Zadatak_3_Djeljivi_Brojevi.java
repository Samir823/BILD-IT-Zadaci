package Zadaci_09_08_2016;

public class Zadatak_3_Djeljivi_Brojevi {

	public static void main(String[] args) {
		/*
		 * 3. Napišite program koji ispisuje sve brojeve, od 100 do 1000, 10
		 * brojeva po liniji, koji su djeljivi i sa 5 i sa 6. Razmak izmeðu
		 * brojeva treba biti taèno jedan space.
		 */

		int brojac = 0;

		for (int i = 100; i < 1000; i++) {// petlja ide od 100 do broja 1000

			if (i % 5 == 0 && i % 6 == 0) {// uslov, ako je tacan broj se printa
											// i brojac povecava za +1
				System.out.print(i + " ");
				brojac++;
			}
			if (brojac == 10) {// prelazak u novi red ako je brojac jednak 10
				System.out.println();
				brojac = 0;
			}
		}

	}

}

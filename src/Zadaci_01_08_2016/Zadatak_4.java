package Zadaci_01_08_2016;

public class Zadatak_4 {

	public static void main(String[] args) {
		// Prvi niz koristi za kolicinu brojeva
		int[] nasumicniNiz = new int[100];

		// Drugi niz sluzi za raspon brojeva
		int[] brojac = new int[10];

		// Generisanje broja od 0 do 9
		for (int i = 0; i < nasumicniNiz.length; i++) {
			int num = (int) (Math.random() * 10);
			nasumicniNiz[i] = num;
			brojac[num]++;
		}
		// Ispis for petljom
		for (int i = 0; i < brojac.length; i++) {
			System.out.println("Broj " + i + " Ponavlja se = " + brojac[i]
					+ " puta");

		}
	}
}

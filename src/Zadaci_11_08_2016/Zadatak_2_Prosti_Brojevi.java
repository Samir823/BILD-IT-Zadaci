package Zadaci_11_08_2016;

public class Zadatak_2_Prosti_Brojevi {

	public static void main(String[] args) {
		/*
		 * 2. Napisati program koji ispisuje sve proste brojeve od 2 do 1000,
		 * ukljuæujuæi i 2 i 1000. Program treba da ispiše 8 brojeva po liniji
		 * te razmak izmeðu brojeva treba da bude jedan space.
		 */

		int newLine = 0;

		for (int i = 2; i <= 1000; i++) {
			if (isPrime(i)) {// petlja ide od 2 do 1000 i ispisuje svaki prost
								// broj

				System.out.print(i + " ");
				newLine++;

			}
			if (newLine == 8) {// ako je promjenjiva jednako broju 8 prelazi u
								// novi red
				System.out.println();
				newLine = 0;// vraca vrijednost na 0
			}

		}

	}

	static boolean isPrime(int n) // metoda pronalazi prost broj
	{
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				count++;
		}
		if (count == 2)
			return true;
		else
			return false;
	}

}

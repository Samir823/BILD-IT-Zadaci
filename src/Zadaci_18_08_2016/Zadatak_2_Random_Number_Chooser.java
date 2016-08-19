package Zadaci_18_08_2016;

public class Zadatak_2_Random_Number_Chooser {

	public static void main(String[] args) {
		/*
		 * 2. Chapter 7, zadatak 7.137.13 (Random number chooser) Write a method
		 * that returns a random number between 1 and 54, excluding the numbers
		 * passed in the argument. The method header is specified as follows:
		 * public static int getRandom(int... numbers)
		 */

		System.out.println(getRandom(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));// poziv
																		// metode
																		// i
																		// proslijedjivanje
																		// argumenata

	}

	public static int getRandom(int... numbers) {

		int randomNum = (int) (Math.random() * 54) + 1;

		for (int i : numbers) {
			if (i == randomNum) { // ako je random broj isti kao i jedan od
									// proslijedjenih u argumentu zavrsi sa
									// radom programa
				System.out.println("Random broj je naveden u argumentu");
				System.exit(0);

			}

		}
		return randomNum;
	}

}

package Zadaci_05_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_1_Racun {

	public static void main(String[] args) {
		/*
		 * 1. Pretpostavimo da uplatimo $100 svaki mjesec na štedni raèun koji
		 * ima godišnju interesnu stopu od 5%. Mjeseèna interesna stopa je stoga
		 * 0.05 / 12 = 0.00417. Nakon prvog mjeseca vrijednost na raèunu postaje
		 * 100 * (1 + 0.00417) = 100.417. Nakon drugog mjeseca, vrijednost na
		 * raèunu postaje (100 + 100.417) * (1 + 0.00417) = 201.252. Nakon
		 * treæeg mjeseca, vrijednost na raèunu postaje (100 + 201.252) * (1 +
		 * 0.00417) = 302.507 i tako dalje. Napisati program koji pita korisnika
		 * da unese mjeseèni iznos štednje te broj mjeseci nakon kojeg bi želio
		 * znati stanje raèuna.
		 */

		boolean prekidac = false;// varijala prekidac omogucava kontrolu do
									// while petlje
		Scanner unos = new Scanner(System.in);// implementiramo scanner klasu
		do {// do while petlja omogucava korisniku ponovan unos u slucaju
			// exceptiona
			try {// try catch hvata exception i omogucava nastavak rada programa

				System.out
						.println("Molimo vas unesite mjesecni iznos stednje: ");// trazimo
																				// od
																				// korisnika
																				// da
																				// unese
																				// vrijednost
				double korisnikStednja = unos.nextDouble();// iniciranje
															// varijable za
															// stednju

				System.out.println("Molimo vas unesite broj mjeseci: ");// trazimo
																		// od
																		// korisnika
																		// da
																		// unese
																		// vrijednost
				int korisnikMjesec = unos.nextInt();// iniciranje varijable za
													// broj mjeseci

				System.out.printf("Ukupan iznos je\n%2.3f KM",
						racun(korisnikStednja, korisnikMjesec));// pozivanje
																// metode i
																// ispis stanja

				prekidac = false;// prekidac ide na false ako je prethodno doslo
									// do exceptiona
			} catch (InputMismatchException ex) {
				System.out.println("Greska!!! Molimo vas da unosite brojeve");// poruka
																				// korisniku
																				// ako
																				// dodje
																				// do
																				// exceptiona
				unos.nextLine();// omogucava se korisniku ponovan unos ako
								// slucajno ili namjerno unese nesto drugo osim
								// broja
				prekidac = true;// prekidac ide na true i omogucava korisniku
								// ponovan unos
			}
		} while (prekidac);
		unos.close();// zatvaramo scanner
	}

	public static double racun(double racun, int mjesec) {// metoda prima racun
															// i broj mjeseci od
															// strane korisnika
		double ukupnoMjesecno = racun * (1 + 0.00417);// kreiranje varijable i
														// prosledjivanje
														// vrijednosti
		if (mjesec == 0) {// ako je unos 0 korisniku se vraca nepromjenjeno
							// stanje racuna
			return racun;
		}

		if (mjesec == 1) {// ako je unos mjeseci 1
			return ukupnoMjesecno;
		}

		for (int i = 1; i < mjesec; i++) {// for petlja vraca stanje racuna za
											// vise od 1 mjeseca
			ukupnoMjesecno = +(racun + ukupnoMjesecno) * (1 + 0.00417);

		}
		return ukupnoMjesecno;// vraca vrijednost nakon izlaza iz petlje
	}

}

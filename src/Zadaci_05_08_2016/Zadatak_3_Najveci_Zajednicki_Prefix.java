package Zadaci_05_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_3_Najveci_Zajednicki_Prefix {

	public static void main(String[] args) {
		/*
		 * 3. Napisati program koji pita korisnika da unese 2 stringa te
		 * ispisuje najveæi zajednièki prefix za ta dva stringa, ukoliko isti
		 * postoji. Na primjer, ukoliko korisnik unese sljedeæa dva stringa
		 * "Dobrodošli u Dubai" i "Dobrodošli u Vankuver" program treba da
		 * ispiše: Najveæi zajednièki prefix za dva stringa je "Dobrodošli u".
		 */

		Scanner unos = new Scanner(System.in);// Implementiranje scannera

		boolean prekidac = false;// varijala prekidac omogucava kontrolu petlje
		do {// do while petljom omogucavamo korisniku da ponovo unese vrijednost
			// ako pogresno unese broj
			try {// try catchom hvatamo exceptione

				System.out.println("Molimo vas da unesete prvi string: ");// trazimo
																			// od
																			// korisnika
																			// da
																			// unese
																			// vrijednost

				String prvi = unos.nextLine();//

				System.out.println("Molimo vas da unesete drugi string: ");

				String drugi = unos.nextLine();

				if (prvi.length() > drugi.length()) {// ako je prvi string veci
														// od drugog zamijenit
														// ce mjesta da se ne bi
														// dogodio outOfBounts
														// exception
					String zamjena = prvi;
					prvi = drugi;
					drugi = zamjena;
				}
				System.out.println("Zajednicki prefix za ova dva stringa je ");
				int provjera = 0;// ako postoji bar jedan prefix dodijelit cemo
									// vrijednost varijabli

				for (int i = 0; i < prvi.length(); i++) {// petljom prolazimo
															// kroz prvi i drugi
															// string
					if (prvi.charAt(i) == drugi.charAt(i)) {// selekcijom
															// uporedjujemo
															// pozicije na
															// stringovima i
															// provjeravamo
															// jednakost
						System.out.print(prvi.charAt(i));
						provjera++;// ako postoji bar jedan prefix dodijelit
									// cemo vrijednost za 1 varijabli provjera

					} else if (provjera == 0) {// ako nije bilo prefixa ispisat
												// ce slijedecu poruku
						System.out
								.println("Stringovi nemaju zajednickog prefixa");
						break;// oznacava izlazak iz petlje
					} else
						break;

				}
				prekidac = false;
			} catch (InputMismatchException ex) {
				System.out
						.println("Greska!!! Pogresan unos, molimo da unesete string");
				unos.nextLine();// omogucavamo korisniku drugi unos

				prekidac = true;
			}

		} while (prekidac);
		unos.close();
	}

}

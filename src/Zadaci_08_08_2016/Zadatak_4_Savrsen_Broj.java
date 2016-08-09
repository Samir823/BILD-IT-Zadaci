package Zadaci_08_08_2016;

public class Zadatak_4_Savrsen_Broj {

	public static void main(String[] args) {
		/*
		 * 4. Pozitivni cijeli broj je savršen broj ukoliko je jednak zbiru svih
		 * svojih pozitivnih djelilaca, iskljuèujuæi sebe. Na primjer, 6 je prvi
		 * savršeni broj jer 6 = 3 + 2 + 1. Sljedeæi savršeni broj je 28 jer 28
		 * = 14 + 7 + 4 + 2 + 1. Samo 4 savršena broja postoje u rasponu od 0 do
		 * 10.000. Napišite program koji ispisuje sva 4.
		 */

		for (int broj = 6; broj <= 10000; broj++) {// petlja prolazi
													// kroz svaki broj od 6 do
													// 10000
			int ukupno = 0;
			int djelilac = broj - 1;

			while (djelilac > 0) {

				if (broj % djelilac == 0) {// ako je ostatak dijeljenja 0, onda
											// se djelilac dodaje na ukupnu
											// vrijednost
					ukupno += djelilac;
				}
				djelilac--;
			}

			if (broj == ukupno) {
				System.out.println(broj);

			}

		}
	}

}

package Zadaci_13_08_2016;

import java.util.Scanner;

public class Zadatak_5_Bolja_Cijena {

	public static void main(String[] args) {
		/*
		 * 5. Pretpostavimo da kupujemo rižu ili neki drugi proizvod u dva
		 * razlièita pakovanja. Želimo napisati program koji uporeðuje cijene ta
		 * dva pakovanja. Program pita korisnika da unese težinu i cijenu oba
		 * pakovanja te ispisuje koje pakovanje ima bolju cijenu.
		 */

		Scanner unos = new Scanner(System.in);

		// pitati korisnika da unese tezinu i cijenu prvog paketa
		System.out.print("Unesite tezinu i cijenu prvog paketa: ");

		// uzeti unos od korisnika i dodijeliti varijablama
		double tezinaPrvogPaketa = unos.nextDouble();
		double cijenaPrvogPaket = unos.nextDouble();

		// pitati korisnika da unese tezinu i cijenu drugog paketa
		System.out.print("Unesite tezinu i cijenu drugog paketa: ");

		// uzeti unos od korisnika i dodijeliti varijablama
		double tezinaDrugogPaketa = unos.nextDouble();
		double cijenaDrugogPaket = unos.nextDouble();

		// zatvoriti Scanner
		unos.close();

		// izracunati odnos tezine i cijene prvog paketa
		double odnosPrvogPaketa = tezinaPrvogPaketa / cijenaPrvogPaket;
		// izracunati odnos tezine i cijene drugog paketa
		double odnosDrugogPaketa = tezinaDrugogPaketa / cijenaDrugogPaket;

		// uporediti odnose tezina i cijena paketa i ispisati poruku korisniku
		if (odnosPrvogPaketa > odnosDrugogPaketa) {
			System.out.println("Bolju cijenu ima prvi paket.");
		} else if (odnosPrvogPaketa == odnosDrugogPaketa) {
			System.out.println("Cijene su jednake.");
		} else {
			System.out.println("Bolju cijenu ima drugi paket.");
		}
	}

}

package Bankomat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainBankomat {

	public static void main(String[] args) {
		Admin a = new Admin();
		

		Scanner unos = new Scanner(System.in);
		do {
			try {
				System.out.print("Unesite user name: ");
				
				String user = unos.next();
				
				System.out.print("Unesite pasword: ");
				
				String pasw = unos.next();
				
				if (user.equals("admin") && pasw.equals("admin")) {
					boolean exit = false;
					do {
                        
						System.out.println("\n           Ulogovani ste kao Administrator");
						System.out.println(" Molimo vas rednim brojem od 0 do 4 odaberite naredni korak ");
			            System.out.println("____________________________________________________________");
						System.out.println("      [1] Dodaj novog korisnika:");
						System.out.println("------------------------------------------------------------");
						System.out.println("      [2] Briši postojeæe korisnike:");
						System.out.println("------------------------------------------------------------");
						System.out.println("      [3] Promijeni stanje novca u bankomatu:");
						System.out.println("------------------------------------------------------------");
						System.out.println("      [4] Ispisi listu korisnika i njihova stanja na racunu:");
						System.out.println("------------------------------------------------------------");
						System.out.println("      [0] log out:");
						System.out.println("____________________________________________________________");

						switch (unos.nextInt()) {

						case 1:
							a.dodajNovogKorisnika();
							break;
						case 2:
							a.brisiKorisnika();
							break;
						case 3:
							a.promijeniStanjeNovcaUBankomatu();
							break;
						case 4:
							a.listaKorisnika();
							break;

						case 0:
							exit = true;
							break;
						}

					} while (!exit);
					continue;

				} else if (a.provjera(user, pasw)) {
					boolean exit = false;
					do {
						System.out.println("     Poštovani/a " + user + " vi ste ulogovani ");
						System.out.println(" Molimo vas rednim brojem od 0 do 2 odaberite naredni korak ");
						System.out.println("________________________________________________________");
						System.out.println("              [1] Podigni novac: ");
						System.out.println("--------------------------------------------------------");
						System.out.println("              [2] Pogledaj stanje na racunu: ");
						System.out.println("--------------------------------------------------------");
						System.out.println("              [0] Log out: ");
						System.out.println("________________________________________________________");
						switch (unos.nextInt()) {

						case 1:
						a.podigniNovac(user);
						break;
						case 2:
							a.pogledajStanjeRacuna(user);
							break;

						case 0:
							exit = true;
							break;
						}

					} while (!exit);
					continue;

				}
			} catch (Exception ex) {
				System.out
						.println("Greška!!!:unijeli ste broj ili slovo gdje ne treba :D\nMolimo vas logujte se ponovo!");
				unos.nextLine();
				
			}
		} while (true);

	}
}

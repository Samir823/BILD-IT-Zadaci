package Bankomat;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
	
	ArrayList<Korisnik> korisnik = new ArrayList<Korisnik>();

	Novac n = new Novac(60,30,20,10);

	Scanner unos = new Scanner (System.in);

	//Admin opcije
	public void dodajNovogKorisnika() {

		System.out.print("\nUnesite user novog korisnika: ");
		String imeKorisnik = unos.next();
		//Posto nisam kreirao niti jednig korisnika pri pokretanju programa ovaj kod sluzi za kreiranje prvog korisnika.
		if (korisnik.size() == 0) {
			System.out.print("\nUnesite pasword novog korisnika: ");
			String paswKorisnik = unos.next();
			
			System.out.print("\nUnesite iznos korisnikovog raèuna: ");
			int sumaKorisnik = unos.nextInt();
			
			korisnik.add(new Korisnik(imeKorisnik, paswKorisnik, sumaKorisnik));
			System.out.println("\n:::::::Korisnik " + imeKorisnik
					+ " uspjesno kreiran!::::::");
		} else {
			//Ovaj kod je za kreiranje ostalih korisnika
			
			boolean pozicija = true;
			if(pozicija){
			for (Korisnik korisnik2 : korisnik) {

				if (korisnik2.getImeKorisnika().equals(imeKorisnik)) {
					System.out
							.println("\nUser koji pokušavate unijeti veæ postoji u bazi!");
					pozicija = false;
					break;
				} 
			}
			if(pozicija){
					System.out.print("\nUnesite pasword novog korisnika: ");
				String paswKorisnik = unos.next();
				
				System.out.print("\nUnesite iznos korisnikovog raèuna: ");
				int sumaKorisnik = unos.nextInt();
			

				korisnik.add(new Korisnik(imeKorisnik, paswKorisnik,
						sumaKorisnik));
				System.out.println("\n:::::::Korisnik " + imeKorisnik
						+ " uspjesno kreiran!::::::");
				

			}}
		}
		}

	

	//Admin opcije
	public void brisiKorisnika() {

		System.out.print("\nUnesite user korisnika kojeg zelite izbrisati: ");
		String ime = unos.next();

		//Metoda uporeðuje unos admina sa svim imenima u array listi i kada identifikuje isti, utvrdi index i obrise sve na tom indexu..
		// tako sam ja to skonto :)   bitno je da radi..hehe
		for (int i = 0; i < korisnik.size(); i++) {
			if (korisnik.get(i).getImeKorisnika().equals(ime)) {
				korisnik.remove(korisnik.get(i));
				System.out.println("\nKorisnik " + ime
						+ " uspješno je izbrisan s liste");
			}
		}

	}

	//Admin opcije
	public void promijeniStanjeNovcaUBankomatu() {

		boolean exit = false;
		do {
			System.out.println("\n   Molimo vas rednim brojem od 0 do 9 odaberite naredni korak");
            System.out.println("_________________________________________________________________");
			System.out.println("[1] Ako zelite poveæati stanje novèanica u vrijednosti od 10 KM");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("[2] Ako zelite poveæati stanje novèanica u vrijednosti od 20 KM");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("[3] Ako zelite poveæati stanje novèanica u vrijednosti od 50 KM");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("[4] Ako zelite poveæati stanje novèanica u vrijednosti od 100 KM");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("[5] Ako zelite umanjiti stanje novèanica u vrijednosti od 10 KM");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("[6] Ako zelite umanjiti stanje novèanica u vrijednosti od 20 KM");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("[7] Ako zelite umanjiti stanje novèanica u vrijednosti od 50 KM");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("[8] Ako zelite umanjiti stanje novèanica u vrijednosti od 100 KM");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("[9] Uvid u stanje bankomata..");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("[0] Izlaz na poèetni meni.. ");
			System.out.println("_________________________________________________________________");
			
			/*Zbog lakseg manipulisanja sam napravio jos jednu metodu "adminIzmjenaStanjaBankomata" 
			 * i implementirao je u ovu..
			*/
			
			switch (unos.nextInt()) {
			case 1:
				adminIzmjenaStanjaBankomata(1);
				break;

			case 2:
				adminIzmjenaStanjaBankomata(2);
				break;
			case 3:
				adminIzmjenaStanjaBankomata(3);
				break;

			case 4:
				adminIzmjenaStanjaBankomata(4);
				break;
			case 5:
				adminIzmjenaStanjaBankomata(5);
				break;

			case 6:
				adminIzmjenaStanjaBankomata(6);
				break;
				
			case 7:
				adminIzmjenaStanjaBankomata(7);
				break;
			case 8:
				adminIzmjenaStanjaBankomata(8);
				break;
			case 9: 
				adminIzmjenaStanjaBankomata(9);
				break;
			case 0:
				 exit=true;
			break;
		
			}
			
		} while (!exit );

	}

	//Admin opcije
	public void listaKorisnika() {
		//Prikaz liste korisnika, jest da se nije tražilo u zadatku al nek ima
		
		System.out.println("\n                     LISTA Korisnika                        ");
		System.out.println("____________________________________________________________");
		System.out.printf("%12s %12s %12s ", "Ime korisnika", " Pasword korisnika", "   Stanje raèuna");
		System.out.println();
		for (Korisnik e : korisnik) {
			
			System.out.printf(" %10s %15s %15s %3s",e.getImeKorisnika(), e.getPasw(),e.getSumaRacuna(),"KM");
			System.out.println("\n____________________________________________________________\n");
			
			
		}
		System.out.println();

	}

	// Opcije za korisnika
	public void podigniNovac(String user) {
		
		System.out.print("\nPoštovani/a   " + user
			+ "   Unesite iznos novca koji želite podiæi: ");
		int svota = unos.nextInt();

	/*
	 * Ovaj dio koda sluzi za uporedbu usera sa userima u array listi,
	 *  dolazi do potrebnog indexa usera, provjerava stanje racuna korisnika
	 *   
	 */
		for (Korisnik e : korisnik) {
			if (e.getImeKorisnika().equals(user)) {
		

				if (svota > e.getSumaRacuna()) {
					System.out
							.println("Žao nam je transakcija ne može biti obavljena, nemate dovoljno sredstava na racunu ");
					break;
//dio koda provjerava da li može isplatiti željeni iznos, s obzirom na to s koliko novca raspolaže bankomat..
			} else if (svota > n.ukupnoStanjeNovcaUBankomatu()) {
				System.out
							.println("Žao nam je ali nema dovoljno novca u bankomatu, maximalno možete podiæi " + n.ukupnoStanjeNovcaUBankomatu() + " KM");
				} else {
					int ostatak = svota;
					/*E evo onaj bonus :D...
					 *Bankomat kada isplaæuje korisniku prvo provjera
					 */
					while (svota >= 100  ){
						if(n.getNovèanica_100KM() <= 0){
							break;
						}
						n.oduzmiNovcanicu_100_KM(1);
					svota=svota -100;
					
					
					}
					while (svota >= 50  ){
						if(n.getNovèanica_50KM() <= 0){
							break;
						}
						n.oduzmiNovcanicu_50_KM(1);
					svota= svota -50;
					}
					while (svota >=20 ){
						if(n.getNovèanica_20KM() <= 0){
							break;
						}
						n.oduzmiNovcanicu_20_KM(1);
					svota=svota -20;
					}
					while (svota >=10 ){
						if(n.getNovèanica_10KM() <= 0){
							break;
						}
						n.oduzmiNovcanicu_10_KM(1);
					svota= svota -10;
					}
					
					int oduzimanjeSkorisnickogRacuna = ostatak - svota;
					
					
					System.out
							.println("\nVaša transakcija je uspjesno obavljena\nS raèuna ste skinuli "
									+ oduzimanjeSkorisnickogRacuna + " KM, nismo vam mogli isplatiti " + svota + " KM\nBankomat ne sadrži novèanice manje od 10 KM"  );


						System.out.println("\nMožemo vam isplatiti jos "  +
								+ n.ukupnoStanjeNovcaUBankomatu() + " KM");

						modifikovanjeStanjaRacuna(oduzimanjeSkorisnickogRacuna, user);
						pogledajStanjeRacuna(user);

					}
				}
		}
		}

	//Admin opcije
	public boolean provjera(String ime, String pass) {
		for (int i = 0; i < korisnik.size(); i++) {
			if (korisnik.get(i).getImeKorisnika().equals(ime)
					&& korisnik.get(i).getPasw().equals(pass)) {
				return true;
			}
		}
		return false;
	}

	//Admin opcije
	public void modifikovanjeStanjaRacuna(int svota, String user) {
		for (Korisnik e : korisnik) {
			if (e.getImeKorisnika().equals(user)) {

				e.setSumaRacuna((svota));

				break;
			}
		}

	}

	//Opcije za korisnika
	public void pogledajStanjeRacuna(String user) {
		for (Korisnik e : korisnik)

			if (e.getImeKorisnika().equals(user)) {
				System.out.println("\nStanje vašeg raèuna je: "
						+ (e.getSumaRacuna() + " KM"));
				break;

			}

	}

	//Admin opcije
    public void adminIzmjenaStanjaBankomata(int opcija){
	int racun=0;
    	int unosNovèanica = 0;
	switch (opcija) {
	case 1:
		System.out.println("\nUnesite broj novèanica koji želite dodati bankomatu u vrijednosti\nod 10 KM, Bankomat moze primiti maximalno 100 novèanica jedne vrste"); 
				
		unosNovèanica= unos.nextInt();
		if(unosNovèanica > 100){
			System.out.println("Unijeli ste vise od 100 novcanica");
			break;
			
		}
		else if (n.novèanica_10KM + unosNovèanica > 100){
			racun =100 -(n.novèanica_10KM + unosNovèanica);
				System.out.println("Žao nam je bankomat ne moze primiti toliki broj novcanica, maximalan broj je: " + racun);
				break;
		}
		else{
			n.dodajNovcanica_10_KM(unosNovèanica);
			System.out.println("Uspjesno ste dopunili novèanice od 10 KM sa jos " + unosNovèanica + " novcanica\n "
					+ "trenutno se u bankomatu nalazi " + n.novèanica_10KM +" novèanica ");
			break;
	}
	case 2:
		System.out.println("\nUnesite broj novèanica koji želite dodati bankomatu u vrijednosti\nod 20 KM, Bankomat moze primiti maximalno 100 novèanica jedne vrste");
	unosNovèanica= unos.nextInt();
	if(unosNovèanica > 100){
		System.out.println("Unijeli ste vise od 100 novcanica");
	break;	
	}
	else if (n.novèanica_20KM + unosNovèanica > 100){
		racun =100 -n.novèanica_20KM + unosNovèanica;
			System.out.println("Žao nam je bankomat ne moze primiti toliki broj novcanica, maximalan broj je: " + racun);
			break;
	}
	else{
		n.dodajNovcanica_20_KM(unosNovèanica);
		System.out.println("Uspjesno ste dopunili novèanice od 20 KM sa jos " + unosNovèanica + " novcanica\n "
				+ "trenutno se u bankomatu nalazi " + n.novèanica_20KM +" novèanica ");
		break;
		
	}
	case 3:
		System.out.println("\nUnesite broj novèanica koji želite dodati bankomatu u vrijednosti\nod 50 KM, Bankomat moze primiti maximalno 100 novèanica jedne vrste");
	unosNovèanica= unos.nextInt();
	if(unosNovèanica > 100){
		System.out.println("Unijeli ste vise od 100 novcanica");
	break;	
	}
	else if (n.novèanica_50KM + unosNovèanica > 100){
		racun =100 -n.novèanica_50KM + unosNovèanica;
			System.out.println("Žao nam je bankomat ne moze primiti toliki broj novcanica, maximalan broj je: " + racun);
			break;
	}
	else{
		n.dodajNovcanica_50_KM(unosNovèanica);
	
		System.out.println("Uspjesno ste dopunili novèanice od 50 KM sa jos " + unosNovèanica + " novcanica\n "
				+ "trenutno se u bankomatu nalazi " + n.novèanica_50KM +" novèanica ");
		break;
		
}
	case 4:
		System.out.println("\nUnesite broj novèanica koji želite dodati bankomatu u vrijednosti\nod 100 KM,Bankomat moze primiti maximalno 100 novèanica jedne vrste");
	unosNovèanica= unos.nextInt();
	if(unosNovèanica > 100){
		System.out.println("Unijeli ste vise od 100 novcanica");
	break;	
	}
	else if (n.novèanica_100KM + unosNovèanica > 100){
		racun =100 -n.novèanica_100KM + unosNovèanica;
			System.out.println("Žao nam je bankomat ne moze primiti toliki broj novcanica, maximalan broj je: " + racun);
			break;
	}
	else{
		
		n.dodajNovcanica_100_KM(unosNovèanica);
		System.out.println("Uspjesno ste dopunili novèanice od 100 KM sa jos " + unosNovèanica + " novcanica\n "
				+ "trenutno se u bankomatu nalazi " + n.novèanica_100KM +" novèanica ");
		break;
}
	case 5:
		System.out.println("\nUnesite broj novèanica koji želite umanjiti bankomatu u vrijednosti od 10 KM");
		unosNovèanica =unos.nextInt();
		if(unosNovèanica < 0){
			System.out.println("Nemoguæe je unijeti negativan broj");
		}
		else if (n.novèanica_10KM  - unosNovèanica < 0 ){
			System.out.println("Ne možete smanjiti u toj kolièini, probajte s manjim unosom\n"
					+ " maximalno možete umanjiti za" + n.novèanica_10KM) ;
			break;
			
		}else{
			n.oduzmiNovcanicu_10_KM(unosNovèanica);
			System.out.println("Stanje novèanica ste umanjili za: "+ unosNovèanica +"\nSada je na stanju " + n.getNovèanica_10KM() + " novèanica po 10 KM");
			break;
		}
	
	case 6:
		System.out.println("\nUnesite broj novèanica koji želite umanjiti bankomatu u vrijednosti od 20 KM");
		unosNovèanica =unos.nextInt();
		if(unosNovèanica < 0){
			System.out.println("Nemoguæe je unijeti negativan broj");
		}
		else if (n.novèanica_20KM  - unosNovèanica < 0 ){
			System.out.println("Ne možete smanjiti u toj kolièini, probajte s manjim unosom\n"
					+ " maximalno možete umanjiti za" + n.novèanica_10KM) ;
			break;
			
		}else{
			n.oduzmiNovcanicu_20_KM(unosNovèanica);
			}
			System.out.println("Stanje novèanica ste umanjili za: "+ unosNovèanica +"\nSada je na stanju " + n.getNovèanica_20KM() + " novèanica po 10 KM");
		break;
    
	case 7 :
		System.out.println("\nUnesite broj novèanica koji želite umanjiti bankomatu u vrijednosti od 50 KM");
		unosNovèanica =unos.nextInt();
		if(unosNovèanica < 0){
			System.out.println("Nemoguæe je unijeti negativan broj");
		}
		else if (n.novèanica_50KM  - unosNovèanica < 0 ){
			System.out.println("Ne možete smanjiti u toj kolièini, probajte s manjim unosom\n"
					+ " maximalno možete umanjiti za" + n.novèanica_50KM) ;
			break;
			
		}else{
			n.oduzmiNovcanicu_50_KM(unosNovèanica);
			}
			System.out.println("Stanje novèanica ste umanjili za: "+ unosNovèanica +"\nSada je na stanju " + n.getNovèanica_50KM() + " novèanica po 10 KM");
		break;

	case 8:
		System.out.println("\nUnesite broj novèanica koji želite umanjiti bankomatu u vrijednosti od 100 KM");
		unosNovèanica =unos.nextInt();
		if(unosNovèanica < 0){
			System.out.println("Nemoguæe je unijeti negativan broj");
		}
		else if (n.novèanica_100KM  - unosNovèanica < 0 ){
			System.out.println("Ne možete smanjiti u toj kolièini, probajte s manjim unosom\n"
					+ " maximalno možete umanjiti za " + n.novèanica_100KM) ;
			break;
			
		}else{
			n.oduzmiNovcanicu_100_KM(unosNovèanica);
			}
			System.out.println("Stanje novèanica ste umanjili za: "+ unosNovèanica +"\nSada je na stanju " + n.getNovèanica_100KM() + " novèanica po 10 KM");
		break;

	case 9:
		System.out.println("\n            Stanje bankomata je:\n___________________________________________\nNovèanice od 10 KM  " +
	n.novèanica_10KM + " Kom  " + n.pretvaranjeBrojevaUnovac_10KM() +"  KM\n___________________________________________" +  "\nNovèanice od 20 KM  " + n.getNovèanica_20KM() +
	" Kom  " + n.pretvaranjeBrojevaUnovac_20KM() +"  KM\n___________________________________________" + "\nNovèanice od 50 KM  " + n.getNovèanica_50KM() + " Kom  "+ n.pretvaranjeBrojevaUnovac_50KM()
	+"  KM\n___________________________________________" +  "\nNovèanice od 100 KM  " + n.getNovèanica_100KM() + " Kom  "+ n.pretvaranjeBrojevaUnovac_100KM() +"  KM\n__________________________________________\nUkupno stanje novca u bankomatu je: " + n.ukupnoStanjeNovcaUBankomatu() + " KM\n___________________________________________" );
	
		for(int i =0;i<4;i++){
			
		}
		
		
}
    }
}

	


	
	
	



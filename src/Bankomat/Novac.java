package Bankomat;
public class Novac {

	int novèanica_10KM;
	int novèanica_20KM;
	int novèanica_50KM;
	int novèanica_100KM;

	public Novac() {
		novèanica_10KM = 60;
		novèanica_20KM = 30;
		novèanica_50KM = 20;
		novèanica_100KM = 10;
	}
//Dio koda dodaje novèanice od strane admina, poziva se u admin klasi, metoda "adminIzmjenaStanjaBankomata".. od 10 do 100 KM.
	public void dodajNovcanica_10_KM(int c) {
		setNovèanica_10KM(novèanica_10KM + c);
	}

	public void dodajNovcanica_20_KM(int c) {
		setNovèanica_20KM(novèanica_20KM + c);
	}

	public void dodajNovcanica_50_KM(int c) {
		setNovèanica_50KM(novèanica_50KM + c);
	}

	public void dodajNovcanica_100_KM(int c) {
		setNovèanica_100KM(novèanica_100KM + c);
	}
	
	/**Dio koda oduzima novèanice od strane admina, poziva se u admin klasi, metoda "adminIzmjenaStanjaBankomata".. od 10 do 100 KM.
	 * Takoðe ovaj kod umanjuje novèanice prilikom podizanja novca od strane korisnika, poziva se u admin klasi, metoda "podigniNovac"..
	 */
	public void oduzmiNovcanicu_10_KM(int c) {
		setNovèanica_10KM(novèanica_10KM - c);
	}

	public void oduzmiNovcanicu_20_KM(int c) {
		setNovèanica_20KM(novèanica_20KM - c);
	}

	public void oduzmiNovcanicu_50_KM(int c) {
		setNovèanica_50KM(novèanica_50KM - c);
	}

	public void oduzmiNovcanicu_100_KM(int c) {
		setNovèanica_100KM(novèanica_100KM - c);
	}

	public Novac(int novèanica_10km, int novèanica_20km, int novèanica_50km,
			int novèanica_100km) {
		novèanica_10KM = novèanica_10km;
		novèanica_20KM = novèanica_20km;
		novèanica_50KM = novèanica_50km;
		novèanica_100KM = novèanica_100km;
	}



	public int getNovèanica_10KM() {
		return novèanica_10KM;
	}

	public void setNovèanica_10KM(int novèanica_10km) {
		novèanica_10KM = novèanica_10km;
	}

	public int getNovèanica_20KM() {
		return novèanica_20KM;
	}

	public void setNovèanica_20KM(int novèanica_20km) {
		novèanica_20KM = novèanica_20km;
	}

	public int getNovèanica_50KM() {
		return novèanica_50KM;
	}

	public void setNovèanica_50KM(int novèanica_50km) {
		novèanica_50KM = novèanica_50km;
	}

	public int getNovèanica_100KM() {
		return novèanica_100KM;
	}

	public void setNovèanica_100KM(int novèanica_100km) {
		novèanica_100KM = novèanica_100km;
	}

//Dio koda služi za dodjeljivanje vrijednosti novèanicama..od 10 do 100 KM
	public int pretvaranjeBrojevaUnovac_10KM() {
		return novèanica_10KM * 10;
	}

	public int pretvaranjeBrojevaUnovac_20KM() {
		return novèanica_20KM * 20;
	}

	public int pretvaranjeBrojevaUnovac_50KM() {
		return novèanica_50KM *50;
	}

	public int pretvaranjeBrojevaUnovac_100KM() {
		return novèanica_100KM *100;
	}
//Kada se dodijelila vrijednost, ovaj kod sumira stanje svih novèanica
	public int ukupnoStanjeNovcaUBankomatu(){
		return pretvaranjeBrojevaUnovac_10KM() + pretvaranjeBrojevaUnovac_20KM() +pretvaranjeBrojevaUnovac_50KM() +pretvaranjeBrojevaUnovac_100KM();
		
	}

}



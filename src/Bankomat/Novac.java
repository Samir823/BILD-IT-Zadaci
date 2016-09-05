package Bankomat;
public class Novac {

	int nov�anica_10KM;
	int nov�anica_20KM;
	int nov�anica_50KM;
	int nov�anica_100KM;

	public Novac() {
		nov�anica_10KM = 60;
		nov�anica_20KM = 30;
		nov�anica_50KM = 20;
		nov�anica_100KM = 10;
	}
//Dio koda dodaje nov�anice od strane admina, poziva se u admin klasi, metoda "adminIzmjenaStanjaBankomata".. od 10 do 100 KM.
	public void dodajNovcanica_10_KM(int c) {
		setNov�anica_10KM(nov�anica_10KM + c);
	}

	public void dodajNovcanica_20_KM(int c) {
		setNov�anica_20KM(nov�anica_20KM + c);
	}

	public void dodajNovcanica_50_KM(int c) {
		setNov�anica_50KM(nov�anica_50KM + c);
	}

	public void dodajNovcanica_100_KM(int c) {
		setNov�anica_100KM(nov�anica_100KM + c);
	}
	
	/**Dio koda oduzima nov�anice od strane admina, poziva se u admin klasi, metoda "adminIzmjenaStanjaBankomata".. od 10 do 100 KM.
	 * Tako�e ovaj kod umanjuje nov�anice prilikom podizanja novca od strane korisnika, poziva se u admin klasi, metoda "podigniNovac"..
	 */
	public void oduzmiNovcanicu_10_KM(int c) {
		setNov�anica_10KM(nov�anica_10KM - c);
	}

	public void oduzmiNovcanicu_20_KM(int c) {
		setNov�anica_20KM(nov�anica_20KM - c);
	}

	public void oduzmiNovcanicu_50_KM(int c) {
		setNov�anica_50KM(nov�anica_50KM - c);
	}

	public void oduzmiNovcanicu_100_KM(int c) {
		setNov�anica_100KM(nov�anica_100KM - c);
	}

	public Novac(int nov�anica_10km, int nov�anica_20km, int nov�anica_50km,
			int nov�anica_100km) {
		nov�anica_10KM = nov�anica_10km;
		nov�anica_20KM = nov�anica_20km;
		nov�anica_50KM = nov�anica_50km;
		nov�anica_100KM = nov�anica_100km;
	}



	public int getNov�anica_10KM() {
		return nov�anica_10KM;
	}

	public void setNov�anica_10KM(int nov�anica_10km) {
		nov�anica_10KM = nov�anica_10km;
	}

	public int getNov�anica_20KM() {
		return nov�anica_20KM;
	}

	public void setNov�anica_20KM(int nov�anica_20km) {
		nov�anica_20KM = nov�anica_20km;
	}

	public int getNov�anica_50KM() {
		return nov�anica_50KM;
	}

	public void setNov�anica_50KM(int nov�anica_50km) {
		nov�anica_50KM = nov�anica_50km;
	}

	public int getNov�anica_100KM() {
		return nov�anica_100KM;
	}

	public void setNov�anica_100KM(int nov�anica_100km) {
		nov�anica_100KM = nov�anica_100km;
	}

//Dio koda slu�i za dodjeljivanje vrijednosti nov�anicama..od 10 do 100 KM
	public int pretvaranjeBrojevaUnovac_10KM() {
		return nov�anica_10KM * 10;
	}

	public int pretvaranjeBrojevaUnovac_20KM() {
		return nov�anica_20KM * 20;
	}

	public int pretvaranjeBrojevaUnovac_50KM() {
		return nov�anica_50KM *50;
	}

	public int pretvaranjeBrojevaUnovac_100KM() {
		return nov�anica_100KM *100;
	}
//Kada se dodijelila vrijednost, ovaj kod sumira stanje svih nov�anica
	public int ukupnoStanjeNovcaUBankomatu(){
		return pretvaranjeBrojevaUnovac_10KM() + pretvaranjeBrojevaUnovac_20KM() +pretvaranjeBrojevaUnovac_50KM() +pretvaranjeBrojevaUnovac_100KM();
		
	}

}



package Bankomat;

public class Korisnik {

	public  String imeKorisnika;
	public String pasw;
	public int sumaRacuna;

	public Korisnik() {

	}

	Korisnik(String imeKorisnika, String pasw, int sumaRacuna) {
		this.imeKorisnika = imeKorisnika;
		this.pasw = pasw;
		this.sumaRacuna = sumaRacuna;
	}

	public int getSumaRacuna() {
		return sumaRacuna;
	}

	public void setSumaRacuna(int sumaRacuna) {
		this.sumaRacuna =this.sumaRacuna - sumaRacuna;
	}

	public String getImeKorisnika() {
		return imeKorisnika;
	}

	public void setImeKorisnika(String imeKorisnika) {
		this.imeKorisnika = imeKorisnika;
	}

	public String getPasw() {
		return pasw;
	}

	public void setPasw(String pasw) {
		this.pasw = pasw;
	}

}

package Zadaci_25_08_2016;

public class Zadatak_3_Implement_The_Character_Class {

	public static void main(String[] args) {
		/*
		 * 10.24 (Implement the Character class) The Character class is provided
		 * in the Java library. Provide your own implementation for this class.
		 * Name the new class MyCharacter.
		 */
		// kreiranje objekta i proslijedjivanje karaktera "a"
		MyCharacter ch = new MyCharacter('a');
		// metoda testira da li je karakter slovo
		System.out.println("Is character letter: " + MyCharacter.isLetter(ch));
		// metoda testira da li je karakter broj
		System.out.println("Is character digit: " + MyCharacter.isDigit(ch));
		// metoda petvara karakter iz malih u velika slova
		System.out.println(ch.toUpperCase());
		// metoda petvara karakter iz velikih u mala slova
		System.out.println(new MyCharacter('A').toLowerCase());
		// testiranje
		System.out.println(ch);
	}

}

class MyCharacter {
	char ch;

	// konstruktor prima arg
	public MyCharacter(char ch) {
		this.ch = ch;
	}

	// metoda provjerava da li je karakter slovo, vraca true ako jeste a ako
	// nije vraca false
	public static boolean isLetter(MyCharacter ch) {
		if ((ch.ch >= 'A' && ch.ch <= 'Z') || (ch.ch >= 'a' && ch.ch <= 'z'))
			return true;
		else
			return false;

	}

	// metoda vraca true ako je karakter broj a ako nije vraca false
	public static boolean isDigit(MyCharacter ch) {
		if (ch.ch >= '0' && ch.ch <= '9')
			return true;
		else
			return false;

	}

	// metoda vraca lover case karaktere u upper case karaktere
	public MyCharacter toUpperCase() {
		if (this.ch >= 97 && this.ch <= 122) {
			return new MyCharacter((char) ((int) this.ch - 32));
		} else {
			return new MyCharacter(this.ch);
		}
	}

	/*
	 * character that uses ASCII code to convert upper case character to lower
	 * case character- returns converted character from upper case to lower case
	 */

	// metoda vraca upper case karaktere u lover case karaktere
	public MyCharacter toLowerCase() {
		if (this.ch >= 65 && this.ch <= 90) {
			return new MyCharacter((char) ((int) this.ch + 32));
		} else {
			return new MyCharacter(this.ch);
		}
	}

	// metoda pretvara karakter u string
	public String toString() {
		String res = "";
		res += this.ch;
		return res;
	}

}
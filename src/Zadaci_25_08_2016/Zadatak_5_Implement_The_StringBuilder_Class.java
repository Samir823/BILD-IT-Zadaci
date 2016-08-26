package Zadaci_25_08_2016;

public class Zadatak_5_Implement_The_StringBuilder_Class {

	public static void main(String[] args) {
		/*
		 * **10.27 (Implement the StringBuilder class) The StringBuilder class
		 * is provided in the Java library. Provide your own implementation for
		 * the following methods (name the new class MyStringBuilder1): public
		 * MyStringBuilder1(String s); public MyStringBuilder1
		 * append(MyStringBuilder1 s); public MyStringBuilder1 append(int i);
		 * public int length(); public char charAt(int index); public
		 * MyStringBuilder1 toLowerCase(); public MyStringBuilder1 substring(int
		 * begin, int end); public String toString();
		 */

		MyStringBuilder1 build = new MyStringBuilder1("Samir");
		System.out.println();

		System.out.println("Dodaj string:"
				+ build.append(new MyStringBuilder1("Kahvedzic")));
		System.out.println("Duzina: " + build.length());
		System.out.println("Dodaj integer: " + build.append(10));
		System.out.println("Substring (0, 3): " + build.substring(0, 3));
		System.out.println("Mala slova: " + build.toLowerCase());
		System.out.println("Karakter: " + build.charAt(0));
	}

}

class MyStringBuilder1 {
	String s;

	// konstruktor za zadanim stringom
	public MyStringBuilder1(String s) {
		this.s = s;
	}

	// metoda dodaje integer stringu
	public MyStringBuilder1 append(int i) {
		String str = i + "";
		this.s = this.s + str;
		return new MyStringBuilder1(this.s);
	}

	// metoda dodaje string stringu
	public MyStringBuilder1 append(MyStringBuilder1 s) {
		this.s = this.s + s;
		return new MyStringBuilder1(this.s);
	}

	// metoda vraca duzinu stringa
	public int length() {
		return s.length();
	}

	// metoda ispisuje string malim slovima
	public MyStringBuilder1 toLowerCase() {
		String str = "";
		for (int i = 0; i < s.length(); i++) {
			str += Character.toLowerCase(s.charAt(i));
		}
		return new MyStringBuilder1(str);
	}

	// metoda vraca karakter na odredjenoj poziciji
	public char charAt(int index) {
		return s.charAt(index);
	}

	// metoda vraca substring stringa
	public MyStringBuilder1 substring(int begin, int end) {
		String s = "";
		for (int i = begin; i < end - begin; i++) {
			s += this.s.charAt(i);
		}
		return new MyStringBuilder1(s);
	}

	// override metoda ispisuje string
	public String toString() {
		return this.s;
	}
}
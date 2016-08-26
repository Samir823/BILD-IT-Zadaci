package Zadaci_25_08_2016;

public class Zadatak_1_Implement_The_String_Class {

	public static void main(String[] args) {
		/*
		 * (Implement the String class) The String class is provided in the Java
		 * library. Provide your own implementation for the following methods
		 * (name the new class MyString1): public MyString1(char[] chars);
		 * public char charAt(int index); public int length(); public MyString1
		 * substring(int begin, int end); public MyString1 toLowerCase(); public
		 * boolean equals(MyString1 s); public static MyString1 valueOf(int i);
		 */
		MyString1 str = new MyString1("Samir Kahvedzic");
		System.out.println("Prvo slovo: " + str.charAt(0));
		System.out.println("Duzina: " + str.length());
		System.out.println("Substring (1, 4): " + str.substring(1, 4));
		System.out.println("Jednakost: " + str.equals(new MyString1("JaSkiO")));
		System.out.println("Malim slovima: " + str.toLowerCase());
		System.out.println("Vrijednost broja 50: " + MyString1.valueOf(50));
	}

}

class MyString1 {
	char[] ch;

	// no-arg konstruktor
	MyString1() {
	}

	// konstruktor sa stringom
	MyString1(String s) {
		this(s.toCharArray());
	}

	// metoda vraca karakter sa odredjenim indexom
	public char charAt(int index) {
		return ch[index];
	}

	// konstruktor sa char nizom
	public MyString1(char[] chars) {
		ch = chars;
	}

	// metoda koja vraca duzinu
	public int length() {
		return ch.length;
	}

	// metoda vraca substring stringa
	public MyString1 substring(int begin, int end) {
		char[] chars = new char[end - begin];
		for (int i = 0; i < chars.length; i++) {
			chars[i] = ch[begin + i];
		}
		return new MyString1(chars);
	}

	// metoda pretvara string u mala slova
	public MyString1 toLowerCase() {
		for (int i = 0; i < ch.length; i++) {
			ch[i] = Character.toLowerCase(ch[i]);
		}
		return new MyString1(ch);
	}

	// metoda vraca vrijednost integer argumenta
	public static MyString1 valueOf(int i) {
		char[] c = { (char) i };
		return new MyString1(c);
	}

	// metoda poredi dva stringa
	public boolean equals(MyString1 s) {
		for (int i = 0; i < s.length(); i++) {
			if (ch[i] != s.charAt(i)) {
				return false;
			}
		}
		return true;
	}

	// override metoda za print vrijednosti
	public String toString() {
		StringBuilder s = new StringBuilder();
		for (char ex : ch) {
			s.append(ex);
		}
		return s.toString();
	}
}
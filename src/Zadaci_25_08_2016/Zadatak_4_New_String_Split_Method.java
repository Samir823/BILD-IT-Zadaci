package Zadaci_25_08_2016;

import java.util.ArrayList;

public class Zadatak_4_New_String_Split_Method {

	public static void main(String[] args) {
		/*
		 * **10.25 (New string split method) The split method in the String
		 * class returns an array of strings consisting of the substrings split
		 * by the delimiters. However, the delimiters are not returned.
		 * Implement the following new method that returns an array of strings
		 * consisting of the substrings split by the matching delimiters,
		 * including the matching delimiters. public static String[]
		 * split(String s, String regex) For example, split("ab#12#453", "#")
		 * returns ab, #, 12, #, 453 in an array of String, and
		 * split("a?b?gf#e", "[?#]") returns a, b, ?, b, gf, #, and e in an
		 * array of String.
		 */
		String[] temp1 = split("ab#12#453", "#");
		for (String e : temp1) {
			System.out.print(e + " ");
		}

		String[] temp2 = split("\na?b?gf#e", "[?#]");
		for (String e : temp2) {
			System.out.print(e);
		}
	}

	/*
	 * metoda rastavlja string i dodaje "tokens" u string array
	 */
	public static String[] split(String s, String regex) {

		ArrayList<String> res = new ArrayList<String>();
		String temp = "";
		int count = 0;
		// nested petlja uporedjuje svaki karakter stringa sa svakim karakterom
		// "regex" stringa

		for (int i = 0; i < s.length(); i++) {
			count = 0;
			for (int j = 0; j < regex.length(); j++) {

				if (s.charAt(i) == regex.charAt(j)) {
					res.add(temp);
					res.add(Character.toString(regex.charAt(j)));
					temp = "";
					break;
				} else {
					count++;
				}

				if (count == regex.length()) {
					temp += s.charAt(i);
				}
			}
		}
		// dodavanje posljednjeg dijela stringa
		res.add(temp);

		String[] result = new String[res.size()];
		for (int i = 0; i < res.size(); i++) {
			result[i] = res.get(i);
		}
		return result;

	}

}

package Zadaci_08_09_2016;

public class Zadatak_2_Generic_Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// kreiranje liste
		Integer[] list = new Integer[20];
		for (int i = 0; i < list.length; i++) {
			list[i] = i;
		}
		// ispis pozicija
		System.out.println(linearSearch(list, 3));
		System.out.println(linearSearch(list, 10));
		System.out.println(linearSearch(list, 22));

	}

	//
	public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
		// pretrazuje sve elemente liste i ako nadje elemenat koji odgovara
		// trazenom vraca poziciju
		for (int i = 0; i < list.length; i++) {
			if (list[i].compareTo(key) == 0) {
				return i;
			}
		}
		// inace vraca -1
		return -1;
	}

}

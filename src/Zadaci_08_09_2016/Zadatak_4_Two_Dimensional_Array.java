package Zadaci_08_09_2016;

public class Zadatak_4_Two_Dimensional_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[][] list = { { 3, 5, 10 }, { 5, 6, 5 }, { 8, 1, 11 } };

		System.out.println("Max = " + max(list));
	}

	// generic method that returns the maximum element in a two-dimensional
	// array
	public static <E extends Comparable<E>> E max(E[][] list) {

		E max = list[0][0];
		for (E[] elements : list) {
			for (E element : elements) {
				if (element.compareTo(max) > 0) {
					max = element;
				}
			}
		}

		return max;

	}

}
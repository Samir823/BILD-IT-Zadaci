package Zadaci_08_09_2016;

public class Zadatak_5_Generic_Binary_Search {

	public static void main(String[] args) {
		Integer[] list = { 6, 7, 8, 15, 22, 33, 41, 57, 72, 90 };

		// Test binarySearch
		System.out.println(binarySearch(list, 15));
		System.out.println(binarySearch(list, 10));
		System.out.println(binarySearch(list, 59));

	}

	/*
	 * This method returns index of the search key, if it is contained in the
	 * array, else it returns (-(insertion point) - 1). The insertion point is
	 * the point at which the key would be inserted into the array: the index of
	 * the first element greater than the key, or list.length if all elements in
	 * the array are less than the specified key
	 */
	public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {

		int low = 0;
		int high = list.length - 1;

		while (high >= low) {
			int mid = (high - low) / 2 + low;
			if (list[mid].compareTo(key) == 0)
				return mid;

			if (list[mid].compareTo(key) < 0)
				low = mid + 1;
			else
				high = mid - 1;
		}

		return -1;

	}

}
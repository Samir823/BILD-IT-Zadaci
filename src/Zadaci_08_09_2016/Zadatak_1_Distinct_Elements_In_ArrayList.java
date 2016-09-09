package Zadaci_08_09_2016;

import java.util.ArrayList;

public class Zadatak_1_Distinct_Elements_In_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ArrayList<String> list = new ArrayList<String>();
		
		//String inputs
	    list.add("Matem");
	    list.add("Tablet");
	    list.add("Tablet");
	    list.add("Ruksak");
	    list.add("Put");
	    list.add("Most");
	    list.add("Most");

	    System.out.println("Original list:");
	    print(list);		//printing the original list
	    System.out.println("\nNon-duplicate list:");
	    print(removeDuplicates(list));		//printing the new list
	}
	
	/* Method used for removing duplicates from an array */
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
		ArrayList<E> listRemDup = new ArrayList<E>();
		for (E elem : list) {
			if (!listRemDup.contains(elem)) {	//if list doesn't contain element, add it
				listRemDup.add(elem);
		    }
		}
		return listRemDup;
	}
	
	/* Print array method */
	public static <E> void print(ArrayList<E> list) {
		for (E ex : list) {
			System.out.print(ex + " ");
		}
	}
}

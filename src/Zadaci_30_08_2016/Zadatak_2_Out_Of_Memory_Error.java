package Zadaci_30_08_2016;

public class Zadatak_2_Out_Of_Memory_Error {

	public static void main(String[] args) {
		/*
		 * *12.10 (OutOfMemoryError) Write a program that causes the JVM to
		 * throw an OutOfMemoryError and catches and handles this error.
		 */

		try {
			int[] temp = new int[1000000000];
			temp = new int[temp.length * 1000000000];
		} catch (OutOfMemoryError ex) {
			ex.printStackTrace();
		}

	}

}

package Zadaci_20_08_2016;

import java.util.Arrays;

public class Zadatak_3_Stopwatch {

	public static void main(String[] args) {
		/*
		 * (Stopwatch) Design a class named StopWatch. The class contains: ■
		 * Private data fields startTime and endTime with getter methods. ■ A
		 * no-arg constructor that initializes startTime with the current time.
		 * ■ A method named start() that resets the startTime to the current
		 * time. ■ A method named stop() that sets the endTime to the current
		 * time. ■ A method named getElapsedTime() that returns the elapsed time
		 * for the stopwatch in milliseconds. Draw the UML diagram for the class
		 * and then implement the class. Write a test program that measures the
		 * execution time of sorting 100,000 numbers using selection sort.
		 */

		StopWatch stoperica = new StopWatch();// kreiranje objekta

		int[] niz = new int[100000];// kreiranje niza

		stoperica.start();
		for (int i = 0; i < niz.length; i++) {// dodjeljivanje nizu nasicne
												// brojeve

			niz[i] = (int) (Math.random() * 10000);
		}
		Arrays.sort(niz);// sortiranje niza

		stoperica.stop();// pozivanje metode stop

		System.out.println("Ukupno vremena je potrebno "// ispis stanja programa
				+ stoperica.getElapsedTime() + " Milisekundi");
	}

}

class StopWatch {// kreiranje klase stopWatch
	private long startTime;
	private long endTime;

	StopWatch() {// no arg konstruktor

	}

	void start() {// kreiranje start metode
		startTime = System.currentTimeMillis();

	}

	void stop() {// kreiranje stop metode

		endTime = System.currentTimeMillis();
	}

	public long getElapsedTime() {// metoda vraca ukupno milisekundi potrebnih
									// za sortiranje niza

		long ukupno = endTime - startTime;
		return ukupno;

	}

}

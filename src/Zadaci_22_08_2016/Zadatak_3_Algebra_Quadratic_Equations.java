package Zadaci_22_08_2016;

import java.util.Scanner;

public class Zadatak_3_Algebra_Quadratic_Equations {

	public static void main(String[] args) {
		/*
		 * (Algebra: quadratic equations) Design a class named QuadraticEquation
		 * for a quadratic equation ax2 + bx + x = 0. The class contains: ■
		 * Private data fields a, b, and c that represent three coefficients. ■
		 * A constructor for the arguments for a, b, and c. ■ Three getter
		 * methods for a, b, and c. ■ A method named getDiscriminant() that
		 * returns the discriminant, which is b2 - 4ac. ■ The methods named
		 * getRoot1() and getRoot2() for returning two roots of the equation r1
		 * = -b + 2b2 - 4ac 2a and r2 = -b - 2b2 - 4ac 2a These methods are
		 * useful only if the discriminant is nonnegative. Let these methods
		 * return 0 if the discriminant is negative. Draw the UML diagram for
		 * the class and then implement the class. Write a test program that
		 * prompts the user to enter values for a, b, and c and displays the
		 * result based on the discriminant. If the discriminant is positive,
		 * display the two roots. If the discriminant is 0, display the one
		 * root. Otherwise, display “The equation has no roots.” See Programming
		 * Exercise 3.1 for sample runs.
		 */

		System.out.println("Unesite 3 cijela broja: a,b,c: ");// trazimo od
																// korisnika da
																// unese
																// vrijednost

		Scanner input = new Scanner(System.in);

		double a = input.nextDouble();// promjenjive za korisnikov unos
		double b = input.nextDouble();
		double c = input.nextDouble();

		QuadraticEquation discriminant = new QuadraticEquation(a, b, c);// kreiranje
																		// objekta

		if (discriminant.getDiscriminant() > 0) {// ako je uslov ispunjen ispisi
													// oba korijena
			System.out.println("Korijen 1: " + discriminant.getRoot1()
					+ "\nKorijen 2: " + discriminant.getRoot2());
		} else if (discriminant.getDiscriminant() == 0) { // ako je jednak 0
															// ispisi samo
															// jedan{
			System.out.println("Korijen 1: " + discriminant.getRoot1());
		} else {
			System.out.println("Jednacina nema korijena");// ako je manji od 0
															// ispisi poruku
		}
		input.close();
	}

}

class QuadraticEquation {// kreiranje klase

	// iniciranje data fieldsa
	private double a;
	private double b;
	private double c;

	public QuadraticEquation(double a, double b, double c) {// konstruktor prima
															// arg
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// geteri 
	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	// metodom dobivamo diskriminantu
	public double getDiscriminant() {
		return ((b * b) - (4 * a * c));

	}

	// Metoda za prvi korijen
	public double getRoot1() {
		if (getDiscriminant() > 0) {
			return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
		} else {
			return 0;
		}
	}

	// Medoda za drugi korijen
	public double getRoot2() {
		if (getDiscriminant() > 0) {
			return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
		} else {
			return 0;
		}

	}
}

package Zadaci_22_08_2016;

import java.util.Scanner;


public class Zadatak_4_Algebra_2x2_Linear_Equations {

	public static void main(String[] args) {
		/*
		 * (Algebra: 2 * 2 linear equations) Design a class named LinearEquation
		 * for a 2 * 2 system of linear equations: ax + by = e cx + dy = f x =
		 * ed - bf ad - bc y = af - ec ad - bc The class contains: ■ Private
		 * data fields a, b, c, d, e, and f. ■ A constructor with the arguments
		 * for a, b, c, d, e, and f. ■ Six getter methods for a, b, c, d, e, and
		 * f. ■ A method named isSolvable() that returns true if ad - bc is not
		 * 0. ■ Methods getX() and getY() that return the solution for the
		 * equation. Draw the UML diagram for the class and then implement the
		 * class. Write a test program that prompts the user to enter a, b, c,
		 * d, e, and f and displays the result. If ad - bc is 0, report that
		 * “The equation has no solution.” See Programming Exercise 3.3 for
		 * sample runs.
		 */

		Scanner input = new Scanner(System.in);

		System.out
				.println("Unesite brojeve za slijedece varijable: a, b, c, d, e, f: ");
		// kreiranje promjenjivih za korisnikov unos
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();

		LinearEquation linear = new LinearEquation(a, b, c, d, e, f);// kreiranje
																		// objekta

		if (linear.isSolvable()) {

			System.out.printf("x je: % 1.2f\ny je: %1.2f  ", linear.getX(),
					linear.getY());// ispis stanja objekta
		} else
			System.out.println("Jednacina nema rjesenja");
		input.close();
	}

}

class LinearEquation {// kreiranje klase

	// iniciranje data fielda
	private static double a;
	private static double b;
	private static double c;
	private static double d;
	private double e;
	private double f;

	public LinearEquation(double a, double b, double c, double d, double e,// kreiranje
																			// konstruktora
																			// koji
																			// prima
																			// arg
			double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
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

	public double getD() {
		return d;
	}

	public double getE() {
		return e;
	}

	public double getF() {
		return f;
	}

	// metoda koja vraca da li jednacina ima rjesenje
	public boolean isSolvable() {
		if ((a * d) - (b * c) != 0) {
			return true;

		}
		return false;

	}

	// dobivanje x
	double getX() {
		return (e * d - b * f) / (a * d - b * c);

	}

	// dobivanje y
	double getY() {
		return (a * f - e * c) / (a * d - b * c);

	}
}

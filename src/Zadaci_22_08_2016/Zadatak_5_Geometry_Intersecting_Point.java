package Zadaci_22_08_2016;

import java.util.Scanner;

public class Zadatak_5_Geometry_Intersecting_Point {

	public static void main(String[] args) {
		/*
		 * (Geometry: intersecting point) Suppose two line segments intersect.
		 * The two endpoints for the first line segment are (x1, y1) and (x2,
		 * y2) and for the second line segment are (x3, y3) and (x4, y4). Write
		 * a program that prompts the user to enter these four endpoints and
		 * displays the intersecting point. As discussed in Programming Exercise
		 * 3.25, the intersecting point can be found by solving a linear
		 * equation. Use the LinearEquation class in Programming Exercise 9.11
		 * to solve this equation. See Programming Exercise 3.25 for sample
		 * runs.
		 */

		Scanner input = new Scanner(System.in);

		System.out
				.println("Unesite brojeve za tacke: x1, y1, x2, y2, x3, y3, x4, y4: ");
		// varijable za pohranjivanje korisnikovog unosa
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();

		// iniciranje varijabli i proslijedjivanje vrijednosti
		double a = y1 - y2;
		double b = -(x1 - x2);
		double c = y3 - y4;
		double d = -(x3 - x4);
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;

		LinearEquation jednacina = new LinearEquation(a, b, c, d, e, f);// kreiranje
																		// objekta
																		// pomoci
																		// date
																		// klase

		if (jednacina.isSolvable()) {

			System.out.printf("x je: % 1.2f\ny je: %1.2f  ", jednacina.getX(),
					jednacina.getY());// ispis stanja objekta
		} else
			System.out.println("Jednacina nema rjesenja");
		input.close();

	}

}

package Zadaci_29_08_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_1_Area_Of_A_Convex_Polygon {

	public static void main(String[] args) {
		/*
		 * *11.15 (Area of a convex polygon) A polygon is convex if it contains
		 * any line segments that connects two points of the polygon. Write a
		 * program that prompts the user to enter the number of points in a
		 * convex polygon, then enter the points clockwise, and display the area
		 * of the polygon. Here is a sample run of the program:
		 */

		Scanner input = new Scanner(System.in);
		// pitamo korisnika za broj tacaka
		System.out.print("Unesite broj tacaka: ");
		int numOfPoints = input.nextInt();

		System.out.print("Unesite koordinate tacaka: ");

		ArrayList<MyPoint> points = new ArrayList<>();

		for (int i = 0; i < numOfPoints; i++) {// spremanje koordinata u array
			points.add(new MyPoint(input.nextDouble(), input.nextDouble()));
		}

		System.out.println("Povrsina je " + getConvexPolygonArea(points));
		input.close();
	}

	// metoda vraca povrsinu
	public static double getConvexPolygonArea(ArrayList<MyPoint> points) {

		double sum1 = 0;
		double sum2 = 0;
		for (int i = 0; i < points.size(); i++) {
			int limitIndex = (i + 1) % points.size();
			MyPoint p1 = points.get(i);
			MyPoint p2 = points.get(limitIndex);
			sum1 += (p1.x * p2.y);
			sum2 += (p1.y * p2.x);
		}

		double area = 0.5 * (sum1 - sum2);
		return (area > 0) ? area : -area;
	}
}

class MyPoint {// kreiranje klase
	double x;
	double y;

	public MyPoint() {
		this(0, 0);
	}

	public MyPoint(double x, double y) {// kreiranje konstruktora koji prima arg
		this.x = x;
		this.y = y;
	}

	// metoda racuna distancu
	public double distance(double x, double y) {
		// d = sqrt((x2 - x1)^2 + (y2 - y1)^2)
		return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y)
				* (y - this.y));
	}

	public double distance(MyPoint other) {
		return other.distance(this.x, this.y);
	}

	public double distance() {
		return this.distance(0.0, 0.0);
	}

	public String __repr__() {
		return String.format("Moja kvota (%f, %f)", this.x, this.y);
	}

	// geteri
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public String toString() {
		return String.format("(%f, %f)", this.x, this.y);
	}
}

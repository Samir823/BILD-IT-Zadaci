package Zadaci_23_08_2016;

public class Zadatak_3_The_MyPoint_Class {

	public static void main(String[] args) {
		/*
		 * 10.4 (The MyPoint class) Design a class named MyPoint to represent a
		 * point with x- and y-coordinates. The class contains: ■ The data
		 * fields x and y that represent the coordinates with getter methods. ■
		 * A no-arg constructor that creates a point (0, 0). ■ A constructor
		 * that constructs a point with specified coordinates. ■ A method named
		 * distance that returns the distance from this point to a specified
		 * point of the MyPoint type. ■ A method named distance that returns the
		 * distance from this point to another point with specified x- and
		 * y-coordinates. Draw the UML diagram for the class and then implement
		 * the class. Write a test program that creates the two points (0, 0)
		 * and (10, 30.5) and displays the distance between them.
		 */
		MyPoint a = new MyPoint(0, 0);// kreiranje objekata i proslijedjivanje
										// arg
		MyPoint b = new MyPoint(10, 30.5);

		System.out.printf("Udaljenost izmedju dvije tacke %s i %s je %f.\n", a,
				b, b.distance(a));
	}
}

class MyPoint {// kreiranje klase
	private double x;
	private double y;

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
		return String.format("MyPoint(%f, %f)", this.x, this.y);
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

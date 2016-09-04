package Zadaci_03_09_2016;

public class Zadatak_3_The_Octagon_Class {

	public static void main(String[] args) {
		/*
		 * *13.11 (The Octagon class) Write a class named Octagon that extends
		 * GeometricObject and implements the Comparable and Cloneable
		 * interfaces. Assume that all eight sides of the octagon are of equal
		 * length. The area can be computed using the following formula: area =
		 * (2 + 4/22)* side * side Draw the UML diagram that involves Octagon,
		 * GeometricObject, Comparable, and Cloneable. Write a test program that
		 * creates an Octagon object with side value 5 and displays its area and
		 * perimeter. Create a new object using the clone method and compare the
		 * two objects using the compareTo method.
		 */

		Octagon oct = new Octagon(5);
		System.out.println("Octagon:\n" + oct);
		// clone octagon and print clone
		Octagon clone = (Octagon) oct.clone();
		System.out.println("Clone:\n" + clone);
		// test if octagon and clone are equal
		System.out.printf("Octagon and clone compareTo = %d\n",
				oct.compareTo(clone));
	}
}

class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon> {
	double side;

	// default and one that sets side length
	public Octagon() {
		this(1);
	}

	public Octagon(double side) {
		this.side = side;
	}

	/**
	 * @return the side
	 */
	public double getSide() {
		return side;
	}

	/** Retrieves area of octagon */
	@Override
	public double getArea() {
		return (2 + 4 / Math.sqrt(2)) * side * side;
	}

	/** Retrieve perimeter */
	@Override
	public double getPerimeter() {
		return this.side * 8;
	}

	// octagons are compared based on their area
	@Override
	public int compareTo(Octagon arg0) {
		if (this.getArea() > arg0.getArea()) {
			return 1;
		} else if (this.getArea() < arg0.getArea()) {
			return -1;
		}
		return 0;
	}

	// implement comparable method
	@Override
	protected Object clone() {
		// create brand new stack
		Octagon newOcta = null;
		// cry to clone
		try {
			newOcta = (Octagon) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		// set list to the new stack and retrieve it
		newOcta.side = side;
		return newOcta;
	}

	@Override
	public String toString() {
		return super.toString() + "\n\tside: " + this.side + "\n\tarea: "
				+ getArea();
	}

}

/** Simple geometric object class */
abstract class GeometricObject {
	// geometric object have color and date created
	private String color;
	private java.util.Date dateCreated;

	// default constructor and one that takes color as argument
	public GeometricObject() {
		this("white");
	}

	public GeometricObject(String color) {
		dateCreated = new java.util.Date();
		this.color = color;
	}

	// accessors and mutators
	public String getColor() {
		return color;
	}

	public java.util.Date getDateCreated() {
		return this.dateCreated;
	}

	public void setColor(String color) {
		this.color = color;
	}

	/** Abstract method getArea */
	public abstract double getArea();

	/** Abstract method getPerimeter */
	public abstract double getPerimeter();

	@Override
	public String toString() {
		return "\tcolor: " + this.getColor() + "\n\tdate: " + getDateCreated();
	}
}
package Zadaci_02_09_2016;

import java.util.concurrent.Callable;

public class Zadatak_2_Enable_Geometric_Object_Comparable {

	public static void main(String[] args) {
		/*
		 * *13.5 (Enable GeometricObject comparable) Modify the GeometricObject
		 * class to implement the Comparable interface, and define a static max
		 * method in the GeometricObject class for finding the larger of two
		 * GeometricObject objects. Draw the UML diagram and implement the new
		 * GeometricObject class. Write a test program that uses the max method
		 * to find the larger of two circles and the larger of two rectangles.
		 */

		GeometricObject geo1 = new Circle(20);
		GeometricObject geo2 = new Circle(15);
		GeometricObject geo3 = new Rectangle(6, 5);
		GeometricObject geo4 = new Rectangle(9, 4);
		// ispis max objekta
		System.out.println("Max Circle: "
				+ GeometricObject.max(geo1.getArea(), geo2.getArea()));
		System.out.print("Max Rectangle: "
				+ GeometricObject.max(geo3.getArea(), geo4.getArea()));

	}
}

abstract class GeometricObject implements Comparable, Callable {
	private String color;
	private boolean filled;
	private java.util.Date dateCreated;

	// default konstruktor
	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}

	public void howToColor() {
		// TODO Auto-generated method stub

	}

	// geteri i setteri
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	@Override
	// override metoda
	public String toString() {
		return "Created on " + dateCreated + "\nColor: " + color
				+ " and filled " + filled;
	}

	// static metoda za provjeru max-a
	public static Object max(Object o1, Object o2) {
		if (((Comparable) o1).compareTo(o2) > 0)
			return "object1";
		else
			return "object2";
	}

	public abstract double getArea();

	public abstract double getPerimeter();
}

class Circle extends GeometricObject implements Callable {

	private double radius;

	// default konstruktor
	public Circle() {
	}

	// konstruktor sa zadanom vrijednosti
	public Circle(double radius) {
		this.radius = radius;
	}

	// getteri i setteri
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}

	public double getDiameter() {
		return 2 * radius;
	}

	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	// metoda za printanje
	public void printCircle() {
		System.out.println("The circle is created " + getDateCreated()
				+ " and the radius is " + radius);
	}

	@Override
	// override metoda za komparaciju povrsina
	public int compareTo(Object o) {
		if (getArea() < ((Circle) o).getArea())
			return 1;
		else if (getArea() > ((Circle) o).getArea())
			return -1;
		else
			return 0;
	}

	@Override
	public void howToColor() {
		System.out.println("Color all four sides.");
	}

	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}

class Rectangle extends GeometricObject implements Callable {

	private double width, heigth;

	// default konstruktor
	public Rectangle() {
	}

	// konstruktor za zadanim vrijednostima
	public Rectangle(double width, double heigth) {
		this.width = width;
		this.heigth = heigth;
	}

	// getteri i setteri
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeigth() {
		return heigth;
	}

	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}

	public double getArea() {
		return width * heigth;
	}

	public double getPerimeter() {
		return 2 * (width + heigth);
	}

	@Override
	// override metoda za komparaciju povrsina
	public int compareTo(Object o) {
		if (getArea() < ((Rectangle) o).getArea())
			return 1;
		else if (getArea() > ((Rectangle) o).getArea())
			return -1;
		else
			return 0;
	}

	@Override
	public void howToColor() {
		System.out.println("Color all four sides.");
	}

	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
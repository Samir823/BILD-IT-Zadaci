package Zadaci_26_08_2016;

import java.util.Scanner;

public class Zadatak_1_The_Triangle_Class {

	public static void main(String[] args) {
		/*
		 * 11.1 (The Triangle class) Design a class named Triangle that extends
		 * GeometricObject. The class contains: ■ Three double data fields named
		 * side1, side2, and side3 with default values 1.0 to denote three sides
		 * of the triangle. ■ A no-arg constructor that creates a default
		 * triangle. ■ A constructor that creates a triangle with the specified
		 * side1, side2, and side3. ■ The accessor methods for all three data
		 * fields. ■ A method named getArea() that returns the area of this
		 * triangle. ■ A method named getPerimeter() that returns the perimeter
		 * of this triangle. ■ A method named toString() that returns a string
		 * description for the triangle. For the formula to compute the area of
		 * a triangle, see Programming Exercise 2.19. The toString() method is
		 * implemented as follows: return "Triangle: side1 = " + side1 +
		 * " side2 = " + side2 + " side3 = " + side3; Draw the UML diagrams for
		 * the classes Triangle and GeometricObject and implement the classes.
		 * Write a test program that prompts the user to enter three sides of
		 * the triangle, a color, and a Boolean value to indicate whether the
		 * triangle is filled. The program should create a Triangle object with
		 * these sides and set the color and filled properties using the input.
		 * The program should display the area, perimeter, color, and true or
		 * false to indicate whether it is filled or not.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite tri strane trougla: ");
		// double[] sides = new double[3];
		//
		// for (int i = 0; i < sides.length; i++) {
		// sides[i] = input.nextDouble();
		//
		// }

		double strana1 = input.nextDouble();
		double strana2 = input.nextDouble();
		double strana3 = input.nextDouble();
		System.out
				.println("Unesite true ako je trougao pun a ako je prazan unesite false");
		// taking filled value from user
		String isFilledString = input.next();
		boolean isFilled = (isFilledString.equals("true"));
		System.out.println("Unesite boju trougla: ");
		// taking color value from user
		String color = input.next();

		// kreiranje objekta koji prima dimenzije trougla od korisnika
		Triangle t1 = new Triangle(strana1, strana2, strana3);
		t1.setColor(color);
		t1.setFilled(isFilled);
		System.out.println("Trougao: ");
		System.out.println("Povrsina = " + t1.getArea());
		System.out.println("Obim = " + t1.getPerimeter());
		System.out.println("Color = " + t1.getColor());
		System.out.println("Da li je pun? " + t1.isFilled());
		input.close();
	}

}

class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;

	// default constructor
	Triangle() {
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}

	// constructor prima arg
	Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		//
	}

	// geteri i seteri
	public double getSide1() {
		return side1;
	}

	// set method for side1 data field
	public void setSide1(double side1) {
		this.side1 = side1;
	}

	// get method for side2 data field
	public double getSide2() {
		return side2;
	}

	// set method for side2 data field
	public void setSide2(double side2) {
		this.side2 = side2;
	}

	// get method for side3 data field
	public double getSide3() {
		return side3;
	}

	// set method for side3 data field
	public void setSide3(double side3) {
		this.side3 = side3;
	}

	// method racuna povrsinu trougla
	public double getArea() {
		double h = getPerimeter() / 2;
		double area = Math.sqrt(h * (h - side1) * (h - side2) * (h - side3));
		return area;
	}

	// method racuna obim trougla
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	// printanje stanja objekta
	public String toString() {
		return "Triangle:side1= " + side1 + " side2= " + side2 + "side3= "
				+ side3;

	}

}

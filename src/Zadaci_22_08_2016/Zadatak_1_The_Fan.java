package Zadaci_22_08_2016;

public class Zadatak_1_The_Fan {

	/*
	 * (The Fan class) Design a class named Fan to represent a fan. The class
	 * contains: ■ Three constants named SLOW, MEDIUM, and FAST with the values
	 * 1, 2, and 3 to denote the fan speed. ■ A private int data field named
	 * speed that specifies the speed of the fan (the default is SLOW). ■ A
	 * private boolean data field named on that specifies whether the fan is on
	 * (the default is false). ■ A private double data field named radius that
	 * specifies the radius of the fan (the default is 5). ■ A string data field
	 * named color that specifies the color of the fan (the default is blue). ■
	 * The accessor and mutator methods for all four data fields. ■ A no-arg
	 * constructor that creates a default fan. ■ A method named toString() that
	 * returns a string description for the fan. If the fan is on, the method
	 * returns the fan speed, color, and radius in one combined string. If the
	 * fan is not on, the method returns the fan color and radius along with the
	 * string “fan is off” in one combined string. Draw the UML diagram for the
	 * class and then implement the class. Write a test program that creates two
	 * Fan objects. Assign maximum speed, radius 10, color yellow, and turn it
	 * on to the first object. Assign medium speed, radius 5, color blue, and
	 * turn it off to the second object. Display the objects by invoking their
	 * toString method.
	 */

	public static void main(String[] args) {

		Fan fan1 = new Fan();// kreiranje 2 fan objekta
		Fan fan2 = new Fan();

		fan1.setSpeed(3);// proslijedjivanje argumenata
		fan1.setRadius(10);
		fan1.setColor("zuta");
		fan1.setOn(true);

		System.out.println("Opis prvog ventilatora\n" + fan1.toString() + "\n");// ispis
																				// stanja
																				// za
																				// prvi
																				// fan

		fan2.setSpeed(2);
		fan2.setRadius(5);
		fan2.setColor("plava");
		fan2.setOn(false);
		System.out.println("Opis drugog ventilatora\n" + fan2.toString());// ispis
																			// stanja
																			// drugog
																			// objekta

	}
}

class Fan {// kreiranje klase fan

	// kreiranje data fielda
	static int SLOW = 1;
	static int MEDIUM = 2;
	static int FAST = 3;

	private boolean on;
	private int speed;
	private double radius;
	private String color;

	Fan() {
		on = false;
		speed = SLOW;
		radius = 5;
		color = "plava";

	}

	// geteri i seteri
	public boolean isOn() {
		return on;
	}

	public static int getSLOW() {
		return SLOW;
	}

	public static void setSLOW(int sLOW) {
		SLOW = sLOW;
	}

	public static int getMEDIUM() {
		return MEDIUM;
	}

	public static void setMEDIUM(int mEDIUM) {
		MEDIUM = mEDIUM;
	}

	public static int getFAST() {
		return FAST;
	}

	public static void setFAST(int fAST) {
		FAST = fAST;
	}

	public boolean isOff() {
		return on;
	}

	public void setOn(boolean on) {
		if (on) {
			this.on = on;
		}
	}

	public String getSpeed() {// metoda vraca brzinu ventilatora ispis poruke
		if (on && speed > 0 && speed <= 3) {
			if (speed == 1) {
				return " SLOW ";

			} else if (speed == 2) {
				return " MEDIUM";
			} else if (speed == 3) {
				return " FAST";
			}

		}
		return "";
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {// metoda vraca i ispisuje opis objekta
		if (on) {
			return "Brzina ventilatora: " + getSpeed() + "\nBoja: " + color
					+ "\nObim: " + radius;

		} else {
			return "Boja: " + color + "\nObim: " + radius
					+ "\nVentilator je iskljucen";
		}

	}
}

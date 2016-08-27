package Zadaci_26_08_2016;

public class Loan {
	double amount;

	// default constructor
	Loan() {

	}

	// constructor that alows user to set amount
	Loan(double amount) {
		this.amount = amount;
	}

	// get method for amount data field
	public double getAmount() {
		return amount;
	}

	// set method for amount data field
	public void setAmount(double amount) {
		this.amount = amount;
	}

	// method that allows us to print the object
	public String toString() {
		return "" + amount;
	}

}
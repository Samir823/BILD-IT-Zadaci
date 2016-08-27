package Zadaci_26_08_2016;

import java.util.Date;

public class Employee extends Person {
	String office;
	int salary;
	Date dateHired;

	Employee() {

	}

	// constructor where user inputs info for data fields
	public Employee(String name, String address, String phoneNumber,
			String emailAddress, String office, int salary) {
		super(name, address, phoneNumber, emailAddress);
		this.office = office;
		this.salary = salary;
		this.dateHired = new Date();
	}

	// get method for office data field
	public String getOffice() {
		return office;
	}

	// set method for office data field
	public void setOffice(String office) {
		this.office = office;
	}

	// get method for salary data field
	public int getSalary() {
		return salary;
	}

	// set method for salary data field
	public void setSalary(int string) {
		this.salary = string;
	}

	// get method for dateHired data field
	public Date getDateHired() {
		return dateHired;
	}

	// set method for dateHired data field
	public void setDateHired(Date dateHired) {
		this.dateHired = new Date();
	}

	// overriden method that prints object as class name and object name
	public String toString() {
		return "Employee " + getName();
	}

}

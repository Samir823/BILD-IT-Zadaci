package Zadaci_26_08_2016;

public class Staff extends Employee {
	String title;

	// default constructor
	Staff() {

	}

	// constructor that allows user to enter values for data fields
	public Staff(String name, String address, String phoneNumber,
			String emailAddress, String office, int salary, String title) {
		super(name, address, phoneNumber, emailAddress, office, salary);
		this.title = title;
	}

	// get method for title data field
	public String getTitle() {
		return title;
	}

	// set method for title data field
	public void setTitle(String title) {
		this.title = title;
	}

	// method that allows us to print object as class name and object name
	public String toString() {
		return "Staff " + getName();
	}

}



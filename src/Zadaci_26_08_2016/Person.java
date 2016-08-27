package Zadaci_26_08_2016;

public class Person {
	String name;
	String address;
	String phoneNumber;
	String email;

	// default constructor
	Person() {
	}

	// constructor that allows user to input data field values
	Person(String name, String address, String phoneNumber, String email) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	// get method for name data field
	public String getName() {
		return name;
	}

	// set method for name data field
	public void setName(String name) {
		this.name = name;
	}

	// get method for address data field
	public String getAddress() {
		return address;
	}

	// set method for address data field
	public void setAddress(String address) {
		this.address = address;
	}

	// get method for phoneNumber data field
	public String getPhoneNumber() {
		return phoneNumber;
	}

	// set method for phoneNumber data field
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	// get method for email data field
	public String getEmail() {
		return email;
	}

	// set method for email data field
	public void setEmail(String email) {
		this.email = email;
	}

	// method that allows us to print object as Class name and object name
	public String toString() {
		return "Person " + getName();
	}

}

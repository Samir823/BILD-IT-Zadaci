package Zadaci_26_08_2016;

public class Zadatak_2_The_Person_Student_Employee_Classes {

	public static void main(String[] args) {
		/*
		 * 11.2 (The Person, Student, Employee, Faculty, and Staff classes)
		 * Design a class named Person and its two subclasses named Student and
		 * Employee. Make Faculty and Staff subclasses of Employee. A person has
		 * a name, address, phone number, and email address. A student has a
		 * class status (freshman, sophomore, junior, or senior). Define the
		 * status as a constant. An employee has an office, salary, and date
		 * hired. Use the MyDate class defined in Programming Exercise 10.14 to
		 * create an object for date hired. A faculty member has office hours
		 * and a rank. A staff member has a title. Override the toString method
		 * in each class to display the class name and the person’s name. Draw
		 * the UML diagram for the classes and implement them. Write a test
		 * program that creates a Person, Student, Employee, Faculty, and Staff,
		 * and invokes their toString() methods.
		 */

		// creating and printing out person object
		Person person = new Person();
		person.setName("Jon Snow");
		person.setAddress("Castle Black, 82");
		person.setEmail("ickija.black@hotmail.com");
		person.setPhoneNumber("061/222-661");
		System.out.println(person);

		// kreiranje objekta staff klase
		Staff staff = new Staff();
		System.out.println();
		staff.setName("King Kong");
		staff.setTitle("Star Kraft");
		System.out.println(staff);

		// kreiranje objekta faculty klase
		Faculty faculty = new Faculty();
		System.out.println();
		faculty.setName("Zdravko");
		faculty.setOfficeHours("40h");
		faculty.setRank("Profesor");
		System.out.println(faculty);

		// kreiranje objekta employee klase
		Employee employee = new Employee();
		System.out.println();
		employee.setName("Tarik");
		employee.setOffice("Post Office");
		employee.setSalary(2000);
		System.out.println(employee);

		// kreiranje objekta student klase
		Student student = new Student();
		System.out.println();
		student.setName("Ljubisa");
		student.setStatus(2);
		System.out.println(student);
	}
}

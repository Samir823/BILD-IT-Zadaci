package Zadaci_03_09_2016;

public class Zadatak_5_Enable_The_Course_Class_Cloneable {

	/*
	 * *13.13 (Enable the Course class cloneable) Rewrite the Course class in
	 * Listing 10.6 to add a clone method to perform a deep copy on the students
	 * field.
	 */

	public static void main(String[] args) throws CloneNotSupportedException {
		Course c1 = new Course();
		c1.addStudent("A");
		c1.addStudent("B");
		c1.addStudent("C");
		c1.addStudent("D");
		Course c2 = (Course) c1.clone();

		// ispis originalne liste i kopirane
		System.out.println("Object1...");
		c1.getStudents();
		System.out.println("\n\nObject2 (cloned)...");
		c2.getStudents();
	}
}

class Course implements Cloneable {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	// default konstruktor
	public Course() {
	}

	public Course(String courseName) {
		this.courseName = courseName;
	}

	// metoda za dodavanje studenata u niz
	public void addStudent(String student) {
		if (numberOfStudents >= students.length) { // ako broj studenata predje
													// granicu 100,
			String[] temp = new String[students.length * 2]; // kopirati sve
																// elemente u
																// novi niz i
																// dodati
																// velicinu
																// 100*2
			System.arraycopy(students, 0, temp, 0, students.length);
			students = temp;
		}
		students[numberOfStudents++] = student;
	}

	// metoda za ispis niza
	public void getStudents() {
		for (String ex : students) {
			if (ex != null) {
				System.out.print(ex + " ");
			}
		}
	}

	// metoda koja vraca broj studenata
	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}

	public void dropStudent(String student) {
		// Left as an exercise in Programming Exercise 10.9
	}

	// metoda koja kopira iz jednog niza u drugi
	public Object clone() throws CloneNotSupportedException {
		Course c = (Course) super.clone();
		c.students = students.clone();
		return c;
	}
}
package Group_project_1;

import java.beans.Statement;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.sun.corba.se.pept.transport.Connection;

public class SearchDatabase {

	public static void main(String[] args) throws Exception {

		java.util.Scanner input = new java.util.Scanner(System.in);
		String query = "";
		getConnection();

		
		
		try {
			// prompting user to start search
			System.out
					.println("Enter 1 to search the information about a particular city.\nEnter 2 to see the information in a particular country.\nEnter 3 for the information about a particular language.\nEnter 4 to exit Search. ");
			int check = input.nextInt();
			// Prompting user to enter proper value
			if (check < 1 && check > 4) {
				System.out
						.println("You have entered too small value, try again with input bigger then 0 and smaller then 5.");
				check = input.nextInt();
			}
			// invoking CheckUp
			CheckUp(check, query);

		} catch (SQLException e) {
			System.out.println("Exception ocured.");

		} catch (Exception e) {

		} finally {
			input.close();

		}

	}

	// Connection confirmation method
	public static java.sql.Connection getConnection() throws Exception {

		try {
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/world";
			String username = "root";
			String password = "";
			Class.forName(driver);

			java.sql.Connection conn = DriverManager.getConnection(url,
					username, password);
			System.out.println("Connected");
			return conn;

		} catch (Exception e) {
			System.out.println(e);
		}

		return null;

	}

	// Method for inputing String line
	public static String nextLine() {
		java.util.Scanner input2 = new java.util.Scanner(System.in);
		String argument = input2.nextLine();
		input2.close();
		return argument;
	}

	public static void CheckUp(int check, String query) throws SQLException {
		// Creating connection path
		java.sql.Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/world", "root", "");
		// creating statement to execute query
		java.sql.Statement statement = con.createStatement();
		if (check == 1) {
			// search through city table
			System.out
					.println("Enter the name of the city you are interested in or code of the state \n or area where the city is located or population:");
			String city = nextLine();

			query = "SELECT * FROM CITY WHERE Name = '" + city
					+ "' OR CountryCode = '" + city + "' OR District = '"
					+ city + "' OR Population = '" + city + "';";

			// Executing query
			ResultSet feedback = statement.executeQuery(query);

			while (feedback.next()) {

				System.out.println(String.format("%-26s ", "Code :")
						+ feedback.getString("CountryCode"));
				System.out.println(String.format("%-26s", "Name :")
						+ feedback.getString("Name"));
				System.out.println(String.format("%-26s", "District : ")
						+ feedback.getString("District"));
				System.out.println(String
						.format("%-26s", "Total population : ")
						+ feedback.getString("Population"));

				System.out.println();

			}

		} else if (check == 2) {

			// search through Country table
			System.out
					.println("Enter the name of the state that interests you \n or the code off thr state or the name of the continent where the state is \n or the name of the President. ");
			String drzava = nextLine();

			query = "SELECT * FROM Country WHERE Name ='" + drzava
					+ "' OR Code='" + drzava + "' OR Continent ='" + drzava
					+ "'  OR HeadOfState='" + drzava + "';";

			// Executing query
			ResultSet feedback = statement.executeQuery(query);

			while (feedback.next()) {

				System.out.println(String.format("%-26s",
						"Name of the state : ") + feedback.getString("Name"));
				System.out.println(String.format("%-26s", "Code : ")
						+ feedback.getString("Code"));
				System.out.println(String.format("%-26s", "Continent : ")
						+ feedback.getString("Continent"));
				System.out.println(String.format("%-26s", "Region : ")
						+ feedback.getString("Region"));
				System.out.println(String.format("%-26s", "Area : ")
						+ feedback.getString("SurfaceArea"));
				System.out.println(String.format("%-26s",
						"Independent since : ")
						+ feedback.getString("IndepYear"));
				System.out.println(String.format("%-26s", "Population : ")
						+ feedback.getString("Population"));
				System.out.println(String.format("%-26s",
						"Average life expectancy : ")
						+ feedback.getString("LifeExpectancy"));
				System.out.println(String.format("%-26s", "The President : ")
						+ feedback.getString("HeadOfState"));
				System.out.println();

			}

		} else if (check == 3) {
			// search through Language table
			System.out
					.println("Enter eng. the name of the language of interest, \n or code of the state.");
			String language = nextLine();

			query = "SELECT * FROM countrylanguage WHERE Language = '"
					+ language + "' OR CountryCode= '" + language + "' ;";

			// Executing query
			ResultSet feedback = statement.executeQuery(query);

			while (feedback.next()) {

				System.out.println(String.format("%-26s", "Country code : ")
						+ feedback.getString("CountryCode"));
				System.out.println(String.format("%-26s", "Language : ")
						+ feedback.getString("Language"));
				System.out.println(String.format("%-26s", " Is official: ")
						+ feedback.getString("IsOfficial"));
				System.out.println(String.format("%-26s",
						"Percentage of representation: ")
						+ feedback.getString("Percentage"));
				System.out.println();

			}

		} else if (check == 4) {

			// exiting search
			System.exit(1);

		}

	}

}
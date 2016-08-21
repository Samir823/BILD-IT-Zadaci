package Zadaci_20_08_2016;

import java.util.Date;

public class Zadatak_4_The_Account_Clas {

	public static void main(String[] args) {

		/*
		 * Write a test program that creates an Account object with an account
		 * ID of 1122, a balance of $20,000, and an annual interest rate of
		 * 4.5%. Use the withdraw method to withdraw $2,500, use the deposit
		 * method to deposit $3,000, and print the balance, the monthly
		 * interest, and the date when this account was created.
		 */

		Account account1 = new Account(1122, 20000, 4.5);// kreiranje objekta
															// kome se
															// proslijedjuju
															// argumenti

		account1.withdrav(2500);// pozivanje metode i skidanje s racuna

		account1.depozit(3000);// polaganje novca na racun

		account1.getDateCreated();// pozivanje metode

		System.out
				.printf("Stanje racuna je : %1.2f KM\nMjesecna rata je: %1.2f KM\nDatum kreiranja je: %s",// ispis
																											// stanja
						account1.getBalance(), account1.getMonthlyInterest(),
						account1.getDateCreated());

	}
}

class Account {// kreiranje klase account
	// dodavanje atributa
	private int id;
	private double balance;
	private double anualInterestRate;
	private Date datumKreiranja;

	Account() {// no arg konstruktor
	}

	Account(int aid, double abalance) {// kreiranje konstruktora
		id = aid;
		balance = abalance;

	}

	public Account(int id, double balance, double anualInterestRate) {// kreiranje
																		// kontruktora
																		// koji
																		// prima
																		// argumente
		this.id = id;
		this.balance = balance;
		this.anualInterestRate = anualInterestRate;
		datumKreiranja = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getStanjeRacuna() {
		return balance;
	}

	public void setStanjeRacuna(double balance) {
		this.balance = balance;
	}

	public java.util.Date getDateCreated() {
		return datumKreiranja;
	}

	double getMonthlyInterestRate() {
		return (anualInterestRate / 100) / 12;

	}

	public double getMonthlyInterest() {

		return balance * ((anualInterestRate / 100) / 12);

	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnualInterestRate() {
		return anualInterestRate;
	}

	public void setAnualInterestRate(double anualInterestRate) {
		this.anualInterestRate = anualInterestRate;
	}

	public Date getDatumKreiranja() {
		return datumKreiranja;
	}

	public void setDatumKreiranja(Date datumKreiranja) {
		this.datumKreiranja = datumKreiranja;
	}

	double withdrav(double povlacenje) {
		return this.balance -= povlacenje;
	}

	double depozit(double depo) {
		return this.balance += depo;
	}

}

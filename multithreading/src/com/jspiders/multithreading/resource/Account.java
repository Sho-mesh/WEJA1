package com.jspiders.multithreading.resource;

public class Account {
	
	double accountBalance;

	public Account(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public double checkBalance() {
		return this.accountBalance;
	}
	
	public synchronized void deposit(double amount) {
		System.out.println("Depositing " + amount + " in the account");
		accountBalance += amount;
		System.out.println("Current balance : " + checkBalance());
	}
	
	public synchronized void withdraw(double amount) {
		System.out.println("Withdrawing " + amount + " in the account");
		accountBalance -= amount;
		System.out.println("Current balance : " + checkBalance());
	}

}

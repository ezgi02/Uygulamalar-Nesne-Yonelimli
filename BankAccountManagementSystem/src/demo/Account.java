package demo;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private String accountNumber;
	private String owner;
	private double balance;
	 public Account(String accountNumber, String owner, double balance) {
	        this.accountNumber = accountNumber;
	        this.owner = owner;
	        this.balance = balance;
	    }
	 
	 public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited $" + amount);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0) {
	            if (balance >= amount) {
	                balance -= amount;
	                System.out.println("Withdrawn $" + amount);
	            } else {
	                System.out.println("Insufficient balance.");
	            }
	        } else {
	            System.out.println("Invalid withdrawal amount.");
	        }
	    }

	    public void viewBalance() {
	        System.out.println("Account Owner: " + owner);
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Balance: $" + balance);
	    }
	    public static List<Account> accounts = new ArrayList<>();
}

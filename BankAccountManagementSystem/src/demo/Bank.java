package demo;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	 public static List<String> transactionHistory = new ArrayList<>();

	    public static void displayBankInfo() {
	        System.out.println("Welcome to Our Bank");
	        System.out.println("Number of Accounts: " + Account.accounts.size());
	    }

	    public static void trackTransaction(String description) {
	        transactionHistory.add(description);
	    }
}

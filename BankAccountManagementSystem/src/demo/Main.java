package demo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account johnAccount = new Account("A123", "John Doe", 1000);
        Account janeAccount = new Account("B456", "Jane Smith", 1500);

        Account.accounts.add(johnAccount);
        Account.accounts.add(janeAccount);

        Bank.displayBankInfo();

        johnAccount.deposit(500);
        janeAccount.withdraw(200);
        johnAccount.viewBalance();

        Bank.trackTransaction("John deposited $500");
        Bank.trackTransaction("Jane withdrew $200");
    }

	}



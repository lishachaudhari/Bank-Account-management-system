package banking;

import java.util.Scanner;

/**
 * Represents a bank for managing customers and their bank accounts.
 * @author Lisha
 *
 */
public class Bank {

	public static void main(String[] args) {
		//Creates new instances of bank class
		Bank bank = new Bank();
		
		//Calls the run method in the bank class
		bank.run();
		
		

	}
	/**
	 * Runs the program by initializing and managing, bank accounts and customers.
	 */
	public void run() {
		System.out.println("Welcome to the Bank!");
		System.out.println("What is your name?");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.println("Hello" + name + "! We are creating checking and saving accounts for you.");
		//Create customer with given name
		Customers customer = new Customers(name);
		
		System.out.println("Enter Address : ");
		String address = scanner.next();
		//Set customer's address
		customer.setAddress(address);
		
		//create a checking account for customer
		BankAccount checkingAccount = new BankAccount("checking", customer);
		
		//create a saving account for customer
		BankAccount savingAccount = new BankAccount("saving", customer);
		
		//gets and prints the customer info associated with the checking account
		System.out.println();
		System.out.println("Customer info: ");
		System.out.println(checkingAccount.getCustomerInfo());
		
		//gets and prints account info for checking account
		System.out.println("Checking account : ");
		System.out.println(checkingAccount.getAccountInfo());
		
		//gets and prints account info for saving account
		System.out.println("Saving account : ");
		System.out.println(savingAccount.getAccountInfo());
		
		//deposit
		
		//into checking
		System.out.println();
		System.out.println("Amount to deposit into your checking account : ");
		double amount = scanner.nextDouble();
		checkingAccount.deposit(amount);
		
		//into checking
		System.out.println();
		System.out.println("Amount to deposit into your saving account : ");
		amount = scanner.nextDouble();
		savingAccount.deposit(amount);
		
		//print new balance
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println(savingAccount.getAccountInfo());
		
		//withdraws
		
		//from checking
		System.out.println();
		System.out.println("Amount to withdraw from your checking account : ");
		amount = scanner.nextDouble();
		try {
			checkingAccount.withdraw(amount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		//from savings
		System.out.println();
		System.out.println("Amount to withdraw from your saving account : ");
		amount = scanner.nextDouble();
		try {
			savingAccount.withdraw(amount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println(savingAccount.getAccountInfo());
		
		scanner.close();
		
	}

}

package banking;
/**
 * Represents a checking/saving bank account for a customer
 * @author Lisha
 *
 */
public class BankAccount {
	//instance vars
	
	/**
	 * Type of account checking/saving
	 */
	String accountType;
	double balance;
	Customers customer;
	
	public BankAccount(String accountType, Customers customer) {
		this.accountType = accountType;
		this.customer = customer;
	}
	
	//methods
	public void deposit(double amount) {
		this.balance += amount;
	}
	public void withdraw(double amount) throws Exception {
		if(amount > this.balance) {
			throw new Exception("Amount is greater than available balance.");
		}
		this.balance -= amount;
	}
	public String getAccountInfo() {
		return this.accountType  + ": " + this.balance;
	}
	public String getCustomerInfo() {
		return this.customer.getname() + " from " + this.customer.getAddress();
	}
	
}

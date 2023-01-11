package banking;

public class Customer {
	String name;
	String address;
	//Constructor
	public Customer(String name) {
		this.name = name;
	}
	//methods
	public void setAddress(String address) {
		this.address = address;
	}
	public String getname() {
		return this.name;
	}
	public String getAddress() {
		return this.address;
	}
}

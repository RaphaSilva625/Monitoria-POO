package entities;

public class Account {
	private String name;
	private int id;
	private float balance;
	
	public Account(String name, int id, float balance) {
		this.name = name;
		this.id = id;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getBalance() {
		return balance;
	}

	public void deposit(float value) {
		
		balance += value;	
	}
	
	public void withdraw(float value) {
		
		balance -= (value + 2.9f);
	}
}

package entities;

public class Investment {
	
	private Account account;
	private float value;
	
	
	public Investment(Account account, float value) {
		this.account = account;
		this.value = value;
		account.withdraw(value);
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public float getValue() {
		return value;
	}
	
}

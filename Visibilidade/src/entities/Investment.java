package entities;

public class Investment {

	public static float value;
	
	
	public float getValue() {
		return value;
	}
	
	public static void invest(Account account, float value) {
		account.withdraw(value);
		Investment.value = value;
	}
}

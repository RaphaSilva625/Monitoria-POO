package application;

import java.util.Scanner;

import entities.Account;
import entities.Investment;

public class Program {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		
		System.out.print("Enter your account name: ");
		String name = reader.next();
		System.out.print("Enter your account id: ");
		int id = reader.nextInt();
		System.out.print("Enter the amount to be deposited: ");
		float amount = reader.nextFloat();
		
		Account ac1 = new Account(name, id, amount);
		
		System.out.print("Enter the amount to withdrawn: ");
		ac1.withdraw(reader.nextFloat());
		
		System.out.println("Enter the amount to invest: ");
		float amountInvest = reader.nextFloat();
		Investment inv1 = new Investment(ac1, amountInvest);
		
		System.out.println();
		
		
		System.out.println("Account created!");
		System.out.printf("Account name: %s\n", ac1.getName());
		System.out.printf("Account id: %d\n", ac1.getId());
		System.out.printf("Account balance: %.2f\n", ac1.getBalance());
		System.out.printf("Your investment: %.2f\n", inv1.getValue());
		
		reader.close();
	}
}

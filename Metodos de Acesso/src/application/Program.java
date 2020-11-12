package application;

import java.util.Scanner;

import entities.Account;

public class Program {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		Account ac1 = new Account();
		
		System.out.print("Enter your account name: ");
		ac1.setName(reader.next());
		System.out.print("Enter your account id: ");
		ac1.setId(reader.nextInt());
		System.out.print("Enter the amount to be deposited: ");
		ac1.setBalance(reader.nextFloat());
		
		
		System.out.println();
		
		
		System.out.println("Account created!");
		System.out.printf("Account name: %s\n", ac1.getName());
		System.out.printf("Account id: %d\n", ac1.getId());
		System.out.printf("Account balance: %.2f\n", ac1.getBalance());
		
		
		reader.close();
	}
}

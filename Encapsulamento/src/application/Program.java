package application;

import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter your account name: ");
		Account.name = reader.next();
		System.out.print("Enter your account id: ");
		Account.id = reader.nextInt();
		System.out.print("Enter the amount to be deposited: ");
		Account.balance = reader.nextFloat();
		
		
		System.out.println();
		
		
		System.out.println("Account created!");
		System.out.printf("Account name: %s\n", Account.name);
		System.out.printf("Account id: %d\n", Account.id);
		System.out.printf("Account balance: %.2f\n", Account.balance);
		
		
		reader.close();
	}
}

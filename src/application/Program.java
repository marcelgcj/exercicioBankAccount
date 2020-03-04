package application;

import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Account account;
		System.out.printf("Enter account number: ");
		int number = scan.nextInt();
		scan.nextLine();
		System.out.print("Enter account holder: ");
		String holder = scan.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char response = scan.nextLine().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = scan.nextDouble();
			scan.nextLine();
			account = new Account(number, holder, initialDeposit);
		} else {
			account = new Account(number, holder);
		}

		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		System.out.println();

		System.out.print("Enter a deposit value: ");
		double depositValue = scan.nextDouble();
		scan.nextLine();
		account.deposit(depositValue);
		System.out.println("Updated account: ");
		System.out.println(account);
		System.out.println();

		System.out.print("Enter a withdraw value: ");
		double withdrawValue = scan.nextDouble();
		scan.nextLine();
		account.withdraw(withdrawValue);
		System.out.println("Updated account: ");
		System.out.println(account);
		scan.close();
	}

}

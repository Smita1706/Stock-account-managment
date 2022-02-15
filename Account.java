package com.bridgelabz.stockAccount;
import java.util.Scanner;
public class Account {
	static int balance = 0;

	public int addBalance(int amount) {
		balance = balance + amount;
		return balance;
	}
	public int debit(int debitAmount) {
		if(balance> debitAmount) {
			balance = balance - debitAmount;
		}
		else {
			System.out.println("Debit amount exceeded account balance please enter amount less than " + balance);
		}

		return balance;
	}

	public int credit(int creditAmount) {
		balance = balance + creditAmount;	
		return balance;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int amount = 0;
		int ans ;

		Account account = new Account();
		do {
			System.out.println("Enter choice : ");
			System.out.println("1.add ");
			System.out.println("2.debit ");
			System.out.println("3.credit ");
			int ch = s.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter the amount you want add : ");
				amount = s.nextInt();
				balance = account.addBalance(amount);
				System.out.println("Your new balance is : " + balance);
				break;
			case 2:
				System.out.println("Enter the amount you want to debit : ");
				amount = s.nextInt();
				balance = account.debit(amount);
				System.out.println("Your new balance is : " + balance);
				break;
			case 3:
				System.out.println("Enter the amount you want to credit : ");
				amount = s.nextInt();
				balance = account.credit(amount);
				System.out.println("Your new balance is : " + balance);
				break;
			}
			System.out.println("If you want to continue then press 1 else press 0 ");
			ans = s.nextInt();
		}while(ans == 1);
	}
}

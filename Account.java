package com.bridgelabz.stockAccount;

public class Account {
static int balance = 100;
	
	public void debit(int debitAmount) {
		if(balance> debitAmount) {
			balance = balance - debitAmount;
			System.out.println("New Balance: " + balance);
		}
		else {
			System.out.println("Debit amount exceeded account balance");
		}
			
	}
	
	
	public void credit(int creditAmount) {
		balance = balance + creditAmount;
		System.out.println("New Balance: " +balance);
			
	}
}

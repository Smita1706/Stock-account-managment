package com.bridgelabz.stockAccount;

public class Stock {
	private  String shareName;
	private int numOfShares;
	private  int sharePrice;
	int numOfStocks;

	public Stock(String name, int shareNum, int price) {
		this.shareName = name;
		this.numOfShares = shareNum;
		this.sharePrice = price;
	}
	public String getShareName() {
		return shareName;
	}

	public void setShareName(String shareName) {
		this.shareName = shareName;
	}

	public int getNumOfShares() {
		return numOfShares;
	}

	public void setNumOfShares(int numOfShares) {
		this.numOfShares = numOfShares;
	}

	public int getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}
		
	public String toString() {
		return "\nShare Name : "+shareName + 
				"\nNum Of Shares : " + numOfShares + 
				"\nShare Price : " + sharePrice ;
	}

	public static void main(String[] args) {
		Stock s = new Stock("s",1,2);
		s.toString();

	}
}

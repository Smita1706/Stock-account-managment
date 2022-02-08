package com.bridgelabz.stockAccount;

public class Stock {
	String shareName;
	int numOfShares;
	int sharePrice;
	int stockValue = 0;
	static int totalStocksValue = 0;
	
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

	public int getStockValue() {
		return stockValue;
	}

	public void setStockValue(int stockValue) {
		this.stockValue = stockValue;
	}

	public static int getTotalStocksValue() {
		return totalStocksValue;
	}

	public static void setTotalStocksValue(int totalStocksValue) {
		Stock.totalStocksValue = totalStocksValue;
	}

	public int stockValue() {
		stockValue = sharePrice * numOfShares;
		return stockValue;
	}
	public int totalStocksValue() {
		totalStocksValue = stockValue + totalStocksValue;
		return totalStocksValue;
	}

	@Override
	public String toString() {
		return "Stock [Share Name : " + shareName + ", Num Of Shares : " + numOfShares + ", Share Price : " + sharePrice
				+ ", Stock Value : " + stockValue + ", Sotal Stocks Value : " + totalStocksValue + "]";
	}
}

package com.bridgelabz.stockAccount;

import java.util.ArrayList;
import java.util.Scanner;

public class StockPortfolio {

	static int numOfStocks;
	static ArrayList<Stock> stocksArray = new ArrayList<Stock>();

	public static void stockPortfolio() {

		Account account = new Account();
		StockAccount stockAcc = new StockAccount();

		Scanner sc = new Scanner(System.in);

		for(int i=0; i<numOfStocks; i++)
		{
			int stockNum = i;
			System.out.println("Stock " +(++stockNum));
			System.out.println("Please enter the share name: ");
			String name = sc.next();

			System.out.println("Please enter the number of shares to be bought of the selected stock: ");
			int num = sc.nextInt();

			System.out.println("Please enter the price of the shares to be bought: ");
			int price = sc.nextInt();

			Stock stock = new Stock(name, num, price);
			stocksArray.add(stock);
			stock.stockValue();
			stock.totalStocksValue();

			stockAcc.buy(num, name);
			stockAcc.CompanyShares.add(stockAcc);

		}

		account.debit(Stock.totalStocksValue);

		System.out.println(stocksArray);
		System.out.println(StockAccount.CompanyShares);

		System.out.println("Press 1 to sell a share or 2 to print report");
		int Num = sc.nextInt();
		if(Num == 1)
		{
			System.out.println("Please enter the stock name to be sold: ");
			String shareName = sc.next();

			System.out.println("Please enter how many shares are to be sold of the selected stock: ");
			int numOfShares = sc.nextInt();

			stockAcc.sell(numOfShares, shareName);
			System.out.println(StockAccount.CompanyShares);

			for(int i=0;i<stocksArray.size(); i++) {
				String sellingSymbol = stocksArray.get(i).getShareName();
				if(shareName.equals(sellingSymbol)) {
					int creditAmount = numOfShares*stocksArray.get(i).getSharePrice();	
					account.credit(creditAmount);
				}
			}
		}
		if(Num==2)
		{
			stockAcc.printReport();
		}

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Number of stocks to buy: ");
		numOfStocks = s.nextInt();

		stockPortfolio();		

	}
}

package com.bridgelabz.stockAccount;

import java.util.ArrayList;
import java.util.Scanner;

public class StockPortfolio {
	static ArrayList<Stock> stocksArray = new ArrayList<Stock>(); 
	Scanner s = new Scanner(System.in);
	public void getData() {
		System.out.println("Please enter the details of the stock ");
		System.out.println("Please enter the share name : ");
		String name = s.next();

		System.out.println("Please enter the number of shares of share " + name + " :");
		int num = s.nextInt();

		System.out.println("Please enter the price of the share " + name + " per one share: ");
		int price = s.nextInt();
		Stock stock = new Stock(name,num,price);
		stocksArray.add(stock);
		System.out.println("\nStock is added Successfully.");			
	}

	public void getMultipleData(int noOfStocks) {
		int i;
		StockPortfolio port = new StockPortfolio();
		for(i=0;i<noOfStocks;i++) {
			System.out.println((i+1)+"Stock");
			port.getData();
		}
	}

	public void printReport() {
		int i;
		System.out.println("Stocks present in Stock array is : ");
		for(i = 0 ; i < stocksArray.size() ; i++) {
			System.out.println(stocksArray.get(i));
		}
	}

	public static int totalStocksValue() {
		int totalStockValue = 0;
		for(int i =0 ;i<stocksArray.size();i++) {
			totalStockValue += stocksArray.get(i).getNumOfShares() * stocksArray.get(i).getSharePrice();
		}
		return totalStockValue;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StockPortfolio port = new StockPortfolio();
		int noOfStocks ;
		int ans ;
		do {
			System.out.println("Enter choice : ");
			System.out.println("1.Add single stock ");
			System.out.println("2.Add multiple stock ");
			System.out.println("3.Print the report ");
			System.out.println("4.Exit");
			int ch = s.nextInt();
			switch(ch) {
			case 1:
				port.getData();
				break;
			case 2:
				System.out.println("How many stocks you want to add? ");
				noOfStocks = s.nextInt();
				port.getMultipleData(noOfStocks);
				break;
			case 3:
				System.out.println("Enter the amount you want to credit : ");
				port.printReport();
				System.out.println("\nTotal stock : "+totalStocksValue());
				break;
			case 4:
				System.out.println("Exited succesfully");
				break;
			default:
				System.out.println("Please enter valid choise");
			}
			if(ch == 4)
				break;
			System.out.println("If you want to continue then press 1 else press 0 ");
			ans = s.nextInt();
		}while(ans == 1);
	}

}

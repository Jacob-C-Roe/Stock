/*
 * Created By: Jacob Roe
 * Created On: 9.11.2022
 * Chapter 2 - Stock Purchases
 * 
 * Modification Log
 * Date			Programmer		Description
 * 9/11/2022	Jacob Roe		Initial Implementation
 * 
 * This Program will calculate and display the amount of money Joe paid for the stock and the amount of commission Joe paid his broker.
 */
package stocks;

import java.util.Scanner;

public class JoeStockPurchase {

	public static void main(String[] args) {
		//Declare Constants and Variables
		final double RATE = 0.02;
		double amount;
		double cost;
		double total;
		double commission;
		
		// Get input from user - price of stock, how many
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How much did it cost?");
		cost = keyboard.nextDouble();
		
		System.out.print("How many were purchased?");
		amount = keyboard.nextDouble();
		
		// Calculate the total cost of the Stock
		total = cost * amount;
		
		//Calculate the commission
		commission = total * RATE;
		
		//Display results of Calculations
		System.out.println("Total Cost: $" + total);
		System.out.println("Commission Cost: $" + commission);
	}

}

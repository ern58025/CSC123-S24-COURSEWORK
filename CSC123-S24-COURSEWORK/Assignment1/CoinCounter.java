//Ernesto Gonzalez(egonzalez550@toromail.csudh.edu)

import java.util.Scanner;
public class CoinCounter 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the number of pennies: ");
		double penny = keyboard.nextDouble();
		
		System.out.println("Please enter the number of nickels: ");
		double nickel = keyboard.nextDouble();

		System.out.println("Please enter the number of dimes: ");
		double dime = keyboard.nextDouble();
		
		System.out.println("Please enter the number of quarters: ");
		double quarter = keyboard.nextDouble();
		
		double totalCents = (penny * 1) + (nickel * 5) + (dime * 10) + (quarter * 25);
		double dollars = totalCents / 100;
		double remainingCents = totalCents % 100;
		
		System.out.println("You have " + dollars + " dollar(s) and " + remainingCents + " cents");

	}

}

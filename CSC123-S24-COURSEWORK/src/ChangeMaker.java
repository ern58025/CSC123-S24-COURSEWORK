//Ernesto Gonzalez(egonzalez550@toromail.csudh.edu)

import java.util.Scanner;
public class ChangeMaker 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter your amount in dollars: ");
		int dollars = keyboard.nextInt();
		
		System.out.println("Please enter your amount in cents: ");
		int cents = keyboard.nextInt();
		
		int totalCents = (dollars * 100) + cents;
		int quarters = totalCents / 25;
		int centsAfterQuarters = totalCents % 25;
		int dimes = centsAfterQuarters / 10;
		int centsAfterDimes = centsAfterQuarters % 10;
		
		System.out.println(dollars + " dollars and " + cents + " cents are: ");
		System.out.println(quarters + " quarters, " + dimes + "dimes, " + nickels + " nickesl, and " + pennies + "pennies");

	}

}

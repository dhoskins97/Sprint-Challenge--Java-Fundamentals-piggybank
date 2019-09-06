package piggyBank;

import java.util.*;
import java.text.DecimalFormat;

public class Main
{

	private static DecimalFormat fp = new DecimalFormat("$###,###.00");

	public static void main(String[] args)
	{
		

		Quarter quarter = new Quarter(1);
		Dime dime = new Dime(1);
		Dollar dollars = new Dollar(5);
		Nickel nickels = new Nickel(3);
		Dime dimes = new Dime(7);
		Dollar dollar = new Dollar(1);
		Penny pennies = new Penny(10);

		ArrayList<Coin> bank = new ArrayList<Coin>();

		bank.add(quarter);
		bank.add(dime);
		bank.add(dollars);
		bank.add(nickels);
		bank.add(dimes);
		bank.add(dollar);
		bank.add(pennies);

		System.out.println("\n***** Coins Entered *****\n");
		bank.forEach((c) -> System.out.println(c.printQuantity()));

		double bankValue = 0.00;
		bankValue = bankValue + (quarter.value * quarter.quantity);
		bankValue = bankValue + (dime.value * dime.quantity);
		bankValue = bankValue + (dollars.value * dollars.quantity);
		bankValue = bankValue + (nickels.value * nickels.quantity);
		bankValue = bankValue + (dimes.value * dimes.quantity);
		bankValue = bankValue + (dollar.value * dollar.quantity);
		bankValue = bankValue + (pennies.value * pennies.quantity);

		System.out.println("\n\nThe piggy bank holds " + "$" + fp.format(bankValue) + ".");
	}
}
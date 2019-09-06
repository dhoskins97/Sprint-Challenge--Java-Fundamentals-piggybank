package piggyBank;

import java.util.*;

public class Main
{
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
}
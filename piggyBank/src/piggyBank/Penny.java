package piggyBank;

public class Penny extends Coin
{
	public Penny(int quantity)
	{
		super(quantity);
		this.name = "Penny";
		this.pluralName = "Pennies";
		this.value = 0.01;
	}

	@Override
	public double printTotalValue()
	{
		totalValue = 0.01 * quantity;
		return totalValue;
	}

}
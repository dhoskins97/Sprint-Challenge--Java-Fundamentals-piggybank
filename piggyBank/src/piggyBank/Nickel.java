package piggyBank;

public class Nickel extends Coin
{
	public Nickel(int quantity)
	{
		super(quantity);
		this.name = "Nickel";
		this.value = 0.05;
	}

	@Override
	public double printTotalValue()
	{
		totalValue = 0.05 * quantity;
		return totalValue;
	}

}
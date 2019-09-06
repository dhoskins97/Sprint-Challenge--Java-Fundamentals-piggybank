package piggyBank;

public class Dime extends Coin
{
	public Dime(int quantity)
	{
		super(quantity);
		this.name = "Dime";
		this.value = 0.10;
	}

	@Override
	public double printTotalValue()
	{
		totalValue = 0.10 * quantity;
		return totalValue;
	}

}
package piggyBank;

public class Dollar extends Coin
{
	public Dollar(int quantity)
	{
		super(quantity);
		this.name = "Dollar";
		this.value = 1.00;
	}

	@Override
	public double printTotalValue()
	{
		totalValue = 1.00 * quantity;
		return totalValue;
	}

}
package piggyBank;

public class Quarter extends Coin
{
	public Quarter(int quantity)
	{
		super(quantity);
		this.name = "Quarter";
		this.value = 0.25;
	}

	@Override
	public double printTotalValue()
	{
		totalValue = 0.25 * quantity;
		return totalValue;
	}

}
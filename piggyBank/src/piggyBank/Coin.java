package piggyBank;

public abstract class Coin
{
	double value;
	double totalValue;
	int quantity;
	String name;

	public Coin(int quantity)
	{
		this.quantity = quantity;
	}

	public Coin()
	{
		this.quantity = 1;
	}

	public double printTotalValue()
	{
		return totalValue;
	}

	public String printQuantity()
	{
		return quantity + " " + name;
	}
}
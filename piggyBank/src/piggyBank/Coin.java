package piggyBank;

public abstract class Coin
{
	double value;
	double totalValue;
	int quantity;
	String name;
	String pluralName;

	public Coin(int quantity)
	{
		this.quantity = quantity;
		this.totalValue = quantity * value;
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
		if (quantity == 1)
			{return quantity + " " + name;}
		else {return quantity + " " + pluralName;}
	}
}
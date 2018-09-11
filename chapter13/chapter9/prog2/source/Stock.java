public class Stock
{
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;

	public Stock(String symbol,  String name)
	{
		this.symbol = symbol;
		this.name = name;
	}

	public double getChangePercent()
	{
		if (previousClosingPrice > currentPrice)
			return (previousClosingPrice - currentPrice) / 100;
		else
			return (currentPrice - previousClosingPrice) / 100;
	}
}

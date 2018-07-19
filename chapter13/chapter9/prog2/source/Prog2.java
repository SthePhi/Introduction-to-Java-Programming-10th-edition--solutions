public class Prog2
{
	public static void main(String[] args)
	{
		Stock stock = new Stock("ORCL", "Oracle Corporation");
		stock.previousClosingPrice = 34.5;
		stock.currentPrice = 34.35;
		System.out.printf("The price change percentage is %.2f\n", stock.getChangePercent());
	}
}

public class Prog24
{
	public static void main(String[] args)
	{
		int cardIndex = (int)(Math.random() * 52);
		String suit = "";
		String rank = "";

		if (cardIndex >= 0 && cardIndex <=13)
			suit = "Clubs";
		else if (cardIndex > 13 && cardIndex <= 26)
			suit = "Diamonds";
		else if (cardIndex > 26 && cardIndex <= 39)
			suit = "Hearts";
		else
			suit = "Spades";

		if (cardIndex > 13)
			cardIndex %= 13;

		switch (cardIndex)
		{
			case 0:
				rank = "Ace";
				break;
			case 1:
				rank = "2";
				break;
			case 2:
				rank = "3";
				break;
			case 3:
				rank = "4";
				break;
			case 4:
				rank = "5";
				break;
			case 5:
				rank = "6";
				break;
			case 6:
				rank = "7";
				break;
			case 7:
				rank = "8";
				break;
			case 8:
				rank = "9";
				break;
			case 9:
				rank = "10";
				break;
			case 10:
				rank = "Jack";
				break;
			case 11:
				rank = "Queen";
				break;
			case 12:
				rank = "King";
		}

		System.out.println("The card you picked is " + rank + " of " + suit);
	}
}

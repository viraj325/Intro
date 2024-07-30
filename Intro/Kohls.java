
/*
	Programmer-Viraj Patel
	Date-1/25/2016
	Project-Kohl's
	File Name-Kohl's.java
	Description-This program will print out the discount and the the sale price rounded to the nearest hundredths.
*/

import java.util.*;

public class Kohls
{
	public static void main(String [] args)
	{
		Scanner viraj = new Scanner(System.in);

		System.out.println("What your discount card color?");
			String card = viraj.nextLine();

		System.out.println("");

		System.out.println("What is the original price of the purchase?");
			double price = viraj.nextDouble();

		System.out.println("");

		System.out.println("What is your age?");
			int age = viraj.nextInt();

			double discount, salePrice;

		if (card.equals("red")|| card.equals("Red"))
		{
				discount = price * .30;
			System.out.println("You're using a Red Card with a 30% discount.");
		}
		else if (card.equals("blue")|| card.equals("Blue"))
		{
				discount = price * .25;
			System.out.println("You're using a Blue Card with a 25% discount.");
		}
		else if (age > 62)
		{
				discount = price * .20;
			System.out.println("You're using a Senior Card with a 20% discount.");
		}
		else
		{
				discount = price * .15;
			System.out.println("You're using a Green Card with a 15% discount.");
		}
				discount = (int)(discount * 100 + .5)/100.0;
					salePrice = price - discount;

			System.out.println("You are saving $" + discount);
			System.out.println("");
			System.out.println("The Sale price is now $" + salePrice);
	}
}
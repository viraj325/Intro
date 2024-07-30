/*
	Programmer-Viraj Patel
	Date-3/18/2016
	Project-Cheaper
	File Name-Cheaper.java
	Description-This program will calculate the orignal, discount and saleprice to get final output using main methods.
*/

import java.util.*;

public class Cheaper
{
	public static void main (String [] args)
	{
		double original, rate, discount, salePrice;

		original = getPrice();
		rate = getDiscount();
		discount = calculateDiscount(original, rate);
		salePrice = calculateSalePrice(original, discount);
		output(original, rate, discount, salePrice);
	}
	public static double getPrice()
	{
		Scanner viraj = new Scanner(System.in);

			double x;

		System.out.println("Enter the original price of an item");
				x = viraj.nextDouble();

		return x;
	}
	public static double getDiscount()
	{
		Scanner viraj = new Scanner(System.in);

			double y;

		System.out.println("Enter the discount: ");
				y = viraj.nextDouble();

		return y/100.0;
	}
	public static double calculateDiscount(double getPrice, double getDiscount)
	{
			double z = getPrice * getDiscount;

		return z;
	}
	public static double calculateSalePrice(double getPrice, double calculateDiscount)
	{
			double a = getPrice - calculateDiscount;

		return a;
	}
	public static void output(double getPrice, double getDiscount, double calculateDiscount, double calculateSalePrice)
	{
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("Original Price: $" + getPrice);

			getDiscount = getDiscount*100.0;
		System.out.println("Discount Rate: " + getDiscount + "%");

			double round = Math.round(calculateDiscount);
		System.out.println("Amount of Discount: $" + round);

			double rounded = Math.round(calculateSalePrice*100)/100.0;
		System.out.println("Sale Price: $" + rounded);

		System.out.println();
		System.out.println();
	}
}
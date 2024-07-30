/*
	Name: Viraj Patel
	Date: January 14, 2016
	Project: FormLetter
	File Name: FormLetter.java
	Program Description: This program will print out an letter.
*/


public class FormLetter
{
	public static void main (String [] args)
	{
		String customerName = "Viraj Patel";
		String color = "Green";
		String clothingItem = "Jacket";
		double price = 359.99;
		String catalogName = "Greenie";
		String catalogPhoneNumber = "1-234-567-8910";

		System.out.println("Dear "+customerName+",");
		System.out.println(" ");
		System.out.println("We at "+catalogName+" regret to inform you that the "+color+" "+clothingItem);
		System.out.println("that you ordered is currently out of stock. "+"Please call "+catalogName+" at "+catalogPhoneNumber);
		System.out.println("to order a different color or if you would like we will refund your order cost of $"+price+".");
		System.out.println("We are sorry for any inconvenience.");
		System.out.println(" ");
		System.out.println(catalogName+" Orders Department");
		System.out.println(" ");
	}
}
/*
	Programmer-Viraj Patel
	Date-2/25/2016
	Project-MyLoop
	File Name-MyLoop.java
	Description-This program will print out multiple amount of numbers doing do and while.
*/

import java.util.*;

public class MyLoop
{
	public static void main(String [] args)
	{
		Scanner viraj = new Scanner(System.in);

			int number;
			int number2;
			int num3 = 0;

		do
		{
			System.out.println("Enter a number between 1 and 100: ");
				number = viraj.nextInt();
		}
	while (!(number <= 100 && number >= 1));
	{

		do
		{
			System.out.println("Enter a number smaller than " + number + ": ");
				number2 = viraj.nextInt();
		}
		while(!( number2 <= number && number2 > 0));

			System.out.print("MyLoop = ");
	}
	while (num3 <= number)
	{
		System.out.print("");

		System.out.print(num3 + " ");
			num3 += number2;
		}

		System.out.println();
	}
}
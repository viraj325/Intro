/*
	Programmer-Viraj Patel
	Date-3/9/2016
	Project-Evens
	File Name-Evens.java
	Description-This program will print out 3 different loops using (for)loop.
*/

import java.util.*;

public class Evens
{
	public static void main(String [] args)
	{
		Scanner viraj = new Scanner(System.in);

			int num;
			int total = 0;


		do
			{
				System.out.println("Enter a number between 10 and 20: ");
					num = viraj.nextInt();
			}

		while (!(num <= 20 && num >= 10));

		 System.out.println();

		for (int num2=0; num2 <= num; num2 +=2)
		{
			total += num2;
		}

		System.out.println("The sum of the even numbers between 0 and " + num + " is: " +total);

		System.out.println();
	}
}
/*
	Programmer-Viraj Patel
	Date-2/26/2016
	Project-LoopSum
	File Name-LoopSum.java
	Description-This program will print out multiple amount of numbers doing do and while.
*/

import java.util.*;

public class LoopSum
{
	public static void main(String [] args)
	{
		Scanner viraj = new Scanner(System.in);

			int number;
			int number2=1;
			int sum = 0;

		do
				{
					System.out.println("Enter a number between 1 and 9: ");
						number = viraj.nextInt();
				}

	while (!(number <= 9 && number >= 1));

		 System.out.println();

		 do
		 {
			 System.out.print(number2);
	if(number2 < number)
	{
		System.out.print("+");
	}
		 	sum += number2;

			number2 += 1;
		}

	while (number2 <= number);

		System.out.println("="+sum);

	}
}
/*
	Programmer-Viraj Patel
	Date-3/10/2016
	Project-Numbers
	File Name-Numbers.java
	Description-This program will print out the 3 programs, one to nearest whole number,
	second nearest hundreths place, and third square root the whole number to the 5th power using pow().
*/

import java.util.*;

public class Numbers
{
	public static void main(String [] args)
	{
		   Scanner viraj = new Scanner(System.in);

		   		double number;
		   		long round;
		   		double hundreths;
		   		double fifth;

		   	do
		   	{
				System.out.println("Input a positive decimal number: ");
		   			number = viraj.nextDouble();
			}
			while(number <= 0);

				round = Math.round(number);
			System.out.println(number + " rounded to the nearest whole number is: " + round);

				hundreths = Math.round(number*100)/100.0;
			System.out.println(number + " rounded to the hundreths place is: " + hundreths);

				fifth = Math.pow(round,5);
			System.out.println(round + "^5 = " + fifth);

	}
}
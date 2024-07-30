/*
	Programmer-Viraj Patel
	Date-2/24/2016
	Project-NameLoop
	File Name-NameLoop.java
	Description-This program will print your name as many times as you want.
*/

import java.util.*;

public class NameLoop
{
	public static void main(String [] args)
	{
		Scanner viraj = new Scanner(System.in);

		System.out.println("Please enter your name: ");
			String name = viraj.nextLine();

		System.out.println("Enter a positive integer: ");
			int number = viraj.nextInt();

		while(number > 0)
		{
			System.out.println(name);
				number --;
		}
	}
}
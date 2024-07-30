/*
	Programmer-Viraj Patel
	Date-3/8/2016
	Project-ThreeLoops
	File Name-ThreeLoops.java
	Description-This program will print out 3 different loops using (for)loop.
*/

import java.util.*;

public class ThreeLoops
{
	public static void main(String [] args)
	{
			System.out.println("Countdown...");

		for (int count = 10; count > 0; count --)
		{
			System.out.println(count);
		}
			System.out.println("Blast Off!");

			System.out.println();

			System.out.println("Even Counting");

		for (int even = 2; even <= 20; even += 2)
		{
			System.out.print(even + " ");
		}
			System.out.println("");
			System.out.println("Finished");

			System.out.println();

			System.out.println("Odd Counting");

		for (int odd = 15; odd >= 1; odd -= 2)
		{
			System.out.print(odd + " ");
		}

			System.out.println("");
			System.out.print("Finished");

			System.out.println();
	}
}
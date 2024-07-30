/*
	Name- Viraj Patel
	Date- 2/9/2016
	Project- Number Tester
	File Name- numberTester.java
	Description- This program
*/

import java.util.*;

public class numberTester
{
	public static void main(String [] args)
	{
		Scanner viraj = new Scanner (System.in);

			int wholeNumber;

		System.out.println("Please enter a whole number: ");
			wholeNumber = viraj.nextInt();
		System.out.println("");

		if (wholeNumber >= 1 && wholeNumber <= 10)
		{
			System.out.println(wholeNumber + " is in the range of 1 to 10");
		}
		else
		{
			System.out.println(wholeNumber + " is not in the range of 1 to 10");
		}
	}
}
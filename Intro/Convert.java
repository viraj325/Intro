
/*
	Programmer-Viraj Patel
	Date-1/25/2016
	Project-Convert
	File Name-Convert.java
	Description-This program will convert inches into yards, feet, and inches.
*/

import java.util.*;

public class Convert
{
	public static void main(String [] args)
	{
		Scanner viraj = new Scanner (System.in);

		System.out.println("Enter your inches: ");
			int inch = viraj.nextInt();
		System.out.println("");
		System.out.println("");

			int yards = inch / 36;
			int remainder = inch % 36;
			int feet = remainder / 12;
			int inches = remainder % 12;

		System.out.println(yards + " yards " + feet + " feet " + inches + " inches ");

	}
}
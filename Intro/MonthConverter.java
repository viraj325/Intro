
/*
	Programmer-Viraj Patel
	Date-2/22/2016
	Project-MonthConverter
	File Name-MonthConverter.java
	Description-This program will print out dates using switch and case statements.
*/

import java.util.*;

public class MonthConverter
{
	public static void main(String [] args)
	{
		Scanner viraj = new Scanner(System.in);

		System.out.println("Please enter a number for the month: ");
			int month = viraj.nextInt();

		System.out.println("");

		System.out.println("Please enter a number for the day: ");
			int day = viraj.nextInt();

		System.out.println("");

		System.out.println("Please enter a number for the year: ");
			int year = viraj.nextInt();

		System.out.println("");

		switch(month)
		{
			case 1:
					System.out.println("January " + day + ", " + year);
					break;
			case 2:
					System.out.println("February " + day + ", " + year);
					break;
			case 3:
					System.out.println("March " + day + ", " + year);
					break;
			case 4:
					System.out.println("April " + day + ", " + year);
					break;
			case 5:
					System.out.println("May " + day + ", " + year);
					break;
			case 6:
					System.out.println("June " + day + ", " + year);
					break;
			case 7:
					System.out.println("July " + day + ", " + year);
					break;
			case 8:
					System.out.println("August " + day + ", " + year);
					break;
			case 9:
					System.out.println("September " + day + ", " + year);
					break;
			case 10:
					System.out.println("October " + day + ", " + year);
					break;
			case 11:
					System.out.println("November " + day + ", " + year);
					break;
			case 12:
					System.out.println("December " + day + ", " + year);
					break;
			default:
					System.out.println("This is an invalid date.");
		}
	}
}


/*
	Name: Viraj Patel
	Date: 2/8/2016
	Project: BusDriver
	File Name: BusDriver.java
	Program Description: This program will output the total pay including the overtime on the screen.
*/
import java.util.*;

public class BusDriver
{
	public static void main(String [] args)
	{
		Scanner viraj =  new Scanner(System.in);

		System.out.println("Enter your hours that you've worked for the week: ");
			int hours = viraj.nextInt();
			int regPay = 10;
			int overPay = 15;

		if (hours <= 40)
		{
				regPay = regPay * hours;
			System.out.println("Your're pay is: " + regPay);
		}
		else if (hours > 40)
		{
				int remainder = hours - 40;
				overPay = overPay * remainder;
			System.out.println("You're overtime pay is: " + overPay);
		}

				double totalPay = overPay + regPay;
			System.out.println("Here is you're total pay: " + totalPay);
	}
}
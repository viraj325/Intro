// MyRectangle Project

import java.util.Scanner;

public class Rectangle
{

	// method to input the dimension length

	public static int getLength()
	{
		int l;
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Please enter length: ");
		l = keyboard.nextInt();
		return l;
	}

	// method to input the dimension width

	public static int getWidth()
	{
		int w;
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Please enter the width: ");
		w = keyboard.nextInt();
		return w;
	}

	// method to calculate area has parameters for length and width

	public static int calculateArea(int l, int w)
	{
		return l * w;
	}

	// method to calulate perimeter has parameters for length and width

	public static int calculatePerimeter(int l, int w)
	{
		return 2 * l + 2 * w;
	}

	// method output is sent length, width, area, and perimeter

	public static void giveOutput(int l, int w, int a, int p)
	{
		System.out.println("\n\n***********************************************\n");
		System.out.println("A rectangle with length: "+ l);
		System.out.println("and width: " + w);
		System.out.println("Has an area: "+ a+" square units.");
		System.out.println("Perimeter: "+p+" units.");
		System.out.println();
		System.out.println("***********************************************\n");
	}

	// main method declares variables and calls methods

	public static void main(String [] args)
	{
		int length, width, area, perimeter;

		// method calls


			length = getLength();
			width = getWidth();
			area = calculateArea(length, width);
			perimeter = calculatePerimeter(length, width);
			giveOutput(length, width, area, perimeter);



	}
}
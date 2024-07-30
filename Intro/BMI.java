/*
	Programmer-Viraj Patel
	Date-1/25/2016
	Project-BMI
	File Name-BMI.java
	Description-This program will print out the BodyMassIndex(BMI).
*/

import java.util.*;

public class BMI
{
	public static void main(String [] args)
	{
		Scanner viraj = new Scanner (System.in);

		System.out.print("Please enter your Height: ");
			double height = viraj.nextDouble();
		System.out.println("");
		System.out.print("Please enter your Weight: ");
			double weight = viraj.nextDouble();
		System.out.println("");
			double BMIH = height * .0254;
			double BMIW = weight * .454;
			double BodyMassIndex = BMIW /(BMIH * BMIH);
		System.out.println("");
		System.out.println("A person weighing " + weight + " pounds with a height of " + height + " inches would have a BMI of " +(int)BodyMassIndex);
	}
}
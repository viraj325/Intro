
/*
	Programmer-Viraj Patel
	Date-1/25/2016
	Project-Arithemetic
	File Name-Arithmetic.java
	Description-This program will print out anwsers for the operations which are created by me.
*/

import java.util.*;
public class Arithmetic
{
	public static void main(String [] args)
	{

		Scanner viraj = new Scanner (System.in);

		System.out.println("**********************************");
		System.out.println("* this is my fourth Java progess  *");
		System.out.println("**********************************");
		System.out.println("");
		System.out.println("**  Integer arithmetic tests  **");
		System.out.println("");

		System.out.print("Enter the first integer to test: ");
			int first = viraj.nextInt();
		System.out.print("Enter the second integer to test: ");
			int second = viraj.nextInt();
		System.out.println("");
			int sum = first + second;
		System.out.println(first + " + " + second + " = " + sum);
		//these all are only integers
			int minus = first - second;
			int times = first * second;
			int divide = first / second;
			int Divide = first % second;
		System.out.println(first + " - " + second + " = " + minus);
		System.out.println(first + " * " + second + " = " + times);
		System.out.println(first + " / " + second + " = " + divide);
		System.out.println(first + " % " + second + " = " + Divide);
		System.out.println("");
		System.out.println("");
		System.out.println("**  Real arithmetic tests  **");
		System.out.println("");
		System.out.print("Enter the first real to test: ");
			double un = viraj.nextDouble();
		System.out.print("Enter the second real to test: ");
			double deux = viraj.nextDouble();
		System.out.println("");
			double add = un + deux;
			double subtract = un - deux;
			double multiply = un * deux;
			double division = un / deux;
		System.out.println(un + " + " + deux + " = " + add);
		System.out.println(un + " - " + deux + " = " + subtract);
		System.out.println(un + " * " + deux + " = " + multiply);
		System.out.println(un + " / " + deux + " = " + division);
		System.out.println("");

	}
}
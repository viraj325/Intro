/*	Prograqmmer: Viraj Patel
	Date: January 20 2016
	Project: Lab 1.3 Madlib
	File Name: Madlib.java
	Program Description: This is my madlib....
*/

import java.util.*;
public class Madlib
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Welcome to my Madlib");
			System.out.println();

		System.out.println("Please enter your first name: ");
			String yourName = keyboard.nextLine();

		System.out.println("Enter your favorite color: ");
			String color = keyboard.nextLine();

		System.out.println("Enter your second favorite color: ");
			String color2 = keyboard.nextLine();

		System.out.println("What is your favorite animal: ");
			String animal = keyboard.nextLine();

		System.out.println("Enter your ONE favorite hobby: ");
			String hobby = keyboard.nextLine();

		System.out.println("Enter an object:");
			String object = keyboard.nextLine();

		System.out.println("Enter a random funny name: ");
			String name2 = keyboard.nextLine();

        System.out.println("Enter your favorite number: ");
			int number = keyboard.nextInt();


		System.out.println("");


		System.out.println("Once upon a time, in " + name2 + " land, there were " + number + " " + animal + "'s.");
		System.out.println("But one of the " + animal + ", " + yourName + " was so smart and all day long all he did was " + hobby + ".");
		System.out.println(yourName + ", was really different, " + yourName + " was " + color + " when everyone else were " + color2 + ". ");
		System.out.println("But one day, a " + object + " fell on top of " + yourName + " and he disappeared forever.");
		System.out.println(" ");
		System.out.println("THE END");
	}
}
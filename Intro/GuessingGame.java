/*
	Programmer-Viraj Patel
	Date-3/24/2016
	Project-Guessing Game
	File Name-GuessingGame.java
	Description- This program will allow the computer to randomly generate a number and will make the user guess 5 times.
*/

import java.util.*;

public class GuessingGame
{
	public static void main(String [] args)
	{
		Scanner viraj = new Scanner(System.in);

			int number = (int)(Math.random()*25)+1;

			int something = 0;

		System.out.println("You have 5 chances to guess the right number or you will lose.");

		System.out.println();

			int guess;

		do
		{
			System.out.println("Please guess the number: ");
				guess = viraj.nextInt();

					something++;

			if(guess > number)
			{
				System.out.println();

				System.out.println("TOO HIGH");
			}
			else if(guess < number)
			{
				System.out.println();

				System.out.println("TOO LOW");
			}
			else
			{
				if(something == 1)
				{
					System.out.println();

					System.out.println("You got this in 1 try!!!!");
				}
				else if(something == 5)
				{
					System.out.println();

					System.out.println("You finally got the right anwser in 5 tries, REALLY CLOSE");
				}
				else
				{
					System.out.println();

					System.out.println("You got this in " + something + " tries!!");
				}
			}
		}
		while(guess != number && something < 5);

		if(!(guess == number))
		{
			System.out.println();

			System.out.println("You're dumb, the number is " + number);

			System.out.println();
		}
	}
}
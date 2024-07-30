// this program solves the quadratic formula using methods of the Math class

import java.util.Scanner;

public class QuadraticFormula
{
	public static double getPosQuad(int a, int b, int c)
	{
		double temp;
		double discriminant;

		discriminant = Math.pow(b, 2) - 4 * a * c;
		temp = -1 * b + Math.sqrt(discriminant);
		return temp / (2 * a);
	}

	public static double getNegQuad(int a, int b, int c)
		{
			double temp;
			double discriminant;

			discriminant = Math.pow(b, 2) - 4 * a * c;
			temp = -1 * b - Math.sqrt(discriminant);
			return temp / (2 * a);
		}

	public static void main (String [] args)
	{
		int coefA, coefB, coefC;
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Please enter the coeffecient on x^2: ");
		coefA = keyboard.nextInt();

		System.out.print("Please enter the coeffecient on x: ");
		coefB = keyboard.nextInt();

		System.out.print("Please enter the constant: ");
		coefC = keyboard.nextInt();

		System.out.println();
		System.out.println("The positive root is: " + getPosQuad(coefA, coefB, coefC));
		System.out.println();
		System.out.println("The negative root is: " + getNegQuad(coefA, coefB, coefC));
	}
}


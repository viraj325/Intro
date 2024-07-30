import java.util.*;

public class ArrayDemo
{

	public static void main (String [] args)
	{
		int [] array = new int[10];
		array = fillArray();
		printArray(array);
		System.out.println("The total is: "+ sumArray(array));
		System.out.println("The positive total is: "+ sumPosArray(array));
		System.out.println("The negative total is: "+ sumNegArray(array));
	}
	public static int [] fillArray()
	{
		Scanner keyboard = new Scanner (System.in);
		int [] arr = new int[10];

		for (int c = 0; c < arr.length; c++)
		{
			System.out.print("Enter #"+c+": ");
			arr[c] = keyboard.nextInt();
		}
		return arr;
	}
	public static void printArray(int [] arr)
	{
		for (int c = 0; c < arr.length; c++)
		{
			System.out.print(arr[c]+ " ");
		}
		System.out.println();
	}

	public static int sumArray(int [] arr)
	{
		int sum = 0;
		for (int c = 0; c < arr.length; c++)
		{
			sum += arr[c];
		}
		return sum;
	}

	public static int sumPosArray(int [] arr)
	{
		int sum = 0;
		for (int c = 0; c < arr.length; c++)
		{
			if (arr[c] > 0)
				sum += arr[c];
		}
		return sum;
	}

	public static int sumNegArray(int [] arr)
	{
		int sum = 0;
		for (int c = 0; c < arr.length; c++)
		{
			if (arr[c] < 0)
				sum += arr[c];
		}
		return sum;
	}




}
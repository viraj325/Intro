import java.util.*;

public class arraylab
{
	public static void main(String [] args)
	{
		int [] array = new int [10];

		array = fillArray();

		printArray(array);

		System.out.println("The total is: " + getTotal(array));

		System.out.println("The negative total is: " + getNegTotal(array));

		System.out.println("The positive total is: " + getPosTotal(array));
	}
	public static int getPosTotal(int [] arr)
	{
		int sum = 0;

		for(int c = 0; c < arr.length; c++)
		{
			if(arr[c] > 0)
				sum += arr[c];
		}
		return sum;
	}
	public static int getNegTotal(int [] arr)
	{
		int sum = 0;

		for(int c = 0; c < arr.length; c++)
		{
			if(arr[c] < 0)
				sum += arr[c];
		}
		return sum;
	}
	public static int getTotal(int [] arr)
	{
		int sum = 0;

		for(int c = 0; c < arr.length; c++)
		{
			sum += arr[c];
		}
		return sum;
	}
	public static void printArray(int [] arr)
	{
		for(int c = 0; c < arr.length; c++)
		{
			System.out.print(arr[c] + " ");
		}
		System.out.println();
	}
	public static int [] fillArray()
	{
		int [] arr = new int [10];

		Scanner viraj = new Scanner(System.in);

		for(int c = 0; c < arr.length; c++)
		{
			System.out.print("Enter a number, please: ");
				arr[c] = viraj.nextInt();
		}

		return arr;
	}
/*
	Name: Viraj Patel
	Date: 4/26/2016
	Project: Random Array
	File Name: RandomArray.java
	Program Description: This program will output a total sum, maximum, minimum, and the average of 25 different inputed numbers.
*/
import java.util.*;

public class RandomArray
{
	public static void main(String [] args)
	{
		int [] array = new int [25];

		array = fillArray();
			printArray(array);

		System.out.println("The sum of the numbers is: " + getTotal(array));

		System.out.println("The maximum of the numbers in the array is: " + getMax(array));

		System.out.println("The minimum of the numbers in the array is: ");

		System.out.println("The average of the numbers in the array is: ");
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

	{int [] arr = new int[25];

		for (int c = 0;c<arr.length;c++)
		{
			arr[c] = (int)(Math.random()*25)+1;
		}
		return arr;
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
	public static int getMax(int [] arr)
	{
		int max = 0;

		for(int c = 0; c < arr.length; c++)
		{
			max = Math.max(0,arr[c]);
		}
		return max;
	}
}
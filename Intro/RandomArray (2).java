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

		System.out.println("The sum of the numbers is: ");

		System.out.println("The maximum of the numbers in the array is: ");

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
}
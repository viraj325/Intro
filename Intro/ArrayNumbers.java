import java.util.Scanner;
public class ArrayNumbers
{
	public static void main (String [] args)
	{
		int [] array = new int [10];
		array = inputNumbers();
		printArray(array);
		System.out.println( "The total of the numbers is:"+ getTotal(array));
		System.out.println( "The total of the positive numbers is:"+ getPositiveTotal(array));
		System.out.println( "The total of the negative numbers is:"+ getNegativeTotal(array));
	}

	public static int [] inputNumbers()
	{
		Scanner keyboard = new Scanner(System.in);
		int [] arr = new int[10];

		for (int a = 0; a < arr.length; a++)
		{
			System.out.print("Enter a number: ");
			arr[a] = keyboard.nextInt();
		}
		return arr;
	}

	public static void printArray(int [] arr)
	{
		System.out.println("Current  Array Contents:\n\n");
		for (int a = 0; a < arr.length; a++)
		{
			System.out.print(arr[a] + " ");
		}
		System.out.println("\n\n");
	}
	public static int getTotal(int [] arr)
	{
		int sum = 0;
		for (int count = 0; count < arr.length; count++)
		{
			sum += arr[count];
		}
		return sum;

	}
	public static int getPositiveTotal(int [] arr)
		{
			int sum = 0;
			for (int count = 0; count < arr.length; count++)
			{
				if(arr[count]>0)
				sum += arr[count];
			}
			return sum;

		}

	public static int getNegativeTotal(int [] arr)
		{
			int sum = 0;
			for (int count = 0; count < arr.length; count++)
			{
				if(arr[count]<0)
				sum += arr[count];
			}
			return sum;

		}
}
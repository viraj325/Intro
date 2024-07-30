public class MethodDemoRectangle
{
	public static void main (String [] args)
	{

printRectangle(3,5);
System.out.println(getSum(6));

	}

	public static void printRectangle(int r, int c)
	{
		for (int x = 1; x <= r; x++)
		{
			for (int y = 1; y <= c; y++)
				System.out.print("$");
			System.out.println();
		}
	}

	public static int getSum(int x)
	{
		int sum = 0;
		for (int i = 1; i <= x; i++)
			sum += i;
		return sum;



	}
}

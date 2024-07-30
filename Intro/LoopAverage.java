import java.util.Scanner;

public class LoopAverage
{
	public static void main (String [] args)
	{
		Scanner keyboard = new Scanner (System.in);

		int input = 1;
		int sum = 0;
		int count = 0;
		while ( input >= 0)
		{
			 System.out.print("Enter a non-negative number or a negative to quit: ");
			 input = keyboard.nextInt();

			 if ( input >= 0)
			 {
			 	sum += input;
			 	count++;
			}
		 }
		 System.out.println(sum);
		 System.out.println(count);
		 double avg = (double) sum / count;
		 System.out.println(avg);
	 }
 }

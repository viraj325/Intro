import java.util.*;
public class VowelSensor
{
	public static void main (String [] args)
	{

		Scanner keyboard = new Scanner (System.in);

		String word;
		String newWord = "";
		char letter = 'x';

		System.out.print("Enter a word: ");
		word = keyboard.nextLine();

		word = word.toLowerCase();

		for(int c = 0; c< word.length(); c++)
		{
			letter = word.charAt(c);
			if(letter =='a' || letter =='o'|| letter =='i' || letter == 'e'|| letter =='u')
			{
				newWord += "*";
			}
			else
			{
				newWord += letter;
			}
		}

		System.out.println(newWord);
	}
}
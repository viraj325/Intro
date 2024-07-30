import java.util.*;
public class Vowells
{
	public static void main (String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String word;
		String output = "";
		char letter;
		System.out.print("Enter a word: ");
		word = keyboard.nextLine();

		for (int i = 0; i < word.length() ;i++)
		{
			letter = word.charAt(i);
			if (letter=='a' || letter == 'e' || letter == 'i' ||letter == 'o' || letter == 'u')
			{
				output += "*";
			}
			else
			{
				output += letter;
			}
		}
		System.out.println(output);
	}
}


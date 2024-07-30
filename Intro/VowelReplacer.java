import java.util.*;

public class VowelReplacer
{
	public static void main (String [] args)
	{
		String word;
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Please enter a word: ");
		word = keyboard.nextLine();

		String newWord = "";
		char letter = 'x';

		for(int c = 0; c < word.length(); c++)
		{
			letter = word.charAt(c);
			if (letter == 'a'|| letter == 'e' || letter == 'i' || letter =='o' || letter == 'u')
			{
				newWord += "*";
			}
			else
			{
				newWord += letter;
			}
		}
			System.out.println (newWord);

	}
}
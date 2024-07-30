import java.util.*;

public class stars
{
	public static void main(String [] args)
	{
		Scanner viraj = new Scanner(System.in);

			String word;
			String newWord = "";
			char letter = 'a';

		System.out.println("Enter a word PLZZZZZZZ: ");
			word = viraj.nextLine();
			word = word.toLowerCase(); //You can also do upper case with toUppercase.

		for(int x = 0;x < word.length(); x++)
		{
			letter = word.charAt(x);
			if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')
			{
				newWord += "*";
			}
			else
			{
				newWord += letter;
			}
		}

		System.out.println("Output: " + newWord);
	}
}
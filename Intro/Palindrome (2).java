/*
		Name- Viraj Patel
		Date- 4/13/2016
		Project- Palindrome
		File Name- Palindrome.java
		Program Description- This program checks if the input by the user is a palindrome or not.
*/


import java.util.*;

public class Palindrome
{
	public static void main(String [] args)
	{
		Scanner viraj = new Scanner(System.in);

			String newWord = "";
			char letter = 'a';

		System.out.println("Enter a word please: ");
			String word = viraj.nextLine();

			word = word.toLowerCase();

			int blah = word.length();

	for(int x = blah; x > 0; x--)
			{
				letter = word.charAt(x - 1);
				newWord += letter;
			}
				if(newWord.equals(word))
				{
					System.out.println(newWord + " ,this is a palindrome!");
				}
				else
				{
					System.out.println(word + " ,this is not a palindrome!");
				}
	}
}
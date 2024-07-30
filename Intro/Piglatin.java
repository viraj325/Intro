import java.util.*;

public class Piglatin
{
	public static void main(String [] args)
	{
		Scanner viraj = new Scanner(System.in);

			char letter = 'a';

					System.out.println("Enter a word to translate to piglatin: ");
						String word = viraj.nextLine();
						word=word.toLowerCase();
						String newWord = "";

								String yay = "yay";
								String ay = "ay";
								int count = 0;

								letter = word.charAt(count);
							if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')
								{
									System.out.println(word + " translated in Piglatin is " + word + yay);
								}
							else

								{
								do
							{
								letter = word.charAt(count);
									newWord = word.substring(count);

								newWord += word.substring(0,count);
									newWord += ay;

								count++;
							}
								while(letter != 'a' && letter != 'e' && letter != 'i' && letter != 'o' && letter != 'u');

								System.out.println(word + " translated in Piglatin is " + newWord);
										}
	}
}
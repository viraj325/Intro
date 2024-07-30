/*
	Name: Viraj Patel
	Date: 4/26/2016
	Project: Initials
	File Name: Initials.java
	Program Description: This program will take the name that is entered by the user and print out its initials.
*/
import java.util.*;

public class Initials
{
	public static void main(String [] args)
	{
		Scanner viraj = new Scanner(System.in);

		System.out.print("Input your name with one space between each name: ");
			String name = viraj.nextLine();

		int x = name.indexOf(' ');

		int y = name.indexOf(' ', x + 1);

		char b = name.charAt(0);

		char a = name.charAt(x + 1);

		char c = name.charAt(y + 1);

		String w = name.substring(0,1);

		String l = name.substring(x,x+1);

		System.out.print(b+a+c);

		System.out.print(w);
		System.out.print(l);
	}
}
/*
	Programmer-Viraj Patel
	Date-3/10/2016
	Project-Multiplication Table
	File Name-MultiplicationTable.java
	Description-This program will print out the multiplication table.
*/

import java.util.*;

public class MultiplicationTable
{
	public static void main(String [] args)
	{
		   Scanner viraj = new Scanner(System.in);

				int total= 0;

		    	int idk = -1;

		   System.out.println("\t\t\t Viraj's Great and Special Multiplication Table");

		   System.out.println(" ");

		   System.out.println("\t0 \t1 \t2 \t3 \t4 \t5 \t6 \t7 \t8 \t9");

		   for(int row= 0; row <= 9; row++)
		     {
		       idk++;

		       System.out.print(idk);

		       for(int col= 0; col <= 9; col++)
		     {
		      	 total=row * col;

		      	System.out.print("\t" +total );
			 }

   		 System.out.println();
	 }
	}
}
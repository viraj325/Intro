/*
	Name- Viraj Patel
	Date- 2/10/2016
	Project- Grades
	File Name- Grades.java
	Description- This program will output the grades.
*/

import java.util.*;

public class Grades
{
	public static void main(String [] args)
	{
		Scanner viraj = new Scanner (System.in);

		System.out.println("Please enter the name of your class: ");
			String class = viraj.nextLine();

		System.out.println("Please enter your 1st Test Score: ");
			double test1 = viraj.nextDouble();

		System.out.println("Please enter your 2nd Test Score: ");
			double test2 = viraj.nextDouble();

		System.out.println("Please enter your 3rd Test Score: ");
			double test3 = viraj.nextDouble();

			double grade;
				grade = grade/3;
				char letterGrade = 'X';

		System.out.println("Class average = " + grade + "%");
		if(grade >= 90 && grade <= 100)
		{
			letterGrade = 'A';
		}
		else if (grade >= 80 && grade <= 89)
		{
			letterGrade = 'B';
		}
		else if (grade >= 70 && grade <= 79)
		{
			letterGrade = 'C';
		}
	}
}
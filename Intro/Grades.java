import java.util.*;

public class Grades
{
	public static void main(String [] args)
		{

		Scanner viraj = new Scanner (System.in);
			System.out.println("Please input your class: ");
	String className = viraj.nextLine();
			System.out.println("Please enter your 1st Test score: ");
	double test1 = viraj.nextDouble();
			System.out.println("Please enter your 2nd Test score: ");
	double test2 = viraj.nextDouble();
			System.out.println("Please enter your 3rd Test score: ");
	double test3 = viraj.nextDouble();
	double total = test1 + test2 + test3;
		total = total/3;
		total = (int)(total*10+.5)/10.0;
		char letterGrade = 'X';
	System.out.println("Class average = "+total+"%");
		if (total >= 90 && total<=100)
		{
			letterGrade = 'A';
		}
		else if (total >= 80 && total <= 89)
		{
		letterGrade = 'B';
		}
		else if (total >= 70 && total <= 79)
				{
				letterGrade = 'C';
		}
		else if (total >= 60 && total <= 69)
				{
				letterGrade = 'D';
		}
		else if (total < 60)
			{
			letterGrade = 'F';
		}
System.out.println("your grade in "+className+" is a "+letterGrade);
}
}
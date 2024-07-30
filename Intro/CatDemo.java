/*
	Name- Viraj Patel
	Date- 5/2/2016
	File Name- CatDemo.java
	Program- CatDemo
	Program Description- This program will print out Shane's and Javi's favorite food.
*/

public class CatDemo
{
	public static void main(String [] args)
	{
		Cat javi = new Cat("Javi","Lasagna");

		System.out.println(javi.getName() + "'s favorite food is " + javi.getFood() + "!");

		Cat shane = new Cat("Shane","Fruit Salad");

		System.out.println(shane.getName() + "'s favorite food is " + shane.getFood() + "!");
	}
}
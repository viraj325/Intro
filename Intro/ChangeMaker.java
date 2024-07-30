


public class ChangeMaker
{
	public static void main(String [] args)
	{
		int cents = 65;
		int quarters = cents / 25;
		int remainder = cents % 25;

		int dime = remainder / 10;
		remainder = remainder % 10;

		int nickel = remainder / 5;
		int penny = remainder % 5;

		System.out.println("Amount = " + cents);
		System.out.println("Quarters = " + quarters);
		System.out.println("Dimes = " + dime);
		System.out.println("Nickels = " + nickel);
		System.out.println("Pennies = " + penny);
		/*delete this line 24 after thee code is done!! */
		System.out.println(remainder);
	}
}
public class DogDemo
{
	public static void main(String[] args)
	{
		Dog rover = new Dog("Rover", 25);

		System.out.println("My Dog Info:");
		System.out.println("Name: " + rover.getName());
		System.out.println("Size: " + rover.getSize()+ " pounds");
		System.out.println();
		System.out.println();
		System.out.println("Listen to " + rover.getName() + " speak:");
		for (int cnt = 1; cnt <= 5; cnt++)
			{
				System.out.println(rover.getBark());
			}

		System.out.println();
		System.out.println();
		System.out.println("See how happy " + rover.getName() + " is:");
		rover.wag(10);

		System.out.println();
		System.out.println();

		Dog mitzi = new Dog("Mitzi", 3);

		System.out.println("My Dog Info:");
		System.out.println("Name: " + mitzi.getName());
		System.out.println("Size: " + mitzi.getSize()+ " pounds");
		System.out.println();
		System.out.println();
		System.out.println("Listen to " + mitzi.getName() + " speak:");
		for (int cnt = 1; cnt <= 5; cnt++)
			{
				System.out.println(mitzi.getBark());
			}

		System.out.println();
		System.out.println();
		System.out.println("See how happy " + mitzi.getName() + " is:");
			mitzi.wag(6);

		System.out.println();
		System.out.println();

		Dog spot= new Dog("Spot", 10);

				System.out.println("My Dog Info:");
				System.out.println("Name: " + spot.getName());
				System.out.println("Size: " + spot.getSize()+ " pounds");
				System.out.println();
				System.out.println();
				System.out.println("Listen to " + spot.getName() + " speak:");
				for (int cnt = 1; cnt <= 3; cnt++)
					{
						System.out.println(spot.getBark());
					}

				System.out.println();
				System.out.println();
				System.out.println("See how happy " + spot.getName() + " is:");
			spot.wag(8);
		System.out.println("Thank you for demo-ing the Dog class!!");
	}
}
public class Dog
{
	private  String name;
	private  int size;

	public  Dog (String name, int sz)
	{
		this.name = name;
		size = sz;
	}

	public  String getName()
	{
		return name;
	}

	public  int getSize()
	{
		return  size ;
	}

	public String getBark()
	{
		if (size <= 3)
			return "yip";
		else if (size <= 15)
			return "wuf";
				else
			return "WOOOOOOF!";
	}

	public  void wag(int count)
	{
		for (int c = 1; c <= count; c++)
			System.out.println ("wag");
	}
}
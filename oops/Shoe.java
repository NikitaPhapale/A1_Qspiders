class Shoe
{
	String brand="Nike";
	double price;
	int size;
	String color;
	String type;

	{
		System.out.println("Object Loading");
		if(brand.charAt(0)=='N')
		{
			price=1000.0;
		}
		else
		{
			price=500.0;
		}
	}
	Shoe()
	{
		System.out.println("No argument Constructor");

	}
	Shoe(double price,int size,String color,String type)
	{
		System.out.println("Parameterized Constructor");
		this.price=price;
		this.size=size;
		this.color=color;
		this.type=type;
	}
	public void displayDetails()
	{
		System.out.println(brand);
		System.out.println(price);
		System.out.println(size);
		System.out.println(color);
		System.out.println(type);
												
	}
}

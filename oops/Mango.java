class Mango 
{
	String type;
	String origin;
	double price;

	public Mango printType()
	{
		System.out.println(type);// print when we call method
		return this;//reference of object of class Mango...print when we print method
	}
	public Mango printOrigin()
	{
		System.out.println(origin);
		return this;
	}
	public Mango printPrice()
	{
		System.out.println(price);
		return this;
	}
}

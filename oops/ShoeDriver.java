class ShoeDriver 
{
	public static void main(String[] args) 
	{
		Shoe s1=new Shoe();
		s1.displayDetails();
		System.out.println("******************");
		
		Shoe s2=new Shoe(3000.32,9,"black","Sports");
		s2.displayDetails();

	}
}

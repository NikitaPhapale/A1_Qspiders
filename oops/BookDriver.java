class BookDriver 
{
	public static void main(String[] args) 
	{
		Book b1=new Book();
		System.out.println(b1);
		b1.brand="Classmate";
		b1.price=50.0;
		b1.noOfPages=100;
		b1.wt=100;
		b1.type="Long Note";
		b1.bound="Soft Bound";
		System.out.println("Brand:"+b1.brand);
		System.out.println("Price:"+b1.price);
		System.out.println("Pages:"+b1.noOfPages);
		System.out.println("wt:"+b1.wt);
		System.out.println("type:"+b1.type);
		System.out.println("bound:"+b1.bound);
		System.out.println("*********************");

		Book b2=new Book();
		System.out.println(b2);
		System.out.println("Brand:"+b2.brand);
		System.out.println("Price:"+b2.price);
		System.out.println("Pages:"+b2.noOfPages);
		System.out.println("wt:"+b2.wt);
		System.out.println("type:"+b2.type);
		System.out.println("bound:"+b2.bound);

	}
}

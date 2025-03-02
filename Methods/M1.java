class M1 
{
	public static void main(String[] args) 
	{
		m1(10,(byte)20);
		int i=10;
		i++;
		System.out.println(i);
		++i;
		System.out.println(i);
		
	}
	public static void m1(int a,byte b)
	{
		System.out.println("Hii from int and byte");

	}
	public static void m1(int a,int b)
	{
		System.out.println("Hii from int and int");
	}

}

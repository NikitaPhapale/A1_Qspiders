class EvenOddWithoutMod 
{
	public static void main(String[] args) 
	{
		System.out.println(evenOdd(9));
	}
	public static String evenOdd(int num)
	{
		if((num/2)*2==num)
			return "Even";
		return "Odd";
	}
}

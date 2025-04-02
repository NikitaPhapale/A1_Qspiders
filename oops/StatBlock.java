class StatBlock 
{
	static double d;
	static
	{
		d=test(100);
		System.out.println(d);
		d=test(d)+demo((int)d);
	    //System.out.println(StatBlock.d);
		double d=demo((int)test(StatBlock.d));
		System.out.println(d);
	}
	public static void main(String[] args) 
	{
		System.out.println(d);
		System.out.println(test(d));
		System.out.println((int)demo((int)d));
	}
	public static double test(double num)
	{
		return num*num;
	}
	public static char demo(int num)
	{
		return (char)num;
	}
}

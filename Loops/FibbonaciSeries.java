class FibbonaciSeries 
{
	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		int range=10;
		System.out.println(a);//0
		System.out.println(b);//1
		
		for(int i=2;i<=range;i++)
		{
		
			int next=a+b;//1 2 3 5 8 13 21 34 55
			a=b;//1 1 2 3 5 8 13 21 34
			b=next;//1 2 3 5 8 13 21 34 55
			System.out.println(next);
			//System.out.println(a);
			//System.out.println(b);

			
		}
	}
}

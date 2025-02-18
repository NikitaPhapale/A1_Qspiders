class Pattern27 
{
	public static void main(String[] args) 
	{
		
		int a=4;
		int sum=1;
		for(int i=1;i<=4;i++)
		{   sum=i;
			for(int j=1;j<=4;j++)
			{
				
				System.out.print(sum+" ");
				sum+=a;

			}
			System.out.println();
		}
	}
}

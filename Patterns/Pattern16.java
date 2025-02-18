
class Pattern16 
{
	public static void main(String[] args) 
	{
	
		int b=1;
		for(int i=1;i<=5;i++)
		{
			int a=4;
			b=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(b+" ");
				b+=a;
				a--;
				
			}
			
			System.out.println();
		}
	}
}

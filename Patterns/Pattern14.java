 
class Pattern14
{
	public static void main(String[] args) 
	{
		int k=0;
	int n=5;
	for(int i=1;i<=5;i++)
		{
			
			for(int j=1,a=k+i;j<=i;j++,a--)
			{
				System.out.print(a+" ");
				
			}
		     k+=i;

			System.out.println();
		}
	}
}

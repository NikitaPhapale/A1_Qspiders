//
class Pattern15
{
	public static void main(String[] args) 
	{
		
		int evenDiff=9;
		int oddDiff=-2;
		for(int i=1;i<=5;i++)
		{
			System.out.print(i+" ");
			int temp=i;      
			for(int j=2;j<=i;j++)
			{
				
				if(j%2==0)
				{
					
					temp+=evenDiff;
					System.out.print(temp+" ");
					
				}
				else
				{
					temp+=oddDiff;
					System.out.print(temp+" ");
					
				}
			}
			System.out.println();
			evenDiff-=2;
			oddDiff+=2;
		}
		
	
	}
}

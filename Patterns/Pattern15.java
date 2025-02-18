//
class Pattern15
{
	public static void main(String[] args) 
	{
		int b=1;
		
		for(int i=1;i<=5;i++)
		{
			int a=5;
			int c=2;
			b=i;      
			//          1<=2  2
			for(int j=1;j<=i;j++)
			{
				
				if(j%2!=0)//1%2!=0
				{
					
					System.out.print(b+" ");//2
					b+=c;//b=4
					c+=2;//4
				}
				else
				{
					b+=a;//
					System.out.print(b+" ");
					
					a-=2;
					
				}
			}
			System.out.println();
		}
		
	
	}
}

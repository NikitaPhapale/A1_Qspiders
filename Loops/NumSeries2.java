//2 6 22 278 65814
//
class NumSeries2 
{
	public static void main(String[] args) 
	{
		/*int pow=1;
		for (int i=2,j=2;i<=256 ;i=pow)
		{
			
			pow=i*i;
			//System.out.println(pow);
			
			//System.out.println(pow+j);
			j+=pow;
			System.out.println(j);
		}*/
		int num1=2;
		System.out.print(num1+" ");
		for(int i=2,p=2;i<=5;i++,p*=2)
		{
			int pow =1;
			for(int j=1;j<=p;j++)
			{
				pow*=2;
			}
			System.out.print(pow+num1+" ");
			num1+=pow;
		}
	}
}

import java.util.Scanner;
class MaxRepDigitNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num:");
		long num=sc.nextLong();
		int max=0;
		int rep=0;
		for(int i=0;i<=9;i++)
		{
			int cnt=0;
			for(long j=num;j>0;j/=10)
			{
				long rem=j%10;
				if(rem==i)
					cnt++;
			
			}
			if(cnt>max)		
			{
				max=cnt;
				rep=i;
				 	
			}
		}
		System.out.println("Highest repeated digit :"+rep+" has a frequency:"+max);

	}
}

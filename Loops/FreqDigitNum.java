import java.util.Scanner;
class FreqDigitNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter a num:");
		long num=sc.nextLong();
		for(int i=0;i<=9;i++)
		{
			int cnt=0;
		for(long j=num;j>0;j/=10)
			{
			long rem=j%10;
			if(i==rem)
				cnt++;
			}
			if(cnt!=0)
			{
				System.out.println("Frequency of "+i+" :"+cnt);
			}
			
		}
	}
}

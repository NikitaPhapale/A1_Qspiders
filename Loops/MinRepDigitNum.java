import java.util.Scanner;
class MinRepDigitNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num:");
		long num=sc.nextLong();
		int min=9;
		int rep=0;
		for(int i=0;i<=9;i++)
		{
			int cnt=0;
			for(long j=num;j>0;j/=10)
			{
				long rem=j%10;
				if(rem==i)//we can compare int and long
					cnt++;
			}

			if(cnt<min &&cnt!=0)//beacuse we asign cnt to 0 which is least so it will give output at i=0
			{
				min=cnt;
				rep=i;
			}
		}
				System.out.println("Least repeated digit :"+rep+" has a frequency:"+min);

	}
}

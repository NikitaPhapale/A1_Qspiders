import java.util.Scanner;
class SumOfPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num:");
		int num=sc.nextInt();
		int temp=num;
		boolean flag=true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=false;
			}
		}
		if(flag)
		{
			System.out.println("Prime number it is");
		}
		else
		{
			int sum=0;
			for(int i=2;i<num;i++)
			{
				boolean flag1=true;
				for(int j=2;j<i;j++)
				{
					if(i%j==0)
						flag1=false;
				}
				if(flag1)
				{
					sum+=i;
				
				}
				
				System.out.println(sum);

			}
		}
	}
}

import java.util.Scanner;
class RangeNeonNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int range=sc.nextInt();
		for(int i=1;i<=range;i++)
		{
			if(neon(i))
				System.out.println(i);

		}
		
		
	}
	public static boolean neon(int num)
	{
		int sqr=num*num;
		int sum=0;
		for(int i=sqr;i>0;i/=10)
		{
			sum+=i%10;
		}
		return num==sum;
	}
}

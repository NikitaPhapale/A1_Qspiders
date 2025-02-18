import java.util.Scanner;
class SpyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int num=sc.nextInt();
		int sum=0;
		int product=1;
		for(int i=num;i>0;i/=10)
		{
			int rem=i%10;
			sum+=rem;
			product*=rem;
		}
		System.out.println(sum==product?num+" is a Spy number":num+" is not Spy number");
	}
}

import java.util.Scanner;
class PrimeNumFactors 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num:");
		int cnt=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				cnt++;

			}
		}
		if(cnt==0)
		{
			System.out.println(num+" is a prime number");
			System.out.println("Factorial of prime number "+num+ ":");
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					System.out.println(i);
				}
			}
			
		}
	}
}

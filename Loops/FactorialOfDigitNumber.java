import java.util.Scanner;
class SumFactorialOfDigitNumber 
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int temp=num;
		
		int sum=1;
		while(num>0)
		{
			int fact=1;
			int rem=num%10;
		for(int i=1;i<=rem;i++)
		{
			fact*=i;
		}
		System.out.println("Factorial of Digit:"+rem+":"+fact);
		num/=10;
		
		}
		

	}
}

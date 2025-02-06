import java.util.Scanner;
class SumOfDigitLoop 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number:");
		int num=new Scanner(System.in).nextInt();
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum+=rem;
			num/=10;

		}
		System.out.println(sum);
	}
}

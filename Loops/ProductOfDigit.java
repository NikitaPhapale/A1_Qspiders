import java.util.Scanner;
class ProductOfDigit 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number:");
		int num=new Scanner(System.in).nextInt();
		int product=1;
		while(num>0)
		{
			int rem=num%10;
			product*=rem;
			num/=10;

		}
		System.out.println(product);
	}
}

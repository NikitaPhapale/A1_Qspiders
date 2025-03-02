import java.util.Scanner;
class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter num:");
		int num=sc.nextInt();
		if(reverse(num)==num)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");



	}
	public static int reverse(int num)
	{
		int rev=0;
		for(int i=num;i>0;i/=10)
		{
			rev=rev*10+(i%10);
		}
		return rev;

	}
}

import java.util.Scanner;
class PalindromeNum
{
	public static void main(String[] args) 
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num:");
		int num=sc.nextInt();
		int temp=num;
		int rev=0;
		while(num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		if(temp==rev)
		{
			System.out.println(temp+" is Palindrome Number");
		}
		else
		{	
			System.out.println(temp+" is not a Palindrome Number");
		}
}
}

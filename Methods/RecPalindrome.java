import java.util.Scanner;
class RecPalindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int num=sc.nextInt();
		int temp=num;
		System.out.println(palindrome(num,temp,0));
	}
	public static boolean palindrome(int num,int temp,int rev)
	{
		
		
		if(num==0)
			return temp==rev;
		else
		{
			rev=rev*10+(num%10);
			return palindrome(num/10,temp,rev);
		}
	}
}

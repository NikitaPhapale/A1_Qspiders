import java.util.Scanner;
class PalindromeString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.next().toLowerCase();
		String temp=str;
		String rev="";
		for(int i=0;i<str.length();i++)
		{
			rev=str.charAt(i)+rev;
		}
		if(rev.equals(temp))
		{
			System.out.println(temp+" is Palindrome String");
		}
		else
		{
			System.out.println(temp+" is not a Palindrome String");
		}
	}
}

import java.util.Scanner;
class PalindromeString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.next();
		System.out.println(reverse(str));
		if(str.equals(reverse(str)))
			System.out.println(str+" is Palindrome String");
		else
			System.out.println(str+"  is not Palindrome String");
	}
	public static String reverse(String str)
	{
		String rev="";
		for(int i=0;i<str.length();i++)
		{
			rev=str.charAt(i)+rev;
		}
		return rev;
	
	}
}

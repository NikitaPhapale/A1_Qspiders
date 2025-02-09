import java.util.Scanner;
class ReverseString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		//logic1
		System.out.println("Enter a String1:");
		String str1=sc.next();
		String rev1="";
		for(int i=0;i<str1.length();i++)
		{
			rev1=str1.charAt(i)+rev1;
		}
		System.out.println(rev1);


		//logic2
		System.out.println("Enter a String2:");
		String str2=sc.next();
		String rev2="";
		for(int i=str2.length()-1;i>=0;i--)
		{
			rev2+=str2.charAt(i);
		}
		System.out.println(rev2);


		//logic3
		System.out.println("Enter a String3:");
		String str3=sc.next();
		StringBuffer rev3=new StringBuffer(str3);
		System.out.println(rev3.reverse());		
	}
}

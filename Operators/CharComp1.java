import java.util.Scanner;
class CharComp1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter char:");
		char ch=sc.next().charAt(0);
		System.out.println((ch>=65 && ch<=90 || ch>='a' && ch<='z')?((ch>=97 && ch<=122)?(ch+" is a Lowercase charcter"):(ch+" is an Uppercase charcter")):((ch>='0' && ch<='9')?(ch+" is a Digit"):(ch+"  is a Special character")));

		
	}
}

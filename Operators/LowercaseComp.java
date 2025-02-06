import java.util.Scanner;
class LowercaseComp 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character:");
		char ch=sc.next().charAt(0);
		System.out.println((ch>=97 && ch<=122)?(ch+" is a lowercase character"):(ch+" is not a lowercase character"));
	}
}

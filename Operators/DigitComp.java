import java.util.Scanner;
class DigitComp 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a char:");
		char ch=sc.next().charAt(0);
		System.out.println((ch>=48 && ch<=57)?(ch+" is a digit"):(ch+" is not a digit"));
	}
}

import java.util.Scanner;
class charComp
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter char:");
		char ch=sc.next().charAt(0);
		System.out.println((ch>=65 && ch<=90)?("It is Uppercase char"):("It is not a uppercase char."));//

		
	}
}

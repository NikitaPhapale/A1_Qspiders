import java.util.Scanner;
class NumComp 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num:");
		int num=sc.nextInt();
		System.out.println((num%2==0 && (num%5!=0))?("HiiTwo"):((num%5==0 && (num%2!=0))?("HiiFive"):((num%2==0 || num%5==0)?("HiiTwoHiiFive"):(" "))));
	}
}

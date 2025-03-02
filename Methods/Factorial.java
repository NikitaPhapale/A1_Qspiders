import java.util.Scanner;
class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter num:");
		int num=sc.nextInt();	
		System.out.println(factorial(num));

	}
	public static int factorial(int num)
	{
		int fact=1;
		for(int i=num;i>0;i--)
		{
			fact*=i;
		}
		return fact;
	}
}

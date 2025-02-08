import java.util.Scanner;
class Factorial 
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int temp=num;
		int fact1=1;
		int fact2=1;
		for(int i=1;i<=num;i++)
		{
			fact1*=i;
		}
		System.out.println("Factorial of num:"+temp+":"+fact1);
		for(int i=num;i>=1;i--)
		{
			fact2*=i;
		}
		System.out.println("Factorial of num:"+temp+":"+fact2);



	}
}

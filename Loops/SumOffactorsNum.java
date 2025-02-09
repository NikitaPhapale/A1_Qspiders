import java.util.Scanner;
class SumOffactorsNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num:");
		int num=sc.nextInt();
		System.out.println("Factorial of num"+num+" :");
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println("Sum of factors of num "+num+" :"+sum);
	}
}

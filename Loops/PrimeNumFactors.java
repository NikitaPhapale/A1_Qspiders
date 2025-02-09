import java.util.Scanner;
class PrimeFactors 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num:");
		int num=sc.nextInt();
		System.out.println("Factors of "+num+" :");
		for(int i=1;i<=num;i++)
		{
			System.out.println(i);
		}
	}
}

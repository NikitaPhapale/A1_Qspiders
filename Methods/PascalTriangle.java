import java.util.Scanner;
class PascalTriangle
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter n:");
		int n=sc.nextInt();
		pascaltriangle(n);
	}
	public static void pascaltriangle(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int space=0;space<n-i-1;space++)
				System.out.print(" "+" ");
			for(int star=0;star<=i;star++)
				System.out.print(fact(i)/(fact(star)*fact(i-star))+"   ");
			System.out.println();
		}
			
	}
	public static int fact(int num)
	{
		int fact=1;
		for(int i=num;i>0;i--)
			fact*=i;
		return fact;
	}
}

import java.util.Scanner;
class FloydTriangle 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		floydTriangle(n);
	}
	public static void floydTriangle(int n)
	{
		int count=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(count++ +" ");
			}
			System.out.println();
		}
	}
}

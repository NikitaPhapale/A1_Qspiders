import java.util.Scanner;
class Pattern2 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter n:");
		int n=new Scanner(System.in).nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}

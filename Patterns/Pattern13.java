import java.util.Scanner;
class Pattern13
{
	public static void main(String[] args) 
	{
		System.out.println("Enter n:");
		int n=new Scanner(System.in).nextInt();

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==n/4 || j==n/4 ||i==3*n/4 ||j==3*n/4 ||j==0&&i<=n/4 ||i==0 && j<=n/4 ||i==0&&j>=3*n/4 ||
					j==n-1&& i<=n/4 ||j==n-1&&i>=3*n/4||i==n-1&& j>=3*n/4 ||j==0 &&i>=3*n/4 || i==n-1&& j<=n/4 
					||i==(n-1)/2 &&j==(n-1)/2 ||i==n/4&&j==n/8)
				{
					System.out.print("*"+" ");

				}
				else
				{
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
	}
}

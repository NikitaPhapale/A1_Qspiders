import java.util.Scanner;
class Pattern11 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
				System.out.print(" "+" ");
			for(int k=0;k<n-i;k++)
				System.out.print("*"+" ");
			System.out.println();
	}



		System.out.println("Enter n1:");
		int n1=sc.nextInt();
		for(int i=0;i<n1;i++)
		{
			for (int j=0;j<n1 ;j++ )
			{
			if(j<i)
				System.out.print(" "+" ");
			else
				System.out.print("*"+" ");
		}
			System.out.println();
	}
	}
		
}

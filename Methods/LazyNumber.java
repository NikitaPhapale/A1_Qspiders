import java.util.Scanner;
class LazyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(pieces(n));
	}
	public static int pieces(int n)
	{
		int piece=1;
		
		
		for(int cut=1;cut<=n;cut++)
		{
			piece+=cut;
			
		}
		return piece;
	}

}

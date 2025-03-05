import java.util.Scanner;
class RecurFibo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of terms:");
		int n=sc.nextInt();
		fibbo(n,0,1);
	}
	public static void fibbo(int n,int n1,int n2)
	{
		if(n>0)
		{
		int n3=n1+n2;
		System.out.println(n1);
		fibbo (--n,n2,n3);
		}
		return ;
	}
}

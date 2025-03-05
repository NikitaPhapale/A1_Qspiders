import java.util.Scanner;
class LCM 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n1 and n2:");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println(lcm(n1,n2));

	}
	public static int lcm(int n1,int n2)
	{
		int max=n1>n2?n1:n2;
		for(int i=1;;i++)
		{
			if(max*i%n1==0&&max*i%n2==0)
				return max*i;
		}
	}
}

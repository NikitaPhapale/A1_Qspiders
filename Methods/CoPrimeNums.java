import java.util.Scanner;
class CoPrimeNums 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n1 and n2:");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println(isCoPrime(n1,n2));
	}
	public static boolean isCoPrime(int n1,int n2)
	{
		return hcf(n1,n2)==1;
	}
	public static int hcf(int n1,int n2)
	{
		int min=n1<n2?n1:n2;
		while(true)
		{
			if(n1%min==0 && n2%min==0)
				return min;
			min--;
		}
	}
}

import java.util.Scanner;
class PythagoreanTriplets
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n1,n2,n3:");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		System.out.println(isTriplets(n1,n2,n3));
	}
	public static boolean isTriplets(int n1,int n2,int n3)
	{
		return n1*n1+n2*n2==n3*n3;
	}

}

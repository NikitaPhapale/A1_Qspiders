import java.util.Scanner;
class TwinPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n1 and n2:");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println(isTwinPrime(n1,n2));

	}
	public static boolean isTwinPrime(int n1,int n2)
	{
		if(Math.abs(n1-n2)==2 && isPrime(n1) && isPrime(n2))
		{
				return true;
			
		}
		return false;
	}
	public static boolean isPrime(int num)
	{
		if(num==1)
			return false;
		int den=2;
		for(;den<num;den++)
		{
			if(num%2==0)
				return false;
		}
		return true;
	}
}

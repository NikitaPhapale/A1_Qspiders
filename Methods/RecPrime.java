import java.util.Scanner;
class RecPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int num=sc.nextInt();
		System.out.println(isPrime(num,2));

	}
	public static boolean isPrime(int num,int den)
	{
	
		if(num==den)
			return true;
		else if(num%den==0)
			return false;
		return isPrime(num,++den);
	}
}

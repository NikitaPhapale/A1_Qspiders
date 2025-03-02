import java.util.Scanner;
class EmirpNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int num=sc.nextInt();
		if(isPrime(num) && isPrime(reverse(num)))
			System.out.println(num+ " Emirp num");
		else
			System.out.println(num+ " Not Emirp num");


	}
	public static boolean isPrime(int num)
	{
		int i=2;
		for( ;i<num;i++)
		{
			if(num%i==0)
				break;
		}
		return i==num;
	}
	public static int reverse(int num)
	{
		int rev=0;
		for(int i=num;i>0;i/=10)
		{
			rev=rev*10+(i%10);
		}
		return rev;
	}
}

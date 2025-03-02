import java.util.Scanner;
class PrimeRotateNum
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int num=sc.nextInt();
		if(isPrime(num))
			System.out.println(num+" is prime ");
		else
			System.out.println(num+" is not prime");
		int rot=rotate(num);
		
		while(rot!=num)
		{
			
			if(isPrime(rot))
				System.out.println(rot+" is a prime ");
			else
				System.out.println(rot+" is not prime");
			rot=rotate(rot);

		}
		//System.out.println(rot);

	}
	public static int rotate(int num)
	{
		int last=num%10;
		num/=10;
		int ct=count(num);
		return last*power(10,ct)+num;

	}
	public static int power(int num,int ct)
	{
		int pow=1;
		for(int i=1;i<=ct;i++)
			pow*=num;
		return pow;
	}
	public static int count(int num)
	{
		int ct=0;
		for(int i=num;i>0;i/=10)
			ct++;
		return ct;
	}
	public static boolean isPrime(int num)
	{
		int i=2;
		for (;i<num ;i++ )
		{
			if(num%i==0)
				return false;
		}
		return true;
	}

}

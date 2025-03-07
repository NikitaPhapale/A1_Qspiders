import java.util.Scanner;
class SmithNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int num=sc.nextInt();
		System.out.println(isSmith(num));
	}
	public static boolean isSmith(int num)
	{
		if(!isPrime(num))
			return sumOfDigit(num)==primeFactors(num);;
		return false;
		
	}
	
	public static int primeFactors(int num)
	{
		int sum=0;
		for(int i=2;i<=num;i++)
		{
		//in below loop we are taking prime factors and if we got any then it will be addinng repaetedly so that why we are using while loop 	
        while (num % i == 0) 
			{  
            sum += sumOfDigit(i); 
            num /= i;  
			 }
		  }
		return sum;
	}
	public static int sumOfDigit(int num)
	{
		int sum=0;
		while(num>0)
		{
			sum+=num%10;
			num/=10;
			
		}
		return sum;
	}
	public static boolean isPrime(int num)
	{
		if (num==1)
		{
			return false;
		}
		int den=2;
		for (;den<num ;den++ )
		{
			if(num%den==0)
				return false;
		}
		return true;
	}
}

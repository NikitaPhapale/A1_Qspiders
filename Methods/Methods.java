class Methods 
{
	public static void prime(int num)
	{
		boolean flag=true;
		if(num<2)
			flag=false;
		for (int i=2;i<num ;i++ )
		{
			if(num%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag )
			System.out.println(num+" is a prime number");
		else
			System.out.println(num+" is not prime number");
	}

	public static void power(int num,int pow)
	{
		
		int op=1;
		for(int i=1;i<=pow;i++)
		{
			op*=num;
		}
		System.out.println(pow+" power of "+num+" :"+op);
	}

	public static void factorial(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		System.out.println(num+" has factorial: "+fact);
	}

	public static void sumOfDigit(int num)
	{
		int sum=0;
		for(int i=num;i>0;i/=10)
		{
			sum+=i%10;
		}
		System.out.println("Sum of digit of num "+num+": "+sum);
	}

	public static void productOfDigit(int num)
	{
		int product=1;
		for(int i=num;i>0;i/=10)
		{
			product*=i%10;
		}
		System.out.println("Product of digit of num "+num+": "+product);
	}


	public static void reverse(int num)
	{
		int rev=0;
		for(int i=num;i>0;i/=10)
		{
			int rem=i%10;
			rev=(rev*10)+rem;
		}
		System.out.println("reverse of num "+num+": "+rev);
	}


	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		prime(2);
		power(2,5);
		factorial(5);
		sumOfDigit(12345);
		productOfDigit(123);
		reverse(123);
	}
}

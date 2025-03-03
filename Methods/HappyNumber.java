import java.util.Scanner;
class HappyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int range=sc.nextInt();
		for(int i=1;i<=range;i++)
		{
			if(isHappy(i))
				System.out.println(i);
		}

	}
	public static boolean isHappy(int num)
	{
		int sum=sumOfSqOfDigit(num);
		while(sum!=4 && sum!=1)
		{
			sum=sumOfSqOfDigit(sum);
		}
		return sum==1?true:false;
	}
	public static int sumOfSqOfDigit(int num)
	{
		int sum=0;
		for(int i=num;i>0;i/=10)
		{
			sum+=(i%10)*(i%10);
		}
		return sum;
	}
}

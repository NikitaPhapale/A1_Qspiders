import java.util.Scanner;
class RecuStrongNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int num=sc.nextInt();
		int temp=num;
		System.out.println(sumOfDigit(num,temp,0));
	}
	public static boolean sumOfDigit(int num,int temp,int sum)
	{
		return num==0?temp==sum:sumOfDigit(num/10,temp,sum+fact(num%10));
	}

	public static int fact(int num)
	{
		return num==0?1:num*fact(num-1);
	}
}

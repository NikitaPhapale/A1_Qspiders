import java.util.Scanner;
class RecSumOfDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int num=sc.nextInt();
		System.out.println(sumOfDigit(num,0));
	}
	public static int sumOfDigit(int num,int sum)
	{
		return num==0?sum:sumOfDigit(num/10,sum+(num%10));
	}
}

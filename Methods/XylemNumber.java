import java.util.Scanner;
class XylemNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int num=sc.nextInt();
		System.out.println(isXylem(num));
	}
	public static boolean isXylem(int num)
	{
		
		int sumMid=0;
		int sumExt=num%10;
		num/=10;
		while(num>9)
		{
			sumMid+=num%10;
			num/=10;
		}
		sumExt+=num;
		return sumMid==sumExt;
	}
}

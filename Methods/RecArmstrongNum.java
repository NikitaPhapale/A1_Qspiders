import java.util.Scanner;
class RecArmstrongNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int num=sc.nextInt();
		int temp=num;
		System.out.println(sumOfDigit(num,temp,0));
	}
	public static int count(int num,int ct)
	{
		return num==0?ct:count(num/10,++ct);
	}
	public static int power(int base,int raise)
	{
		return raise==0?1:base*power(base,raise-1);
	}
	public static boolean sumOfDigit(int num,int temp,int sum)
	{
		return num==0?sum==temp:sumOfDigit(num/10,temp,sum+power(num%10,count(temp,0)));
	}
}

import java.util.Scanner;
class MysteryNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int num=sc.nextInt();
		System.out.println(isMystery(num));
	}
	public static boolean isMystery(int num)
	{
		int i=1;
		while(i<num)
		{
			if( i+reverse(i)==num)		
			   return true;		
			i++;
		}
		return false;
		
		
	}
	public static int reverse(int num)
	{
		int rev=0;
		while(num>0)
		{
			rev=(rev*10)+num%10;
			num/=10;
		}
		return rev;
	}
}

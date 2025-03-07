import java.util.Scanner;
class BouncyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter num:");
		int num=sc.nextInt();
		System.out.println(isBouncy(num));

	}
	public static boolean isBouncy(int num)
	{
		boolean inc=false,dec=false;
		int last=num%10;
		num/=10;
		int secondLast=num%10;
		while(num>0)
		{
			if(last<secondLast)
				inc=true;
			else if(last>secondLast)
				dec=true;
			last=secondLast;
			num/=10;
			secondLast=num%10;
		
		}
		if(inc && dec)
			return true;
		return false;
		
	}
}

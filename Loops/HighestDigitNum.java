import java.util.Scanner;
class HighestDigitNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num:");
		int num=sc.nextInt();
		int temp=num;
		int max=0;
		while(num>0)
		{
			int rem=num%10;
			if(rem>max)
			{
				max=rem;
			}
			num/=10;
		}
		System.out.println("Max digit of num "+temp+":"+max);
		
		
	}
}

import java.util.Scanner;
class SumOfOddDigitFactorial 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a  number:");
		int num=sc.nextInt();
		int tem=num;
		
		int oddSum=0;
		
		while(num>0)
		{
			int rem=num%10;

			int fact=1;
			if(rem%2!=0)
			{
				for(int i=rem;i>=1;i--)
				{
					fact*=i;
				}
				oddSum+=fact;
				System.out.println("Odd digit:"+rem+"factorial is:"+fact);
				
			}
			
			num/=10;
		}
		System.out.println("Number is:"+tem);
		System.out.println("Odd digit factorial sum:"+ oddSum);
		
	}
}

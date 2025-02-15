import java.util.Scanner;
class TechNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int div=1;
		int len=0;
		for(int i=num;i>0;i/=10)
			len++;
		if(len%2==0)
		{
			//divisor
		
			for(int i=1;i<=(len/2);i++)
				div*=10;
			
			int lh=num/div;
			int rh=num%div;
			int sum=lh+rh;
			int sqr=sum*sum;
			System.out.println(sqr==num?num+" is Tech Number":num+" is not a Tech number");
		}
		else
		{
			System.out.println(num+ " is not a Tech number");
		}
	}
}

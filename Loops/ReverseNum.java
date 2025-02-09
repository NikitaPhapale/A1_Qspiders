import java.util.Scanner;
class ReverseNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num:");
		int num=sc.nextInt();//123
		//
		int rev=0;
			//   i=123;123>0 12>0  1>0;i=12 i=1
		for(int i=num;i>0;i/=10)
		{
			int rem=i%10;//123%10=3  12%10=2   1%10=1

			rev=(rev*10)+rem;//0*10+3=3   3*10+2=32   32*10+1=321
		}
		System.out.println(rev);

	
		System.out.println("Enter a num1:");
		int num1=sc.nextInt();
		int rev1=0;
		while(num1>0)
		{
			int rem=num1%10;
			rev1=(rev1*10)+rem;
			num1/=10;
		}
		System.out.println(rev1);
		
	}
}

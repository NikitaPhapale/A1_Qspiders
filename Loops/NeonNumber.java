import java.util.Scanner;
class NeonNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter num:");   
		int num=sc.nextInt();
		int sqr=num*num;
		int sum=0;
		for(int i=sqr;i>0;i/=10)
		{
			int rem=i%10;
			sum+=rem;

		}
		if(sum==num)
			System.out.println(num+" is NeonNumber");
		else
			System.out.println(num+" is not NeonNumber");

	}
}

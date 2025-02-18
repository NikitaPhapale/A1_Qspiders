import java.util.Scanner;
class SunnyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int num=sc.nextInt();
		 num+=1;
		int sqr=1;
		boolean flag=false;
		for(int i=1;i<=num;i++)
		{
			
			if(i*i==num)
			{
				flag=true;
				System.out.println(num+" has perfect square ...so  "+num+" is Sunny number");
			}
			if(i*i>num)
				break;
				
		}
		if(!flag)
		{
			System.out.println(num+" is not Sunny number");
		}

	}
}

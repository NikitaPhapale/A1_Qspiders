import java.util.Scanner;
class SunnyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int num=sc.nextInt();
		int num+=1;
		int sqr=1;
		boolean flag=false;
		for(int i=1;i<=num;i++)
		{
			
			if(i*i==num)
			{
				fag=true;
				System.out.println("perfect square");
			}
			if(i*i>num)
				break;
				
		}

	}
}

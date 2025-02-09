import java.util.Scanner;
class Sqrt 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num:");
		int num=sc.nextInt();
		boolean flag=false;//means num doesnot have perfect sqrt
		
	for(int i=1;i<=num;i++)
		{
		if(i*i==num)
			{
				flag=true;///means num has perfect sqrt
				System.out.println(i+" is a a perfect sqrt for "+ num);
			}
			if(i*i>num)//means eg num=16 and i=5 so why we will check for 5*5=25 it is waste of memory so break loop
				break;
		}
		if(!flag)
		{
			System.out.println(num+" is not having a perfect sqrt");
		}
		
	}
}

import java.util.Scanner;
class PrimeInRange 
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a start:");
		int start=sc.nextInt();
		System.out.println("Enter a end:");
		int end=sc.nextInt();

		for(int i=start;i<=end;i++)
		{
			boolean flag=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=false;
				}
			}
			if(flag && i>1)
			{

				System.out.println(i);
			}
		}
	}
}

import java.util.Scanner;
class MakeNumPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num:");
		int num=sc.nextInt();
        int temp=num;
		int cnt=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
				cnt++;
		}
		if(cnt==0)
		{
			System.out.println(num+" is a prime number");

		}
		else
		{
			int cnt1=0;
			int nextP=0;
			
			for(int i=num+1; ;i++)
			{

			for(int j=2;j<i;j++)
			{
				if(i%j==0)
					cnt1++;	
			}
				if(cnt1==0)
				{
					nextP=i;
					break;
				}else{
					i=2;
					num++;	
				}
			}
	//	temp+=(nextP-temp);
		System.out.println(temp);
		System.out.println(nextP);
		
		}

	}
}

import java.util.Scanner;
class NumEx 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num:");
		int num=sc.nextInt();
		int temp=num;
		int cnt=0;
		while(num>0)
		{
			int rem=num%10;
			cnt++;
			num/=10;
		}


		
		if(cnt%2==0)
		{
			int ans=0;
			while(temp>0)
			{
				
			int rem=temp%10;//1234%10=4   123%10=3  12%10=2  1%10=1
			if(rem%2!=0)
				{
				rem++;//4(3)  2(1)
				}
			ans=ans*10+rem;//0*10+4=4   4*10+4=44  44*10+2=442  442*10+2=4422
			temp/=10;//1234/10=123   123/10=12   12/10=1
			}
			int rev=0;
			while(ans>0)
				{
					int rem1=ans%10;//4422%10=2   442%10=2 44%10=4 4%10=4
					rev=rev*10+rem1;//0*10+2=2   2*10+2=22 22*10+4=224 224*10+4=2244
					ans/=10;//4422/10=442  442/10=44 44/10=4
				}
				System.out.print(rev);//2244	
			
		}
		else
		{
			int ans=0;
			while(temp>0)
			{
				
			int rem=temp%10;
			if(rem%2==0)
				{
				rem++;
				}
			ans=ans*10+rem;
			temp/=10;
			}
			int rev=0;
			while(ans>0)
				{
					int rem1=ans%10;
					rev=rev*10+rem1;
					ans/=10;
				}
				System.out.print(rev);
		}
	}
}

import java.util.Scanner;
class GoodPrimeNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a range:");
		int range=sc.nextInt();//10
		int cnt=0;
		//      i=3
		//      i=2
		//      i=1 1<=10
		for(int i=1;i<=range;i++)
		{
			boolean flag=true;//2
			//         ;2<3(true) 3<3(false)  ;j=3
			//      j=2;2<1(false)
			for(int j=2;j<i;j++)
			{
				if(i%j==0)//3%2==0(false)
				{
					flag=false;
				}
			}
			if(flag && i>1)
			{
				boolean flag1=true;
				//System.out.println(i);//2 3 5 7
				while(i>0)//2>0  3>0
				{
					int rem=i%10;//2 3
					
					//          2<3
					for(int j=2;j<rem;j++)
					{
						if(rem%j==0)//3%2==0(false)
						{
							flag1=false;
							j=2;
							//break;
						}
					}
					if(flag1)
					{
						cnt++;//cnt=1(2)  2(3)
					   
					}
					i/=10;
				}
				
			}
		
		}
			System.out.println(cnt);
	}
}

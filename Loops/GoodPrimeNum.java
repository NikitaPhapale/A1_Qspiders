import java.util.Scanner;
class GoodPrimeNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a range:");
		int range=sc.nextInt();//10
		int cnt=0;
		System.out.println("Good Prime numbers in given range are:" );

		for(int i=1;i<=range;i++)
		{
			boolean flag=true;
			
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;//eg i=4 so at j=2 4%2==0 means flag=false so do we need to check for j=3 no once it is divisible means at any cost no prime
				}
			}
			if(flag && i>1)
			{
				
				boolean flag1=true;
				int temp=i;
				while(temp>0)
				{
					int rem=temp%10;
				
					if(!(rem==2||rem==3||rem==5||rem==7))
						{
							flag1=false;
							break;
							
						}
						temp/=10;
					
				
				}
				if(flag1)
				{
					System.out.print(i+" ");
					cnt++;
				}

			}
		}
		    System.out.println();
		    System.out.println("Count of Good Prime numbers is:");
			System.out.println(cnt);
		
		}
			
	}


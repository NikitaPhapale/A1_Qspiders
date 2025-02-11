import java.util.Scanner;
class NextPrevPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num:");
		int num=sc.nextInt();//9
		int nprime=0;
		int pprime=0;

              //i=9-1;8>=2 7>=2 ;i--=7
		for(int i=num-1;i>=2;i--)
		{
			boolean flag=true;//let i is prime
			for(int j=2;j<i;j++) //j=2 ;2<8   j=2 ;2<7 3<7 4<7 5<7 6<7 7<7(false so go out this loop) ;j++=3 4 5 6 7
			{
				if(i%j==0)//8%2==0(true)  7%2==0(false) 7%3==0(false) 7%4==0(false) 7%5==0(false) 7%6==0(false)..7 is not divisible by any j means it is prime
				{
					flag=false;//8 is not prime
					break;//break this if block go for next for loop iteration
				}

			}
			if(flag)//at 7 flag==true that is prime
			{
				pprime=i;//so update pprime=7
				break;//and break dont check for any prev ones is find
			}

		}
		for(int i=num+1;;i++) //i=10;true;i++=11
		{
			boolean flag=true;
			for(int j=2;j<i;j++) //j=2;2<10  j=2;2<11 3<11 4<11 5<10....10<11 11<11(false terminate this for loop)   ;j++=3 4 5 6 7 8 9 10 11
			{
				if(i%j==0)//10%2==0(true) 11%2==0(false) 11%3==0(false)....11%10==0(false)
				{
					flag=false;//10 is not a prime
					break;//so stop checking for 10 go for next break this if block and go to next for iteration
				}

			}
			if(flag)//at i=11 whole innner for loop runs and not divisble by any means prime number
			{
				nprime=i;//so nprime=11
				break;//and stop checking for next nums
			}

		}
		

		if(num-pprime<nprime-num)
		{
			System.out.println(pprime+" "+num);
		}
		else if(num-pprime>nprime-num)
		{
			System.out.println(num+" "+nprime);
		}
		else
		{
			System.out.println(pprime+" "+num+" "+nprime);
		}

	}
}

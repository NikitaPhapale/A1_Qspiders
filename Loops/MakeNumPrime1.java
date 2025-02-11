import java.util.Scanner;
class MakeNumPrime1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num:");
		int num=sc.nextInt();//8
		boolean flag=true;//let 8 is prime
        //      i=2;2<11 3<11 4<11 5<11 6<11 7<11 8<11 9<11 10<11 11<11(false) Stop   ;i=3 4 5 6 7 8 9 10 11
		//      i=2;2<10
		//      i=2;2<9  3<6  ;i=3
		 //     i=2;2<8   
		for(int i=2;i<num;i++)
		{
			if(num%i==0)//8%2==0(true)  9%2==0(false) so it didnot go inside if go for next iteration at i=3   9%3==0(true)   10%2==0(true)   11%2==0(false) 11%3==0(false) 11%4==0(false)....11%10==0(false)
			{
				flag=false;//means 8 is not prime   means 9 is not prime    means 10 is not a prime
				num++;//if 8 is not prime to find next prime do num++=9    num++=10   num++=11
				i=2;//then for new num intiallize i=2 again  otherwise it will start from same i   again i=2(at num=10)  again i=2(at num=11)
			}
			
		}
		System.out.println("num:"+num);//so when num=11 loop runs for all iterations and it is nextPrime number of 8
	}
}

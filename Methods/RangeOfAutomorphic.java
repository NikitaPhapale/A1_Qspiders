import java.util.Scanner;
class RangeOfAutomorphic
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range:");
		int range=sc.nextInt();
		for(int i=1;i<=range;i++)
		{
		if(automorphic(i))
			System.out.println(i);
		}
	}
	public static boolean automorphic(int num)
	{
		
		int div=1;
		for(int i=num;i>0;i/=10)
		{ 
			div*=10;
		}
		return num==(num*num)%div;
	}

}

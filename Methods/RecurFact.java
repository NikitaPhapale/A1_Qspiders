import java.util.Scanner;
class RecurFact 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int num=sc.nextInt();
		System.out.println(fact(4));

	}
	public static int fact(int num)
	{
		if(num==0)
			return 1;
		return num*fact(num-1);
	}
}

import java.util.Scanner;
class LargestAmongThree
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three values:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int ans=(a>b)?((a>c)?(a):(c)):((b>c)?(b):(c));

		System.out.println("largest number amoung three is:"+ans);
	}
}

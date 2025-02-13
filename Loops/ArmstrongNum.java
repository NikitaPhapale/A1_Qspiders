import java.util.Scanner;
class  ArmstrongNum
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num:");
		int num=sc.nextInt();
		int dup=num;
		int sum=0;
		int len=0;
		for(int i=num;i>0;i/=10)
		{
			len++;
		}
		while(num>0)
		{
			int rem=num%10;
			int pow=1;
			for(int i=1;i<=len;i++)
			{
				pow*=rem;
			}
			sum+=pow;
			num/=10;
		}
		System.out.println(dup==sum?dup+" is Armstrong number": dup+" is not armstrong number");
	}
}

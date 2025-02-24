import java.util.Scanner;
class IncreasingNum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		String num=sc.next();
		boolean flag=true;
		for(int i=0;i<num.length()-1;i++)
			if(num.charAt(i)>num.charAt(i+1))
		{
			flag=false;
			break;
		}
		if(flag)
			System.out.println(num+" is a increasing number");
		else
			System.out.println(num+" is not increasing number");

	}
}

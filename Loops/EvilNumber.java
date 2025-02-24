import java.util.Scanner;
class EvilNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int num=sc.nextInt();
		String bin=" ";
		for(int i=num;i>0;i/=2)
			bin=(i%2)+bin;
		System.out.println("Binary num :"+bin);

		int cnt=0;
		for(int i=0;i<bin.length();i++)
			if(bin.charAt(i)=='1')
				cnt++;
		if(cnt%2==0)
			System.out.println(num+" is a Evil number");
		else
			System.out.println(num+" is not a Evil number");

	}
}

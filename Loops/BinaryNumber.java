import java.util.Scanner;
class BinaryNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int num=sc.nextInt();
		String bin=" ";
		for(int i=num;i>0;i/=2)//10 10/2=5 5/2=2 2/2=1 1/2=0
			bin=(i%2)+bin;//10%2=0 5%2=1 2%2=0 1%2=1
		System.out.println(num+":"+bin); 0101
	}
}

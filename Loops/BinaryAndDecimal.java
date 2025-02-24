import java.util.Scanner;
class BinaryAndDecimal 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int num=sc.nextInt();
		String bin=Integer.toBinaryString(num);
		System.out.println(num+":"+bin);

		int num1=Integer.parseInt(bin,2);
		System.out.println(bin+":"+num1);
	}
}

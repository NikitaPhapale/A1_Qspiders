import java.util.Scanner;
class charEx 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a char:");
		char ch=sc.next().charAt(0);//Z
		int ans=ch-'A'+1;//Z-A+1==90-65+1=26(Z)
		System.out.println(ans);
		
	}
}

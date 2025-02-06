import java.util.Scanner;
class VowelsUserName 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=sc.next();
		System.out.println("Vowels present your name");
		for(int i=0;i<name.length();i++)
		{
			if((name.charAt(i)=='a')||(name.charAt(i)=='e')||(name.charAt(i)=='i')||(name.charAt(i)=='o')||(name.charAt(i)=='u')
				||(name.charAt(i)=='A')||(name.charAt(i)=='E')||(name.charAt(i)=='I')||(name.charAt(i)=='O')||(name.charAt(i)=='U'))
			{
				System.out.println(name.charAt(i));
			}
		}
	}
}

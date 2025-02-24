import java.util.Scanner;
class MockString
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		String str=sc.next();
		boolean flag=true;
		char ch=' ';
		for(int i=0;i<str.length()-1;i++)
		{
			for(int j=i+1;j<str.length();j++)
		
			{
				if(str.charAt(i)==str.charAt(j))
			{
				flag=true;
				ch=str.charAt(i);
			}
		
			else
				flag=false;
			}
			
			
		}
		if(flag)
		{
			System.out.println(str+ " String has repeated chars");
			System.out.println(ch);
		}
		else
			System.out.println(str+ " String has not repeated chars");

	}
}

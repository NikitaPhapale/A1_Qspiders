import java.util.Scanner;
class PasswordProg 
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc=new Scanner(System.in);
		int storePin=143;
		int seconds=5000;

		outerLoop:
		for (; ; )
		{
			int attempts=3;
			do
			{
				System.out.println("Enter your pin:");
				int pin=sc.nextInt();
				if(storePin==pin)
				{
					System.out.println("Phone is Unlocked");
					break outerLoop;
				}
				else
				{
					System.out.println("Wrong pin");
					System.out.println("Attempts left:"+(attempts-1));
				}
				attempts--;
			}
			while (attempts>=1);
			System.out.println();
			System.out.println("Phone is Disables for "+(seconds/1000)+" seconds");
			Thread.sleep(seconds);
			seconds*=2;
			System.out.println();
		}
	}
}

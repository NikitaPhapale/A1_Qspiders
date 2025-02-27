import java.util.Scanner;
class Restaurant 
{
	static String name;//null
	static long contact;//0
	static String address;//null
	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		for (; ; )
		{
			System.out.println();
			System.out.println("             JAVA KA DHABA");
			System.out.println();
			System.out.println("1.CREATE ACCOUNT");
			System.out.println("2.ESIXTING USER");
			System.out.println();
			System.out.println("ENTER OPTION:");
			int opt=sc.nextInt();
			System.out.println();
			switch(opt)
			{
				case 1:
					createAccount(sc);
					break;
				case 2:
					login(sc);
					break;
				default:
					System.out.println("INVALID INPUT");
					break;
			}


		}
	}

	public static void createAccount(Scanner sc)
	{
		System.out.println("               REGISTRATION");
		System.out.println();
		System.out.println("Name: ");
		name=sc.next();
		System.out.println("Phone: ");
		contact=sc.nextLong();
		System.out.println("Address: ");
		sc.nextLine();
		address=sc.nextLine();
		System.out.println();
		System.out.println("ACCOUNT CREATED SUCCESSFULLY");

	}

	public static void login(Scanner sc)
	{
		if(name==null)
		{
			System.out.println("CREATE YOUR ACCOUNT FIRST");
			return;
		}
		System.out.println("          LOGIN");
		System.out.println();

		for(int attempt=3;attempt>=1;attempt--)
		{
			System.out.print("Username: ");
			String username=sc.next();
			System.out.print("Password: ");
			long phone=sc.nextLong();
			System.out.println();
			if(name.equals(username) && contact==phone)
			{
				homePage(sc);
			}
			else
			{
				System.out.println("INVALID CREDENTIALS");
				System.out.println("ATTEMPT LEFT: "+(attempt-1));
				System.out.println();

			}
		}
		System.out.println("THANK YOU & NEVER VISIT AGAIN");
		System.exit(0);
	}

	public static void homePage(Scanner sc)
	{
		System.out.println("           HOMEPAGE");
		System.out.println();
		System.out.println("1.MENU");
		System.out.println("2.ORDER");
		System.out.println("3.TABLE BOOKING");
		System.out.println("4.LOGOUT");
		System.out.println();
		System.out.println("Enter option:");
		int opt=sc.nextInt();

	}
}

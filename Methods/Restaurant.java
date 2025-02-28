import java.util.*;
class Restaurant 
{
	static String name;//null
	static long contact;//0
	static String address;//null
	static ArrayList<String> basket=new ArrayList<>();

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
			return;//control transfer to calling method which is main()
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
		
		switch(opt)
		{
			case 1:
				menu(sc); break;
			case 2:
				order(sc);break;
			case 3:
				tableBooking(); break;
			case 4:
				System.out.println("THANK YOU AND VISIT AGAIN");
				System.exit(0);break;
			default:
				System.out.println("INVALID INPUT"); break;
		}

	}
	public static void menu(Scanner sc)
	{
		for (; ; )
		{
			System.out.println();
			System.out.println("			MENU");
			System.out.println("101 : BUTTER CHICKEN =450/-");
			System.out.println("102 : CHICKEN BIRYANI =350/-");
			System.out.println("103 : SHAHI PANEER =330/-");
			System.out.println("104 : MIX VEG =280/-");
			System.out.println("105 : PARATHE =200/-");
			System.out.println("106 : ROTI/NAAN =50/-");
			System.out.println("107 : EXIT MENU");
			System.out.println();
			System.out.println("Enter a food id:");
			int id=sc.nextInt();
			switch(id)
			{
				case 101:
					basket.add("101 : BUTTER_CHICKEN = 450");
					System.out.println("Butter Chicken added to backet");
					break;
				case 102:
					basket.add("102 : CHICKEN_BIRYANI = 350");
					System.out.println("Chicken Biryani added to backet");
					break;
				case 103:
					basket.add("103 : SHAHI PANEER = 330");
					System.out.println("Shahi Paneer added to backet");
					break;
				case 104:
					basket.add("104 : MIX_VEG = 280");
					System.out.println("Mix Veg added to backet");
					break;
				case 105:
					basket.add("105 : PARATHE = 200");
					System.out.println("Paratha added to backet");
					break;
				case 106:
					basket.add("106 : ROTI/NAAN = 50");
					System.out.println("Roti/Naan added to backet");
					break;
				case 107:
					return;
				default:
					System.out.println("INVALID INPUT");
					break;
			}


		}
	}
	public static void order(Scanner sc)
	{
	}

	public static void tableBooking()
	{
	}


}

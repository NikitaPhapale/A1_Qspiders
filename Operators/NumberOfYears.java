import java.util.Scanner;
class NumberOfYears 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of minutes");
		long minutes=sc.nextLong();

		long years=minutes/(365*24*60);//total given minutes /minutes per year gives number of years
		long remainingminutes=minutes%(365*24*60);//after covering minutes in years then remaining minutes will be reminder of above calculation only
		long days=remainingminutes/(24*60);//then that remainnig nimutes will be calculated in   year as remainnig minutes/minutes per day will give you days for that minutes
		System.out.println("The Number of years for given input is:"+years+" years");
		System.out.println("The Number of days after covering year is:"+days+" days");

		
	}
}

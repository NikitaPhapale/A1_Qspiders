import java.util.Scanner;
class  PoundsToKg
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number in pounds:");
		float pounds=sc.nextFloat();
		final float st=0.454f;
		float kilograms=pounds*st;
		System.out.println("number in kilograms is:"+kilograms);
	}
}

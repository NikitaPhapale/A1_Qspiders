import java.util.Scanner;
class CalultateTips 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter subtotal:");
		float subtotal=sc.nextFloat();
		System.out.println("Enter gratuity rate:");
		float gratRate=sc.nextFloat();
		float gratuity=(gratRate*subtotal)/100;
		float total=subtotal+gratuity;
		System.out.println("Gratuity tip:"+gratuity);
		System.out.println("Total:"+total);

	}
}

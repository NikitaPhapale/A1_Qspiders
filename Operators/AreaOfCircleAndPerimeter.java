import java.util.*;
class AreaOfCircleAndPerimeter
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		final float pi=22/7f;
		System.out.print("Enter radius of circle in meters:");
		float radius=sc.nextFloat();

		float area=pi*(radius*radius);
		System.out.println("Area of circle for radius="+radius+" is:"+area+" m^2");

		float perimeter=2*pi*radius;
		System.out.println("Perimeter of circle for radius:"+radius+" is:"+perimeter+" m");

	}
}

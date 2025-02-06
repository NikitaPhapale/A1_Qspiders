import java.util.Scanner;
class AreaAndVolumeOfCylinder 
{
	public static void main(String[] args) 
	{
		Scanner st=new Scanner(System.in);
		System.out.print("Enter radius of Cylinder(cm):");
		float radius=st.nextFloat();

		System.out.print("Enter height of Cylinder(cm):");
		float height=st.nextFloat();

		 final float pi=22/7f;

		float area=2*pi*radius*(radius+height);
		System.out.println("Area of Cylinder for radius:"+radius+" is:"+area);

		float volume=pi*radius*radius*height;
		System.out.println("Volume of Cylinder for radius:"+radius+" is:"+volume);

	}
}

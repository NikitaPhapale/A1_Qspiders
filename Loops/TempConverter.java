import java.util.Scanner;
class TempConverter 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("**********TEMPERATURE CONVERTER**********");
		System.out.println();
		
		
		System.out.println("ENTER TEMP(in CELSIUS):");
		double tempCel=sc.nextDouble();
		System.out.println("1.CONVERT CELCIUS TO FAHRENHEIT");
		System.out.println("2.CONVERT CELCIUS TO KELVIN");
		System.out.println("3.CONVERT CELCIUS TO RANKINE");
		System.out.println("4.CONVERT CELCIUS TO REAUMUR");
	    System.out.println("5.CONVERT CELCIUS TO NEWTON");
		System.out.println("6.CONVERT CELCIUS TO DELISLE");
		System.out.println("7.CONVERT CELCIUS TO ROMER");

		System.out.println("Enter a option:");
		int op=sc.nextInt();
		switch(op)
		{
			case 1:
				double fah=(tempCel*1.8)+32;
				System.out.println(tempCel+" in  Fahrenite is "+fah);
				break;
			case 2:
				double kelvin=tempCel+273.15;
				System.out.println(tempCel+" in  Kelvin is "+kelvin);
				break;
			case 3:
				double rankine=(tempCel+273.15)*1.8;
				System.out.println(tempCel+" in  Rankine is "+rankine);
				break;
			case 4:
				double reaumur=tempCel*0.8;
				System.out.println(tempCel+" in  Reaumur is "+reaumur);
				break;
			case 5:
				double newton=tempCel*0.33;
				System.out.println(tempCel+" in  Newton is "+newton);
				break;
			case 6:
				double delisle=(100-tempCel)*1.5;
				System.out.println(tempCel+" in  Delisle is "+delisle);
				break;
			case 7:
				double romer=(tempCel*0.525)+7.5;
				System.out.println(tempCel+" in  Romer is "+romer);
				break;
			
		
		}
	}
}

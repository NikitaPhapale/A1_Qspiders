import java.util.Scanner;
class BMI 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Entet your weight in pounds:");
		float weight=sc.nextFloat();
		System.out.println("Enter your height in inchs:");
		float height=sc.nextFloat();
		height=height*0.0254f;
		weight=weight*0.45359237f;
		System.out.println("Weight in kg is:"+weight+" Height in meters is :"+height);
		float bmi=weight/(height*height);
		System.out.println("BMI is:"+bmi);
		System.out.println((bmi<18.5)?("Underweight"):((18.5<bmi&&bmi<24.9)?("Normal"):((25.0<bmi&&bmi<29.9)?("Overweight"):((bmi>=30.0)?("Obese"):("Invalid data")))));
	}
}

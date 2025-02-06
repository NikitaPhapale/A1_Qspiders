import java.util.Scanner;
class EvenOdd
{
	public static void main(String[] args) 
	{
		
		System.out.println("Enter num");
		int num=new Scanner(System.in).nextInt();

		//first logic
		//eg num=7 ..7/2=3 and 7/2.0==3.5 
		if(num/2==num/2.0){
			System.out.println("Even");
		}
		else{
			System.out.println("Odd");
		}

		//second logic
		//eg num=7

		if((num/2)*2==num){
			System.out.println("Even");
		}
		else{
			System.out.println("Odd");
		}
	   
	   //third logic
	   if(num%2==0){
		   System.out.println("Even");
	   }
	   else{
		   System.out.println("Odd");
	   }

	}
}

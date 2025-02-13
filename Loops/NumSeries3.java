//10,30,68,130,222
class NumSeries3 
{
	public static void main(String[] args) 
	{
		int num1=10;
		System.out.print(num1+" ");
		for(int i=2, first=20,second=18;i<=5;i++)
		{

			num1+=first;//10+20=30
			System.out.print(num1+" ");
			first+=second;//first=20+18=38
			second+=6;//18+6=24(second)
			

		}
	}
}

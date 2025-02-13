//1,3,9,33,153,873
class NumSeries5 
{
	public static void main(String[] args) 
	{
		int num1=1;
		System.out.print(num1+" ");
		int first=2;
		int second=3;
		for(int i=1;i<=5;i++)
		{
			num1+=first;
			System.out.print(num1+" ");
			first*=second;
			second++;
		}
	}
}

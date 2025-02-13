//79,108,139,176,217,260
class NumSeries4
{
	public static void main(String[] args) 
	{
		int num1=79;
		System.out.print(num1+" ");
		for(int i=1,first=29,second=2;i<=5;i++)
		{
			num1+=first;
			System.out.print(num1+" ");
			first+=second;
			if(i%2==0)
			{
				second+=6;
			}
			else
			{
				second+=2;
			}
			
		}
	}
}

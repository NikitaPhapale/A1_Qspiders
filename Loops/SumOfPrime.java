import java.util.Scanner;
class SumOfPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int temp = num;
		boolean flag = true;

		// Check if the number is prime
		for(int i = 2; i < num; i++)
		{
			if(num % i == 0)
			{
				flag = false;
				break;
			}
		}

		if(flag && num>2)
		{
			System.out.println("Prime number it is");
		}
		else
		{
			int sum = 0;
			for(int i = 2; i < temp; i++)
			{
				boolean flag1 = true;
				for(int j = 2; j < i; j++)
				{
					if(i % j == 0)
					{
						flag1 = false;
						break;
					}
				}

				
				if(flag1)
				{
					sum += i;
					//System.out.print(i + " ");
					if(sum == temp)
					{
						System.out.println("Sum matches the number: " + sum);
						break;
					}
					else if(sum>temp)
					{
						break;
					}

				}
			}
			System.out.println("No exact prime sum match found.");
		}
	}
}

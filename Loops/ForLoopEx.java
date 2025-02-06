class ForLoopEx 
{
	public static void main(String[] args) 
	{
		System.out.println("1.Numbers from 1 to 10");
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}

			System.out.println();


		System.out.println("2.Alphabet from A to Z");

		for (char ch='A';ch<='Z' ;ch++ )
		{
			System.out.print(ch+" ");
		}

			System.out.println();


		System.out.println("3.Alphabet from z to a");

		for (char ch='z';ch>='a' ;ch-- )
		{
			System.out.print(ch+" ");
		}

			System.out.println();


		System.out.println("4.Digits from 0 to 9");

		for (char ch='0';ch<='9' ;ch++ )
		{
			System.out.print(ch+" ");
		}
		
		System.out.println();


		System.out.println("5.Ascii table");
		for (int i=0;i<=127 ;i++ )
		{
			System.out.println(i+":"+((char)i));
		}
	}
}

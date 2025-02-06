class ProductOfDigits 
{
	public static void main(String[] args) 
	{
		int num =2222;
		int product=1;

		int rem=num%10;//1234%10=4
		product=product*rem;//1*4=4

		num=num/10;//1234/10=123
		rem=num%10;//123%10=3
		product=product*rem;//4*3=12

		num=num/10;//123/10=12
		rem=num%10;//12%10=2
		product=product*rem;//12*2=24

		num=num/10;//12/10=1
		rem=num%10;//1%10=1
		product=product*rem;//24*1

		System.out.println("Product of digits is:"+product);


	}
}

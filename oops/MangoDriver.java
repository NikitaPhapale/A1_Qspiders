class MangoDriver 
{
	public static void main(String[] args) 
	{
		Mango m1=new Mango();

		m1.type="Hapus";
		m1.origin="Ratnagiri";
		m1.price=2000.0;

		//m1.printOrigin().printType().printPrice();
		System.out.println(m1.printOrigin());
		System.out.println(m1.printType());
		System.out.println(m1.printOrigin().printPrice());
	}
}

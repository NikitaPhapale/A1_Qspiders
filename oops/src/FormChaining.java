class FormChaining 
{
	String name;
	long phno;
	long tel;
	char gender;
	String blood;
	String email;
	String dob;

	FormChaining()
	{
		System.out.println("From constructor 1");
	}

	FormChaining(String name,long phno,char gender,String dob)
	{
		System.out.println("From constructor 2");
		this.name=name;
		this.phno=phno;
		this.gender=gender;
		this.dob=dob;
	}
	FormChaining(String name,long phno,char gender,String dob,long tel)
	{
		
		this(name,phno,gender,dob);

		this.tel=tel;
		System.out.println("From constructor 3");
	}
	FormChaining(String name,long phno,char gender,String dob,long tel,String blood)
	{
		
		this(name,phno,gender,dob,tel);

		this.blood=blood;
		System.out.println("From constructor 4");
	}
	FormChaining (String name,long phno,char gender,String dob,long tel,String blood,String email)
	{
		
		this(name,phno,gender,dob,tel,blood);
		
		this.email=email;
		System.out.println("From constructor 5");
	}
	public void displayFormChaining()
	{
		System.out.println(name);
		System.out.println(phno);
		System.out.println(gender);
		System.out.println(dob);

		System.out.println(tel);
		System.out.println(blood);
		System.out.println(email);
		System.out.println("---------------------------");
	}
}

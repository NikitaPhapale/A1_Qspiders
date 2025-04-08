class Form 
{
	String name;
	long phno;
	long tel;
	char gender;
	String blood;
	String email;
	String dob;

	Form()
	{
	}

	Form(String name,long phno,char gender,String dob)
	{
		this.name=name;
		this.phno=phno;
		this.gender=gender;
		this.dob=dob;
	}
	Form(String name,long phno,char gender,String dob,long tel)
	{
		this.name=name;
		this.phno=phno;
		this.gender=gender;
		this.dob=dob;

		this.tel=tel;
	}
	Form(String name,long phno,char gender,String dob,long tel,String blood)
	{
		this.name=name;
		this.phno=phno;
		this.gender=gender;
		this.dob=dob;

		this.tel=tel;
		this.blood=blood;
	}
	Form (String name,long phno,char gender,String dob,long tel,String blood,String email)
	{
		this.name=name;
		this.phno=phno;
		this.gender=gender;
		this.dob=dob;
		
		this.tel=tel;
		this.blood=blood;
		this.email=email;
	}
	public void displayForm()
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

class Student 
{
	String name;
	String degree;
	int age;
	String coll;
	int roll;

	Student()
	{
		System.out.println("From no argument constructor");
		System.out.println(this);
	}
	Student(String name,int age,String coll,String degree,int roll)
	{
		this.name=name;
		this.age=age;
		this.coll=coll;
		this.degree=degree;
		this.roll=roll;
	}
	public void displayStudent()
	{
		
		System.out.println(name);
		System.out.println(degree);
		System.out.println(coll);
		System.out.println(roll);
		System.out.println(age);

	}
}

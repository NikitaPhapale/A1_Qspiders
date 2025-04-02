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
	public void displayStudent()
	{
		String name="Mighty Raju";
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(this);
		System.out.println(degree);
		System.out.println(coll);
		System.out.println(roll);
		System.out.println(age);

	}
}

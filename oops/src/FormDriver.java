class FormDriver 
{
	public static void main(String[] args) 
	{
		Form f1=new Form();
		f1.displayForm();

		Form f2=new Form("Raju",987654310l,'M',"12/12/12");
		f2.displayForm();

		Form f3=new Form("Rani",99328939938l,'F',"06/06/2004",9485439503l,"A+","rani@gmail.com");
		f3.displayForm();
	}
}

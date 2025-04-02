class ServerDBDriver 
{
	public static void main(String[] args) 
	{
		Server s1=new Server();
		s1.serverDetails();
		s1.serverDetails().getDBData("MYSQL","root","root");

	}
}

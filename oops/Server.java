class Server 
{
	String name;
	String ip;
	int port;

	public Server severDetails()
	{
		System.out.println(name);
		System.out.println(ip);
		System.out.println(port);
		return this;

	}
	public DB getDBData(String name,String user,String pass)
	{
		String name1=this.name;
		String user1=this.user;
		String pass1=this.pass;
		return this;
	}
}

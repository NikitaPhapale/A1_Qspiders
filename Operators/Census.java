class Census 
{
	public static void main(String[] args) 
	{
		long currPop=312032486;
		long newPop;
		final long seconds=(365*24*60*60)*5;
		long birth=seconds/7;
		long death=seconds/13;
		long immegrant=seconds/45;

		newPop=currPop+birth-death+immegrant;

		System.out.println("Current Population is:"+currPop);
		System.out.println("New Population after 5 years is:"+newPop);
	}
}

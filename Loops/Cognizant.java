class Cognizant 
{
	public static void main(String[] args) 
	{
		String arr={"i","b","b","i","b","a","i","a","a","i"};
		int cnt=0;
		for(int i=0;i<arr.length()-1;i++)
		{
			if(arr[i]==arr[i+1])
				cnt++;
		}
		System.out.println(cnt);
	}
}

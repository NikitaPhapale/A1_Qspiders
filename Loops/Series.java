class Series 
{
	public static void main(String[] args) 
	{
		//A C F J O U
		//here distance between char is like 1,2,3,4,5.....
		//so we will take i to keep series 1,2,3,4
		//and add that i to char so it will increase it with that number
		
		int i=1;
		for(char ch='A';ch<='Z';ch+=i){
			System.out.println(ch+" ");
			i++;
			
		}
	}
}

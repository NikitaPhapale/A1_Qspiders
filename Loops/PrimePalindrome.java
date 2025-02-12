import java.util.Scanner;
class PrimePalindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num:");
		int n=sc.nextInt();
		  boolean flag=true;
		  outer:
		 
        for(int i=2;i<n;i++)
        {
            if(n%i==0){
                flag=false;
               n++;
               i=2;
                
              }
				
		} 
		
		
			System.out.println("n"+n);
		
		int temp=n;
		int rev=0;
		while(n>0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		System.out.println("rev"+rev);
		if(rev==temp && temp!=0 && temp!=1)
		{
			System.out.println("PrimePalidrome");
			
		}
		
		
        }
          
	
}

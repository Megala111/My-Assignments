package week1.day2;

public class PrimeNumber {
	public static void main(String[] args) {
		boolean flag=true;
		  int n=13;
		   for(int i=2;i<n;i++){      
		    if(n%i==0){           
		     flag=false;           
		    } 
		   }
		   if(flag && n!=1)
		    {
            System.out.println(n+"is a prime number");
		   }
		   else
		   {
			   System.out.println(n+"is not a prime number");
		   }
	}
	} 


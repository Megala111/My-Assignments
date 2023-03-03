package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int rem,sum=0,temp;
		int num=34343;
		temp=num;
		while(num>0) {
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("This is palindrome");
		}
		else
		{
	        System.out.println("This is not a palindrome");
		}
		
	}
}

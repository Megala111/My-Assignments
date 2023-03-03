package week1.day2;

import java.util.Arrays;

public class SecondSmallestNumber {
	
	public static void main(String[] args) {
		int[] arr= {23,45,67,32,89,22};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	    System.out.println("This is the second smallest number:"+arr[1]);
		
	}
}

package in.smartprogramming.corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FibonacciNumbers {
	
	static int a=0, b=1, c;

	public static void main(String[] args) {
		//program to print fibonacci numbers
		
		//Reverse Array Query
		
		int[] arr = {3,2,9,8,5};
		
		Arrays.sort(arr);
		for(int i : arr) {
			System.out.println(i);
		}
		
		int[][] query = {{0,2}, {1,2},{0,2}};
		
		System.out.println();
		
		
		
		System.out.print(a + " " +b);
		
	/*	for(int i=1; i<=10; i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}*/
		
		
		FibonacciNumbers fb = new FibonacciNumbers();
		fb.recursion(15);
		
		//program to print fibonacci numbers using recusrsive function
		
		

	}
	
	void recursion(int n) {
		
		if(n>=1) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			
			recursion(n-1);
			
								
		}
		
			
		
	}
	
		
			
			

}

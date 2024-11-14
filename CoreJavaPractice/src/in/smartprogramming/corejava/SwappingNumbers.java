package in.smartprogramming.corejava;

import java.util.Scanner;

public class SwappingNumbers {

	public static void main(String[] args) {
		//Program to swap two numbers using third variable
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c;
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("Swapped numbers a = "+a +" b= " +b);
		

		//Program to swap two numbers without using third variable
		
		int d =15, e=-6;
		
		d = d+e;
		e = d-e;
		d = d-e;
		
		System.out.println("d= "+d);
		System.out.println("e= "+e);
	}

	
	
}

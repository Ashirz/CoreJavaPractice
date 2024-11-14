package in.smartprogramming.corejava;

import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {
		
		//Program to check if a number is even or odd
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the number ");
		int a =sc.nextInt();
		if(a%2 ==0) {
			System.out.println(a +" is an even number");
		
		
		}else System.out.println(a +" is an odd number");
		
		//Program to check if it is leap year
		
		System.out.println("Enter the year ");
		
		int year = sc.nextInt();
		if((year%400 ==0) || (year%4==0 && year%100!=0)){
			
			System.out.println(year +" is a leap year");
		}

		else System.out.println(year +" is not a leap year");
	}

}

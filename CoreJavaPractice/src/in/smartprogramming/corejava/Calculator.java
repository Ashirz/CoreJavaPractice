package in.smartprogramming.corejava;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// Creating simple calculator using switch case
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find factorial using recursive function ");
		int n = sc.nextInt();
		Calculator c = new Calculator();
		System.out.println("Factorial of "+ n+ " is "+c.factorial(n));
		
		/*System.out.println("Enter the numbers ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result;
		
		String symbol = sc.next();
		
		switch (symbol)
		
		{
		case "+" : result = a+b;
		System.out.println("Result is " +result);
		break;
		
		case "-" : result = a-b;
		System.out.println("Result is " +result);
		break;
		
		case "*" : result = a*b;
		System.out.println("Result is " +result);
		break;
		
		case "/" : result = a/b;
		System.out.println("Result is " +result);
		break;
		
		case "%" : result = a%b;
		System.out.println("Result is " +result);
		break;
		
		default : System.out.println("Invalid symbol");
		
		}
		
		//Program to print multiplication table
		
		System.out.println("Enter the number to find timetable ");
		
		int num = sc.nextInt();
		
		for (int i = 1; i<=10; i++) {
			
			
			
			System.out.println(num + " * " + i + " = " + num*i);
		}*/
		
		//Program to find factorial of a number
		
		System.out.println("Enter the number to find factorial ");
		
		int num1 = sc.nextInt();
		int fact =1;
		
		for (int i=num1; i>=1; i--) {
			 fact = fact*i;
			
		}
		System.out.println("Factorial of " + num1 +" is " + fact);
		
		//Program to find factorial of a number using recursive function
		
				
	}
	int factorial(int n) {
		if (n>=1) {
			return (n*factorial(n-1));
		}
		return 1;
		
	}

}

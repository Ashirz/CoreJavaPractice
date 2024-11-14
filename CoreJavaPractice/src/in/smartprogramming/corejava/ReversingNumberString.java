package in.smartprogramming.corejava;

import java.util.Scanner;

public class ReversingNumberString {

	public static void main(String[] args) {
		
		//Reverse a number
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to reverse: ");
		int num = sc.nextInt();
		int temp = num;
		int rem, result = 0;
		
		while(temp !=0) {
			
			rem = temp%10;
			result = result*10+rem;
			temp = temp/10;
		}
	
		System.out.println("Reversed number is "+result);
		
		//check if a number is palindrome
		if (result == num) {
			
			System.out.println("This is a palindrome number!");
		}else System.out.println("This is not a palindrome number!");
		
		//Reverse a string
		/*System.out.println("Enter the string to reverse: ");
		String str = sc.next();
		
		int l=str.length();
		String res = "";
		
		for(int i=l-1; i>=0; i--) {
			res = res + str.charAt(i);
		}
		
		System.out.println("Reversed string is " + res);*/
		
					

	}

}

package in.smartprogramming.corejava;

import java.util.Scanner;

public class IntegertoBinary {
	public static void main(String args[]) {
		//Program to convert an integer to binary using an Array
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the integer :");
		
		int num = sc.nextInt();
		
		int[] result = new int[1000];
		int i =0;
		while (num!=0) {
			result[i] = num%2;
			num = num/2;
			
			i++;
						
		}
		for(int j=i-1; j>=0; j--)
			System.out.println(result[j]);
		
		//Program to convert binary to integer
		
		//Program to calculate simple interest
		
		System.out.println("Enter the Principle: ");
		float principle = sc.nextFloat();
		System.out.println("Enter the Time: ");
		float time = sc.nextFloat();
		System.out.println("Enter the Rate: ");
		float rate = sc.nextFloat();
		
		float SimpleInterest = (principle*time*rate)/100;
		
		System.out.println("Simple Interest is: "+SimpleInterest);
		
		
	}

}

package in.smartprogramming.corejava;

//import java.util.Scanner;

public class CheckforPrime {

	public static void main(String[] args) {
		
		int temp = 0;
	/*	Scanner sc =new Scanner (System.in);
		System.out.println("Enter the number to check if prime or not: ");
		int num = sc.nextInt();
		
		
		if(num==1) {
			System.out.println("1 is neither prime nor composite");
		}else {
		for(int i = 1; i<=num; i++) {
			if(num%i==0) {
				temp++;
				
			}
		}if (temp==2) {
			System.out.println(num+ " is prime");
		}else System.out.println(num+ " is not prime");

	}*/

		//Printing all prime numbers between 1 -100
		
		for(int j =2; j<=100; j++) {
			for (int i= 2; i<j; i++) {
				if(j%i ==0) {
					temp++;
					
				}
			}if (temp==0) {
				System.out.println(j);
			}else temp =0;
		}
		
}
}

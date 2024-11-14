package in.smartprogramming.corejava;



public class FindLargestNumber {

	public static void main(String[] args) {
		
		//Program to find largest of three numbers using nested if else
		int a = -10, b=-25, c=-9;
		if (a>b) {
			if(a>c) {
				System.out.println("Largest number is " +a);
			}else
				System.out.println("Largest number is " +c);
			
		}if (b>c) {
			System.out.println("Largest number is " +b);
		}
		
		
		//Program to find largest of three numbers using if else
		
		int a1 = 10, b1=-25, c1=-9;
		if (a1>b1 && a1>c1) {
			System.out.println("Largest number is " +a1);
		}else if(b1>a1 && b1>c1 ) {
			System.out.println("Largest number is " +b1);
		}else System.out.println("Largest number is " +c1);
	}

}

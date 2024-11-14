package in.smartprogramming.corejava;

public class SainsburyTask1 {

	public static void main(String[] args) {
		
		//2 digit number
		for (int i=1; i<=9;i++) {
			for (int j=1; j<=9; j++) {
				if (j>=i) {
					int num = i*10+j;
					
					System.out.println(num);
					
				}
			}
		}
		
		//3 digit number
		for (int i=1; i<=9;i++) {
			for (int j=1; j<=9; j++) {
				for(int k=1; k<=9; k++) {
					
				if (j>=i && k>=j) {
					int num = i*100+j*10+k;
					
					System.out.println(num);
					
					
				}
			}
		}
		}
	}

}

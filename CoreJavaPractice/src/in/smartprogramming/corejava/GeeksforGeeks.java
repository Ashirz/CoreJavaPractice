package in.smartprogramming.corejava;

public class GeeksforGeeks {

	public static void main(String[] args) {
		int [] a = {-7, 1, 5, 2, -4, 3, 0};
		//int []a= {1, 2, 3};
		
		System.out.println(equilibriumIndex(a));

	}

	private static int equilibriumIndex(int a[]) {
		
		int index =a.length/2;
		int sumFirst =0;
		int sumEnd =0;
		
		for(int i =0; i<index; i++) {
			sumFirst =sumFirst+a[i];
			
		}
		for(int i= a.length-1; i>index; i--) {
			sumEnd =sumEnd +a[i];
		}
		
		if(sumFirst==sumEnd)
		
		return index+1;
		
		else return 0;
	}
	

}

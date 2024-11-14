package in.smartprogramming.corejava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {

	public static void main(String[] args) {
		/*try{
			//FileInputStream fi = new FileInputStream("C:/hello.text");
			Class.forName("com.mysql.jdbc.Driver");
		}catch(Exception e){
		//	System.out.println(e);
		//	e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("File doesn't exist in system");
		}
		

		int a=26, b=0, c;
		try {
		c = a/b;
		
		System.out.println(c);}
		catch (Exception e) {
			System.out.println(e);
			
		}*/
		
		
		try {
			String s = "";
			System.out.println(s.length());
		}
		//finally block is used to clean up or close any resources opened in try block
		finally {
	
			System.out.println("love yourself");
	}
		}

}

package in.smartprogramming.corejava;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class StringOperations {

	public static void main(String[] args) {
		String s1 = new String("rashi");
		s1.replace('r', 'a');
		System.out.println(s1);
		String s2 = new String("ashi");
		
		String s3 = "aa";
		String s4 = "Aaa";
		
		char[] news3 = s3.toCharArray();
		Arrays.sort(news3);
        System.out.println(s3.contains(s4));
        
        
		
		char[] news4 = s4.toCharArray();
		
		int n1 = s3.compareTo(s4);
		int n2 = s4.compareTo(s3);
		
		System.out.println();
		
				
		Array[] ar = new Array[2];
	ArrayList c = new ArrayList() ;
	
	String s5 = "A man, a plan, a canal: Panama";
	
	
	String s6 = s5.replaceAll("[^a-zA-Z]", "").toLowerCase();
	//System.out.println(s6);
	
	char[] s7 = s6.toCharArray();
	
	int  s=s7.length;
	
	for(char i: s7)
	
	System.out.println(i);
	
	//System.out.println(s5.toCharArray());
	
	//System.out.println(s);
	
	
	String S = "cat dog and plan";
    
    String t = "baa";
    
    String sr[] = S.split(" ");
    
    sr.toString();
    System.out.println(sr[1]);
    
    
       
    String a1 = "ww";
    
    String a2 = "qwyw";
    
    System.out.println(a2.indexOf(a1));
    
   System.out.println(a1.concat(a1));
   System.out.println(a1.repeat(3)); 
   
    
   // System.out.println(S.contentEquals(t));
  //  System.out.println(S.contentEquals(t));
    
		
	}

}

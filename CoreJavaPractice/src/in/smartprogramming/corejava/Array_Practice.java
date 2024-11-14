package in.smartprogramming.corejava;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Array_Practice {

	public static  void main(String[] args) {
		
		HashMap hm = new HashMap();
		
		 Queue<Integer> q1 = new LinkedList<Integer>();
		 
		 ArrayList ar = new ArrayList();
		 ar.get(0);
		 
		 
		
		int index =  (int) Math.ceil(2.5);
		System.out.println(index);
	
		
		
		String logs[] = {"88 99 200", "99 88 221", "99 88 150", "12 12 50"};
		
		System.out.println(logs);
		
		String s1 = "88 99 100";
		String s2 = "88 99 200";
		System.out.println(s1.toCharArray());
		

		//Write a Java Program to Find the Largest Element in Array

		int ar[] = {25,80,115,2,25,35,1000};
		Arrays.sort(ar);
		
		for(int i: ar)
		System.out.print(i+ " ");
		
		int largest =ar[0];
		for (int i=0; i<ar.length; i++) {
			if (ar[i]>largest) {
				largest = ar[i];
				
			}
		}
		
		System.out.println("The largest number is "+ largest);
		
		
		
		
		//Removing duplicate elements from an array
		int[] ar2 = {5,2,2,3,3,3,4,5,6,6,1,1,1,1};
		ArrayList newAr = new ArrayList();
		
		
		for (int i=0; i<ar2.length-1;i++) {
			
			if (!newAr.contains(ar2[i])) {
			//	newAr.add(ar2);
				newAr.add(ar2[i]);
			}
			
		}
		System.out.println(newAr);
		
		
		
		//remove all occurences of an element
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		int[] ar3 = {5,2,2,3,3,3,4,5,6,6,1,1,1,1};
		ArrayList newAr1 = new ArrayList();
		
		
		for (int i=0; i<ar3.length-1;i++) {
			
			if(!newAr1.contains(key)) {
			
				newAr1.add(ar3[i]);
				newAr1.remove(key);
	
			}	
						
		}
				System.out.println(newAr1);
				
				
		
				
		
	}

}

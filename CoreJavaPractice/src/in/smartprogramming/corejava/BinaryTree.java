package in.smartprogramming.corejava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
	public static void main(String[] args) {

	/*	int n = 10;
		for(int i=1; i<n;i++) {
			if(i*3 == n) {
				System.out.println("Fizz");
				
			if (i*5==n) {
				System.out.println("FizzBuzz");
				break;
			}
		}
			
			
		
		}
	}
}
	
	    	
	    int nums1 []= {0,0,1,1,1,2,2,3};
	    	HashSet hs =new HashSet();
	    	for(int i=0; i<nums1.length; i++) {
	    	hs.add(nums1[i]);
	    	}
	    	System.out.println(hs);*/
	    	
	    	
	    	
	   /// 	return hs.size();


	    	
	
	    	int [] nums = {2,2,1,1,1,2,2,5,15};
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		int n =nums.length;
		for(int i=0; i<n-1; i++) {
			if(hm.containsKey(hm)) {
				hm.put(nums[i],  hm.getOrDefault(nums[i], 0) + 1);
			}else hm.put(nums[i+1],1);
			
		}
		
	//System.out.println(hm.get(2));
		for(int k: hm.keySet())
		{
		//	if (hm.get(k)>n/2) 
				
			System.out.println(hm);
		
	
	}
	}
	
	}


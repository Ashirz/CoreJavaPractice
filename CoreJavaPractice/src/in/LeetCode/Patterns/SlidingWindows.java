package in.LeetCode.Patterns;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
public class SlidingWindows {

	public static void main(String[] args) {
		 
		int[] a = {2,6,1,-6,-1,8,5,-2,20,5};
		
		System.out.println("Maximum Average: "+maxAverage(a, 4));
		
		int[] arr = {-10, -2, -8, -5,-1};
        System.out.println("Maximum Sum (Kadanes): "+maxSubarraySum(arr));
        
        System.out.println("Maximum Sum (Alternative Kadanes): "+maxSubArraySum(arr));
        
    //    System.out.println("Maximum Sum(my method): "+maxSubArraySum(arr));
        
        System.out.println("Maximum Product: "+maxSubArrayProduct(arr));
       int  arr1[] = {1, 2, 3, 5} ;
       
             
        System.out.println("Missing number is : "+ missingNumber(arr1));
	}

	//Maximum Average subArray - find the max average from subArrays of size(k);
	private static float maxAverage(int[] a, int k) {
				
		int start =0;
		int sumWin = 0;
		float max= Float.NEGATIVE_INFINITY;
		
		
		
		for(int end=0; end<a.length; end++) {
			
			sumWin = sumWin +a[end];
			
			
			//static sliding window
			if(end-start+1 == k) {
				max = Math.max(max, (float)sumWin/k );
				sumWin = sumWin - a[start];
				start++;}
			
		}
		return max;
	}
	
	
	
	
	// Maximum Subarray Sum using Kadane's Algorithm -GFG
	   static int maxSubarraySum(int[] arr) {
		   
		 //  {2, 3, -8, 7, -1, 2, 3}
		   
		    int res = arr[0];
	        int maxEnding = arr[0];

	        for (int i = 1; i < arr.length; i++) {
	            
	            // Find the maximum sum ending at index i by either extending 
	            // the maximum sum subarray ending at index i - 1 or by
	            // starting a new subarray from index i
	            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
	          
	            // Update res if maximum subarray sum ending at index i > res
	            res = Math.max(res, maxEnding);
	        }
	        return res;
	    }

	   //Alternative Kadanes - YT
	   static int maxSubArraySum(int[] arr) {
		   
		   int winSum = 0;
		   int max= Integer.MIN_VALUE;
		   
		   
		   for(int i=0; i<arr.length; i++) {
			   winSum = winSum+arr[i];
			   
			   max = Math.max(max, winSum);
			   if(winSum<0)
			   {  winSum=0;}
			   			 	   
			   }
		   return max;
		   }
	   
	   //Finding maximum product 
	   static long maxSubArrayProduct(int[] arr) {
		  	 
		   long currMin = arr[0];
		   long currMax = arr[0];
		   long maxProd = arr[0];
		
		   
		   for(int i=0; i<arr.length; i++) {
			   
			  long temp = max(arr[i]*1L, arr[i]*currMin, arr[i]*currMax);	 
			 currMin = min(arr[i]*1L, arr[i]*currMin, arr[i]*currMax);
			 currMax = temp;
			   
				
				maxProd = Math.max(maxProd, currMax);
						   }
		   return maxProd;
		   }
	   
	   
	   static long min(long l, long b, long m) {
		   return Math.min(l,  Math.min(b, m));
	   }
	   
	   static long max(long l, long m, long n) {
		   return Math.max(l,  Math.max(m, n));
	   }
	   
	   //Finding the missing number in a sorted array of no duplicates
	   
	 //  arr[] = {1, 2, 4, 6, 3, 7, 8}

	   static int missingNumber(int[] arr) {
		   
		   Arrays.sort(arr);
		   int element = arr[0];
		   
		   for (int i=0; i<arr.length; i++) {
			   if(arr[i] != i+1) {
				   return i+1;
				   
			   }
		   }
		   return arr.length+1;
	   }
	   
	  
	   
	}

	
	



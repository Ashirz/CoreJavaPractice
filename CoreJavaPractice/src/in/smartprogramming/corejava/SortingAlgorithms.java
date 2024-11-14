package in.smartprogramming.corejava;

public class SortingAlgorithms {

	public static void main(String[] args) {
		
		int array[] = {5,8,9,1,2,6,4};
		
		//Quick Sort
		quickSort(array, 0, array.length-1);
		
		System.out.println("Implementing quick sort");
		for(int i: array) System.out.print(i);	
		System.out.println();

		
		//Merge sort
		
			Divide(array);
				
			System.out.println("Implementing merge sort");
			for(int i: array) System.out.print(i);	
			System.out.println();
		
		
		//Bubble Sort
		
		int ar1[] = {5,8,9,1,2,6,4};
		
		for (int i=0; i<ar1.length; i++) {
			for (int j=0; j<ar1.length-i-1; j++) {
				if(ar1[j]>ar1[j+1]) {
					int temp = ar1[j];
					ar1[j] = ar1[j+1];
					ar1[j+1] = temp;
					
					
				}
			}
			
		}
		System.out.println("Implementing bubble sort");
		for(int i : ar1)
		System.out.print(i);

		
		//Selection sort
		int ar2[] = {5,8,9,1,2,6,4};
		
		int temp, min;
		
		for(int i=0; i<ar2.length; i++) {
			min =i;
			for(int j=i+1; j<ar2.length; j++) {
				if(ar2[min]>ar2[j]) {
					min=j;
					
				}
				
			}
			temp = ar2[i];
			ar2[i] = ar2[min];
			ar2[min] = temp;
		}
		
		System.out.println();
		System.out.println("Implementing selection sort");
		for(int i:ar2)
			System.out.print(i);
		
		//Insertion sort- can we use for instead of while?
		
		int ar3[] = {5,8,9,1,2,6,4};
		
		for(int i=1; i<ar3.length; i++) {
			
			int temp1 = ar3[i];
			
			int j=i-1;
			
			while (j>=0 && ar3[j]>temp1) {
				 
					ar3[j+1] = ar3[j];
					j--;
				}
				ar3[j+1] = temp1;
			}
			
		System.out.println();
		System.out.println("Implementing insertion sort");
		for(int i:ar3)
			System.out.print(i);
		
		
					
	}
	
	//Merge sort methods divide & conquer
	public static void Divide(int[] array) {
		
		int length = array.length;
		
		int mid = length/2;
		
		if(length <=1) return;
		
		//Subarrays		
		int[] LeftArray = new int [mid];
		int[] RightArray = new int[length-mid];
		
		int i=0,j=0;
		
		//populating subarrays
		for(; i<length; i++) {
			if(i<mid) {
				LeftArray[i] = array[i];
				
				
			}else {
				RightArray[j] = array[i];
				j++;}
			
		}
		
		Divide(LeftArray);
		 
		Divide(RightArray);
		
	    Conquer(LeftArray, RightArray, array);
	    
	    
			
		}

	private static void Conquer(int[] leftArray, int[] rightArray, int[] array) {
		int length = array.length;
		int leftsize = length/2;
		int rightsize = length-leftsize;
		
		int l=0,r=0,i = 0;
		
		//populating the sorted array back
		while (l<leftsize && r<rightsize) {
			if(leftArray[l]<rightArray[r]) {
				array[i] = leftArray[l];
				i++;
				l++;
			} else {array[i] = rightArray[r];
			i++;
			r++;
		}
		
	}
		
		while(l<leftsize) {
			array[i] = leftArray[l];
			i++;
			l++;
		}
	
		while(r<rightsize) {
			array[i] = rightArray[r];
			i++;
			r++;
		}
		
		
	}
	
	
	private static void quickSort(int[] array, int start, int end) {
		if(end<=start) return;
		
		int pivot = partition(array, start, end);
		quickSort(array, start, pivot-1);
		quickSort(array, pivot+1, end);
				
	}

	private static int partition(int[] array, int start, int end) {
		
		int pivot = array[end];
		int j = start-1;
		
		for (int i=start; i<array.length; i++) {
			if(array[i]<pivot) {
				j++;
				int temp;
				
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		
		j++;
		
		int temp = array[j];
		array[j]  = array[end];
		array[end] =temp;
		
		return j;
	}
}




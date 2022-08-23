package Arrays;


import java.util.*;
import java.io.*;

class Reverse {
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		while(t > 0) {
		    int n = scn.nextInt();
		    int[] arr = new int[n];
		    
		    for(int i=0; i<n; i++) {
		        arr[i] = scn.nextInt();
		    }
		    t--;
		    
		    reverseArray(arr);
		
		for(int i=0; i<arr.length; i++) {
		    System.out.print(arr[i] + " ");
		}
		System.out.println();
		}
		
	}
	
	public static void reverseArray(int[] arr) {
	    int left = 0;
	    int right = arr.length - 1;
	    
	    while(left<right) {
	        int temp = arr[left];
	        arr[left] = arr[right];
	        arr[right] = temp;
	        left++;
	        right--;
	    }
	}
}
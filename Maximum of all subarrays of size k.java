//Maximum of all subarrays of size k

/*
Given an array A and an integer K. Find the maximum for each and every contiguous subarray of size K.
*/


import java.util.*;
import java.lang.*;
import java.io.*;

class Test {
	public static void main (String[] args) {
	Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		for(int i =0 ; i<cases ; i++){
		    int size = input.nextInt();
		    int k = input.nextInt();
		    int []arr = new int[size];
		    for(int j=0; j<size;j++) arr[j] = input.nextInt();
		    
		    int j, max;
 
        for (int l = 0; l <= size - k; l++) {
             
            max = arr[l];
 
            for (j = 1; j < k; j++) 
            {
                if (arr[l + j] > max)
                    max = arr[l + j];
            }
            System.out.print(max + " ");
        }
        System.out.println();
		}
	}
}
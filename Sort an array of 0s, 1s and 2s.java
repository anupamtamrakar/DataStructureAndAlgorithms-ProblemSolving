// Sort an array of 0s, 1s and 2s

//Given an array A of size N containing 0s, 1s, and 2s; you need to sort the array in ascending order.


import java.util.*;
import java.lang.*;
import java.io.*;

class Test {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int test = input.nextInt();
		for (int i = 0;i < test; i++){
		    int size = input.nextInt();
		    int []arr = new int[size];
		    for ( int j =0 ; j <size;j++) arr[j] = input.nextInt();
		    sortfun(arr, size);
		    System.out.println();
		}
	}
	
	private static void sortfun(int []arr, int size){
	    int zeros = 0;
	    int ones = 0;
	    int twos = 0;
	    for (int i=0;i<size; i++){
	        if(arr[i] == 0) zeros++;
	        if(arr[i] == 1) ones++;
	        if(arr[i] == 2) twos++;
	    }
	    /*System.out.print(zeros); 
	    System.out.print(ones); 
	    System.out.print(twos); */
	    for (int i=0;i<zeros; i++){
	       System.out.print(0 + " "); 
	    }
	    for (int i=0;i<ones; i++){
	       System.out.print(1 + " "); 
	    }
	    for (int i=0;i<twos; i++){
	       System.out.print(2 + " "); 
	    }
	}
}
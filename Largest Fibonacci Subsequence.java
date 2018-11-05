// Largest Fibonacci Subsequence

/*
Given an array with positive number the task to find the largest subsequence from array that contain elements which are Fibonacci numbers.
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
		    int []arr = new int[size];
		    for(int j=0; j<size;j++) arr[j] = input.nextInt();
		    
		    for(int j=0; j<size;j++){
		        if(isFibonacci(arr[j]))
		            System.out.print(arr[j] + " ");
		    }
		   System.out.println(); 
	}
	}
	
	// A utility method that returns true if x is perfect square
    static  boolean isPerfectSquare(int x)
    {
        int s = (int) Math.sqrt(x);
        return (s*s == x);
    }
      
    // Returns true if n is a Fibonacci Number, else false
    static boolean isFibonacci(int n)
    {
        // n is Fibonacci if one of 5*n*n + 4 or 5*n*n - 4 or both
        // is a perfect square
        return isPerfectSquare(5*n*n + 4) ||
               isPerfectSquare(5*n*n - 4);
    }
}
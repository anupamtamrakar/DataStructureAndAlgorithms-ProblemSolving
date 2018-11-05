// Next larger element

/*
Given an array A of size N having distinct elements, the task is to find the next greater element for each element of the array in order of their appearance in the array. If no such element exists, output -1 
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
	            int g = -1;
	            int k;
	            for(k =j+1;k<size;k++){
	                if(arr[k]> arr[j]){
	                    System.out.print(arr[k] + " ");
	                    break;
	                }
	            }
	            if(k == size)
	                System.out.print(g + " ");
	        }
	        System.out.println();
		}
	}
}
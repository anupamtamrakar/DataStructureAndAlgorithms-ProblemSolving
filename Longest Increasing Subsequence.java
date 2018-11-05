// Longest Increasing Subsequence

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		for(int i =0 ; i<cases ; i++){
		    int size = input.nextInt();
		    int []arr = new int[size];
		    for(int j=0; j<size;j++) arr[j] = input.nextInt();
		    int []temp = new int[size];
		    for(int j=0; j<size;j++) temp[j] =1;
		    
		    for(int j=1; j<size;j++){
		        for(int k=0;k<j;k++){
		            if(arr[j]>arr[k] && temp[j]<temp[k]+1)
		                temp[j] = temp[k]+1;
		        }
		    }
		    
		    int max= 0;
		    for(int j=0; j<size;j++){
		        if(temp[j]>max)
		            max = temp[j];
		    }
		    System.out.println(max);
		}
	}
}
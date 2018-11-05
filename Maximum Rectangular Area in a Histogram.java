//Maximum Rectangular Area in a Histogram

import java.util.*;
import java.lang.*;
import java.io.*;

class Test {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		for(int x =0 ; x<cases ; x++){
		    int size = input.nextInt();
		    int []arr = new int[size];
		    for(int j=0; j<size;j++) arr[j] = input.nextInt();
		    
		    int max = 0;
		    
		    for(int j=0; j<size;j++){
		        int i=j;
		        int k=j;
		        int rec;
		        while(i>=0 && arr[j]<= arr[i])
		            i--;
		        while(k<=size-1 && arr[j]<=arr[k])
		            k++;
		        
		        rec = arr[j] * (k-i-1);
		        if(rec >= max)
		            max = rec;
		            
		    }
		   System.out.println(max);
		}
	}
}
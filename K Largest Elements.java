// k largest elements



import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		for(int i =0 ; i<cases ; i++){
		    int size = input.nextInt();
		    int k = input.nextInt();
		    int []arr = new int[size];
		    for(int j=0; j<size;j++) arr[j] = input.nextInt();
		    
		    Arrays.sort(arr);
		    
		    for(int j=size-1; j>0 && k>0;j--,k--){
		        System.out.print(arr[j]+ " ");
		    }
		    
		 System.out.println();   
		}
	}
}



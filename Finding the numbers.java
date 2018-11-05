// Finding the numbers

/*

You are given an array A containing 2*N+2 positive numbers, out of which 2*N numbers exist in pairs whereas the other two number occur exactly once and are distinct. You need to find the other two numbers and print them in ascending order.
*/


import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Map;
import java.util.HashMap;

class Test {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		for(int i =0 ; i<cases ; i++){
		    int size = input.nextInt();
		    size = 2*size + 2;
		    int []arr = new int[size];
		    for(int j=0; j<size;j++) arr[j] = input.nextInt();
		    findnum(arr, size);
		}
	}
	
	private static void findnum(int []arr, int size){
	    int value = -1;
	    Map <Integer, Integer> map = new HashMap<Integer,Integer>();
	    for (int i=0;i<size;i++){
	        if(map.containsKey(arr[i])){
	            map.remove(arr[i]);
	        }
	        else{
	            map.put(arr[i],1);
	        }
	    }
	    
	    for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
	            if(value == -1)
	                value = entry.getKey();
	            else
	                if(value < entry.getKey())
	                    System.out.print(value + " " + entry.getKey());
	                else
	                    System.out.print(entry.getKey() + " " + value);
	    }
	    System.out.println();
	}
}
// Power of 2


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		for(int i =0 ; i<cases ; i++){
		    long num = input.nextLong();
		   
		    if((num != 0) && ((num & (num-1)) == 0))
		        System.out.println("YES");
		    else
		        System.out.println("NO");
		}
	}
}
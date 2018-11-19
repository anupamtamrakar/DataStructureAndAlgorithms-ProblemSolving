
/* Author: Anupam Tamrakar */

import java.util.*;
import java.lang.*;
import java.io.*;


class test
{
	public static void main(String args[]) {
		int n = 4;
		int [] A = new int[n];
		recur(n,A);
	}
	
	public static void recur(int n,int [] A) {
		if(n<1) {
			for(int i=0;i<A.length;i++)
				System.out.print(A[i]);
			System.out.println();
		}
		else {
			A[n-1] = 0;
			recur(n-1,A);
			A[n-1] = 1;
			recur(n-1,A);
		}
	}
	
}
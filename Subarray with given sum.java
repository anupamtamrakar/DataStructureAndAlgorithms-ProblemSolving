// Subarray with given sum

// Given an unsorted array A of size N of non-negative integers, find a continuous sub-array which adds to a given number.


import java.util.*;
import java.lang.*;
import java.io.*;

class Test {
	public static void main (String[] args) throws java.lang.Exception {
	Scanner input = new Scanner(System.in);
        int numCases = input.nextInt();
        for (int i=0;i<numCases;i++) {
            int size = input.nextInt();
            int k = input.nextInt();
            int[] array = new int[size+1];
            for (int j=1;j<size+1;j++) array[j] = input.nextInt();
            printSubArrayIndexes(array, k, size);
        }
	}
	
    private static void printSubArrayIndexes (int[] array, int sum, int size) {
        int cur = 0;
        int left_index = 1;
        int right_index = 1;
        while(right_index < size + 1){
                if(cur < sum){
                cur = cur + array[right_index];
                right_index++;
                }
            while (cur > sum){
                cur = cur - array[left_index];
                left_index++;
            }
            
            if(cur == sum){
                System.out.println(left_index + " " + (right_index - 1));
                break;
            }
        }
        if(cur != sum)
            System.out.println(-1);
    }
}


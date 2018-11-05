//Edit Distance

/*
Given two strings str1 and str2 and below operations that can performed on str1. Find minimum number of edits (operations) required to convert ‘str1′ into ‘str2′.

Insert
Remove
Replace
All of the above operations are of cost=1.
Both the strings are of lowercase.
*/


import java.util.*;
import java.lang.*;
import java.io.*;

class Test {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		for(int k=0 ; k<cases ; k++){
		    int m = input.nextInt();
		    int n = input.nextInt();
            String a, b;

            a= input.next();
            b= input.next();
            System.out.println(fun(a,b,m,n));
		}
	}
	
	public static int fun(String a, String b, int m, int n){
	    // Create a table to store results of subproblems 
    int [][]dp = new int[m+1][n+1]; 
  
    // Fill d[][] in bottom up manner 
    for (int i=0; i<=m; i++) 
    { 
        for (int j=0; j<=n; j++) 
        { 
            // If first string is empty, only option is to 
            // isnert all characters of second string 
            if (i==0) 
                dp[i][j] = j;  // Min. operations = j 
  
            // If second string is empty, only option is to 
            // remove all characters of second string 
            else if (j==0) 
                dp[i][j] = i; // Min. operations = i 
  
            // If last characters are same, ignore last char 
            // and recur for remaining string 
            else if (a.charAt(i-1) == b.charAt(j-1)) 
                dp[i][j] = dp[i-1][j-1]; 
  
            // If the last character is different, consider all 
            // possibilities and find the minimum 
            else
                dp[i][j] = 1 + Math.min(Math.min(dp[i][j-1],dp[i-1][j]),dp[i-1][j-1]); 
        } 
    } 
  
    return dp[m][n]; 
	    
	}
}
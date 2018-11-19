/* package whatever; // don't place package name! */
/* Author: Anupam Tamrakar */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s = "Bajee Sheik";
		int len = s.length();
		StringBuilder str = new StringBuilder();
	    System.out.println(rev(s, str, len));
		
	}
	
	public static String rev(String s, StringBuilder str, int len){
		if(len == 0)
			return str.toString();
		str.append(s.charAt(len-1));
		return rev(s,str,len-1);
	}
}
package com.batch24;

public class MathPractice {
	// Java program to Compare two strings
	// lexicographically
	public class GFG {
	  
	    // This method compares two strings
	    // lexicographically without using
	    // library functions
	    public int stringCompare(String str1, String str2)
	    {
	  
	        int l1 = str1.length();//Geeksforgeeks//13
	        int l2 = str2.length();//Geeks//5
	        int lmin = Math.min(l1, l2);//5
	  
	        for (int i = 0; i < 5; i++) {
	            int str1_ch = (int)str1.charAt(i);//79
	            int str2_ch = (int)str2.charAt(i);//79
	  
	            if (str1_ch != str2_ch) {
	                return str1_ch - str2_ch;
	            }
	        }
	  
	        // Edge case for strings like
	        // String 1="Geeks" and String 2="Geeksforgeeks"
	        if (l1 != l2) {//13 vs 5
	            return l1 - l2;
	        }
	  
	        // If none of the above conditions is true,
	        // it implies both the strings are equal
	        else {
	            return 0;
	        }
	    }
	  
	    // Driver function to test the above program
	    public void main(String args[])
	    {
	        String string1 = new String("Geeksforgeeks");
	        String string2 = new String("Practice");
	        String string3 = new String("Geeks");
	        String string4 = new String("Geeks");
	  
	        // Comparing for String 1 < String 2
	        System.out.println("Comparing " + string1 + " and " + string2
	                           + " : " + stringCompare(string1, string2));
	  
	        // Comparing for String 3 = String 4
	        System.out.println("Comparing " + string3 + " and " + string4
	                           + " : " + stringCompare(string3, string4));
	  
	        // Comparing for String 1 > String 4
	        System.out.println("Comparing " + string1 + " and " + string4
	                           + " : " + stringCompare(string1, string4));
	    }
	}
}

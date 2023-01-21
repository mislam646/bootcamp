package com.batch24;

public class Palindrome {
public static void main(String[] args) {
	String name = "United State of America";

	int count = 0;
	for (int i = 0; i <= name.length()-1; i++) {
		if (name.charAt(i)== 't') {
			count++;

		}
	}
	System.out.println(count);
}



}


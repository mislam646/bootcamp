package com.batch24;

public class MatchingString {
public static void main(String[] args) {
	String a = "dog";
	String b = "gog";
	
	if (a.charAt(0)==b.charAt(0)) {
		System.out.println("first charecter matching");
	}
	else {
		System.out.println("first charecter not matching");
	}
	
	if (a.charAt(a.length()-1)==b.charAt(b.length()-1)) {
		System.out.println("last charecter matching");
	}
	else {
		System.out.println("last charecter not matching");
	}
	
}
}

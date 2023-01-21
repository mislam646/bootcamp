package com.batch24;

import java.util.ArrayList;

public class PrimeNumber {
	public static void main(String[] args) {
		PrimeNumber abc= new PrimeNumber();
		abc.verifyPrimenumber();
	}
	
	void verifyPrimenumber(){
		int i =279;
		ArrayList j = PrimeNumber.printPrimeNumber();
		if(j.contains(i)) {
			System.out.println(i+" is a prime number");
		}
		else {System.out.println(i+ " is not a prime number");}
		
	}
	
	static ArrayList printPrimeNumber(){
		
	ArrayList <Integer> y =new ArrayList<Integer>();
		for(int i= 1;i<=300;i++) {
			for(int j=2;j<=i;j++) {
				if(j==i) {
					//System.out.println(i);
					y.add(i);
				}
				if(i%j==0) {break;}
			}
			
		}
		//System.out.println(y);
		return y;
	}


}

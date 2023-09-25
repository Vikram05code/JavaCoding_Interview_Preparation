package com.vikram.coding;

import java.util.Scanner;

public class CheckPrimeNumber {
   
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int number = scan.nextInt();
		
		if(matchPrime(number)) {
			System.out.println(number+" is a prime number");
		}else {
			System.out.println(number+" is not a prime number");
		}
	}
	
	public static boolean matchPrime(int num) {
		if(num <= 1) {
			return false;
		}
		
		for(int i=2; i<num; i++) {
			if(num % i==0) {
				return false;
			}
		}
		return true;
	}
}

package com.vikram.coding;

import java.util.Scanner;


public class PalindromeChecker {
   
	public static boolean isPalindrome(String str) {
		//Step 1: Normalize tthe string
		String cleanedString = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		int left = 0;
		int right = cleanedString.length()-1;
		
		while(left<right) {
			if(cleanedString.charAt(left)!= cleanedString.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
 public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence : ");
		String str1 = sc.nextLine();
		
		boolean result = isPalindrome(str1);
		
		System.out.println("Is String "+str1 +" a Palindrome : "+result);
		
	
}
	
}	
	
	
	
	

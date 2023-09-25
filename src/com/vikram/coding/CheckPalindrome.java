package com.vikram.coding;

import java.util.Scanner;

public class CheckPalindrome {
	/*
	 * public static void main(String args[]) { Scanner s = new Scanner(System.in);
	 * System.out.print("Enter a Word: "); String word = s.nextLine();
	 * System.out.println("Is "+word+" palindrome? - "+isWordPalindrome(word)); }
	 * 
	 * 
	 * public static boolean isWordPalindrome(String word){ String reverseWord =
	 * getReverseWord(word); //if word equals its reverse, then it is a palindrome
	 * if(word.equalsIgnoreCase(reverseWord)){ return true; } return false; }
	 * 
	 * public static String getReverseWord(String word){ if(word == null ||
	 * word.isEmpty()){ return word; }
	 * 
	 * return word.charAt(word.length()- 1) + getReverseWord(word.substring(0,
	 * word.length() - 1)); }
	 */
	
	
	
	  public static void main(String[] args) {
		  
		  Scanner scan = new Scanner(System.in);
		  System.out.print("Enter a String: ");
		  String str1 = scan.nextLine();
		  
		  System.out.println("Is String "+str1+" a Palindrome?: ");
		  boolean result = isPalindrome(str1);
		  System.out.println(result);
		  
	  }
	
	    public static boolean isPalindrome(String str) {
	    	
	    	String cleanStr = str.replaceAll("^a-zA-Z0-9", "").toLowerCase();
	    	
	    	int left = 0;
	    	int right = cleanStr.length()-1;
	    	
	    	char[] chars = cleanStr.toCharArray();
	    	
	    	while(left<right) {
	    		if(chars[left] != chars[right]) {
	    			return false;
	    		}
	    		left++;
	    		right--;
	    	}
	    	return true;
	    			
	    	}
	    	
	    	
	    	
	    	
	
	} 

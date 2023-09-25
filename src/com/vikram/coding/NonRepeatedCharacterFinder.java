package com.vikram.coding;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class NonRepeatedCharacterFinder {
   
	public static void main(String[] args) {
		
	   Scanner scanner = new Scanner(System.in);
	   System.out.println("Enter a sentence");
	   String str1 = scanner.nextLine().toLowerCase();
	   
	   char result = firstNonRepeatedCharacter(str1);
	   if(result != '0') {
		   System.out.println("The first non-repeated character is: "+result);
	   }
	   else {
		   System.out.println("All characters are repeated");
	   }
	   
	}
	
	
	public static char firstNonRepeatedCharacter(String input) {
		
		//step 1: Build a frequency count for each character
		
		Map<Character, Integer> charCount = new LinkedHashMap<>();
		for(char ch : input.toCharArray()) {
			charCount.put(ch, charCount.getOrDefault(ch, 0)+ 1);
		}
		
		//step 2: find the first character with a count of 1
		for(char ch : input.toCharArray()) {
			if(charCount.get(ch)==1) {
				return ch;
			}
		}
		return '0';
	}
	
	
}

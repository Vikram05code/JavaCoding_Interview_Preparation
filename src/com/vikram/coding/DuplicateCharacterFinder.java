package com.vikram.coding;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class DuplicateCharacterFinder {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a text : ");
		String text = scan.nextLine();
		
		System.out.println("Duplicate characters in the strings are: ");
		findDuplicates(text);
	}
	
	public static void findDuplicates(String str) {
		Map<Character, Integer> charCountMap = new HashMap<>();
		
		for(char c : str.toCharArray()) {
			charCountMap.put(c, charCountMap.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			if(entry.getValue() > 1) {
				System.out.println(entry.getKey()+" ");
			}
		}
	}
	
}

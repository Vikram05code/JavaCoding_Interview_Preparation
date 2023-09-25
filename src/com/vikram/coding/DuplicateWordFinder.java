package com.vikram.coding;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateWordFinder {
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Sentenece: ");
		String str1 = scan.nextLine();
		System.out.println("Duplicate words in sentence are : ");
		findDuplicateWords(str1);
	}
	
	
	public static void findDuplicateWords(String str) {
		String[] words = str.split(" ");
		Map<String, Integer> wordCountMap = new HashMap<>();
		
		for(String word : words) {
			String wordLowerCase = word.toLowerCase();
			wordCountMap.put(wordLowerCase, wordCountMap.getOrDefault(wordLowerCase, 0)+1);
			
		}
		
		
		
		for(Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+": "+entry.getValue()+" times");
			}
		}
	}
}

package com.vikram.coding;

public class CheckVowels {
   
	public static void main(String[] args) {
		String str="thymlf";
		if(matchVowels(str)) {
			System.out.println("The string contains vowels");
		}else {
			System.out.println("The string does not contains vowels");
		}
		
	}
	
	public static boolean matchVowels(String word) {
		word = word.toLowerCase();
		
		for(int i=0; i<word.length(); i++) {
			char c= word.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				return true;
			}
		}
		return false;
	}
}

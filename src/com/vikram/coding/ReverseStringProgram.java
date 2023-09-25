package com.vikram.coding;

public class ReverseStringProgram {
	
     public static void main(String [] args) {
    	 String str = "Vikram";
    	String result = reverse(str);
    	System.out.println(result);
     }
     
     public static String reverse(String word) {
    	 if(word==null) {
    		 throw new IllegalArgumentException("null is not a valid input");
    	 }
    	 StringBuilder strObj = new StringBuilder();
    	 char[] chars = word.toCharArray();
    	 for(int i=chars.length-1; i>=0; i--) {
    		 strObj.append(chars[i]);
    	 }
    	 return strObj.toString();
     }
}

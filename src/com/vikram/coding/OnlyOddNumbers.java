//How do you check if a list of integers contains only odd numbers in java?

package com.vikram.coding;

import java.util.List;

public class OnlyOddNumbers {
  
	public static void main(String[] args) {
		
	}
	public static boolean onlyOddNumbers(List<Integer> list) {
		for(int num : list) {
			if(num%2==0) {
				return false;
			}
		}
		return true;
	}
}

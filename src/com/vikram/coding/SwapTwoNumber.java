package com.vikram.coding;

public class SwapTwoNumber {
   
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("Before Swapping a="+a+",b="+b);
		
		b=a+b;
		a=b-a;//a swapped
		b=b-a;//b swapped
		System.out.println("After Swapping a="+a+",b="+b);
	}
}

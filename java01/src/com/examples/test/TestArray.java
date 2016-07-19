package com.examples.test;

public class TestArray {
	public static void main(String[] args){
		System.out.println("Testing arrays");
		int start[] = new int[10];
		int end[] = {1};
		System.out.println("Printing the size of start : "+start.length);
		
		//default element in an array is zero
		for (int i = 0; i<start.length; i++){
			System.out.println(start[i]);
		}
		
		for (int j = 0; j<10; j++){
			end[j] = j;
		}
		
		for (int k = 0; k < end.length; k ++){
			System.out.println(end[k]);
		}
	}
}

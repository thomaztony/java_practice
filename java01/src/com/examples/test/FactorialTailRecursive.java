package com.examples.test;

public class FactorialTailRecursive {
	public static void main(String[] args){
		System.out.println("Inside the tail recursive factorial class");		
		int n = 5;
		int factorial = fact (1, n);
		System.out.println("Factorial of number : "+n + " is = " + factorial);
	}
	
	public static int fact(int acc, int n){
		int accumulator = acc;	
		if (n==0){
			return accumulator;
		}
		else{
			accumulator = fact(acc*n, n-1);
		}
			
		return accumulator;
	}
}

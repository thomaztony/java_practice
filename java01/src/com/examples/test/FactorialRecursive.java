package com.examples.test;

public class FactorialRecursive {
	public static void main(String[] args){
		System.out.println("Inside Factorial class");
		int n = 16;
		int factorial = fact(n);
		System.out.println("Factorial of number : "+n + " is = " + factorial);
		
	}
	
	public static int fact(int n){
		int fact = 1;
		
		if (n==0){
			fact = 1;
		}else{
			fact = n * fact(n-1);
		}
		return fact;
	}
}

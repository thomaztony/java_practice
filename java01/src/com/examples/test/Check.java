package com.examples.test;

public class Check {
	public static void main (String[] args){
		char c_array[] = {'1', '2'};
		Test test = new Test(c_array);
		test.print();
		
		Check check = new Check();
		check.functionBreakTest(c_array);
		
		boolean result = check.functionReturnTest(c_array);
		System.out.println("Printing the result : "+ result);
		//System.out.println("Printing the value of un-initialized x : " + x);
		
		Object obj1 = new Object();
		System.out.println("Printing the object obj1 : >> "+ obj1);
		System.out.println("Testing equals and hashCode methods : >> "+ obj1.equals(obj1));
		
		Object obj2 = new Object();
		System.out.println("Printing the object obj2 : >> "+ obj2);
		System.out.println("Testing the equals and hashCode methods 2: >> "+obj1.equals(obj2));
		
		obj2 = obj1;
		
		System.out.println("Testng the equals and hashCode methods 3: >> "+ obj1.equals(obj2));
		
	}
	
	void functionBreakTest(char[] c_array){
		System.out.println("Start of functionBreak method");
		
		for (char c : c_array){
			if (Character.toString(c).equals("1")){
				
				System.out.println("The value of c is 1");
				break;
			}
			
			System.out.println("Before exiting the for loop");
			
			System.out.println("After breaking from the for loop");
			int x = 10;
			System.out.println("Printing the value of x : " + x);
		}
	}
	
	public boolean functionReturnTest(char[] c_array){
		
		if (c_array.length == 2){
			
			return true;
		}
		
		if (c_array.length < 3){
			System.out.println("Array length is less than 3");			
		}
				
		return false;
	}
	
	public void print(){
		System.out.println("Test");
	}
	
}

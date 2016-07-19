package com.examples.test;

import java.util.Arrays;

public final class Test {
	
	private final char c[];	
	
	public Test(char s[]){
		this.c = s;	
	}
	
	public void print(){
		System.out.println("Printing char array c : "+ c);
		System.out.println("Printing the content of array c : "+ Arrays.toString(c) );
	}
	
	public static void main(String[] args){
		
		//Equality of String objects
		
		/*String str1 = "core_java";
		String str2 = "core_java";*/
		
		/*String str1 = "core_java";
		String str2;
		str2 = str1;*/
		
		String str1 = new String("core_java");
		String str2 = new String("core_java");
		
		if(str1 == str2){
			System.out.println("str1:" +str1+" and str2:"+ str2+" are equal with '==' ");
		}else {
			System.out.println("str1:" +str1+" and str2:"+ str2+" are not equal with '=='");
		}
		
		if (str1.equals(str2)){
			System.out.println("str1:" +str1+" and str2:"+ str2+" are equal with equals()");
		}else {
			System.out.println("str1:" +str1+" and str2:"+ str2+" are not equal with equals()");
		}
		
		if (str1.hashCode() == str2.hashCode()){
			System.out.println("Hashcodes for str1:"+str1+" and str2:"+str2+" are equal");
		}else{
			System.out.println("Hashcodes for str1:"+str1+" and str2:"+str2+" are not equal");
		}
		
		System.out.println("Hashcode of str1 : >> "+ str1.hashCode());
		System.out.println("HexString of str1 : >> "+ Integer.toHexString(str1.hashCode()));
		System.out.println("Hashcode of str2 : >> "+ str2.hashCode());
		System.out.println("HexStirng of str2 : >> "+ Integer.toHexString(str2.hashCode()));
		
		
		//Converting String to Character array and vice-versa
		
		System.out.println("Printing the character array for str1 : >> "+ str1.toCharArray());
		char[] charArray = str1.toCharArray();
		for (char c : charArray){
			System.out.println("Printing the elements of the charArray : >> " + c);
		}
		
		System.out.println("Printing the charArray as string : >> "+charArray);
		
		//Equality of primitives(integer)
		
		int num1 = 10;
		int num2 = 12;
		if (num1 == num2){
			System.out.println("num1 and num2 are equal with '=='");
		}else{
			System.out.println("num1 and num2 are not equal with '=='");
		}
		
		
		char val[] = new char[0];
		char val1[] = new char[1];
		char val2[] = {'1','2'};
		val1[0]='c';
		char val3[] = str2.toCharArray();
		System.out.println(val3.toString());
		for (char c : val3){
		System.out.println(c);
		}
		
		String charToVal = new String(val2);
		System.out.println(">>>>>> Printing the value of val2 >>>>>>>>>> "+charToVal);
		
		
		System.out.println("Length of char array "+val1.length);
		System.out.println("Printing the char array "+ val1.toString());
		System.out.println("Arrays. toString : "+ Arrays.toString(val));
		
		Object o = new Object();
		System.out.println("Printing object : "+ o.hashCode());
		System.out.println("Printing the address of Object : "+ Integer.toHexString(o.hashCode()));
		
		String sample = "sample";
		System.out.println("Printing the string object : "+ sample);
		System.out.println("Printing the potential address of the string object : "+ Integer.toHexString(sample.hashCode()));
		
		String str4 = "test";
		
	}
	
	/*public void testMethod(){
		private final char[] value;
		private final int x;
		
	}*/

	
	
	
	
	
}

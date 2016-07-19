package com.examples.test;
/* Printing the below pine tree pattern.

    * 

   * * 

  * * * 

 * * * * 	 
  
 */	
public class PineTreePattern {
	public static void main(String[] args){
		System.out.println("Testing");



		int level = 4;

		for(int i=0; i<level; i++){
			for(int k=0; k<level-i; k++){
				System.out.print(" ");
			}
			for (int j=0; j<=i; j++){				
				System.out.print("* ");
			}
			System.out.println("\n");
		}


	}
}

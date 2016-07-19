package com.examples.test;

/* Printing the below pine tree pattern.
        
          1 

         1 1 

        1 2 1 

       1 3 3 1 

      1 4 6 4 1 
	  
*/

public class PascalsTriangle {
	public static void main(String[] args){
		System.out.println("Starting Pascals Triangle");

		int level = 100;
		int currentRow[] = new int[level];
		int previousRow[] = new int[level];
		currentRow[0] = 1;	
		previousRow[0] = 1;
		previousRow[1] = 1;

		for(int i = 0; i < level; i++){
			currentRow[i] = 1;		
			for (int j = 1; j <= (i-1) ; j++){
				currentRow[j] = previousRow[j-1] + previousRow[j];				
			} 
			
			//printing spaces to form the pinetree shape
			for(int k=0; k<level-i; k++){
				System.out.print(" ");
			}
			
			for (int k = 0; k <= i; k++){
				previousRow[k] = currentRow[k];
				System.out.print(currentRow[k]+" ");
			}
			
			System.out.println("\n");
		}
	}
}

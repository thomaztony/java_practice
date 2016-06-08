package com.examples.csp;

public class MaxProfit {
	public static void main(String args[]){
		System.out.println("Testing");
		int[] stockPricesYesterday = new int[]{1,7, 5, 2};
		
		//int maxProfit = getMaxProfit(stockPricesYesterday);
		//System.out.println("Printing max profit "+ maxProfit);
		
		int maxProfit1 = getMaxProfit1(stockPricesYesterday);
		System.out.println("Printing max profit >> "+ maxProfit1);
		
	}
	public static int getMaxProfit(int[] stockPricesYesterday) {

	    int maxProfit = 0;

	    // go through every time
	    for (int outerTime = 0; outerTime < stockPricesYesterday.length; outerTime++) {
	    	System.out.println(">>>>>>             Starting the iteration      >>>>>>>>>>>>>>");

	        // for every time, got through every OTHER time
	        for (int innerTime = 0; innerTime < stockPricesYesterday.length; innerTime++) {
	        	
	        	System.out.println("Outer loop is : "+outerTime + " Inner loop is : "+ innerTime);
	        	

	            // for each pair, find the earlier and later times
	            int earlierTime = Math.min(outerTime, innerTime);
	            System.out.println("Earlier Time "+earlierTime);
	            int laterTime   = Math.max(outerTime, innerTime);
	            System.out.println("Later Time "+laterTime);

	            // and use those to find the earlier and later prices
	            int earlierPrice = stockPricesYesterday[earlierTime];
	            System.out.println("Earlier price : "+earlierPrice);
	            int laterPrice   = stockPricesYesterday[laterTime];
	            
	            System.out.println("Later price : "+laterPrice);

	            // see what our profit would be if we bought at the
	            // min price and sold at the current price
	            int potentialProfit = laterPrice - earlierPrice;
	            System.out.println("Printing potential profit : "+ potentialProfit);

	            // update maxProfit if we can do better
	            maxProfit = Math.max(maxProfit, potentialProfit);
	            System.out.println("Printing maxProfit : "+ maxProfit);
	            
	            System.out.println("\n");
	            
	           
	        }
	        System.out.println(">>>>>>             Ending the iteration      >>>>>>>>>>>>>>");
	        System.out.println("\n");
	    }

	    return maxProfit;
	}
	
	
	
	  public static int getMaxProfit1(int[] stockPricesYesterday) {

		    // make sure we have at least 2 prices
		    if (stockPricesYesterday.length < 2) {
		        throw new IllegalArgumentException("Getting a profit requires at least 2 prices");
		    }

		    // we'll greedily update minPrice and maxProfit, so we initialize
		    // them to the first price and the first possible profit
		    int minPrice = stockPricesYesterday[0];
		    System.out.println("Printing minPrice : "+ minPrice);
		    int maxProfit = stockPricesYesterday[1] - stockPricesYesterday[0];
		    System.out.println("Printing maxProfit : "+ maxProfit);

		    // start at the second (index 1) time
		    // we can't sell at the first time, since we must buy first,
		    // and we can't buy and sell at the same time!
		    // if we started at index 0, we'd try to buy /and/ sell at time 0.
		    // this would give a profit of 0, which is a problem if our
		    // maxProfit is supposed to be /negative/--we'd return 0!
		    for (int i = 1; i < stockPricesYesterday.length; i++) {
		        int currentPrice = stockPricesYesterday[i];
		        System.out.println("Printing currentPrice : "+ currentPrice);

		        // see what our profit would be if we bought at the
		        // min price and sold at the current price
		        int potentialProfit = currentPrice - minPrice;
		        System.out.println("Printing the potential profit : "+ potentialProfit);

		        // update maxProfit if we can do better
		        maxProfit = Math.max(maxProfit, potentialProfit);
		        System.out.println("Printing maxProfit : "+ maxProfit);

		        // update minPrice so it's always
		        // the lowest price we've seen so far
		        minPrice = Math.min(minPrice, currentPrice);
		        System.out.println("Printing minPrice : "+ minPrice);
		    }

		    return maxProfit;
		}
}

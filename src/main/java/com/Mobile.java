package com;

public class Mobile {
     private String name="Samsung!";
     
     public int fact(int num){
    	   int sum=1;
    	   for(int x=2;x<=num;x++){
    		   sum=sum*x;
    	   }
    	   return sum;
     }

	@Override
	public String toString() {
		return "Mobile [name=" + name + "]";
	}
}

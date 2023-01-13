package com.condition;

public class Example3 {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 3 ;
		int c = 31;
		
		if (a > b) {   //==> 100 > 3 ==> true
			  if (a > c) {   // ==> 100 > 31 ==> true
				  System.out.println("a is bigger");
			  } else {
				  System.out.println("c is bigger");
			  }
		} else if (b > c) {  // ==>  30 > 3 ==> true
			if (b > a ) {   //30 > 10 ==> true
				 System.out.println("b is bigger");
			} else {
				System.out.println("a is bigger");
			}
		} else if (c > a) {  
			  if (c > b ) {  
				  System.out.println("c is bigger");
			  } else {
				  System.out.println(" b is bigger");
			  }
		} else {
			System.out.println("a,b,c are equal");
		}
	}
}

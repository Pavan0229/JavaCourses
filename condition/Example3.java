package com.condition;

public class Example3 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 30 ;
		int c = 3;
		
		if (a > b) {  
			  if (a > c) {
				  System.out.println("a is bigger");
			  } else {
				  System.out.println("c is bigger");
			  }
		} else if (b > c) {  
			if (b > a ) {
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

package com.programme;

public class Example1 {
	
	int m2 ;
	
	
	public String m2 () {    //Non Static Method
		return "abc";
	}

	public static void m1() {   // static Method
		int m = 10;   // local
		System.out.println(m); 
	}

	public static void main(String[] args) {
		
		
		Example1 e1 = new Example1();
		
		System.out.println(e1.m2);
		
		m1();  
		
	     e1.m2();	
	     System.out.println(e1.m2());
		
		
		/*
		 * int pre = 120; int cur = 1354; int units = cur - pre; int unitPrice; if
		 * (units > 200) { // False
		 * 
		 * 
		 * 
		 * int bill = units ; System.out.println(bill);
		 * 
		 * 
		 * } else { System.out.println("no bill"); }
		 */
	}

}

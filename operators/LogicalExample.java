package com.operators;

public class LogicalExample {

	public static void main(String[] args) {

     int a = 20;
     
     System.out.println(a < 10 && a < 20);   // 20 < 10 && 20 < 20  ==>  false && false ==> false
     
     System.out.println(a > 10 && a < 21);   // 20 > 10 && 20 < 21  ==>  true && true ==> true
     
     System.out.println(a < 10 || a < 21);  //  20 < 10 || 20 > 21  ==>  false && true ==> true
		
     System.out.println(a > 10 || a < 21);  // result ==> true
     
     
     System.out.println(!(a < 10 && a < 20));  //
	}

}

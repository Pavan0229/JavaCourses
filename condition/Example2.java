package com.condition;

public class Example2 {

	public static void main(String[] args) {
	  int a  = 20 ; // local 
	  int b = 20 ;  // local 
	  
	  if (a < b ) {     //20 < 20 ==> false
		   System.out.println("Biggest Number is :" + b);
	  } else if (a > b ) {  // 20 > 20 ==> false
		  System.out.println("Biggest Number is :" + a);
	  } else {
		  System.out.println("Both are equal");
	  }

	}

}

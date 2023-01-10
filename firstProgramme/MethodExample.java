package com.firstProgramme;

public class MethodExample {
	
	
	
	public static void doing () {     // static Method
		
	String s = "ABC";
	
	System.out.println(s);
	}
	
	
	void running() { 				//Non-Static Method
		
		
		int i = 1000;
		
		System.out.println(i);
	}

	public static void main(String[] args) {
	  
		doing();    // Static Method 
		
		MethodExample m1 = new MethodExample();     //Object creation
		m1.running();
        
	}

}

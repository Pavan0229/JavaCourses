package com.firstProgramme;

public class VariableExample {

	int i = 100; // Instance/ NON STATIC Variable

	static String s = "abc"; // static Variable

	double localExample() { // Non-static method
		double d = 1000d;
		//double d = 500d; // local Variable
		System.out.println(d);
		return d ;

	}

	static void doing() { // Static Method
		boolean flag = true; // LOCAL VARIABLE

		System.out.println(flag);
	}

	public static void main(String[] args) {

		String s2 = "Java";    //local Variable
		
		System.out.println(s2);
		
		
		VariableExample v = new VariableExample(); // Object Creation
		System.out.println(v.i);

		System.out.println(s);
		
		
	   v.localExample();
	   
	  doing();
	   

	}
}

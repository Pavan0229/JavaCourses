package com.condition;

public class Example4 {
	
	int i ;   // global i = 0  
	
	void m1() {
		int j ;   // local Variable
		
	//	System.out.println(j); // j = no value
		
	}
	public static void main(String[] args) {

		
		Example4 p1 = new Example4();
		System.out.println(p1.i);
		//System.out.println(p1.j);
	}

}

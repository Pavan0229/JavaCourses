package com.programme;

public class Example4 {

	public static void main(String[] args) {

		/*
		 * for (int i = 5; i <= 100; i = i + 5) { // System.out.println(i); }
		 */

		/*
		 * for (int number = 0; number < 50 ; number++) {
		 * 
		 * if (number%5 == 0 ) { System.out.println(" " + number); } }
		 */

		/*
		 * for (int i = 1; i <= 10 ; i++) { // System.out.println(i*5); // 1*5 ==> 5 }
		 */

		/*
		 * for (int i = 10; i >= 1; i = i-1) { System.out.println(i *10); }
		 */

		/*
		 * for (int i = 30; i >= 100; i = i + 1) { // 30 >= 100 ==> false if (i == 30) {
		 * // 30 == 10 ==> false System.out.println(i);
		 * 
		 * } else { System.out.println("printing different value"); } }
		 * 
		 * System.out.println("Running Loop is wrong");
		 */
		
		int count = 0;
		
		for ( int i = 1;i<= 10; i = i+1) {
			count = count + i; // 0 + 1 = 1 ; 1 + 1 = 2;
		}
		System.out.println(count);
	}

}

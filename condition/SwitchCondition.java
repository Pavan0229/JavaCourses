package com.condition;

public class SwitchCondition {

	
	public static void main(String[] args) {
		
		
		String s  = "abcss";
		//int i = 101;
		
		switch(s) {
		case "abc":
			System.out.println("abc");
		break;
		case "abcd":
			System.out.println("abcd");
		break;
		case "abcff":
			System.out.println("abcff");
		break;
		
		case "abcss":
			System.out.println("abcss");
		break;
		
		case "abcssss":
			System.out.println("abcssss");
		break;
		default:
			System.out.println("No value is Present");
		break;
		}
	}
}

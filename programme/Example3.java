package com.programme;

public class Example3 {

	public static void main(String[] args) {

		int pre = 6350;
		int cur = 9800;

		int bill = cur - pre;

		if (bill < 100) { // false

			int unitPrice = 1;

			int powerbill = bill * 1;

			System.out.println(powerbill);

		} else if (bill > 100 & bill < 200) {   // 3450 > 100 & 3450 < 200 ==> false
			int unitPrice = 2;

			int powerbill = bill * 2;

			System.out.println(powerbill);
		} else if (bill > 200 & bill < 300) {  //3450 > 200 & 3450 < 300 ==> 
			int unitPrice = 3;

			int powerbill = bill * 3;

			System.out.println(powerbill);
		} else if (bill > 300 & bill < 400) {   //3450 > 300 & 3450 < 400
			int unitPrice = 4;

			int powerbill = bill * 4;

			System.out.println(powerbill);
		} else {
			int unitPrice = 5;

			int powerbill = bill * 5;

			System.out.println(powerbill);
		}

	}
}

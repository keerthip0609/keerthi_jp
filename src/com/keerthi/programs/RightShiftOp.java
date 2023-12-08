package com.keerthi.programs;

public class RightShiftOp {
	 public static void main(String[] args) {
		 int no1 = 8;
		 int no2 = -8;
		    
		    // 2 bit signed right shift
		 System.out.println(no1 >>> 2);    // prints 2
		 System.out.println(no2 >>> 2);    // prints 1073741822
	}
}

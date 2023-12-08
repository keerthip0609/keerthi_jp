package com.keerthi.programs;

import java.util.*;

public class ComparisionOp {
	public static void main(String[] args) {
		/*
		 Write a program to enter the values of two variables 'a' and 'b' from keyboard and then check if both the conditions 'a < 50' and 'a < b' are true.
		 */
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		if (a < 50 & a<b) {
			System.out.println("True");
		}
	}

}

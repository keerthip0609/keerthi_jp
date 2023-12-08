package com.keerthi.programs;

import java.util.Scanner;

public class LogicalOpProg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a==b & b==c & c==a) {
			System.out.println("All are equal");
		}
		else {
			System.out.println("Not equal");
		}
	}
}

package com.keerthi.programs;

import java.util.Scanner;

public class PrintData {
	//print int,double, char on screen
	public static void main(String[] args) {
		System.out.println("int");
	    System.out.println("double");
		System.out.println("char");
		
		/* Take name, roll number and field of interest from user and print in the format below :
		Hey, my name is xyz and my roll number is xyz. My field of interest are xyz. */
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name: ");
		String s1 = s.next();
		System.out.println("Enter rollno: ");
		int i = s.nextInt();
		System.out.println("Enter FOI: ");
		String s2 = s.next();
		System.out.println("Hey, my name is " +s1+ " and my roll number is " +i+ ". My field of interest are " +s2+ ".");
		
		//Take two different string input and print them in same line. 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string one: ");
		String one = sc.next();
		System.out.println("Enter string two: ");
		String two = sc.next();
		System.out.println(one+two);
	} 
}

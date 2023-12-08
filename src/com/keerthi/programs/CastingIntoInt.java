package com.keerthi.programs;

import java.util.Scanner;

public class CastingIntoInt {
	//assign value of 100.235 to double variable and then convert it into int
	public static void main(String[] args) {
		double D = 100.235;
		System.out.println((int)D);
		
	// add int val 5 and double val 6.2
		int i = 5;
		double d = 6.2;
		System.out.println(i + d);
		
	// double type user inputs and print area casted int int value
		Scanner s = new Scanner(System.in);
		System.out.println("Enter length : ");
		double l = s.nextDouble();
		System.out.println("Enter breadth : ");
		double b = s.nextDouble();
		double area = l * b;
		int a = (int)area;
		System.out.println("Area of rectangle = " +a);
		
	}
}

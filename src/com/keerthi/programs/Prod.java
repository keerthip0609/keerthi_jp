package com.keerthi.programs;

import java.util.Scanner;

public class Prod {

	// product of numbers 8.2 and 6
	public static void main(String[] args) {
		double a = 8.2;
		int b = 6;
		double product = a*b;
		System.out.println("product of the numbers = " +product);
		
		// square of no 3.9
		double d = 3.9;
		double sq = d*d;
		System.out.println("Square of the number = " +sq);
		
		// take 2 user inputs and print sum and prod of them
		Scanner s = new Scanner(System.in);
		System.out.println("Enter x: ");
		int x = s.nextInt();
		System.out.println("Enter y: ");
		int y = s.nextInt();
		int sum = x + y;
		int pro = x * y;
		System.out.println("Sum = " +sum);
		System.out.println("Product = " +pro);
		
		//Take side of a square from user and print area and perimeter of it.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side: ");
		int side = sc.nextInt();
		int area = side * side;
		int perimeter = 4 * side;
		System.out.println("Area of square = " +area);
		System.out.println("Perimeter of square = " +perimeter);
	} 
}

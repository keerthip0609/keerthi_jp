package com.keerthi.programs;

public class JavaOperatorsProg {
	public static void main(String[] args) {
		 int a = 11, b = 2;
		 //Arithmetic operators
		 // addition operator
		 System.out.println("a + b = " + (a + b));

		 // subtraction operator
		 System.out.println("a - b = " + (a - b));

		  // multiplication operator
		 System.out.println("a * b = " + (a * b));

		  // division operator
		 System.out.println("a / b = " + (a / b));

		  // modulo operator
		 System.out.println("a % b = " + (a % b));
		 
		//Assignment op
		 int i = 4;
		 int var = i;
		 System.out.println("var using =: " + var);
		 var += i;
		 System.out.println("var using +=: " + var);
		 var *= i;
		 System.out.println("var using *=: " + var);
		 
		 //Relational Op
		 int x = 7, y = 14;
		 System.out.println("x is " + x + " and y is " + x);
		 System.out.println(x == y);
		 System.out.println(x != y);
		 System.out.println(x >= y);
		 System.out.println(x <= y);
		 System.out.println(x < y);
		 System.out.println(x > y);
		 
		 //Logical op
		 // && operator
		 System.out.println((5 > 3) && (8 > 5));
		 System.out.println((5 > 3) && (8 < 5));
		// || operator
		 System.out.println((5 > 3) || (8 < 5));  // true
		 System.out.println((5 < 3) || (8 < 5));  // false
		// ! operator
		 System.out.println(!(5 == 3));  // true
		 System.out.println(!(5 > 3));  // false
		 
		//unary op
		 int num = 5;
		 System.out.println(++num);
		 System.out.println(num++);
		 
		 //instanceof
		 String str = "";
		 boolean result;
		 result = str instanceof String;
		 System.out.println("Is str an object of String? " + result);
		 
		 // ternary operator
		 int februaryDays = 29;
		 String res;
		 res = (februaryDays == 28) ? "Not a leap year" : "Leap year";
		 System.out.println(res);
		 
	}
}

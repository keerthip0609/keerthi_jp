package com.keerthi.programs;

public class UnaryOp {
	public static void main(String[] args) {
		int x = 9;
		int y = x++;
		int z = ++x;
		System.out.println("Post increment value is " +y);
		System.out.println("Pre increment value is " +z);
	}

}

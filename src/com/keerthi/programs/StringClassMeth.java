package com.keerthi.programs;

public class StringClassMeth {
	public static void main(String args[]) {
		String s1 = "Keerthi";
		String s2 = " Pothireddy ";
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s2.trim());
		char c = s1.charAt(3);
		System.out.println(c);
		int p1 = s1.indexOf('h');
		int p2 = s2.indexOf('h');
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(s1.equals(s2));
		System.out.println(s2.compareTo(s1));
		System.out.println(s1.compareTo(s2));
		String str1 = s1.substring(4);
		String str2 = s2.substring(3,9);
		System.out.println(str1);
		System.out.println(str2);
		double d = 5.5;
		System.out.println(String.valueOf(d));
		String start = "Hi";
		System.out.println(s1.startsWith(start));
	}
}

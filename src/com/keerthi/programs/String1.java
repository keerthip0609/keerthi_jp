package com.keerthi.programs;

public class String1 {
	public static void main(String[] args) {
		System.out.println(longestPalin("aaaabbaa"));
		System.out.println(longestPalin("abc"));
	}
	public static String SubstringPalin(String S, int left, int right) {
		if (left > right)
			return null;
		while (left >= 0 && right < S.length() && S.charAt(left) == S.charAt(right)) {
			left--;
			right++;
		}
		return S.substring(left + 1, right);
	}
	public static String longestPalin(String s) {
		if (s == null)
			return null;
		String longest = s.substring(0,1);
		for(int i = 0; i < s.length()-1; i++) {
			// odd cases
			String palindrome = SubstringPalin(s, i, i);
			if (palindrome.length() > longest.length())
				longest = palindrome;
			// even cases
			palindrome = SubstringPalin(s, i, i+1);
			if (palindrome.length() > longest.length())
				longest = palindrome;
		}
		return longest;
	}
}

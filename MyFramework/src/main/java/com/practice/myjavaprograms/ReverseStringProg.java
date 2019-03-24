package com.practice.myjavaprograms;

public class ReverseStringProg {

	public static void main(String[] args) {
		// reverseUsingStrBuf("reverse this string if you can");
		reverseUsingNormalLogic("reverse this string if you can");
	}

	/* Using StringBuffer */
	public static void reverseUsingStrBuf(String str) {
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
	}

	/* Using normal Java logic */
	public static void reverseUsingNormalLogic(String str) {

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}

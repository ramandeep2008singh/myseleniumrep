package com.practice.myjavaprograms;

import java.util.HashMap;

public class FindDuplicateChars {

	public static void main(String[] args) {
		findDupCharsAndCount("Better Butter Bids On a Bus");
	}
	public static void findDupCharsAndCount(String str) {
		HashMap<String, String> hmap = new HashMap<String, String>();
		for (int i=0; i<=str.length(); i++) {
			hmap.put(str.charAt(i), "");
		}
	}
}

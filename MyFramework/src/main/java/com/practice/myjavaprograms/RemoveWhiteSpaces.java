package com.practice.myjavaprograms;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		removeWhiteSpace("My Name Is Ramandeep Singh");
	}
	public static void removeWhiteSpace(String str) {
		String finalStr = str.replace(" ", "");
		System.out.println(finalStr);
	}

}

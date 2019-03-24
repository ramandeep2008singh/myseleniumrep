package com.practice.myjavaprograms;

public class PyramidOfNumbers {

	public static void main(String[] args) {
		generatePyramid(5);
	}

	/* Method to generate number Pyramid */
	public static void generatePyramid(int no) {
		int rowCount = 1;
		for (int i = no; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= rowCount; k++) {
				System.out.print("* ");
			}
			System.out.println();
			rowCount++;
		}
	}
}

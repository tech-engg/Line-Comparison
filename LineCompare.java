package com.linecomapre;

public class LineCompare {

	public int x1, x2, y1, y2; 

	public LineCompare(int x1, int x2, int y1, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;

	}

	public double calculateLengthOfLine() {
		double lengthofLine = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		return lengthofLine;
	}

	public static void diffOfLine(double length1, double length2) {
		if (length1 < length2) {
			System.out.println("line-1 is less than line-2.");
		} else if (length2 < length1) {
			System.out.println("line-2 is less than line-1.");
		} else {
			System.out.println("Both line has equal lenth.");
		}

	}

	public static void main(String[] args) {
		System.out.println("Wellcome to the Line comparision ");

		LineCompare line1 = new LineCompare(6, 8, 9, 1);

		double length1 = line1.calculateLengthOfLine();
		System.out.println("Length of line-1 = " + length1);

		LineCompare line2 = new LineCompare(12, 13, 5, 3);

		double length2 = line2.calculateLengthOfLine();
		System.out.println("Length of line-2 = " + length2);

		diffOfLine(length1, length2);
	}
}
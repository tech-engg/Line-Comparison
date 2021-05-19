package com.linecomapre;
import java.util.Scanner;

import java.util.Scanner;

public class LineCompare {

	
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparision Computaion");

		/* creating the object */
		Scanner myObj = new Scanner(System.in);
		System.out.println(" Enter the values of co-ordinate ");

		System.out.println("Enter the value of (x1,y1)=");
		int x1 = myObj.nextInt();
		int y1 = myObj.nextInt();
		System.out.println("Enter the value of (x2,y2)=");
		int x2 = myObj.nextInt();
		int y2 = myObj.nextInt();

		double lengthofLine1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		System.out.println("Enter the value of (x3,y3)=");
		int x3 = myObj.nextInt();
		int y3 = myObj.nextInt();
		System.out.println("Enter the value of (x4,y4)=");
		int x4 = myObj.nextInt();
		int y4 = myObj.nextInt();

		double lengthofLine2 = Math.sqrt(Math.pow(x4 -x3, 2) + Math.pow(y4 -y3, 2));

		System.out.println("length of line2 =" + lengthofLine2);
		System.out.println("length of line1 =" + lengthofLine1);
		
		if(lengthofLine1 == lengthofLine2)
		{
			System.out.println("the lines are equal");
		}	
		else
		{	
			System.out.println("the lines are not equal");
		}
		
		if(lengthofLine1 > lengthofLine2)
			System.out.println("line one is greater");
		else
			System.out.println("line two is greater");
	}

}
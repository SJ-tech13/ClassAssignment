package com.assignment;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyString inputString = new MyString();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String string = input.next();
		
		
		
		inputString.setString(string);
		System.out.println("the reverse string is: " + inputString.reverseString());
		
	}

}

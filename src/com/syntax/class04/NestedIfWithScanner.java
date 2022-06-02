package com.syntax.class04;

import java.util.Scanner;

public class NestedIfWithScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner DMVTest = new Scanner (System.in);
		System.out.println("Please enter your age");
		int age = 18;
		
		int numb = DMVTest.nextInt();
		
		if (numb >= 18) {
			System.out.println("Issue licence");
			
			
			
		} else
		{
			
			System.out.println("Don't issue licence");
		}
		
		
		
		
		
		
		
	}

}

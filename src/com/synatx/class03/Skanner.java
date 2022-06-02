package com.synatx.class03;

import java.util.Scanner;

public class Skanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Please enter your value");
		String name = input.next();
		
		System.out.println(name);
		
		System.out.println(name + "please enter your age");
		
		int age = input.nextInt();
		
		System.out.println(name +" is " + age + " years old");
		

	}

}

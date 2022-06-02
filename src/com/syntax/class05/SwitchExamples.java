package com.syntax.class05;

import java.util.Scanner;

class SwitchExamples {

	public static void main(String[] args) {
		
		
		Scanner day = new Scanner (System.in);
		
		System.out.println("What is the number of day?");
		
		String num = day.next();
		
		String name;
		
		switch (num) {
		case "Ahmad":
			name  ="Saturday";
			break;
			
		case "Mohammad":
		name = "Sunday";
		break;
		
		default:
			name ="Other days";
			break;
		
		}
		
		System.out.println(name);
		
		
		
	}

}

package com.syntax.class04;

import java.util.Scanner;

public class NestIfWithScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner CDOffer = new Scanner (System.in);

System.out.println("Do you have a licence?");
		
		String CreditCard = CDOffer.next();
		
		if (CreditCard.equalsIgnoreCase("No")) {
			
			System.out.println("I offer you a credit card");
		
		}
		else if (CreditCard.equalsIgnoreCase("Yes"))
			
			System.out.println("What's the credit limit on it?");
		
		int balance = CDOffer.nextInt();
		
		if (balance >= 10000) { 
			System.out.println("still offer credit card");
		}
		else {
		
		System.out.println("don't offer credit card");
		
		
		
	}
	}
}

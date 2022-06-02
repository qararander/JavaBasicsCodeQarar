package com.synatx.class03;

public class NestedIfTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	boolean HasDiploma = false;
	boolean NoDiploma=false;
	boolean HasDegree = true;
	double GPA = 4.5;
	
	if (HasDiploma) { 
		System.out.println("Congratulations!");
	}
	else if (NoDiploma) {
		System.out.println("Should get a degree");
		
	} else if (HasDegree) {
		System.out.println("Check a degree score");
		if (GPA >= 4.5);
		System.out.println("Hurrey, you are elegible for the schollarship");
	}
	
	else {
		
		System.out.println("You should have studied hard");
	}
		
		
	}

}

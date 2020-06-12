package yjla;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter float: ");
		float myFloat = input.nextFloat();
		System.out.println("Float entered = " + myFloat);
		
		System.out.print("Enter double: ");
		double myDouble = input.nextDouble();
		System.out.println("Double entered = "+ myDouble);
		
		System.out.print("Enter text : ");
		String myString = input.next();
		System.out.println("Text entered = "+myString);
	}
}

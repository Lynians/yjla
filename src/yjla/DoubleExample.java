package yjla;

public class DoubleExample {
	public void floatingPointLiterals() {
		double myDouble = 3.4;
		
		float myFloat = 3.4F;
		
		// 3.445*10^2
		
		double myDoubleScientific = 3.445e2;
		
		System.out.println(myDouble);
		System.out.println(myFloat);
		System.out.println(myDoubleScientific);
	}
	public void printCharacter() {
		char myChar = 'g';
		char newLine = '\n';
		String myString = "Java 8";
		
		System.out.println(myChar);
		System.out.println(newLine);
		System.out.println(myString);
	}
	public static void main(String[] args) {
		DoubleExample d = new DoubleExample();
		d.floatingPointLiterals();
	}
}

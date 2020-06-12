package yjla;

public class ArithmeticOperator {
	public static void main(String[] args) {
		double number1 = 12.5, number2 = 3.5, result;
		
		//Using addition operator
		result = number1 + number2;
		System.out.println("number1 + number2 = "+result);
		
		//Using subtraction operator
		result = number1 - number2;
		System.out.println("number1 - number2 = "+result);
		
		//Using multiplication operator
		result = number1 * number2;
		System.out.println("number1 * number2 = "+result);
		
		//Using division operator
		result = number1 / number2;
		System.out.println("number1 / number2 = "+result);
		
		//Using remainder operator
		result = number1 % number2;
		System.out.println("number1 % number2 = "+result);
		/////
		
		String start, middle, end, result1;
		
		start = "Talk is cheap. ";
		middle = "Show me the code. ";
		end = "- Linus Torvalds";
		
		result1 = start + middle + end;
		System.out.println(result1);
	}
}

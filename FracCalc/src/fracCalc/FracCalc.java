package fracCalc;

import java.util.*;

public class FracCalc {

	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner (System.in);
		System.out.println("Enter a equation: ");
		String input = userInput.nextLine();
		while (!input.contentEquals("quit")) {
			System.out.println(produceAnswer(input));
			System.out.println("type quit to stop");
			input = userInput.nextLine();	

		}

	}
	// ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
	// This function takes a String 'input' and produces the result
	//
	// input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
	//      e.g. input ==> "1/2 + 3/4"
	//        
	// The function should return the result of the fraction after it has been calculated
	//      e.g. return ==> "1_1/4"
	public static String produceAnswer(String input) {
		int firstSpace = input.indexOf(' ');   	
		String operand1 = input.substring(0, firstSpace);
		input = input.substring(input.indexOf(' ') + 1);
		String operator = input.substring(0, input.indexOf(' '));
		input = input.substring(input.indexOf(' ') + 1);
		String operand2 = input;
		String Whole = findWholeNum(operand2);
		String Numerator = findNumerator(operand2);
		String Denominator = findDenominator(operand2);
		return operand2;

	} 	



	public static String findWholeNum(String s) {
		//mixed numbers if statement
		// mixed numbers contains underscore
		if (s.contains("_")) {
			return s.substring(0,s.indexOf('_'));    	    	
			//fractions if else statement
			//fractions contain a slash
		}
		else if (s.contains("/")) {
			return"0";
			//whole numbers else statement

		} 
		else {
			return s;
		}
	}	

	public static String findNumerator(String s) {

		return s;
	}
	public static String findDenominator(String s) {

		return s;
	}

} 

    	 
   
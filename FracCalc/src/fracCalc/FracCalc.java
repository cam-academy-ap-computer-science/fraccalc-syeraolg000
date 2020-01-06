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
	// The function should return the result of the fraction after it has been calculated.
	//      e.g. return ==> "1_1/4"
	public static String produceAnswer(String input) {
	

	int firstSpace = input.indexOf(' ');   	
		String operand1 = input.substring(0, firstSpace);
		input = input.substring(input.indexOf(' ') + 1);
		String operator = input.substring(0, input.indexOf(' '));
		input = input.substring(input.indexOf(' ') + 1);
		String operand2 = input;
		
		String op2Whole = findWholeNum(operand2);
		String op2Numerator = findNumer(operand2);
		String op2Denominator = findDenom(operand2);
		
		String chkPt2Answ = "whole:" + op2Whole + " numerator:" + op2Numerator + " denominator:" + op2Denominator;
		return chkPt2Answ;

	} 	



	public static String findWholeNum(String s) {
		//mixed numbers if statement
		// mixed numbers contains underscore
		if (s.contains("_")) {
			return s.substring(0,s.indexOf('_'));    	    				
		}
		//fractions if else statement
		//fractions contain a slash
		else if (s.contains("/")) {
			return"0";
		 
		//whole numbers else statement.
		}else return s; 
	}
		

	public static String findNumer(String s) {
		// 5_1111/2222    22/333    234
		if(s.contains("_")) {
		return s.substring(s.indexOf('_') + 1, s.indexOf('/'));
		}else if (s.contains("/")) {
			return s.substring(0, s.indexOf('/'));
		}else{
			return "0";
		}
	}
	
	public static String findDenom(String s) {
		// 3_1/2    333/22  -322
		if(s.contains("/")) {
		    return s.substring(s.indexOf("/") + 1);
		}else {
			return "1";
		}
	

}
}


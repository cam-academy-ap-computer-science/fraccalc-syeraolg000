package fracCalc;

import java.util.*;

public class FracCalc {

    public static void main(String[] args) 
    {
    	Scanner s = new Scanner (System.in);
    	System.out.println("Enter a equation: ");
    	String input =  s.nextLine();
    	System.out.println(produceAnswer(input));
    	
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
    	Scanner s = new Scanner (input);
    	
    	String operand1 = s.next();
    	String operator = s.next();
    	String operand2 = s.next();
    	//System.out.println(operand1.indexOf(" "));....
    	//int operand1index = operand1.indexOf("+");
    	//System.out.println(operand1.substring(0,operand1index));
    	//System.out.println(operand1.substring(operand1index + 1));
    	 return operand2;
    	 
    // TODO: Implement this function to produce the solution to the input
        
                                                    
    }


    // TODO: Fill in the space below with any helper methods that you think you will need
    
}

//System.out.println("");
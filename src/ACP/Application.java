package ACP;

import java.util.Scanner;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Laura - sandbox code
 */

/*
    This is a simple program to complete a math equation based on the operands and operation selected by the user.
*/
public class Application {
	
	public static void main(String[] args) {
            ACPController acpControl = new ACPController();
            		
            Integer firstNum;
            Integer secondNum;
            String operation;
            
            Scanner in = new Scanner(System.in);
		
            System.out.println("***** Practice Application Controller Pattern through Simple Calculations *****");

            // Retrieve the first number from the user
            System.out.println("\nFIRST NUMBER: ");
            try{
                firstNum = Integer.parseInt(in.nextLine());
            }catch(NumberFormatException e){
                firstNum = 0;
            }

            // Retrieve the operation from the user
            System.out.println("\nOPERATION: \n\tMultiply (*), Divide (/), or Add (+)");            
            operation = in.nextLine();
            
            //Retrieve the second number from the user
            System.out.println("\nSECOND NUMBER: ");
            try{
                secondNum = Integer.parseInt(in.nextLine());
            }catch(NumberFormatException e){
                secondNum = 0;
            }
            
            // Validate input from the user
            if (operation.length() == 0) {
                System.out.println("\nERROR: INVALID OPERATOR: MUST BE *, /, or + ");                
                return;
            }else if(firstNum <= 0) {
                System.out.println("\nERROR: FIRST NUMBER MUST BE GREATER THAN 0");
                return;
            }else if(secondNum <= 0) {
                System.out.println("\nERROR: SECOND NUMBER MUST BE GREATHER THAN 0");
                return;
            }

            char c = operation.charAt(0);
            
            // Make sure the operation entered by the user is valid
            if((c == '*') || (c == '/') || (c == '+')){
                // Display the information entered by the user
                System.out.println("\nRESULT: " + firstNum + " " + operation + " " + secondNum + " = ");
            
                // Call application control code that determines specific "class . . . implements HandleOperation" code and display results
                System.out.println(acpControl.handleOperation(operation, firstNum, secondNum));
                
            }else {
                // Display an error message because the user did not enter valid input
                System.out.println("\nERROR: INVALID OPERATOR: MUST BE *, /, or + ");
            }            
	}

}

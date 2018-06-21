package ACP;

import java.util.HashMap;

/**
 *
 * @author Laura - sandbox code
 */

/*
    This is the main controller that initiates an implementation based on the operation string passed
*/
public class ACPController {
	
        // Create a HashMap to link the string to the doMath interface
	public static HashMap<String, MathOperation> hashMapOfOperation = new HashMap<String, MathOperation>();

	public  ACPController() {

	}	
	
        public  Integer handleOperation(String operation, Integer firstNum, Integer secondNum) {
			
            // Connect the hashmap key to the class that needs to be implemented
            hashMapOfOperation.put("+",  new ACPAdd());
            hashMapOfOperation.put("*", new ACPMultiply());
            hashMapOfOperation.put("/", new ACPDivide());
			
            // Create an instance of the MathOperation class based on the operation passed
            MathOperation doMath = hashMapOfOperation.get(operation);
	
            // Execute the code to complete the simple math calculation and return the results to the main application
            return(doMath.operate(firstNum, secondNum));	
	}
}

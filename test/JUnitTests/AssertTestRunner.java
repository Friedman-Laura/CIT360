package JUnitTests;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 *
 * @author Laura - sandbox code
 */

public class AssertTestRunner {
    public static void main(String[] args) {
       
        // Test the first set of JUnit Assertions
        Result result = JUnitCore.runClasses(TestAssertions.class);
		
        // If any of the tests fail, it will print a failure message
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
	
        // If the first round of JUnit Assertion tests are successful, it will display 'true'
        System.out.println(result.wasSuccessful());

        // Test the second set of JUnit Assertions which includes a variety of Hamcrest tests
        Result result1 = JUnitCore.runClasses(HamcrestAssertTests.class);
		
        // If any of the tests fail, it will print a failure message        
        for (Failure failure : result1.getFailures()) {
            System.out.println(failure.toString());
        }
		
        /*
            If the second round of JUnit Hamcrest Assertion tests are successful, it will
            display 'true'
        */
        System.out.println(result1.wasSuccessful());
    }
}
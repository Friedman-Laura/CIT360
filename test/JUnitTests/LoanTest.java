package JUnitTests;

import JUnitCode.Loan;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Laura
 */

/*
    This is code I wrote to complete a simple assertEquals JUnit test of the code
    in Loan.java sandbox code under the JUnitCode package of Source Packages section
    section of the CIT360 NetBeans Project.

    @BeforeClass will run before any other code in the test class is run.
    @Before will run before each @Test is run.
    @Test will run for each test condition defined.
    @After will run after each @Test is completed.
    @AfterClass will run after all @Test conditions are complete.
*/
public class LoanTest {

    private double delta = .005;
    
    @BeforeClass
    public static void setUpBefore() {
        System.out.println("Starting **ALL ** JUnit Tests\n");
    }
    
    @Before
    public void setUpOneTest() {
        System.out.println("Starting **ONE** JUnit Test");     
    }
    
    @Test
    public void firstLoanTest() {
        
        // Call the JUnitCode package Loan.java class with sample values                
        JUnitCode.Loan loan = new Loan(12, 30, 100000.00);
        
        // Convert to integer values to drop the decimal value
        int monthlyPayment = (int) loan.getMonthlyPayment();
        int totalPayment = (int) loan.getTotalPayment();
        
        // Display values for logging purposes
        System.out.println("Monthly Payment: Expected = 1028, Actual = " + monthlyPayment);
        System.out.println("Total Payment: Expected = 370300, Actual = " + totalPayment); 
        
        // Compare expected with actual values
        assertEquals(1028, monthlyPayment);
        assertEquals(370300, totalPayment);
    }
    
    @Test
    public void secondLoanTest() {
        
        // Call the JUnitCode package Loan.java class with sample values
        JUnitCode.Loan loan = new Loan(12, 30, 200000.00);
        
        // Convert to integer values to drop the decimal value
        int monthlyPayment = (int) loan.getMonthlyPayment();
        int totalPayment = (int) loan.getTotalPayment();

        // Display values for logging purposes
        System.out.println("Monthly Payment: Expected = 2057, Actual = " + monthlyPayment);
        System.out.println("Total Payment: Expected = 740601, Actual = " + totalPayment);        

        // Compare expected with actual values
        assertEquals(2057, monthlyPayment);
        assertEquals(740601, totalPayment);
    }
    
    @After
    public void tearDownOneTest() {
        System.out.println("Completed **ONE** JUnit Test\n");
    }
    
    @AfterClass
    public static void tearDownAfter() {
        System.out.println("Completed **ALL** JUnit Tests");
    }
}

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

class LoanCalculation{
    double  annualInterest;
    int     numberOfYears;
    double  loanAmount;
    int     monthlyPayment;
    int     totalPayment;
}
public class LoanTest {
    
    JUnitCode.Loan loan1 = null;    
    int monthlyPayment1;
    int monthlyPayment2;
    
    JUnitCode.Loan loan2 = null;
    int totalPayment1;
    int totalPayment2;
    
    @BeforeClass
    public static void setUpBefore() {
        System.out.println("Starting **ALL ** JUnit Tests\n");
        
        
    }
    
    @Before
    public void setUpOneTest() {
        System.out.println("Starting **ONE** JUnit Test");  
        loan1 = null;
        loan2 = null;
        monthlyPayment1 = 0;
        monthlyPayment2 = 0;
        totalPayment1 = 0;
        totalPayment2 = 0;
        System.out.println("Reset all objects and variables\n");
    }
    
    @Test
    public void firstLoanTest() {
        
        System.out.println("\n** TEST #1 **\n");
        
        // Call the JUnitCode package Loan.java class with sample values
        loan1 = new Loan(12, 30, 100000.00);
        System.out.println("Loan class called and assigned values to loan1 object");

        // Convert to integer values to drop the decimal value
        monthlyPayment1 = (int) loan1.getMonthlyPayment();
        totalPayment1 = (int) loan1.getTotalPayment();
        
        // Display values for logging purposes
        System.out.println("Monthly Payment: Expected = 1028, Actual = " + monthlyPayment1);
        System.out.println("Total Payment: Expected = 370300, Actual = " + totalPayment1); 
        
        // Compare expected with actual values
        assertEquals(1028, monthlyPayment1);
        assertEquals(370300, totalPayment1);
    }
    
    @Test
    public void secondLoanTest() {
        System.out.println("\n** TEST #2**\n");        
        
        System.out.println("loan2 object created and assigned a value = " + loan2);
        
        /*
            Checkk that the Loan object IS null. It should be because it was just created
            but nothing has been assigned to it yet.
        */
        assertNull(loan2);
        
        // Call the JUnitCode package Loan.java class with sample values
        loan2 = new Loan(12, 30, 200000.00);
        System.out.println("Loan class called and assigned values to loan2 object");
        
        /*
            Check that the Loan object isn't null.
            It shouldn't be because it was just assigned with the values from calling the Loan class
        */
        assertNotNull(loan2);
        
        // Convert to integer values to drop the decimal value
        monthlyPayment2 = (int) loan2.getMonthlyPayment();
        totalPayment2 = (int) loan2.getTotalPayment();

        // Display values for logging purposes
        System.out.println("Monthly Payment: Expected = 2057, Actual = " + monthlyPayment2);
        System.out.println("Total Payment: Expected = 740601, Actual = " + totalPayment2);        

        // Compare expected with actual values
        assertEquals(2057, monthlyPayment2);
        assertEquals(740601, totalPayment2);
    }
    
    @Test
    public void thirdLoanTest() {
        
        System.out.println("\n** TEST #3 **\n");        

        // Call the JUnitCode package Loan.java class with sample values
        loan1 = new Loan(12, 30, 100000.00);
        System.out.println("Loan class called and assigned values to loan1 object");

        // Call the JUnitCode package Loan.java class with sample values
        loan2 = new Loan(12, 30, 200000.00);
        System.out.println("Loan class called and assigned values to loan2 object");
                
        // Convert to integer values to drop the decimal value
        monthlyPayment2 = (int) loan1.getMonthlyPayment();
        totalPayment2 = (int) loan1.getTotalPayment();

        monthlyPayment2 = (int) loan2.getMonthlyPayment();
        totalPayment2 = (int) loan2.getTotalPayment();

        /*
            Check that a condition is true. In this test case, we are checking that the first
            monthly payment calculated is less than the second monthly payment. This should be a
            true condition because the first loan is for $100K and the second loan is for $200K,
            therefore, the monthly payment for loan1 should be less than loan2.
        */
        assertTrue (monthlyPayment1 < monthlyPayment2);
        System.out.println("Monthly Payment 1 (" + monthlyPayment1 + ") is less than Monthly Payment 2 (" + monthlyPayment2 + ")");
        

        /*
            Check that a condition is false. In this test case, we are checking that the first
            monthly payment calculated is greater than the second monthly payment. This should be a
            false condition because the first loan is for $100K and the second loan is for $200K,
            therefore, the monthly payment for loan1 should actually be less than loan2.
        */
        assertFalse(monthlyPayment1 > monthlyPayment2);
        System.out.println("Monthly Payment 1 (" + monthlyPayment1 + ") is NOT greater than Monthly Payment 2 (" + monthlyPayment2 + ")");

        /*
            Check that the two loan object references point to different objects. In this test case,
            we are checking that loan1 is pointing to a different loan object than loan2. This should
            be a false condition because the Loan class was called separately for each loan object.
        */
        assertNotSame(loan1, loan2);
        System.out.println("Loan object loan1 (" + loan1 + ") is NOT THE SAME as Loan object loan2(" + loan2 + ")");
        
        /*
            Check if two object references point to the same object. In this test case, we are checking that the NumberOfYears is the same in both
            loan1 and loan2 objects.
        */  
        assertSame(loan1.getNumberOfYears(),loan2.getNumberOfYears());
        System.out.println("Number of Years in loan1 object (" + loan1.getNumberOfYears() + ") is THE SAME as Number of Years in loan2 object (" + loan2.getNumberOfYears() + ")");
        
        //Check whether two arrays are equal to each other.
        /*
            Define and populate the array of expected values for both loan calculations for:
                Annual Interest
                Number of Years
                Loan Amount
                Monthly Payment
                Total Payment
        */
        int[] expectedLoans = {12, 30, 100000, 1028, 370300, // First Loan (loan1)
                              12, 30, 200000, 2057, 740601  // Second Loan (loan2)
        };
                
        /*
            Check if two object references point to the same object. In this test case, we are checking that the NumberOfYears is the same in both
            loan1 and loan2 objects.
        */  
        
        int[] actualLoans = {(int)loan1.getAnnualInterestRate(),
                             loan1.getNumberOfYears(),
                             (int)loan1.getLoanAmount(),
                             (int)loan1.getMonthlyPayment(),
                             (int)loan1.getTotalPayment(),
                             (int)loan2.getAnnualInterestRate(),
                             loan2.getNumberOfYears(),
                             (int)loan2.getLoanAmount(),
                             (int)loan2.getMonthlyPayment(),
                             (int)loan2.getTotalPayment()
        };
        
        assertArrayEquals(expectedLoans,actualLoans);
        System.out.println("The Expected Loan Outcome array info is THE SAME as the Actual Loan Outcome array info");        
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

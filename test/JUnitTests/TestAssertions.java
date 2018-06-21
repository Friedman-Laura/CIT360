package JUnitTests;

import org.junit.Test;
import static org.junit.Assert.*;

/*
    @author - Laura - sandbox code
*/

/*
    This is a simple example of the various basic assertion JUnit tests in Java
*/
public class TestAssertions {

   @Test
   public void testAssertions() {
      //test data
      String str1 = new String ("Now is the time for all good men to come to the aid of their country.");
      String str2 = new String ("Now is the time for all good men to come to the aid of their country.");
      String str3 = null;
      String str4 = "Now is the time for all good men to come to the aid of their country.";
      String str5 = "Now is the time for all good men to come to the aid of their country.";
		
      int val1 = 23;
      int val2 = 26;

      String[] expectedArray = {"Laura", "Friedman", "PO Box 93624", "Southlake", "TX", "76092"};
      String[] resultArray =  {"Laura", "Friedman", "PO Box 93624", "Southlake", "TX", "76092"};

      //Check that two objects are equal
      assertEquals(str1, str2);

      //Check that a condition is true
      assertTrue (val1 < val2);

      //Check that a condition is false
      assertFalse(val1 > val2);

      //Check that an object isn't null
      assertNotNull(str1);

      //Check that an object is null
      assertNull(str3);

      //Check if two object references point to the same object
      assertSame(str4, str5);

      //Check if two object references not point to the same object
      assertNotSame(str1, str3);

      //Check whether two arrays are equal to each other.
      assertArrayEquals(expectedArray, resultArray);
   }
}

package JUnitTests;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.hamcrest.core.CombinableMatcher;
import org.junit.Test;

/*
    @author - Laura - sandbox code
*/

/*
    This file contains basic examples of Hamcrest, which is a framework for software tests.
    It allows for more detailed JUnit testing in Java.

    According to www.vogella.com/tutorials./Hamcrest/article.html:
        "Hamcrest allows checking for conditions in your code via existing matchers classes.
        It also allows you to define your custom matcher implementations.

        To use Hamcrest matchers in JUnit you use the assertThat statement followed by one
        or several matchers.

        Hamcrest is typically viewed as a third generation matcher framework. The first
        generation used assert(logical statement) but such tests were not easily readable.
        The second generation introduced special methods for assertions, e.g., assertEquals().
        This approach leads to lots of assert methods. Hamcrest uses assertThat method with a
        matcher expression to determine if the test was succesful. See Wiki on Hamcrest for
        more details.

Hamcrest has the target to make tests as readable as possible. For example, the is method is a thin wrapper for equalTo(value).
*/
public class HamcrestAssertTests {
  @Test
  public void testAssertArrayEquals() {
    byte[] expected = "CIT360".getBytes();
    byte[] actual = "CIT360".getBytes();
    assertArrayEquals("failure - byte arrays not same", expected, actual);
  }

  @Test
  public void testAssertEquals() {
    assertEquals("failure - strings are not equal", "CIT360", "CIT360");
  }

  @Test
  public void testAssertFalse() {
    assertFalse("failure - should be false", false);
  }

  @Test
  public void testAssertNotNull() {
    assertNotNull("should not be null", new Object());
  }

  @Test
  public void testAssertNotSame() {
    assertNotSame("should not be same Object", new Object(), new Object());
  }

  @Test
  public void testAssertNull() {
    assertNull("should be null", null);
  }

  @Test
  public void testAssertSame() {
    Integer aNumber = Integer.valueOf(76092);
    assertSame("should be same", aNumber, aNumber);
  }

  // JUnit Matchers assertThat
  @Test
  public void testAssertThatBothContainsString() {
    assertThat("BYU Idaho", both(containsString("B")).and(containsString("I")));
  }

  @Test
  public void testAssertThatHasItems() {
    assertThat(Arrays.asList("Laura", "Friedman", "PO Box 93624", "Southlake", "TX", "76092"), hasItems("Laura", "Friedman"));
  }

  @Test
  public void testAssertThatEveryItemContainsString() {
    assertThat(Arrays.asList(new String[] { "Laura", "Friedman", "Southlake", "Texas" }), everyItem(containsString("a")));
  }

  // Core Hamcrest Matchers with assertThat
  @Test
  public void testAssertThatHamcrestCoreMatchers() {
    assertThat("Laura", allOf(equalTo("Laura"), startsWith("Laura")));
    assertThat("Laura", not(allOf(equalTo("Michael"), equalTo("Laura"))));
    assertThat("Laura", anyOf(equalTo("Samantha"), equalTo("Laura")));
    assertThat(55, not(CombinableMatcher.<Integer> either(equalTo(23)).or(equalTo(26))));
    assertThat(new Object(), not(sameInstance(new Object())));
  }

  @Test
  public void testAssertTrue() {
    assertTrue("failure - should be true", true);
  }
}
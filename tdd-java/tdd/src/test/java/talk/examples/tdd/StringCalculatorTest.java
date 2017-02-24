package talk.examples.tdd;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

/**
 * Unit tests for String Calculator using junit.framework package
 */
public class StringCalculatorTest
{
    private StringCalculator sc;

    @Before
    public void setUp() {
        this.sc = new StringCalculator();
    }

    @Test
    public void test_whenStringIsEmpty_ReturnZero() {
        int expectedResult = 0;
        int actualResult = this.sc.add("");

        Assert.assertTrue(expectedResult == actualResult);
    }

    @Test
    public void test_whenStringHas1Number_ReturnThatSameNumber() {
        int expectedResult = 1;
        int actualResult = this.sc.add("1");

        Assert.assertTrue(expectedResult == actualResult);

        expectedResult = 10;
        actualResult = this.sc.add("10");

        Assert.assertTrue(expectedResult == actualResult);
    }

    @Test
    public void test_whenStringHas2Numbers_ReturnTheAddition() {
        int expectedResult = 3;
        int actualResult = this.sc.add("1,2");

        Assert.assertTrue(expectedResult == actualResult);
    }

    @Test
    public void test_whenStringHas5Numbers_ReturnTheAddition() {
        int expectedResult = 15;
        int actualResult = this.sc.add("1,2,3,4,5");

        Assert.assertTrue(expectedResult == actualResult);
    }
}

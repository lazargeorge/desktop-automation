package desktop.automation.app;

import org.testng.Assert;
import org.testng.annotations.Test;

import desktop.automation.exception.NotNumberException;


/**
 * Simple test for handling some operation via Calculator app.
 * 
 * @author Paul Brodner
 */
public class AdditionTest extends CalculatorTest
{
    @Test
    public void testSumOfTwoAndThree() throws NotNumberException
    {
    	calculator.Calculator_Standard_Basic();
        calculator.add(2, 3);
        Assert.assertEquals("5", calculator.getResult());
    }

    @Test
    public void testMultipleAddition() throws NotNumberException
    {
        calculator.add(2, 9);
        calculator.add(1, 7);
        Assert.assertEquals("19", calculator.getResult());
    }

    @Test(expectedExceptions = NotNumberException.class)
    public void testNotANumberException() throws NotNumberException
    {
        calculator.add(21, 3);
    }
}

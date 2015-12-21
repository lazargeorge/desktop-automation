package desktop.automation.app;

import org.testng.Assert;
import org.testng.annotations.Test;

import desktop.automation.exception.NotNumberException;

public class MultiplicationTest extends CalculatorTest {
	 @Test
	    public void testMultiplicationOfTwoAndThree() throws NotNumberException
	    {
	        calculator.multiply(3,2);
	        Assert.assertEquals("6", calculator.getResult());
	    }
	 
	 @Test
	    public void testMultiplicationOfNull() throws NotNumberException
	    {
	        calculator.multiply(3,0);
	        Assert.assertEquals("0", calculator.getResult());
	    }

	    @Test
	    public void testMultipleMultiplication() throws NotNumberException
	    {
	    	calculator.multiply(8,4);
	    	calculator.multiply(2,1);
	        Assert.assertEquals("64", calculator.getResult());
	    }
	    

	    @Test(expectedExceptions = NotNumberException.class)
	    public void testNotANumberException() throws NotNumberException
	    {
	        calculator.multiply(21, 3);
	    }
}

package desktop.automation.app;

import org.testng.Assert;
import org.testng.annotations.Test;

import desktop.automation.exception.NotNumberException;

public class SubstractionTest extends CalculatorTest {

	   @Test
	    public void testSubOfTwoAndThree() throws NotNumberException
	    {
		   
	        calculator.substract(3,2);
	        Assert.assertEquals("1", calculator.getResult());
	    }

	    @Test
	    public void testMultipleSub() throws NotNumberException
	    {
	    	calculator.substract(9,4);
	    	calculator.substract(2,1);
	        Assert.assertEquals("2", calculator.getResult()); 
	    }
	    
	    @Test
	    public void testNegativeSub() throws NotNumberException
	    {
	    	calculator.substract(4,6);	    
	        Assert.assertEquals("-2", calculator.getResult());
	    }

	    @Test(expectedExceptions = NotNumberException.class)
	    public void testNotANumberException() throws NotNumberException
	    {
	        calculator.substract(21, 3);
	    }
}

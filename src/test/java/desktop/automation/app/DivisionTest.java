package desktop.automation.app;

import org.testng.Assert;
import org.testng.annotations.Test;

import desktop.automation.exception.NotNumberException;

public class DivisionTest extends CalculatorTest {

	 @Test
	    public void testDivisionOfTwoAndThree() throws NotNumberException
	    {
	        calculator.divide(3,2);
	        Assert.assertEquals("6", calculator.getResult());
	    }
	
	    @Test
	    public void testMultipleDivision() throws NotNumberException
	    {
	    	calculator.divide(20,2);
	    	calculator.divide(5,2);
	        Assert.assertEquals("1", calculator.getResult());
	    }
	    
	    @Test(expectedExceptions = NotNumberException.class)
	    public void testNotANumberException() throws NotNumberException
	    {
	        calculator.divide(21, 3);
	    }
	    
	    @Test
	    public void testFloatDivision() throws NotNumberException 
	    {
	        calculator.divide(7, 3);
	        Assert.assertTrue(calculator.getResult().startsWith("23"));
	    }
	    
		 @Test(expectedExceptions = NumberFormatException.class)
		public void testDivisionOfNull() throws NumberFormatException, NotNumberException
		{
		     calculator.divide(3,0);
		}
	    
}

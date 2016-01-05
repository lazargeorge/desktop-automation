package desktop.automation.app;

import org.testng.Assert;
import org.testng.annotations.Test;

import desktop.automation.exception.NotNumberException;

public class ScientificTests extends CalculatorTest {

	 @Test
	    public void testIntegerPart() throws NotNumberException
	    {
		 	calculator.View_Scientific();
	        calculator.divide(5,2);
	        calculator.IntegerPart();
	        Assert.assertEquals("2", calculator.getResult());
	    }
	 
	 @Test
	    public void testPi() throws NotNumberException
	    {
		 	calculator.View_Scientific();
		 	calculator.Pi();
	        Assert.assertTrue(calculator.getResult().startsWith("314"));
	    }
	 
	 @Test
	    public void testDms() throws NotNumberException
	    {
		 	calculator.View_Scientific();
	        calculator.divide(5,2);
	        calculator.dms();
	        Assert.assertTrue(calculator.getResult().startsWith("23"));
	    }
	 
	 @Test
	    public void testFE() throws NotNumberException
	    {
		 	calculator.View_Scientific();
	        calculator.clickNumber(5);
	        calculator.FE();
	        Assert.assertTrue(calculator.getResult().startsWith("5e"));
	    }
}

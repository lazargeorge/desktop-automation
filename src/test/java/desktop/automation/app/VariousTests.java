package desktop.automation.app;

import org.testng.Assert;
import org.testng.annotations.Test;

import desktop.automation.exception.NotNumberException;

public class VariousTests extends CalculatorTest{
		
		@Test
	    public void testMemoryClear() throws NotNumberException
	    {
	        calculator.clickNumber(5);
	        calculator.MC();
	        calculator.clickNumber(7); 
	        Assert.assertEquals("7", calculator.getResult());
	    }
		
		@Test
	    public void testMemoryRecall() throws NotNumberException
	    {
	        calculator.clickNumber(5);
	        calculator.MR();
	        Assert.assertEquals("0", calculator.getResult());
	    }
		
		@Test
	    public void testMemoryStore() throws NotNumberException
	    {
	        calculator.clickNumber(5);
	        calculator.MS();
	        Assert.assertTrue(calculator.CheckExists("Memory"));
	    }
		
		@Test
	    public void testMemoryPlus() throws NotNumberException
	    {
	        calculator.clickNumber(5);
	        calculator.MAdd();
	        Assert.assertTrue(calculator.CheckExists("Memory"));
	    }
		
		@Test
	    public void testMemorySubstract() throws NotNumberException
	    {
	        calculator.clickNumber(5);
	        calculator.MSubstract();
	        Assert.assertTrue(calculator.CheckExists("Memory"));
	    }
		
		@Test
	    public void testSqrt() throws NotNumberException
	    {
	        calculator.clickNumber(9);
	        calculator.SqareRoot();
	        Assert.assertEquals("3", calculator.getResult());
	    }
		
		@Test
	    public void testDoubleSqrt() throws NotNumberException
	    {
	        calculator.clickNumber(8);
	        calculator.SqareRoot();
	        Assert.assertTrue(calculator.getResult().startsWith("282"));
	    }
		
		@Test
	    public void testPercentage() throws NotNumberException
	    {
			calculator.divide(8, 2);
	        calculator.Percentage();
	        Assert.assertTrue(calculator.getResult().startsWith("016"));
	    }
		
		@Test
	    public void testReciprocal() throws NotNumberException
	    {
			calculator.clickNumber(6);
	        calculator.Reciprocal();
	        Assert.assertTrue(calculator.getResult().startsWith("016"));
	    }
		
		@Test
	    public void testCE() throws NotNumberException
	    {
			calculator.divide(9,5);	
	        calculator.CE();
	        Assert.assertEquals("0", calculator.getResult());
	    }
		
		@Test
	    public void testClear() throws NotNumberException
	    {
			calculator.divide(9,5);	
	        calculator.clear();
	        Assert.assertEquals("0", calculator.getResult());
	    }
		
		@Test
	    public void testBackspace() throws NotNumberException
	    {
			calculator.clickNumber(6);
			calculator.clickNumber(6);
	        calculator.Backspace();
	        Assert.assertEquals("6", calculator.getResult());
	    }
		
		@Test
	    public void testDot() throws NotNumberException
	    {
			// 	operation is 6/2.4=2.5
			calculator.clickNumber(6);
			calculator.divide();
			calculator.clickNumber(2);
	        calculator.Dot();
			calculator.clickNumber(4);
			calculator.divide();

	        Assert.assertTrue(calculator.getResult().startsWith("25"));
	    }
		
}

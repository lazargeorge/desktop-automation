package desktop.automation.app;

import org.testng.Assert;
import org.testng.annotations.Test;

import desktop.automation.exception.NotNumberException;

public class EditMenuInteractionTest extends CalculatorTest {
	@Test
    public void testViewCopyPaste() throws NotNumberException
    {
		//method below uses both copy and paste, so both are tested
		calculator.addCopyPaste(5); 
		Assert.assertEquals("10", calculator.getResult());
    }
	
}

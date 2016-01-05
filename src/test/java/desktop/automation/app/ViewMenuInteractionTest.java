package desktop.automation.app;

import org.testng.Assert;
import org.testng.annotations.Test;

import desktop.automation.exception.NotNumberException;

public class ViewMenuInteractionTest extends CalculatorTest  {
		
	@Test
    public void testViewScientific() throws NotNumberException
    {
	//	calculator.Calculator_Standard_Basic();
	
		calculator.View_Scientific();
		Assert.assertTrue(calculator.CheckExists("Pi")); 
    }
	
	@Test
    public void testViewProgrammer() throws NotNumberException
    {
	//	calculator.Calculator_Standard_Basic();
	
		calculator.View_Programmer();
		Assert.assertTrue(calculator.CheckExists("Or")); 
    }
	
	@Test
    public void testViewStatistics() throws NotNumberException
    {
	//	calculator.Calculator_Standard_Basic();
	
		calculator.View_Statistics();
		Assert.assertTrue(calculator.CheckExists("Sum")); 
    }
	
	@Test
    public void testViewUnitConversion() throws NotNumberException
    {
	//	calculator.Calculator_Standard_Basic();
	
		calculator.View_UnitConversion();
		Assert.assertTrue(calculator.CheckExists("Unit Type")); 
    }

	
	@Test
    public void testViewDateCalculation() throws NotNumberException
    {
	//	calculator.Calculator_Standard_Basic();
	
		calculator.View_DateCalculation();
		Assert.assertTrue(calculator.CheckExists("Date Time")); 
    }
	

}

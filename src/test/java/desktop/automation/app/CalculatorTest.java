package desktop.automation.app;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

/**
 * @author Paul Brodner
 */
public abstract class CalculatorTest
{
    Calculator calculator;


    @BeforeClass
    public void openCalculator()
    {
        calculator = new Calculator();
        calculator.openApplication();
        calculator.clear();
    }

    @AfterClass
    public void closeCalculator()
    {
        calculator.closeWindow();
    }

    @BeforeMethod
    public void clearResults()
    {
    	if(calculator != null)
        calculator.clear();
    }
    
}

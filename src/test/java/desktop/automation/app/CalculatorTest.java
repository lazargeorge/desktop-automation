package desktop.automation.app;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

/**
 * @author Paul Brodner
 */
public abstract class CalculatorTest
{
    Calculator calculator;

    @BeforeTest
    public void openCalculator()
    {
        calculator = new Calculator();
        calculator.openApplication();
    }

    @AfterTest
    public void closeCalculator()
    {
        calculator.closeWindow();
    }

    @BeforeMethod
    public void clearResults()
    {
        calculator.clear();
    }
}

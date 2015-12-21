package desktop.automation.app;

import java.io.File;

import org.alfresco.os.win.Application;
import org.alfresco.utilities.LdtpUtils;

import desktop.automation.exception.NotNumberException;

/**
 * Calculator wrapper
 * 
 * @author Paul Brodner
 */
public class Calculator extends Application
{
    public Calculator()
    {
        setApplicationName("calc.exe");
        setApplicationPath(new File(LdtpUtils.getSystem32(), getApplicationName()).getPath());
        setWaitWindow("Calculator");
    }

    public void add(int a, int b) throws NotNumberException
    {
        clickNumber(a);
        add();
        clickNumber(b);
        add();
    }

    /**
     * Just click on the <+> button
     */
    public void add()
    {
        clickButton("Add");
    }

    /**
     * Clear the Result value, clicking on C button
     */
    public void clear()
    {
        clickButton("Clear");
    }

    /**
     * @return the results of the arithmetic operation
     */
    public String getResult()
    {
        return getLdtp().getObjectList()[5].replace("lbl", ""); // the 5th element object of calculator is the Result label
    }

    /**
     * Click on a number for Calculator
     * 
     * @param number
     * @throws NotNumberException
     */
    private void clickNumber(int number) throws NotNumberException
    {
        if (number < 0 || number > 9)
        {
            throw new NotNumberException(number);
        }
        getLdtp().click(String.valueOf(number));
    }
}

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

    public void substract(int a, int b) throws NotNumberException
    {
    	 clickNumber(a);
         substract();
         clickNumber(b);
         substract();
    }
    
    public void multiply(int a, int b) throws NotNumberException
    {
    	clickNumber(a);
        multiply();
        clickNumber(b);
        multiply();
    }
    
    public void divide(int a, int b) throws NotNumberException
    {
    	clickNumber(a);
        divide();
        clickNumber(b);
        divide();
    }
    
    /**
     * Just click on the <+> button
     */
    public void add()
    {
        clickButton("Add");
    }
    
    public void substract()
    {
        clickButton("Subtract");
    }
    
    public void multiply()
    {
        clickButton("Multiply");
    }
    
    public void divide() throws NotNumberException
    {
    	
        clickButton("Divide");
        double i = Double.parseDouble(getResult());
        
    }
    
    public void equals()
    {
        clickButton("Equals");
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
    public void clickNumber(int number) throws NotNumberException
    {
        if (number < 0 || number > 9)
        {
            throw new NotNumberException(number);
        }
        getLdtp().click(String.valueOf(number));
    }
    
    public void MR()
    {
    	clickButton("Memory recall");
    }
    
    public void MC()
    {
    	clickButton("Memory clear");
    }
    
    public void MS()
    {
    	clickButton("Memory store");
    }
    
    public void MAdd()
    {
    	clickButton("Memory add");
    }
    
    public void MSubstract()
    {
    	clickButton("Memory substract");
    }
    
    public void Backspace()
    {
    	clickButton("Backspace");
    }
    
    public void CE()
    {
    	clickButton("Clear entry");
    }
    
    public void Negate()
    {
    	clickButton("Negate");
    }
    
    public void SqareRoot()
    {
    	clickButton("Square root");
    }
    
    public void Percentage()
    {
    	clickButton("Percentage");
    }
    
    public void DecimalSeparator()
    {
    	clickButton("Decimal separator");
    }
    public void Reciprocal()
    {
    	clickButton("Reciprocal");
    }
    public void Dot()
    {
    	clickButton("Decimal separator");
    }
    
    public boolean CheckExists(String name)
    {
    	if (getLdtp().stateEnabled(name)!=0)
    		return true;	//object exists
    	else return false;
    
    }
}

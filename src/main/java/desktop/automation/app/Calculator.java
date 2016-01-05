package desktop.automation.app;

import java.io.File;

import org.alfresco.os.win.Application;
import org.alfresco.utilities.LdtpUtils;

import com.cobra.ldtp.Ldtp;

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
    public void addCopyPaste(int a) throws NotNumberException
    {
        clickNumber(a);
        Edit_Copy();
        add();
        Edit_Paste();
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
    
    public void divide(int a, int b) throws NotNumberException, NullPointerException
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
    
    public void divide() throws NotNumberException, NullPointerException
    {
    	
        clickButton("Divide");
        double i = Double.parseDouble(getResult()); //used just to throw exception when conversion cannot be made
        
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
    
    public String getResultStatistics()
    {
    	System.out.println(getLdtp().getObjectList()[0]);
    	System.out.println(getLdtp().getObjectList()[1]);
    	System.out.println(getLdtp().getObjectList()[2]);
    	System.out.println(getLdtp().getObjectList()[3]);
    	System.out.println(getLdtp().getObjectList()[4]);
    	System.out.println(getLdtp().getObjectList()[5]);
    	System.out.println(getLdtp().getObjectList()[6]);
    	System.out.println(getLdtp().getObjectList()[7]);
    	return getLdtp().getObjectList()[7];
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
    public void clickNumberHexa(String number) throws NotNumberException
    {
        getLdtp().click(number);
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
    //********************METHODS FOR VIEW MENU*****************************

    public void View_Scientific()
    {
      	getLdtp().selectMenuItem("View;Scientific");  	
    }
    public void View_Scientific_KeyOpen()
    {
    	getLdtp().keyPress("<alt>");
    	getLdtp().keyPress("<2>");
    	getLdtp().keyRelease("<2>");
    	getLdtp().keyRelease("<alt>"); 	
    }
    public void View_Programmer()
    {
      	getLdtp().selectMenuItem("View;Programmer");  	
    }
    public void View_Programmer_KeyOpen()
    {
    	getLdtp().keyPress("<alt>");
    	getLdtp().keyPress("<3>");
    	getLdtp().keyRelease("<3>");
    	getLdtp().keyRelease("<alt>"); 	
    }
    
    public void View_Statistics()
    {
      	getLdtp().selectMenuItem("View;Statistics");  	
    }
    public void View_Statistics_KeyOpen()
    {
    	getLdtp().keyPress("<alt>");
    	getLdtp().keyPress("<4>");
    	getLdtp().keyRelease("<4>");
    	getLdtp().keyRelease("<alt>"); 	
    }
    
    public void View_UnitConversion()
    {
      	getLdtp().selectMenuItem("View;Unit conversion");  	
    }
    public void View_UnitConversion_KeyOpen()
    {
    	getLdtp().keyPress("<alt>");
    	getLdtp().keyPress("<U>");
    	getLdtp().keyRelease("<U>");
    	getLdtp().keyRelease("<alt>"); 	
    }
    
    public void View_History()
    {
      	getLdtp().selectMenuItem("View;History");  	
    }
    
    public void View_History_KeyOpen()
    {
    	getLdtp().keyPress("<Crl>");
    	getLdtp().keyPress("<H>");
    	getLdtp().keyRelease("<U>");
    	getLdtp().keyRelease("<Ctrl>"); 	
    }
    public void View_DateCalculation()
    {
      	getLdtp().selectMenuItem("View;Date calculation");  	
    }
    public void View_DateCalculation_KeyOpen()
    {
    	getLdtp().keyPress("<alt>");
    	getLdtp().keyPress("<E>");
    	getLdtp().keyRelease("<E>");
    	getLdtp().keyRelease("<alt>"); 	
    }
    //********************METHODS FOR EDIT MENU*****************************

    public void Edit_Copy()
    {
      	getLdtp().selectMenuItem("Edit;Copy");  	
    }
    public void Edit_Copy_KeyOpen()
    {
    	getLdtp().keyPress("<Ctrl>");
    	getLdtp().keyPress("<C>");
    	getLdtp().keyRelease("<C>");
    	getLdtp().keyRelease("<Ctrl>"); 	
    }
    public void Edit_Paste()
    {
      	getLdtp().selectMenuItem("Edit;Paste");  	
    }
    public void Edit_Paste_KeyOpen()
    {
    	getLdtp().keyPress("<Ctrl>");
    	getLdtp().keyPress("<V>");
    	getLdtp().keyRelease("<V>");
    	getLdtp().keyRelease("<Ctrl>"); 	
    }
    public void Calculator_Standard_Basic()
    {
    	//if we close computer in a mode, it will reopen in that mode. these are the basics settings, needed at the start of each mode test
    	getLdtp().selectMenuItem("View;Standard");  
    	getLdtp().selectMenuItem("View;Basic");  
    }
    //********************METHODS FOR SCIENTIFIC CALCULATOR*****************************
    public void IntegerPart()
    {
    	clickButton("Integer part");
    }
    
    public void Pi()
    {
    	clickButton("Pi");
    }
    
    public void dms()
    {
    	clickButton("Degree minute second");
    }
    public void FE()
    {
    	clickButton("Exponential notation");
    }
    //********************METHODS FOR STATISTICS CALCULATOR*****************************
    public void StatisticsAdd()
    {
    	clickButton("Add dataset value");
    }
    
    public void StatisticsSum()
    {
    	clickButton("Sum");
    }
    
    public void StatisticsAverage()
    {
    	clickButton("Average");
    }
    public void StatisticsExponential()
    {
    	clickButton("Exponential");
    }
    
    public void StatisticsSumofSquare()
    {
    	clickButton("Sum of square");
    }
    //********************METHODS FOR PROGRAMMER CALCULATOR*****************************
    public void ProgrammerOctal()
    {
    	clickButton("Octal");
    }
    
    public void ProgrammerBinary()
    {
    	clickButton("Binary");
    }
    
    public void ProgrammerDecimal()
    {
    	clickButton("Decimal");
    }
    
    public void ProgrammerHexadecimal()
    {
    	clickButton("Hexadecimal");
    }
    
    public void ProgrammerByte()
    {
    	clickButton("Byte");
    }
    
    public void ProgrammerXor()
    {
    	clickButton("Exclusive or");
    }
    
    public void ProgrammerAnd()
    {
    	clickButton("And");
    }
    
    public void ProgrammerWord()
    {
    	clickButton("Word");
    }
}

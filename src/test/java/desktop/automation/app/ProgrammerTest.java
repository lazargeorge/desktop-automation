package desktop.automation.app;

import org.testng.Assert;
import org.testng.annotations.Test;

import desktop.automation.exception.NotNumberException;

public class ProgrammerTest extends CalculatorTest {
	@Test
    public void testProgrammerBinary() throws NotNumberException
    {
	 	calculator.View_Programmer();
	 	calculator.clear();
	 	calculator.ProgrammerDecimal();
	 	calculator.clickNumber(5);
	 	calculator.ProgrammerBinary();
        Assert.assertEquals("101", calculator.getResult());
    }
	
	@Test
    public void testProgrammerByte() throws NotNumberException
    {
	 	calculator.View_Programmer();
	 	calculator.clear();
	 	calculator.ProgrammerDecimal();
	 	calculator.ProgrammerByte();
	 	calculator.clickNumber(9);
	 	calculator.clickNumber(0);
	 	calculator.add();
	 	calculator.clickNumber(9);
	 	calculator.clickNumber(0);
	 	calculator.equals();
        Assert.assertEquals("-76", calculator.getResult());
    }
	
	@Test
    public void testProgrammerXor() throws NotNumberException
    {
	 	calculator.View_Programmer();
	 	calculator.clear();
	 	calculator.ProgrammerDecimal();
	 	calculator.ProgrammerWord();
	 	calculator.clickNumber(5);
	 	calculator.ProgrammerXor();
	 	calculator.clickNumber(3);
	 	calculator.equals();
        Assert.assertEquals("6", calculator.getResult());
    }
	
	@Test
    public void testProgrammerAnd() throws NotNumberException
    {
	 	calculator.View_Programmer();
	 	calculator.clear();
	 	calculator.ProgrammerHexadecimal();
	 
	 	calculator.clickNumberHexa("A");
	 	calculator.ProgrammerAnd();
	 	calculator.clickNumber(6);
	 	calculator.equals();
        Assert.assertEquals("2", calculator.getResult());
    }
	
}

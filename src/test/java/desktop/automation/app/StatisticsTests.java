package desktop.automation.app;

import org.testng.Assert;
import org.testng.annotations.Test;

import desktop.automation.exception.NotNumberException;

public class StatisticsTests extends CalculatorTest {
		@Test
	    public void testStatisticsSum() throws NotNumberException
	    {	
		//	nu reusesc sa aflu valoarea rezultatului, nu poate fi luata cu getresult, pentru ca pozitia acestuia se misca
		// valoarea rezultatului nu mai e in numele variabilei ca pana acum, nu stiu unde e
			calculator.View_Statistics();
		 	calculator.clear();
		 	calculator.clickNumber(4);
		 	calculator.StatisticsAdd();

		 	calculator.StatisticsSum();
		 
	        Assert.assertEquals("4", calculator.getResultStatistics());
	    }
		
		@Test
	    public void testStatisticsAverage() throws NotNumberException
	    {
		 	calculator.View_Statistics();
		 	calculator.clear();
		 	calculator.clickNumber(6);
		 	calculator.StatisticsAdd();
		 	calculator.clickNumber(5);
		 	calculator.StatisticsAdd();
		 	calculator.clickNumber(8);
		 	calculator.StatisticsAdd();
		 	calculator.StatisticsAverage();
		 	Assert.assertTrue(calculator.getResult().startsWith("63"));	      
	    }
	 

}

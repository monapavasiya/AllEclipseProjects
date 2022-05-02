package testcases;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;



public class Validations
{
	@Rule
	public ErrorCollector errCol = new ErrorCollector();
	
	@Test
	public void validate()
	{
		String expectedValue = "A"; // from xls or properties
		String actualValue ="A1"; //from selenium
		System.out.println("Start");
		try 
		{
			Assert.assertEquals(expectedValue, actualValue);
		}
		catch (Throwable e)
		{
			System.out.println("Some Error" + e.getMessage());
			errCol.addError(e);
		}
	
		
		//Assert.assertEquals(expectedValue, actualValue);
		try 
		{
		   Assert.assertTrue("Error message", 4>12);
		}
		catch (Throwable e)
		{
			System.out.println("Some Error" + e.getMessage());
			errCol.addError(e);
		}
		System.out.println("End");
		//Assert.assertFalse(message, condition);
		//Assert.fail("Had to be logged in but not Logged in");
	}

}

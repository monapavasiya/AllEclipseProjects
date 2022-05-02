package TestCases.suitea;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
/*
public class LoginTest 
{
	@Test
	public void doLogin()
	{
		String expectedResult = "ABCX";
		String actualResult = "ABC";
		
		//Assert.assertEquals(actualResult, expectedResult);
     	//Assert.assertTrue(5>12, "Error message");
		//Assert.fail();
		System.out.println("..............A..........");
		Assert.fail("Custom err msg - 404 error");
		System.out.println("..............B..........");
	}
}
*/
 
//before and after test
/*
public class LoginTest 
{
	@BeforeTest
	public void init()
	{
		System.out.println(".........@BeforeTest.......");
	}
	
	@AfterTest
	public void quit()
	{
		System.out.println("...........@AfterTest......");
	}
    @Test
	public void doLogin()
	{
		String expectedResult = "ABCX";
		String actualResult = "ABC";
		
		//Assert.assertEquals(actualResult, expectedResult);
     	//Assert.assertTrue(5>12, "Error message");
		//Assert.fail();
		System.out.println("..............A..........");
		Assert.fail("Custom err msg - 404 error");
		System.out.println("..............B..........");
	}
}
*/
// before and after method

public class LoginTest 
{
	@BeforeTest
	public void init()
	{
		System.out.println(".........@BeforeTest.......");
	}
	
	@AfterTest
	public void quit()
	{
		System.out.println("..........@AfterTest......");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("******@BeforeMethod****");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("******@AfterMethod****");
	}
	
	
	
    @Test
	public void doLogin()
	{
		String expectedResult = "ABCX";
		String actualResult = "ABC";
		
		//Assert.assertEquals(actualResult, expectedResult);
     	//Assert.assertTrue(5>12, "Error message");
		//Assert.fail();
		//System.out.println("..............A..........");
		//Assert.fail("Custom err msg - 404 error");
		System.out.println("Logging In");
	}
    
    @Test
    public void logout()
    {
    	System.out.println("Logging Out");
    }
}


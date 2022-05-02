package TestCases.suiteb;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.SkipException;
import org.testng.annotations.Test;

/*
  public class SearchAndBuyPhone 
{
	@Test(priority = 1)
	public void search()
	{
		System.out.println("Searching Phone");
	}
	
	@Test(priority = 2)
	public void selectPhone()
	{
		System.out.println("Selecting Phone");
	}
	
	@Test(priority = 3)
	public void checkout()
	{
		System.out.println("Checking out");
	}
	
	

}
*/

// skip testcase


/*
public class SearchAndBuyPhone 
{
	boolean flag = true; 
	@Test(priority = 1)
	public void search()
	{
		if(flag)
			throw new SkipException("Skipping test");
		System.out.println("Searching Phone");
	}
	
	@Test(priority = 2)
	public void selectPhone()
	{
		System.out.println("Selecting Phone");
	}
	
	@Test(priority = 3)
	public void checkout()
	{
		System.out.println("Checking out");
	}
}
*/
//introduce dependancy (if searching phone is skipping then there is no meaning to run other 2 test cases)

/*
public class SearchAndBuyPhone 
{
	boolean flag = true;  // if it will be false then it will run all 3 testcases
	@Test(priority = 1)
	public void search()
	{
		if(flag)
			throw new SkipException("Skipping test");
		System.out.println("Searching Phone");
	}
	
	@Test(priority = 2, dependsOnMethods = {"search"})
	public void selectPhone()
	{
		System.out.println("Selecting Phone");
	}
	
	@Test(priority = 3, dependsOnMethods = {"search" , "selectPhone"})
	public void checkout()
	{
		System.out.println("Checking out");
	}
}
*/

//failing testcase

/*

public class SearchAndBuyPhone 
{
	boolean flag = false; 
	@Test(priority = 1)
	public void search()
	{
		if(flag)
			throw new SkipException("Skipping test");
		System.out.println("Searching Phone");
	}
	
	@Test(priority = 2, dependsOnMethods = {"search"})
	public void selectPhone()
	{
		System.out.println("Selecting Phone");
		Assert.fail();
	}
	
	@Test(priority = 3, dependsOnMethods = {"search" , "selectPhone"})
	public void checkout()
	{
		System.out.println("Checking out");
	}
}
*/

//adding interface

public class SearchAndBuyPhone 
{
	boolean flag = false; 
	@Test(priority = 1)
	public void search(ITestContext context)
	{
		if(flag)
			throw new SkipException("Skipping test");
		System.out.println("Searching Phone");
		context.setAttribute("phoneName", "iphone13");
	}
	
	@Test(priority = 2, dependsOnMethods = {"search"})
	public void selectPhone(ITestContext context)
	{
		String name = (String)context.getAttribute("phoneName");
		System.out.println("Selecting Phone" + name);
		Assert.fail();
	}
	
	@Test(priority = 3, dependsOnMethods = {"search" , "selectPhone"})
	public void checkout(ITestContext context)
	{
		System.out.println("Checking out");
	}
}
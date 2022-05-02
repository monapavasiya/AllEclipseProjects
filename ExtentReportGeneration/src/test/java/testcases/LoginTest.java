package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import reports.ExtentManager;



/*
public class LoginTest 
{

	@Test 
	public void login()
	{
		System.out.println(System.getProperty("user.dir"));
		ExtentReports reports = new ExtentReports();
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") +"\\reports");
		sparkReporter.config().setReportName("Production Regression Testing");
		sparkReporter.config().setDocumentTitle("Automation Reports");
		sparkReporter.config().setTheme(Theme.STANDARD);
		sparkReporter.config().setEncoding("utf-8");

		reports.attachReporter(sparkReporter);

		ExtentTest test = reports.createTest("Login Test");
		test.log(Status.INFO, "Starting test case login");
		test.log(Status.FAIL, "404 Error");
		Assert.fail("404 Error");
		test.log(Status.INFO, "Opening Browser");
		test.log(Status.INFO, "Logging In");
		test.log(Status.PASS, "Test Passed");

		reports.flush(); //don't forgot to put this line ...it will generates the reports

	}
}
 */

public class LoginTest 
{
	
	ExtentTest test;
	ExtentReports reports;

	@BeforeMethod
	public void init()
	{
		reports = ExtentManager.getReports();

		test = reports.createTest("Login Test");
	}

	@AfterMethod
	public void quit()
	{

		reports.flush();
	}
	
	@Test 
	public void login()
	{
		System.out.println(System.getProperty("user.dir"));
		
		test.log(Status.INFO, "Starting test case login");
		test.log(Status.FAIL, "404 Error");
		Assert.fail("404 Error");
		test.log(Status.INFO, "Opening Browser");
		test.log(Status.INFO, "Logging In");
		test.log(Status.PASS, "Test Passed");

	}
}


package TestCases.suitea;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Dataprovider.TestDataProvider;
/*
public class CreateUser 
{

	// step 2 - linking
	@Test(dataProvider = "getData")
	
	//step 3- define parameter
	public void createUser(String browser, String userType, int phone, String email)
	{
		System.out.println(browser + "--" + "--" + userType + "--" + phone + "--" + email);
	}
	
	//step 1
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][4];  // row, colum
		//row 1
		data[0][0] = "Chrome"; 
		data[0][1] = "Admin"; 
		data[0][2] = 123456; 
		data[0][3] = "email1@somedomail.com";
		//row 2
		data[1][0] = "Mozilla"; 
		data[1][1] = "SuperAdmin"; 
		data[1][2] = 456789; 
		data[1][3] = "email2@somedomail.com";
		//row 3
		data[2][0] = "iE"; 
		data[2][1] = "User"; 
		data[2][2] = 234567; 
		data[2][3] = "email3@somedomail.com";
		
		return data;
	}	
}
*/

public class CreateUser 
{

	// step 2 - linking
	//@Test(dataProvider = "getData")
	
	@Test(dataProviderClass = TestDataProvider.class, dataProvider = "getData")
	//step 3- define parameter
	public void createUser(String browser, String userType, int phone, String email)
	{
		System.out.println(browser + "--" + "--" + userType + "--" + phone + "--" + email);
	}
	
	//step 1
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][4];  // row, colum
		//row 1
		data[0][0] = "Chrome"; 
		data[0][1] = "Admin"; 
		data[0][2] = 123456; 
		data[0][3] = "email1@somedomail.com";
		//row 2
		data[1][0] = "Mozilla"; 
		data[1][1] = "SuperAdmin"; 
		data[1][2] = 456789; 
		data[1][3] = "email2@somedomail.com";
		//row 3
		data[2][0] = "iE"; 
		data[2][1] = "User"; 
		data[2][2] = 234567; 
		data[2][3] = "email3@somedomail.com";
		
		return data;
	}
	
	@Test(dataProviderClass = TestDataProvider.class, dataProvider = "getData")
	//step 3- define parameter
	public void deleteUser(String browser, String userType, int phone, String email)
	{
		System.out.println(browser + "--" + "--" + userType + "--" + phone + "--" + email);
	}
}


package Dataprovider;

import java.lang.reflect.Method;
import org.testng.annotations.DataProvider;

public class TestDataProvider
{
	@DataProvider
	public static Object[][] getData(Method m)
	{
		System.out.println("Method / Test" + m.getName());
		Object[][] data = null ;
		if( m.getName().equals("createUser"))
		{
			data = new Object[3][4];  // row, colum
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
		}
		else if( m.getName().equals("deleteUser"))
		{
		     data = new Object[3][4];  // row, colum
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
		}

		return data;
	}

}

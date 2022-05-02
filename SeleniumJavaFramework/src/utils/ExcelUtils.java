package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*public class ExcelUtils 
{

	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;




	public static void main(String[] args)
	{
		//getRowCount();
		getCellDataString();
		getCellDataNumber();
	}
	public static void getRowCount() 
	{
		try
		{

			projectPath =	System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectPath+"/Excel/data.xlsx");
			sheet = workbook.getSheet("Sheet1");
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows : "+rowCount);

		}

		catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}

	public static void getCellDataString()
	{
		try
		{
			projectPath =	System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectPath+"/Excel/data.xlsx");
			sheet = workbook.getSheet("Sheet1");
			String cellData = sheet.getRow(0).getCell(0).getStringCellValue();
			System.out.println(cellData);

		}

		catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	} 
	
	
	public static void getCellDataNumber()
	{
		try
		{
			projectPath =	System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectPath+"/Excel/data.xlsx");
			sheet = workbook.getSheet("Sheet1");
			double cellData= sheet.getRow(1).getCell(1).getNumericCellValue();
			System.out.println(cellData);

		}

		catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	} 

}*/


public class ExcelUtils 
{

	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	
	public ExcelUtils(String ExcelPath, String SheetName)
	{
		try 
		{
		
		workbook = new XSSFWorkbook(ExcelPath);
		sheet = workbook.getSheet(SheetName);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}



	public static void main(String[] args)
	{
		//getRowCount();
		getCellDataString(0,0);
		getCellDataNumber(1,1);
	}
	public static void getRowCount() 
	{
		try
		{

			
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows : "+rowCount);

		}

		catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}

	public static void getCellDataString(int rowNum, int colNum)
	{
		try
		{
			
			String cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println(cellData);

		}

		catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	} 
	
	
	public static void getCellDataNumber(int rowNum, int colNum)
	{
		try
		{
			
			double cellData= sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(cellData);

		}

		catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	} 

}
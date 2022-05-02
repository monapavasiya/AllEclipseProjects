package com.telusko;

public class ExceptionDemo
{

	public static void main(String[] args)  //unchecked exception
	{
		try 
		{
		int i = 9/0;
		}
		catch(Exception e)
		{
		  System.out.println("Error  "); 
		}
		System.out.println("Bye");
		
		
		
		try 
		{
		int i = 9/0;
		}
		catch(Exception e)
		{
		  System.err.println("Error  ");  // to print Error in red colour type err instead of out
		}
		System.out.println("Bye");
		
		
		
		try 
		{
			int i = 7;
			int j =2;
		    int k = i/j;
		    System.out.println("output is "+ k);
		}
		catch(Exception e)
		{
		  System.out.println("Error  ");  
		}
		System.out.println("Bye");
		
		
		
		
		try 
		{
			int i = 7;
			int j =2;
		    int k = i/j;
		    System.out.println("output is "+ k);
		   
		}
		catch(ArithmeticException e)
		{
		  System.out.println("Error  "); 
		  
		}
		finally
		{
			System.out.println("Bye");
		}
		
		
		
		try 
		{
			int a[] = new int[6];
			a[4] = 8;
			int i = 7;
			int j =0;
		    int k = i/j;
		    System.out.println("output is "+ k);
		   
		}
		catch(ArithmeticException e)
		{
		  System.out.println("Cannot divide by zero..  "); 
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Stay in your limit.. ");
		}
		finally
		{
			System.out.println("Bye");
		}
	}

}

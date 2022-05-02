package com.telusko;

public class ExceptionHandlingUser 
{

	public static void main(String[] args)
	{
		int i,j;
		i = 8;
		j = 9 ;
		
		try
		{
			int k = i/j;
			
			if(k==0)
				throw new TeluskoException("this is not possible");
				
			System.out.println(k);
		}
		catch(TeluskoException e)
		{
			System.out.println("Error " + e.getMessage());
		}
	}

}

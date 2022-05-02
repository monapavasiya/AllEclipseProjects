import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

//Bufferereader
//Scanner

public class Userinput 
{

	public static void main(String[] args) throws Exception
	{
			
		{
			{
				
		}
	    System.out.println("Enter a number ");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(n);
		}
		
		
		int n = 0;
        System.out.println("Enter a number ");
		
		BufferedReader br = null;
		try
		{
		br = new BufferedReader(new InputStreamReader(System.in));
	    n = Integer.parseInt(br.readLine());            //create exception
	   
		}
		catch(Exception e)
		{
			System.out.println(e);                    //handle exception
		}
		finally
		{
			 br.close();                             //close exception
		}
		
		System.out.println(n);
		
		
		int i = 0;
		System.out.println("enter a number");
		
		Scanner sc = new Scanner(System.in);  //ctrl + shift + o
		n= sc.nextInt();                      //nextInt is a method inside scanner which will fetch integer  value
	    System.out.println(n);
		
	}

}

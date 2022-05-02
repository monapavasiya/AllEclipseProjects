
public class SelectionDemo {

	public static void main(String[] args) 
	{
		int n = 7;
		
		if(true)
			
			System.out.println("HELLO");
		
		if(false)
	        System.out.println("BYE");
		
		{
			
			int m =8;
			
			if(m%2==0)
		        System.out.println("Even");
		 
			else      //if(m%2!=0) 
			   System.out.println("Odd");
		}
		
		//ternary operator
		//?:  ---> condition?expr1:expr2
		
		{
			
			int i = 5;
			int j = 0;
			
			//if(i>6)
			//	j=1;
			//else
			//	j=2;
			
			j = i>6?1:2;
			
			System.out.println(j);
			
			
			
			
		}
		
	}

}


public class JumpDemo 
{
	//break,continue

	public static void main(String[] args) 
	{
	     for(int i=1;i<=10;i++)
	     {
	    	 System.out.println("value is " + i);
	     }
	     
	     
	     for(int i=1;i<=10;i++)
	     {
	    	 if(i==7)
	    	 {
	    		 continue;
	    	 }
	    	 System.out.println("value is " + i);
	     }

	     
	     for(int i=1;i<=10;i++)
	     {
	    	 if(i>5)
	    	 {
	    		 break;
	    	 }
	    	 System.out.println("value is " + i);
	     }
	}

}

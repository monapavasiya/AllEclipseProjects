
/*abstract class Human
{                                                            //abstract class we can define methods and declare
                                                             // interface only can declare methods only till 1.7 java
  public abstract void eat();
                                                             //1.8 can define methods in interface
  public void walk()
  {
	  
  }
}


class Man extends Human // concrete class
{
  public void eat ()
  {
	  
  }
}



public class AbstarctDemo
{

	public static void main(String[] args)
	{
		Human obj = new Man();
      
	}

}
*/

class Printer
{
  public void show(Number i)
  {
	  System.out.println(i);
  }
 
}

public class AbstarctDemo
{
   public static void main (String[] args)
   {
	   
	   Printer obj = new Printer();
	   obj.show(5.4);
   }
}






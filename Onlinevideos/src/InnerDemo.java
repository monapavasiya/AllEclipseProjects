/*
 * 
 * Inner class
 *    Member class
 *    Static class
 *    Anonymous class
 *    
 *    
 */



class Outer
{
   static int a;
   public static void show()
   {
	   
   }
   
   static class Inner  // outer$inner.class
   {
	   public void display()
	   {
		   System.out.println("in display");
	   }
   }
}



public class InnerDemo 
{

	public static void main(String[] args)  
    {
		Outer obj = new Outer();
		obj.show();
		
		Outer.Inner obj1 = new Outer.Inner();
		obj1.display();
 
	}

}

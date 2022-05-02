
class A
{
  // final int DAY;      //final becomes constant with variable
   public  void show() // cannot override method
  {
	System.out.println("in A show");
  }
}

class B extends A   //can not extend class
{
	 public void show() 
	 {
		 System.out.println("in B show");
	 }
}





public class FinalDemo
{

	public static void main(String[] args)
	{

    
       B obj = new B();
       obj.show();
	}

}

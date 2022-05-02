

class P
{
	public void show()
	{
		System.out.println("in A");
	}
	
}

class Q extends P
{
	public void show()
	{
	   
		System.out.println("in B");
	}
	
}
class R extends P
{
	public void show()
	{
	  
		System.out.println("in C");
	}
	
}


public class OverridingDemo 
{
         //compile time and runtime
	public static void main(String[] args)
	{
	   P obj1 = new Q(); //runtime polymorphism
	   obj1.show();
	   
	   obj1 = new R();
	   obj1.show(); //Dynamic method dispatch

	}

}
